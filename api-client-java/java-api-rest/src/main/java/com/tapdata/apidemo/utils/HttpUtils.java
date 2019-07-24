package com.tapdata.apidemo.utils;

import java.util.HashMap;
import java.util.Map;

import com.tapdata.apidemo.common.ExceptionCode;
import com.tapdata.apidemo.common.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Slf4j
public class HttpUtils {

    public static Map<String, Object> httpGet(String url, Map<String, Object> variables, Integer timeout) throws ServiceException {
        return httpGet(url, variables, null, timeout);
    }

    public static Map<String, Object> httpPost(String url, Map<String, Object> body, Integer timeout) throws ServiceException {
        return httpPost(url, body, null, timeout);
    }

    public static Map<String, Object> httpGet(String url, Map<String, ?> variables, Map<String, String> extraHeaders, Integer timeout) throws ServiceException {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(timeout * 1000);
        requestFactory.setReadTimeout(timeout * 1000);
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        if (extraHeaders != null) {
            extraHeaders.entrySet().stream().forEach(entry -> headers.set(entry.getKey(), entry.getValue()));
        }
        HttpEntity requestEntity = new HttpEntity(headers);
        ResponseEntity<Map> responseEntity = null;
        try {
            UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url).queryParams((LinkedMultiValueMap<String, String>) variables); // The allRequestParams must have been built for all the query params
            UriComponents uriComponents = builder.build().encode(); // encode() is to ensure that characters like {, }, are preserved and not encoded. Skip if not needed.
            responseEntity = restTemplate.exchange(uriComponents.toUri(), HttpMethod.GET, requestEntity, Map.class);
        } catch (RestClientException e) {
            throw new ServiceException(ExceptionCode.MESSAGE, e.getMessage());
        }

        return processResponse(responseEntity);
    }

    public static Map<String, Object> httpPost(String url, Map<String, Object> body, Map<String, String> extraHeaders, Integer timeout) throws ServiceException {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(timeout * 1000);
        requestFactory.setReadTimeout(timeout * 1000);
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        if (extraHeaders != null) {
            extraHeaders.entrySet().stream().forEach(entry -> headers.set(entry.getKey(), entry.getValue()));
        }
        HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<>(body, headers);
        ResponseEntity<Map> entity = null;
        try {
            entity = restTemplate.postForEntity(url, requestEntity, Map.class);
        } catch (RestClientException e) {
            throw new ServiceException(ExceptionCode.MESSAGE, e.getMessage());
        }

        return processResponse(entity);
    }

    private static Map<String, Object> processResponse(ResponseEntity<Map> entity) throws ServiceException {
        Map<String, Object> responseBody = entity.getBody();
        HttpStatus statusCode = entity.getStatusCode();
        if (statusCode.is2xxSuccessful()) {
            return responseBody;
        } else if (statusCode.is4xxClientError()) {
            if (statusCode.value() == 401) {
                throw new ServiceException(ExceptionCode.UNAUTHORIZED_EXCEPTION);
            } else {
                throw new ServiceException(ExceptionCode.UNKNOWN_ERROR);
            }
        } else {
            throw new ServiceException(ExceptionCode.UNKNOWN_ERROR);
        }
    }
}

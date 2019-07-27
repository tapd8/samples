package com.tapdata.apidemo.apicall;

import com.tapdata.apidemo.common.*;
import com.tapdata.apidemo.common.service.CommonService;
import com.tapdata.apidemo.utils.HttpUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service("apiCallService")
public class ApiCallService {

    @Autowired
    private CommonService commonService;

    public List<?> getAllCustomers(int pageSize, int pageNum) throws ServiceException {
        Map<String, String> headers = new HashMap<>(1);
        headers.put("access_token", commonService.getToken());

        if (pageNum < 1) {
            pageNum = 1;
        }
        int startRow = (pageNum - 1) * pageSize;
        LinkedMultiValueMap<String, String> param = new LinkedMultiValueMap();
        param.add("filter[skip]", startRow + "");
        param.add("filter[limit]", pageSize + "");

        Map<String, Object> resultMap = HttpUtils.httpGet(AppConstants.FIN_CUSTOMER_URL, param, headers, 5000);
        List<Map<String, Object>> resultList = (List)resultMap.get("data");

        return resultList;
    }

    public List<?> getCustomersByCountry(String countryCode) throws ServiceException {
        List<Map<String, Object>> resultList = new ArrayList<>();

        Map<String, String> headers = new HashMap<>(1);
        headers.put("access_token", commonService.getToken());

        LinkedMultiValueMap<String, String> param = new LinkedMultiValueMap();
        param.add("filter[where][COUNTRY_CODE]", countryCode);

        Map<String, Object> resultMap = HttpUtils.httpGet(AppConstants.FIN_CUSTOMER_URL, param, headers, 5000);
        resultList = (List)resultMap.get("data");

        return resultList;
    }

    public ApiResponse apiPage(ApiFilter filter) throws ServiceException {
        Map<String, String> headers = new HashMap<>(1);
        headers.put("access_token", commonService.getToken());

        LinkedMultiValueMap<String, String> param = commonService.getParam(filter);

        Map<String, Object> resultMap = HttpUtils.httpGet(AppConstants.FIN_CUSTOMER_URL, param, headers, 5000);
        List<Map<String, Object>> resultList = (List)resultMap.get("data");
        Map<String, Object> totalMap = (Map<String, Object>)resultMap.get("total");

        ApiResponse response = new ApiResponse();
        response.setData(resultList);
        response.setTotal((Integer)totalMap.get("count"));

        return response;
    }

    public Map<String, Object> apiCreate(Map<String, Object> objectMap) throws ServiceException {
        Map<String, String> headers = new HashMap<>(1);
        headers.put("access_token", commonService.getToken());
        Map<String, Object> resultMap = HttpUtils.httpPost(AppConstants.FIN_CUSTOMER_URL, objectMap, headers, 5000);

        return resultMap;
    }

    public Map<String, Object> apiPatch(Map<String, Object> objectMap) throws ServiceException {
        Map<String, String> headers = new HashMap<>(1);
        headers.put("access_token", commonService.getToken());
        String id = objectMap.get("_id").toString();
        String url = AppConstants.FIN_CUSTOMER_URL + "/" + id;
        objectMap.remove("_id");
        Map<String, Object> resultMap = HttpUtils.httpPatch(url, objectMap, headers, 5000);

        return resultMap;
    }

    public Map<String, Object> apiGet(String id) throws ServiceException {
        Map<String, String> headers = new HashMap<>(1);
        headers.put("access_token", commonService.getToken());
        String url = AppConstants.FIN_CUSTOMER_URL + "/" + id;
        Map<String, Object> resultMap = HttpUtils.httpGet(url, null, headers, 5000);

        return resultMap;
    }

    public Map<String, Object> apiDelete(String id) throws ServiceException {
        Map<String, String> headers = new HashMap<>(1);
        headers.put("access_token", commonService.getToken());
        String url = AppConstants.FIN_CUSTOMER_URL + "/" + id;
        HttpUtils.httpDelete(url, null, headers, 5000);

        return new HashMap<String, Object>();
    }
}

package com.tapdata.apidemo.common.service;

import com.tapdata.apidemo.common.AppConstants;
import com.tapdata.apidemo.common.ExceptionCode;
import com.tapdata.apidemo.common.ServiceException;
import com.tapdata.apidemo.utils.HttpUtils;
import com.tapdata.apidemo.utils.PropertiesUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service("commonService")
public class CommonService {

    private String token = null;

    public String getToken() throws ServiceException {
        if (token == null) {
            refreshToken();
        }
        return token;
    }

    public String refreshToken() throws ServiceException {
        Map<String, Object> map = new HashMap<>(3);
        map.put("grant_type", "client_credentials");
        map.put("client_id", AppConstants.CLIENT_ID);
        map.put("client_secret", AppConstants.CLIENT_SECRET);

        Map<String, Object> result = HttpUtils.httpPost(AppConstants.TOKEN_URL, map, 5000);
        if (result == null || result.get("access_token") == null) {
            throw new ServiceException(ExceptionCode.EMPTY_DATA);
        }
        token = (String)result.get("access_token");

        return token;
    }
}

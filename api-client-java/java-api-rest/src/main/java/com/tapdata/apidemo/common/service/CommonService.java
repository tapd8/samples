package com.tapdata.apidemo.common.service;

import com.tapdata.apidemo.common.ApiFilter;
import com.tapdata.apidemo.common.AppConstants;
import com.tapdata.apidemo.common.ExceptionCode;
import com.tapdata.apidemo.common.ServiceException;
import com.tapdata.apidemo.utils.HttpUtils;
import com.tapdata.apidemo.utils.PropertiesUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;

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

    public LinkedMultiValueMap<String, String> getParam(ApiFilter filter) {
        log.info("filter: "+ filter.toString());
        LinkedMultiValueMap<String, String> param = new LinkedMultiValueMap();

        if (filter.getPageSize() != null && filter.getPageNum() != null) {
            if (filter.getPageNum() < 1) {
                filter.setPageNum(1);
            }
            int startRow = (filter.getPageNum() - 1) * filter.getPageSize();
            param.add("filter[skip]", startRow + "");
            param.add("filter[limit]", filter.getPageSize() + "");
        }

        if (filter.getWhere() != null) {
            filter.getWhere().entrySet().stream().forEach(entry -> {
                param.add("filter[where]" + entry.getKey(), (String)entry.getValue());
            });
        }

        if (filter.getFields() != null) {
            filter.getFields().entrySet().stream().forEach(entry -> {
                param.add("filter[fields][" + entry.getKey() + "]", entry.getValue().toString().toLowerCase());
            });
        }

        if (filter.getOrder() != null && !filter.getOrder().isEmpty()) {
            if (filter.getOrder().size() == 1) {
                String orderString = filter.getOrder().get(0);
                param.add("filter[order]", orderString);
            } else {
                for (int i = 0; i < filter.getOrder().size(); i++) {
                    param.add("filter[order][" + i + "]", filter.getOrder().get(i));
                }
            }
        }

        log.info("param: " + param.toString());
        return param;
    }
}

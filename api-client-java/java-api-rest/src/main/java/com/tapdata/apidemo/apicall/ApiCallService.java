package com.tapdata.apidemo.apicall;

import com.tapdata.apidemo.common.AppConstants;
import com.tapdata.apidemo.common.ParamMap;
import com.tapdata.apidemo.common.ServiceException;
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
}

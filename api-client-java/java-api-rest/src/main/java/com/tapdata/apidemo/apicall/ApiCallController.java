package com.tapdata.apidemo.apicall;

import com.tapdata.apidemo.common.ApiFilter;
import com.tapdata.apidemo.common.ApiResponse;
import com.tapdata.apidemo.common.ServiceException;
import com.tapdata.apidemo.common.service.CommonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController("apiCallController")
public class ApiCallController {

    @Autowired
    private CommonService commonService;

    @Autowired
    private ApiCallService apiCallService;

    @RequestMapping(value = "/token")
    public String token() {
        try {
            String token = commonService.getToken();
            return token;
        } catch (ServiceException e) {
            log.error(e.getMessage());
        }

        return "Token Error";
    }

    @RequestMapping(value = "/customers")
    public List<?> customers(@RequestParam(value = "pageSize") int pageSize, @RequestParam(value = "pageNum") int pageNum) {
        try {
            List<?> list = apiCallService.getAllCustomers(pageSize, pageNum);
            return list;
        } catch (ServiceException e) {
            log.error(e.getMessage());
        }

        return null;
    }

    @RequestMapping(value = "/customers/country")
    public List<?> customers(@RequestParam(value = "code") String countryCode) {
        try {
            List<?> list = apiCallService.getCustomersByCountry(countryCode);
            return list;
        } catch (ServiceException e) {
            log.error(e.getMessage());
        }

        return null;
    }

    @RequestMapping(value = "/customers/page", method= RequestMethod.POST)
    public ApiResponse apiPage(@RequestBody ApiFilter filter) {
        try {
            ApiResponse response = apiCallService.apiPage(filter);
            return response;
        } catch (ServiceException e) {
            log.error(e.getMessage());
        }

        return null;
    }

    @RequestMapping(value = "/customers/create", method= RequestMethod.POST)
    public Map<String, Object> apiCreate(@RequestBody Map<String, Object> map) {
        try {
            Map<String, Object> response = apiCallService.apiCreate(map);
            return response;
        } catch (ServiceException e) {
            log.error(e.getMessage());
        }

        return null;
    }

    @RequestMapping(value = "/customers/patch", method= RequestMethod.POST)
    public Map<String, Object> apiPatch(@RequestBody Map<String, Object> map) {
        try {
            Map<String, Object> response = apiCallService.apiPatch(map);
            return response;
        } catch (ServiceException e) {
            log.error(e.getMessage());
        }

        return null;
    }

    @RequestMapping(value = "/customers/get", method= RequestMethod.GET)
    public Map<String, Object> apiGet(@RequestParam(value = "id") String id) {
        try {
            Map<String, Object> response = apiCallService.apiGet(id);
            return response;
        } catch (ServiceException e) {
            log.error(e.getMessage());
        }

        return null;
    }

    @RequestMapping(value = "/customers/delete", method= RequestMethod.GET)
    public Map<String, Object> apiDelete(@RequestParam(value = "id") String id) {
        try {
            Map<String, Object> response = apiCallService.apiDelete(id);
            return response;
        } catch (ServiceException e) {
            log.error(e.getMessage());
        }

        return null;
    }
}
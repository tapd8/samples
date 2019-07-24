package com.tapdata.apidemo.apicall;

import com.tapdata.apidemo.common.ServiceException;
import com.tapdata.apidemo.common.service.CommonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
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

    @RequestMapping(value = "/all_customers")
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
}

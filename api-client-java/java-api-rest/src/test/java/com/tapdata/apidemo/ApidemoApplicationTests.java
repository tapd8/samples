package com.tapdata.apidemo;

import com.tapdata.apidemo.apicall.ApiCallController;
import com.tapdata.apidemo.common.ApiFilter;
import com.tapdata.apidemo.common.ApiResponse;
import com.tapdata.apidemo.common.ServiceException;
import com.tapdata.apidemo.common.service.CommonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ApidemoApplicationTests {

	@Autowired
	private ApiCallController apiCallController;

	private String id = null;

	public void createTest() {
		Map<String, Object> customer = new HashMap<>();
		customer.put("COUNTRY_CODE", "EE");
		customer.put("CUSTOMER_ID", "EE555");
		customer.put("FIRST_NAME", "TEST");
		Map<String, Object> response = apiCallController.apiCreate(customer);

		// TODO: test validations
		System.out.println("====== Create customer ======");
		System.out.println(response.toString());
		id = response.get("_id").toString();
		System.out.println("\n\n");
	}

	public void patchTest() {
		Map<String, Object> updateMap = new HashMap<>();
		updateMap.put("_id", id);
		updateMap.put("FIRST_NAME", "UPDATED_TEST");
		Map<String, Object> response = apiCallController.apiPatch(updateMap);

		// TODO: test validations
		System.out.println("====== Update FIRST_NAME=" + updateMap + " by id succeed ======\n\n");
	}

	public void getTest() {
		Map<String, Object> response = apiCallController.apiGet(id);

		// TODO: test validations
		System.out.println("====== Find by id: " + this.id + " ======");
		System.out.println(response.toString());
		System.out.println("\n\n");
	}

	public void deleteTest() {
		apiCallController.apiDelete(id);

		// TODO: test validations
		System.out.println("====== Delete by id: " + this.id + " succeed ======\n\n");
	}

	public void findPageTest() {
		Map<String, Object> whereMap = new HashMap<>();
		whereMap.put("[COUNTRY_CODE]", "AT");
		Map<String, Object> fieldMap = new HashMap<>();
		fieldMap.put("CUSTOMER_ID", true);
		fieldMap.put("FIRST_NAME", true);
		fieldMap.put("COUNTRY_CODE", true);
		List<String> orderList = new ArrayList<>();
		orderList.add("CUSTOMER_ID DESC");

		ApiFilter filter = new ApiFilter();
		filter.setPageSize(10);
		filter.setPageNum(1);
		filter.setWhere(whereMap);
		filter.setFields(fieldMap);
		filter.setOrder(orderList);
		ApiResponse response = apiCallController.apiPage(filter);

		System.out.println("====== Find by filter ======");
		System.out.println(filter.toString());
		System.out.println("Total count: " + response.getTotal());
		List<Map<String, Object>> data = (List<Map<String, Object>>)response.getData();
		for (Map<String, Object> datum : data) {
			System.out.println(datum.toString());
		}
		System.out.println("\n\n");
	}

	@Test
	public void allTest() {
		createTest();
		patchTest();
		getTest();
		deleteTest();
		findPageTest();
	}
}

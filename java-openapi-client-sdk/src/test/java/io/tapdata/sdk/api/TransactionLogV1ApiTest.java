/*
 * Tapdata OpenAPI
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: moa-v1.1.0-117-g6b02a67
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.tapdata.sdk.api;

import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.model.CONSUMPTIONLOG;
import io.tapdata.sdk.model.Filter1;
import io.tapdata.sdk.model.InlineResponse2001;
import io.tapdata.sdk.model.TransactionLog;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import org.junit.Ignore;
import org.threeten.bp.OffsetDateTime;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionLogV1Api
 */
//@Ignore
public class TransactionLogV1ApiTest {

    private final ApiClient apiClient = new ApiClient(
            "5c0e750b7a5cd42464a5099d",
            "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9",
            "http://106.75.162.192:3080", // http://127.0.0.1:3080
            "http://106.75.162.192:3030/oauth/token" // http://127.0.0.1:3030/oauth/token
    );
    private final TransactionLogV1Api api = new TransactionLogV1Api(apiClient);

    private static String id;

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionLogV1ControllerCreateTest() throws ApiException {
        TransactionLog transactionLog = new TransactionLog();
        transactionLog.setCUSTOMERID("C000079948");
        transactionLog.setAMOUNT(new BigDecimal(RandomUtils.nextDouble(100, 200000)).setScale(2, BigDecimal.ROUND_HALF_UP));
        transactionLog.setBUYTIME(OffsetDateTime.now());
        transactionLog.setSHOP("LV");
        TransactionLog response = api.transactionLogV1ControllerCreate(transactionLog);

        // TODO: test validations
        System.out.println("====== Create transactionLog ======");
        System.out.println(response.toString());
        id = response.getId();
        System.out.println("\n\n");
    }
    
    /**
     * delete record by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionLogV1ControllerDeleteByIdTest() throws ApiException {
        String id = this.id;
        api.transactionLogV1ControllerDeleteById(id);

        // TODO: test validations
    }
    
    /**
     * get record by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionLogV1ControllerFindByIdTest() throws ApiException {
        String id = this.id;
        TransactionLog response = api.transactionLogV1ControllerFindById(id);

        // TODO: test validations
        System.out.println("====== Find by id: " + this.id + " ======");
        System.out.println(response.toString());
        System.out.println("\n\n");
    }
    
    /**
     * get record list by page and limit
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionLogV1ControllerFindPageTest() throws ApiException {
        Filter1 filter = new Filter1();
        Map<String, Object> where = new HashMap<String, Object>(){{
            put("[AMOUNT][gt]", 100000);
        }};
        filter.setWhere(where);
        filter.setLimit(10);
        filter.setSkip(0);
        filter.setOrder(new ArrayList<String>(){{
            add("AMOUNT+DESC");
        }});
        InlineResponse2001 response = api.transactionLogV1ControllerFindPage(filter);

        // TODO: test validations
        System.out.println("====== Find by filter ======");
        System.out.println(filter.toString());
        System.out.println("Total count: " + response.getTotal());
        List<TransactionLog> data = response.getData();
        for (TransactionLog datum : data) {
            System.out.println(datum.toString());
        }
        System.out.println("\n\n");
    }
    
    /**
     * update record by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionLogV1ControllerUpdateByIdTest() throws ApiException {
        String id = this.id;
        TransactionLog transactionLog = new TransactionLog();
        BigDecimal update = new BigDecimal(RandomUtils.nextDouble(1000, 200000)).setScale(2, BigDecimal.ROUND_HALF_UP);
        transactionLog.setAMOUNT(update);
        api.transactionLogV1ControllerUpdateById(id, transactionLog);

        // TODO: test validations
        System.out.println("====== Update AMOUNT=" + update + " by id succeed ======\n\n");
    }

    @Test
    public void allTest() throws ApiException {
        this.transactionLogV1ControllerCreateTest();
        this.transactionLogV1ControllerFindByIdTest();
        this.transactionLogV1ControllerUpdateByIdTest();
        this.transactionLogV1ControllerFindByIdTest();
        this.transactionLogV1ControllerFindPageTest();
    }
    
}

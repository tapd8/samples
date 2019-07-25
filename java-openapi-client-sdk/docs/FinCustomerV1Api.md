# FinCustomerV1Api

All URIs are relative to *http://106.75.162.192:3080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fINCUSTOMERV1ControllerCreate**](FinCustomerV1Api.md#fINCUSTOMERV1ControllerCreate) | **POST** /api/v1/FIN_CUSTOMER | 
[**fINCUSTOMERV1ControllerDeleteById**](FinCustomerV1Api.md#fINCUSTOMERV1ControllerDeleteById) | **DELETE** /api/v1/FIN_CUSTOMER/{id} | delete record by id
[**fINCUSTOMERV1ControllerFindById**](FinCustomerV1Api.md#fINCUSTOMERV1ControllerFindById) | **GET** /api/v1/FIN_CUSTOMER/{id} | get record by id
[**fINCUSTOMERV1ControllerFindPage**](FinCustomerV1Api.md#fINCUSTOMERV1ControllerFindPage) | **GET** /api/v1/FIN_CUSTOMER | get record list by page and limit
[**fINCUSTOMERV1ControllerUpdateById**](FinCustomerV1Api.md#fINCUSTOMERV1ControllerUpdateById) | **PATCH** /api/v1/FIN_CUSTOMER/{id} | update record by id


<a name="fINCUSTOMERV1ControllerCreate"></a>
# **fINCUSTOMERV1ControllerCreate**
> FINCUSTOMER fINCUSTOMERV1ControllerCreate(FINCUSTOMER)



### Example
```java
// Import classes:
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.auth.*;
import io.tapdata.sdk.models.*;
import io.tapdata.sdk.api.FinCustomerV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://106.75.162.192:3080");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    FinCustomerV1Api apiInstance = new FinCustomerV1Api(defaultClient);
    FINCUSTOMER FINCUSTOMER = new FINCUSTOMER(); // FINCUSTOMER | 
    try {
      FINCUSTOMER result = apiInstance.fINCUSTOMERV1ControllerCreate(FINCUSTOMER);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FinCustomerV1Api#fINCUSTOMERV1ControllerCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FINCUSTOMER** | [**FINCUSTOMER**](FINCUSTOMER.md)|  | [optional]

### Return type

[**FINCUSTOMER**](FINCUSTOMER.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | FIN_CUSTOMER model instance |  -  |

<a name="fINCUSTOMERV1ControllerDeleteById"></a>
# **fINCUSTOMERV1ControllerDeleteById**
> fINCUSTOMERV1ControllerDeleteById(id)

delete record by id

### Example
```java
// Import classes:
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.auth.*;
import io.tapdata.sdk.models.*;
import io.tapdata.sdk.api.FinCustomerV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://106.75.162.192:3080");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    FinCustomerV1Api apiInstance = new FinCustomerV1Api(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.fINCUSTOMERV1ControllerDeleteById(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling FinCustomerV1Api#fINCUSTOMERV1ControllerDeleteById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | FIN_CUSTOMER DELETE success |  -  |

<a name="fINCUSTOMERV1ControllerFindById"></a>
# **fINCUSTOMERV1ControllerFindById**
> FINCUSTOMER fINCUSTOMERV1ControllerFindById(id)

get record by id

### Example
```java
// Import classes:
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.auth.*;
import io.tapdata.sdk.models.*;
import io.tapdata.sdk.api.FinCustomerV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://106.75.162.192:3080");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    FinCustomerV1Api apiInstance = new FinCustomerV1Api(defaultClient);
    String id = "id_example"; // String | 
    try {
      FINCUSTOMER result = apiInstance.fINCUSTOMERV1ControllerFindById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FinCustomerV1Api#fINCUSTOMERV1ControllerFindById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**FINCUSTOMER**](FINCUSTOMER.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | FIN_CUSTOMER model instance |  -  |

<a name="fINCUSTOMERV1ControllerFindPage"></a>
# **fINCUSTOMERV1ControllerFindPage**
> InlineResponse200 fINCUSTOMERV1ControllerFindPage(filter)

get record list by page and limit

### Example
```java
// Import classes:
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.auth.*;
import io.tapdata.sdk.models.*;
import io.tapdata.sdk.api.FinCustomerV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://106.75.162.192:3080");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    FinCustomerV1Api apiInstance = new FinCustomerV1Api(defaultClient);
    Filter filter = new Filter(); // Filter | 
    try {
      InlineResponse200 result = apiInstance.fINCUSTOMERV1ControllerFindPage(filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FinCustomerV1Api#fINCUSTOMERV1ControllerFindPage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**Filter**](.md)|  | [optional] [default to null]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Object of page data, result.data is FIN_CUSTOMER model instances, result.total is model count. |  -  |

<a name="fINCUSTOMERV1ControllerUpdateById"></a>
# **fINCUSTOMERV1ControllerUpdateById**
> fINCUSTOMERV1ControllerUpdateById(id, FINCUSTOMER)

update record by id

### Example
```java
// Import classes:
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.auth.*;
import io.tapdata.sdk.models.*;
import io.tapdata.sdk.api.FinCustomerV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://106.75.162.192:3080");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    FinCustomerV1Api apiInstance = new FinCustomerV1Api(defaultClient);
    String id = "id_example"; // String | 
    FINCUSTOMER FINCUSTOMER = new FINCUSTOMER(); // FINCUSTOMER | 
    try {
      apiInstance.fINCUSTOMERV1ControllerUpdateById(id, FINCUSTOMER);
    } catch (ApiException e) {
      System.err.println("Exception when calling FinCustomerV1Api#fINCUSTOMERV1ControllerUpdateById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **FINCUSTOMER** | [**FINCUSTOMER**](FINCUSTOMER.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | FIN_CUSTOMER PATCH success |  -  |


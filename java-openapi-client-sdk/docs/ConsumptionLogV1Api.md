# ConsumptionLogV1Api

All URIs are relative to *http://106.75.162.192:3080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cONSUMPTIONLOGV1ControllerCreate**](ConsumptionLogV1Api.md#cONSUMPTIONLOGV1ControllerCreate) | **POST** /api/v1/CONSUMPTION_LOG | 
[**cONSUMPTIONLOGV1ControllerDeleteById**](ConsumptionLogV1Api.md#cONSUMPTIONLOGV1ControllerDeleteById) | **DELETE** /api/v1/CONSUMPTION_LOG/{id} | delete record by id
[**cONSUMPTIONLOGV1ControllerFindById**](ConsumptionLogV1Api.md#cONSUMPTIONLOGV1ControllerFindById) | **GET** /api/v1/CONSUMPTION_LOG/{id} | get record by id
[**cONSUMPTIONLOGV1ControllerFindPage**](ConsumptionLogV1Api.md#cONSUMPTIONLOGV1ControllerFindPage) | **GET** /api/v1/CONSUMPTION_LOG | get record list by page and limit
[**cONSUMPTIONLOGV1ControllerUpdateById**](ConsumptionLogV1Api.md#cONSUMPTIONLOGV1ControllerUpdateById) | **PATCH** /api/v1/CONSUMPTION_LOG/{id} | update record by id


<a name="cONSUMPTIONLOGV1ControllerCreate"></a>
# **cONSUMPTIONLOGV1ControllerCreate**
> CONSUMPTIONLOG cONSUMPTIONLOGV1ControllerCreate(CONSUMPTIONLOG)



### Example
```java
// Import classes:
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.auth.*;
import io.tapdata.sdk.models.*;
import io.tapdata.sdk.api.ConsumptionLogV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://106.75.162.192:3080");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ConsumptionLogV1Api apiInstance = new ConsumptionLogV1Api(defaultClient);
    CONSUMPTIONLOG CONSUMPTIONLOG = new CONSUMPTIONLOG(); // CONSUMPTIONLOG | 
    try {
      CONSUMPTIONLOG result = apiInstance.cONSUMPTIONLOGV1ControllerCreate(CONSUMPTIONLOG);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumptionLogV1Api#cONSUMPTIONLOGV1ControllerCreate");
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
 **CONSUMPTIONLOG** | [**CONSUMPTIONLOG**](CONSUMPTIONLOG.md)|  | [optional]

### Return type

[**CONSUMPTIONLOG**](CONSUMPTIONLOG.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | CONSUMPTION_LOG model instance |  -  |

<a name="cONSUMPTIONLOGV1ControllerDeleteById"></a>
# **cONSUMPTIONLOGV1ControllerDeleteById**
> cONSUMPTIONLOGV1ControllerDeleteById(id)

delete record by id

### Example
```java
// Import classes:
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.auth.*;
import io.tapdata.sdk.models.*;
import io.tapdata.sdk.api.ConsumptionLogV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://106.75.162.192:3080");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ConsumptionLogV1Api apiInstance = new ConsumptionLogV1Api(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.cONSUMPTIONLOGV1ControllerDeleteById(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumptionLogV1Api#cONSUMPTIONLOGV1ControllerDeleteById");
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

[ApiKeyAuth](../README.md#ApiKeyAuth), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | CONSUMPTION_LOG DELETE success |  -  |

<a name="cONSUMPTIONLOGV1ControllerFindById"></a>
# **cONSUMPTIONLOGV1ControllerFindById**
> CONSUMPTIONLOG cONSUMPTIONLOGV1ControllerFindById(id)

get record by id

### Example
```java
// Import classes:
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.auth.*;
import io.tapdata.sdk.models.*;
import io.tapdata.sdk.api.ConsumptionLogV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://106.75.162.192:3080");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ConsumptionLogV1Api apiInstance = new ConsumptionLogV1Api(defaultClient);
    String id = "id_example"; // String | 
    try {
      CONSUMPTIONLOG result = apiInstance.cONSUMPTIONLOGV1ControllerFindById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumptionLogV1Api#cONSUMPTIONLOGV1ControllerFindById");
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

[**CONSUMPTIONLOG**](CONSUMPTIONLOG.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | CONSUMPTION_LOG model instance |  -  |

<a name="cONSUMPTIONLOGV1ControllerFindPage"></a>
# **cONSUMPTIONLOGV1ControllerFindPage**
> InlineResponse200 cONSUMPTIONLOGV1ControllerFindPage(filter)

get record list by page and limit

### Example
```java
// Import classes:
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.auth.*;
import io.tapdata.sdk.models.*;
import io.tapdata.sdk.api.ConsumptionLogV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://106.75.162.192:3080");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ConsumptionLogV1Api apiInstance = new ConsumptionLogV1Api(defaultClient);
    Filter filter = new Filter(); // Filter | 
    try {
      InlineResponse200 result = apiInstance.cONSUMPTIONLOGV1ControllerFindPage(filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumptionLogV1Api#cONSUMPTIONLOGV1ControllerFindPage");
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

[ApiKeyAuth](../README.md#ApiKeyAuth), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Object of page data, result.data is CONSUMPTION_LOG model instances, result.total is model count. |  -  |

<a name="cONSUMPTIONLOGV1ControllerUpdateById"></a>
# **cONSUMPTIONLOGV1ControllerUpdateById**
> cONSUMPTIONLOGV1ControllerUpdateById(id, CONSUMPTIONLOG)

update record by id

### Example
```java
// Import classes:
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.auth.*;
import io.tapdata.sdk.models.*;
import io.tapdata.sdk.api.ConsumptionLogV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://106.75.162.192:3080");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ConsumptionLogV1Api apiInstance = new ConsumptionLogV1Api(defaultClient);
    String id = "id_example"; // String | 
    CONSUMPTIONLOG CONSUMPTIONLOG = new CONSUMPTIONLOG(); // CONSUMPTIONLOG | 
    try {
      apiInstance.cONSUMPTIONLOGV1ControllerUpdateById(id, CONSUMPTIONLOG);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumptionLogV1Api#cONSUMPTIONLOGV1ControllerUpdateById");
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
 **CONSUMPTIONLOG** | [**CONSUMPTIONLOG**](CONSUMPTIONLOG.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | CONSUMPTION_LOG PATCH success |  -  |


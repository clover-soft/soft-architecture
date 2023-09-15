# DefaultApi

All URIs are relative to *https://virtserver.swaggerhub.com/YAKOV_1/cloud_order/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ordersPost**](DefaultApi.md#ordersPost) | **POST** /orders | Create a new order


<a name="ordersPost"></a>
# **ordersPost**
> ordersPost(orderData)

Create a new order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
OrderData orderData = new OrderData(); // OrderData | Order data
try {
    apiInstance.ordersPost(orderData);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ordersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderData** | [**OrderData**](OrderData.md)| Order data |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


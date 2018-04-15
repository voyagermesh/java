# ApisApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAPIVersions**](ApisApi.md#getAPIVersions) | **GET** /apis/ | 


<a name="getAPIVersions"></a>
# **getAPIVersions**
> IoK8sApimachineryPkgApisMetaV1APIGroupList getAPIVersions()



get available API versions

### Example
```java
// Import classes:
//import com.appscode.voyager.client.ApiException;
//import com.appscode.voyager.client.apis.ApisApi;


ApisApi apiInstance = new ApisApi();
try {
    IoK8sApimachineryPkgApisMetaV1APIGroupList result = apiInstance.getAPIVersions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApisApi#getAPIVersions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IoK8sApimachineryPkgApisMetaV1APIGroupList**](IoK8sApimachineryPkgApisMetaV1APIGroupList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, application/vnd.kubernetes.protobuf
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf


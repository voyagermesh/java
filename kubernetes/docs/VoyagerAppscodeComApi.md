# VoyagerAppscodeComApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAPIGroup**](VoyagerAppscodeComApi.md#getAPIGroup) | **GET** /apis/voyager.appscode.com/ | 


<a name="getAPIGroup"></a>
# **getAPIGroup**
> IoK8sApimachineryPkgApisMetaV1APIGroup getAPIGroup()



get information of a group

### Example
```java
// Import classes:
//import com.appscode.voyager.client.ApiException;
//import com.appscode.voyager.client.apis.VoyagerAppscodeComApi;


VoyagerAppscodeComApi apiInstance = new VoyagerAppscodeComApi();
try {
    IoK8sApimachineryPkgApisMetaV1APIGroup result = apiInstance.getAPIGroup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoyagerAppscodeComApi#getAPIGroup");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IoK8sApimachineryPkgApisMetaV1APIGroup**](IoK8sApimachineryPkgApisMetaV1APIGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, application/vnd.kubernetes.protobuf
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf


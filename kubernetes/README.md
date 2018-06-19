# client-java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.appscode.voyager</groupId>
    <artifactId>client-java</artifactId>
    <version>1.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.appscode.voyager:client-java:1.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/client-java-1.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.appscode.voyager.client.*;
import com.appscode.voyager.client.auth.*;
import com.appscode.voyager.client.models.*;
import com.appscode.voyager.client.apis.ApisApi;

import java.io.File;
import java.util.*;

public class ApisApiExample {

    public static void main(String[] args) {
        
        ApisApi apiInstance = new ApisApi();
        try {
            V1APIGroupList result = apiInstance.getAPIVersions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApisApi#getAPIVersions");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApisApi* | [**getAPIVersions**](docs/ApisApi.md#getAPIVersions) | **GET** /apis/ | 
*VoyagerAppscodeComApi* | [**getAPIGroup**](docs/VoyagerAppscodeComApi.md#getAPIGroup) | **GET** /apis/voyager.appscode.com/ | 
*VoyagerAppscodeComV1beta1Api* | [**createNamespacedCertificate**](docs/VoyagerAppscodeComV1beta1Api.md#createNamespacedCertificate) | **POST** /apis/voyager.appscode.com/v1beta1/namespaces/{namespace}/certificates | 
*VoyagerAppscodeComV1beta1Api* | [**createNamespacedIngress**](docs/VoyagerAppscodeComV1beta1Api.md#createNamespacedIngress) | **POST** /apis/voyager.appscode.com/v1beta1/namespaces/{namespace}/ingresses | 
*VoyagerAppscodeComV1beta1Api* | [**deleteCollectionNamespacedCertificate**](docs/VoyagerAppscodeComV1beta1Api.md#deleteCollectionNamespacedCertificate) | **DELETE** /apis/voyager.appscode.com/v1beta1/namespaces/{namespace}/certificates | 
*VoyagerAppscodeComV1beta1Api* | [**deleteCollectionNamespacedIngress**](docs/VoyagerAppscodeComV1beta1Api.md#deleteCollectionNamespacedIngress) | **DELETE** /apis/voyager.appscode.com/v1beta1/namespaces/{namespace}/ingresses | 
*VoyagerAppscodeComV1beta1Api* | [**deleteNamespacedCertificate**](docs/VoyagerAppscodeComV1beta1Api.md#deleteNamespacedCertificate) | **DELETE** /apis/voyager.appscode.com/v1beta1/namespaces/{namespace}/certificates/{name} | 
*VoyagerAppscodeComV1beta1Api* | [**deleteNamespacedIngress**](docs/VoyagerAppscodeComV1beta1Api.md#deleteNamespacedIngress) | **DELETE** /apis/voyager.appscode.com/v1beta1/namespaces/{namespace}/ingresses/{name} | 
*VoyagerAppscodeComV1beta1Api* | [**getAPIResources**](docs/VoyagerAppscodeComV1beta1Api.md#getAPIResources) | **GET** /apis/voyager.appscode.com/v1beta1/ | 
*VoyagerAppscodeComV1beta1Api* | [**listCertificateForAllNamespaces**](docs/VoyagerAppscodeComV1beta1Api.md#listCertificateForAllNamespaces) | **GET** /apis/voyager.appscode.com/v1beta1/certificates | 
*VoyagerAppscodeComV1beta1Api* | [**listIngressForAllNamespaces**](docs/VoyagerAppscodeComV1beta1Api.md#listIngressForAllNamespaces) | **GET** /apis/voyager.appscode.com/v1beta1/ingresses | 
*VoyagerAppscodeComV1beta1Api* | [**listNamespacedCertificate**](docs/VoyagerAppscodeComV1beta1Api.md#listNamespacedCertificate) | **GET** /apis/voyager.appscode.com/v1beta1/namespaces/{namespace}/certificates | 
*VoyagerAppscodeComV1beta1Api* | [**listNamespacedIngress**](docs/VoyagerAppscodeComV1beta1Api.md#listNamespacedIngress) | **GET** /apis/voyager.appscode.com/v1beta1/namespaces/{namespace}/ingresses | 
*VoyagerAppscodeComV1beta1Api* | [**patchNamespacedCertificate**](docs/VoyagerAppscodeComV1beta1Api.md#patchNamespacedCertificate) | **PATCH** /apis/voyager.appscode.com/v1beta1/namespaces/{namespace}/certificates/{name} | 
*VoyagerAppscodeComV1beta1Api* | [**patchNamespacedIngress**](docs/VoyagerAppscodeComV1beta1Api.md#patchNamespacedIngress) | **PATCH** /apis/voyager.appscode.com/v1beta1/namespaces/{namespace}/ingresses/{name} | 
*VoyagerAppscodeComV1beta1Api* | [**readNamespacedCertificate**](docs/VoyagerAppscodeComV1beta1Api.md#readNamespacedCertificate) | **GET** /apis/voyager.appscode.com/v1beta1/namespaces/{namespace}/certificates/{name} | 
*VoyagerAppscodeComV1beta1Api* | [**readNamespacedIngress**](docs/VoyagerAppscodeComV1beta1Api.md#readNamespacedIngress) | **GET** /apis/voyager.appscode.com/v1beta1/namespaces/{namespace}/ingresses/{name} | 
*VoyagerAppscodeComV1beta1Api* | [**replaceNamespacedCertificate**](docs/VoyagerAppscodeComV1beta1Api.md#replaceNamespacedCertificate) | **PUT** /apis/voyager.appscode.com/v1beta1/namespaces/{namespace}/certificates/{name} | 
*VoyagerAppscodeComV1beta1Api* | [**replaceNamespacedIngress**](docs/VoyagerAppscodeComV1beta1Api.md#replaceNamespacedIngress) | **PUT** /apis/voyager.appscode.com/v1beta1/namespaces/{namespace}/ingresses/{name} | 


## Documentation for Models

 - [V1beta1ACMECertificateDetails](docs/V1beta1ACMECertificateDetails.md)
 - [V1beta1AuthOption](docs/V1beta1AuthOption.md)
 - [V1beta1BasicAuth](docs/V1beta1BasicAuth.md)
 - [V1beta1Certificate](docs/V1beta1Certificate.md)
 - [V1beta1CertificateCondition](docs/V1beta1CertificateCondition.md)
 - [V1beta1CertificateDetails](docs/V1beta1CertificateDetails.md)
 - [V1beta1CertificateList](docs/V1beta1CertificateList.md)
 - [V1beta1CertificateSpec](docs/V1beta1CertificateSpec.md)
 - [V1beta1CertificateStatus](docs/V1beta1CertificateStatus.md)
 - [V1beta1CertificateStorage](docs/V1beta1CertificateStorage.md)
 - [V1beta1ChallengeProvider](docs/V1beta1ChallengeProvider.md)
 - [V1beta1DNSChallengeProvider](docs/V1beta1DNSChallengeProvider.md)
 - [V1beta1FrontendRule](docs/V1beta1FrontendRule.md)
 - [V1beta1HTTPChallengeProvider](docs/V1beta1HTTPChallengeProvider.md)
 - [V1beta1HTTPIngressBackend](docs/V1beta1HTTPIngressBackend.md)
 - [V1beta1HTTPIngressPath](docs/V1beta1HTTPIngressPath.md)
 - [V1beta1HTTPIngressRuleValue](docs/V1beta1HTTPIngressRuleValue.md)
 - [V1beta1Ingress](docs/V1beta1Ingress.md)
 - [V1beta1IngressBackend](docs/V1beta1IngressBackend.md)
 - [V1beta1IngressList](docs/V1beta1IngressList.md)
 - [V1beta1IngressRule](docs/V1beta1IngressRule.md)
 - [V1beta1IngressSpec](docs/V1beta1IngressSpec.md)
 - [V1beta1IngressStatus](docs/V1beta1IngressStatus.md)
 - [V1beta1IngressTLS](docs/V1beta1IngressTLS.md)
 - [V1beta1LocalTypedReference](docs/V1beta1LocalTypedReference.md)
 - [V1beta1OAuth](docs/V1beta1OAuth.md)
 - [V1beta1TCPIngressRuleValue](docs/V1beta1TCPIngressRuleValue.md)
 - [V1beta1TLSAuth](docs/V1beta1TLSAuth.md)
 - [V1beta1VaultStore](docs/V1beta1VaultStore.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hello@appscode.com


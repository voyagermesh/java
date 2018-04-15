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
*CustomObjectsApi* | [**createClusterCustomObject**](docs/CustomObjectsApi.md#createClusterCustomObject) | **POST** /apis/{group}/{version}/{plural} | 
*CustomObjectsApi* | [**createNamespacedCustomObject**](docs/CustomObjectsApi.md#createNamespacedCustomObject) | **POST** /apis/{group}/{version}/namespaces/{namespace}/{plural} | 
*CustomObjectsApi* | [**deleteClusterCustomObject**](docs/CustomObjectsApi.md#deleteClusterCustomObject) | **DELETE** /apis/{group}/{version}/{plural}/{name} | 
*CustomObjectsApi* | [**deleteNamespacedCustomObject**](docs/CustomObjectsApi.md#deleteNamespacedCustomObject) | **DELETE** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name} | 
*CustomObjectsApi* | [**getClusterCustomObject**](docs/CustomObjectsApi.md#getClusterCustomObject) | **GET** /apis/{group}/{version}/{plural}/{name} | 
*CustomObjectsApi* | [**getNamespacedCustomObject**](docs/CustomObjectsApi.md#getNamespacedCustomObject) | **GET** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name} | 
*CustomObjectsApi* | [**listClusterCustomObject**](docs/CustomObjectsApi.md#listClusterCustomObject) | **GET** /apis/{group}/{version}/{plural} | 
*CustomObjectsApi* | [**listNamespacedCustomObject**](docs/CustomObjectsApi.md#listNamespacedCustomObject) | **GET** /apis/{group}/{version}/namespaces/{namespace}/{plural} | 
*CustomObjectsApi* | [**patchClusterCustomObject**](docs/CustomObjectsApi.md#patchClusterCustomObject) | **PATCH** /apis/{group}/{version}/{plural}/{name} | 
*CustomObjectsApi* | [**patchNamespacedCustomObject**](docs/CustomObjectsApi.md#patchNamespacedCustomObject) | **PATCH** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name} | 
*CustomObjectsApi* | [**replaceClusterCustomObject**](docs/CustomObjectsApi.md#replaceClusterCustomObject) | **PUT** /apis/{group}/{version}/{plural}/{name} | 
*CustomObjectsApi* | [**replaceNamespacedCustomObject**](docs/CustomObjectsApi.md#replaceNamespacedCustomObject) | **PUT** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name} | 
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

 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1ACMECertificateDetails](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1ACMECertificateDetails.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1AuthOption](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1AuthOption.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1BasicAuth](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1BasicAuth.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1Certificate](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1Certificate.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateCondition](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateCondition.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateDetails](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateDetails.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateSpec](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateSpec.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateStatus](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateStatus.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateStorage](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateStorage.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1ChallengeProvider](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1ChallengeProvider.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1DNSChallengeProvider](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1DNSChallengeProvider.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPChallengeProvider](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPChallengeProvider.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPIngressBackend](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPIngressBackend.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPIngressPath](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPIngressPath.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPIngressRuleValue](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPIngressRuleValue.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1Ingress](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1Ingress.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressBackend](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressBackend.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressList](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressList.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressRule](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressRule.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressStatus](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressStatus.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressTLS](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressTLS.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1LocalTypedReference](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1LocalTypedReference.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1TCPIngressRuleValue](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1TCPIngressRuleValue.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1TLSAuth](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1TLSAuth.md)
 - [ComGithubAppscodeVoyagerApisVoyagerV1beta1VaultStore](docs/ComGithubAppscodeVoyagerApisVoyagerV1beta1VaultStore.md)
 - [RuntimeRawExtension](docs/RuntimeRawExtension.md)
 - [V1APIGroup](docs/V1APIGroup.md)
 - [V1APIGroupList](docs/V1APIGroupList.md)
 - [V1APIResource](docs/V1APIResource.md)
 - [V1APIResourceList](docs/V1APIResourceList.md)
 - [V1Affinity](docs/V1Affinity.md)
 - [V1DeleteOptions](docs/V1DeleteOptions.md)
 - [V1GroupVersionForDiscovery](docs/V1GroupVersionForDiscovery.md)
 - [V1Initializer](docs/V1Initializer.md)
 - [V1Initializers](docs/V1Initializers.md)
 - [V1LabelSelector](docs/V1LabelSelector.md)
 - [V1LabelSelectorRequirement](docs/V1LabelSelectorRequirement.md)
 - [V1ListMeta](docs/V1ListMeta.md)
 - [V1LoadBalancerIngress](docs/V1LoadBalancerIngress.md)
 - [V1LoadBalancerStatus](docs/V1LoadBalancerStatus.md)
 - [V1LocalObjectReference](docs/V1LocalObjectReference.md)
 - [V1NodeAffinity](docs/V1NodeAffinity.md)
 - [V1NodeSelector](docs/V1NodeSelector.md)
 - [V1NodeSelectorRequirement](docs/V1NodeSelectorRequirement.md)
 - [V1NodeSelectorTerm](docs/V1NodeSelectorTerm.md)
 - [V1ObjectMeta](docs/V1ObjectMeta.md)
 - [V1OwnerReference](docs/V1OwnerReference.md)
 - [V1PodAffinity](docs/V1PodAffinity.md)
 - [V1PodAffinityTerm](docs/V1PodAffinityTerm.md)
 - [V1PodAntiAffinity](docs/V1PodAntiAffinity.md)
 - [V1Preconditions](docs/V1Preconditions.md)
 - [V1PreferredSchedulingTerm](docs/V1PreferredSchedulingTerm.md)
 - [V1ResourceRequirements](docs/V1ResourceRequirements.md)
 - [V1ServerAddressByClientCIDR](docs/V1ServerAddressByClientCIDR.md)
 - [V1Status](docs/V1Status.md)
 - [V1StatusCause](docs/V1StatusCause.md)
 - [V1StatusDetails](docs/V1StatusDetails.md)
 - [V1Toleration](docs/V1Toleration.md)
 - [V1WatchEvent](docs/V1WatchEvent.md)
 - [V1WeightedPodAffinityTerm](docs/V1WeightedPodAffinityTerm.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hello@appscode.com


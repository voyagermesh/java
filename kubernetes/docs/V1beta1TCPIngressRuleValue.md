
# V1beta1TCPIngressRuleValue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | The network address to listen TCP connections on. |  [optional]
**alpn** | **List&lt;String&gt;** | Application-Layer Protocol Negotiation (ALPN) is a Transport Layer Security (TLS) extension for application layer protocol negotiation. ALPN allows the application layer to negotiate which protocol should be performed over a secure connection in a manner which avoids additional round trips and which is independent of the application layer protocols. It is used by HTTP/2. If provided a list of alpn will be added to port as alpn option1,option2,... If SecretName is Provided this secret will be used to terminate SSL with alpn options. If Secret name is not provided backend server is responsible for handling SSL. |  [optional]
**backend** | [**V1beta1IngressBackend**](V1beta1IngressBackend.md) | Backend to forward the requests. |  [optional]
**noTLS** | **Boolean** | Set noTLS &#x3D; true to force plain text. Else, auto detect like present |  [optional]
**nodePort** | [**IoK8sApimachineryPkgUtilIntstrIntOrString**](IoK8sApimachineryPkgUtilIntstrIntOrString.md) | Specifies the node port of the referenced service. |  [optional]
**port** | [**IoK8sApimachineryPkgUtilIntstrIntOrString**](IoK8sApimachineryPkgUtilIntstrIntOrString.md) | port to listen tcp connections. |  [optional]




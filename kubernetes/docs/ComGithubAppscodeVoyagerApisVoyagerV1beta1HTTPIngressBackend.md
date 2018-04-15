
# ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPIngressBackend

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backendRules** | **List&lt;String&gt;** | Serialized HAProxy rules to apply on server backend including request, response or header rewrite. acls also can be used. https://cbonte.github.io/haproxy-dconv/1.7/configuration.html#1 |  [optional]
**headerRules** | **List&lt;String&gt;** | Header rules to modifies the header.  Deprecated: Use backendRule, will be removed. |  [optional]
**hostNames** | **List&lt;String&gt;** | Host names to forward traffic to. If empty traffic will be forwarded to all subsets instance. If set only matched hosts will get the traffic. This is an handy way to send traffic to Specific StatefulSet pod. IE. Setting [web-0] will send traffic to only web-0 host for this StatefulSet, https://kubernetes.io/docs/tasks/stateful-application/basic-stateful-set/#creating-a-statefulset |  [optional]
**name** | **String** | User can specify backend name for using it with custom acl Otherwise it will be generated |  [optional]
**rewriteRules** | **List&lt;String&gt;** | Path rewrite rules with haproxy formatted regex.  Deprecated: Use backendRule, will be removed. |  [optional]
**serviceName** | **String** | Specifies the name of the referenced service. |  [optional]
**servicePort** | **String** | Specifies the port of the referenced service. |  [optional]




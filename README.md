# Voyager Java Client

[![Build Status](https://travis-ci.org/voyager-client/java.svg?branch=master)](https://travis-ci.org/voyager-client/java)
[![Client Capabilities](https://img.shields.io/badge/Kubernetes%20client-Silver-blue.svg?style=flat&colorB=C0C0C0&colorA=306CE8)](http://bit.ly/kubernetes-client-capabilities-badge)
[![Client Support Level](https://img.shields.io/badge/kubernetes%20client-beta-green.svg?style=flat&colorA=306CE8)](http://bit.ly/kubernetes-client-support-badge)

Official Java client for the [Voyager by AppsCode](https://appscode.com/products/voyager/) - Secure HAProxy Ingress Controller for Kubernetes.

## Installation

To install the Java client library to your local Maven repository, simply execute:

```shell
git clone --recursive https://github.com/voyager-client/java
cd java
mvn install
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

```groovy
compile 'io.kubernetes:client-java:1.0.0'
```

### Others

At first generate the JAR by executing:

```
git clone --recursive https://github.com/voyager-client/java
cd java
mvn package
```

Then manually install the following JARs:

* target/client-java-1.0.0-SNAPSHOT.jar
* target/lib/*.jar

## Example

list all pods:

```java
import com.appscode.voyager.client.ApiClient;
import com.appscode.voyager.client.ApiException;
import com.appscode.voyager.client.Configuration;
import com.appscode.voyager.client.apis.VoyagerAppscodeComV1beta1Api;
import com.appscode.voyager.client.models.V1beta1Ingress;
import com.appscode.voyager.client.models.V1beta1IngressList;
import com.appscode.voyager.client.util.Config;
import java.io.IOException;

public class Example {
  public static void main(String[] args) throws IOException, ApiException {
    ApiClient client = Config.defaultClient();
    Configuration.setDefaultApiClient(client);

    VoyagerAppscodeComV1beta1Api api = new VoyagerAppscodeComV1beta1Api();
    V1beta1IngressList list =
        api.listIngressForAllNamespaces(null, null, null, null, null, null, null, null, null);
    for (V1beta1Ingress item : list.getItems()) {
      System.out.println(item.getMetadata().getName());
    }
  }
}
```

watch on ingress object:

```java
import com.appscode.voyager.client.ApiClient;
import com.appscode.voyager.client.ApiException;
import com.appscode.voyager.client.Configuration;
import com.appscode.voyager.client.apis.VoyagerAppscodeComV1beta1Api;
import com.appscode.voyager.client.models.V1beta1Ingress;
import com.appscode.voyager.client.util.Config;
import com.appscode.voyager.client.util.Watch;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WatchExample {
  public static void main(String[] args) throws IOException, ApiException {
    ApiClient client = Config.defaultClient();
    client.getHttpClient().setReadTimeout(60, TimeUnit.SECONDS);
    Configuration.setDefaultApiClient(client);

    VoyagerAppscodeComV1beta1Api api = new VoyagerAppscodeComV1beta1Api();

    Watch<V1beta1Ingress> watch =
        Watch.createWatch(
            client,
            api.listIngressForAllNamespacesCall(
                null, null, null, null, null, "false", null, null, Boolean.TRUE, null, null),
            new TypeToken<Watch.Response<V1beta1Ingress>>() {}.getType());

    for (Watch.Response<V1beta1Ingress> item : watch) {
      System.out.printf("%s : %s%n", item.type, item.object.getMetadata().getName());
    }
  }
}
```

More examples can be found in [examples](examples/) folder. To run examples, run this command:

```shell
mvn exec:java -Dexec.mainClass="com.appscode.voyager.client.examples.Example"
```

## Documentation

All APIs and Models' documentation can be found at the [Generated client's README file](kubernetes/README.md)

## Compatibility

|                          | Kubernetes 1.4 | Kubernetes 1.5 | Kubernetes 1.6 | Kubernetes 1.7 | Kubernetes 1.8 | Kubernetes 1.9 |
|--------------------------|----------------|----------------|----------------|----------------|----------------|----------------|
| java-client 1.0-SNAPSHOT | +              | +              | +              | +              | ✓              | -              |

Key:

* `✓` Exactly the same features / API objects in both java-client and the Kubernetes
  version.
* `+` java-client has features or api objects that may not be present in the
  Kubernetes cluster, but everything they have in common will work.
* `-` The Kubernetes cluster has features the java-client library can't use
  (additional API objects, etc).

See the [CHANGELOG](./CHANGELOG.md) for a detailed description of changes
between java-client versions.

## Community, Support, Discussion

We use Slack for public discussions. To chit chat with us or the rest of the community, join us in the [AppsCode Slack team](https://appscode.slack.com/messages/C0XQFLGRM/details/) channel `#general`. To sign up, use our [Slack inviter](https://slack.appscode.com/).

If you have any problem with the package or any suggestions, please file an [issue](https://github.com/voyager-client/java/issues).

# Development

## Update client

To update the client clone the `gen` repo and run this command at the root of this repo:

```bash
../gen/openapi/autoupdate.sh
```

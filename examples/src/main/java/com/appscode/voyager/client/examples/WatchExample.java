package com.appscode.voyager.client.examples;

import com.google.gson.reflect.TypeToken;
import com.appscode.voyager.client.ApiClient;
import com.appscode.voyager.client.ApiException;
import com.appscode.voyager.client.Configuration;
import com.appscode.voyager.client.apis.VoyagerAppscodeComV1beta1Api;
import com.appscode.voyager.client.models.V1beta1Ingress;
import com.appscode.voyager.client.util.Config;
import com.appscode.voyager.client.util.Watch;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/** A simple example of how to use Watch API to watch changes in Ingress list. */
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

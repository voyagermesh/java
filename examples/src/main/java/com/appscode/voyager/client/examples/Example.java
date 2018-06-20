/*
Copyright 2017 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.appscode.voyager.client.examples;

import com.appscode.voyager.client.ApiClient;
import com.appscode.voyager.client.ApiException;
import com.appscode.voyager.client.Configuration;
import com.appscode.voyager.client.apis.VoyagerAppscodeComV1beta1Api;
import com.appscode.voyager.client.models.V1beta1Ingress;
import com.appscode.voyager.client.models.V1beta1IngressList;
import com.appscode.voyager.client.util.Config;
import java.io.IOException;

/**
 * A simple example of how to use the Java API
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="com.appscode.voyager.client.examples.Example"
 *
 * <p>From inside $REPO_DIR/examples
 */
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

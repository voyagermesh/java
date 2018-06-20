package com.appscode.voyager.client.examples;

import com.appscode.voyager.client.ApiClient;
import com.appscode.voyager.client.ApiException;
import com.appscode.voyager.client.Configuration;
import com.appscode.voyager.client.apis.VoyagerAppscodeComV1beta1Api;
import com.appscode.voyager.client.models.V1beta1Ingress;
import com.appscode.voyager.client.util.ClientBuilder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A simple Example of how to use the Java API.<br>
 * This example demonstrates patching of Ingress using Json Patch.<br>
 * For generating Json Patches, refer <a href="http://jsonpatch.com/">http://jsonpatch.com</a>.
 *
 * <ul>
 *   <li>Creates ingress test-ingress with <b>terminationGracePeriodSeconds</b> value as 30.
 *   <li>Patches ingress test-ingress with <b>terminationGracePeriodSeconds</b> value as 27.
 * </ul>
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="com.appscode.voyager.client.examples.PatchExample"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class PatchExample {
  static String jsonPatchStr =
      "{\"op\":\"replace\",\"path\":\"/spec/rules/0/host\",\"value\":\"www.example.com\"}";
  static String jsonDepStr =
      "{\"apiVersion\":\"voyager.appscode.com/v1beta1\",\"kind\":\"Ingress\",\"metadata\":{\"name\":\"test-ingress\",\"namespace\":\"default\",\"annotations\":{\"ingress.appscode.com/type\":\"NodePort\",\"ingress.appscode.com/use-node-port\":\"false\"}},\"spec\":{\"rules\":[{\"host\":\"web.example.com\",\"http\":{\"paths\":[{\"backend\":{\"serviceName\":\"web\",\"servicePort\":80},\"path\":\"/\"}]}}]}}";

  public static void main(String[] args) throws IOException, ApiException {
    PatchExample example = new PatchExample();
    ApiClient client = ClientBuilder.defaultClient();
    Configuration.setDefaultApiClient(client);

    V1beta1Ingress body = (V1beta1Ingress) example.deserialize(jsonDepStr, V1beta1Ingress.class);
    V1beta1Ingress deploy1 = example.createIngress("default", body, "false");
    System.out.println("original ingress" + deploy1);

    ArrayList<JsonObject> arr = new ArrayList<>();
    arr.add(((JsonElement) example.deserialize(jsonPatchStr, JsonElement.class)).getAsJsonObject());
    V1beta1Ingress deploy2 = example.PatchIngress("test-ingress", "default", arr, "false");
    System.out.println("patched ingress" + deploy2);
  }

  public V1beta1Ingress createIngress(String namespace, V1beta1Ingress body, String pretty)
      throws ApiException {
    VoyagerAppscodeComV1beta1Api api = new VoyagerAppscodeComV1beta1Api();
    V1beta1Ingress deploy = api.createNamespacedIngress(namespace, body, pretty);
    return deploy;
  }

  public V1beta1Ingress PatchIngress(
      String deployName, String namespace, Object body, String pretty) throws ApiException {
    VoyagerAppscodeComV1beta1Api api = new VoyagerAppscodeComV1beta1Api();
    V1beta1Ingress deploy = api.patchNamespacedIngress(deployName, namespace, body, pretty);
    return deploy;
  }

  public Object deserialize(String jsonStr, Class<?> targetClass) {
    Object obj = (new Gson()).fromJson(jsonStr, targetClass);
    return obj;
  }
}

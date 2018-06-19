package com.appscode.voyager.client.util;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.auth.ApiKeyAuth;

public class TestUtils {

  public static ApiKeyAuth getApiKeyAuthFromClient(ApiClient client) {
    return (ApiKeyAuth) client.getAuthentications().get("BearerToken");
  }
}

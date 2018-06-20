package com.appscode.voyager.client.util;

import com.appscode.voyager.client.ApiClient;
import io.kubernetes.client.auth.ApiKeyAuth;

public class TestUtils {

  public static ApiKeyAuth getApiKeyAuthFromClient(ApiClient client) {
    return (ApiKeyAuth) client.getAuthentications().get("BearerToken");
  }
}

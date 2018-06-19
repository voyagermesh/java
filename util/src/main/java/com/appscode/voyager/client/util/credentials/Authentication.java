package com.appscode.voyager.client.util.credentials;

import io.kubernetes.client.ApiClient;
import com.appscode.voyager.client.util.ClientBuilder;

/**
 * Allows the implementation of different authentication mechanisms for the Kubernetes API.
 *
 * @see ClientBuilder#setAuthentication(Authentication)
 */
public interface Authentication {

  void provide(ApiClient client);
}

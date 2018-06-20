package com.appscode.voyager.client.util.credentials;

import static com.appscode.voyager.client.util.TestUtils.getApiKeyAuthFromClient;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import com.appscode.voyager.client.ApiClient;
import com.google.common.base.Charsets;
import okio.ByteString;
import org.junit.Test;

public class UsernamePasswordAuthenticationTest {

  private static final String USERNAME = "username";
  private static final String PASSWORD = "password";
  public static final byte[] USERNAME_PASSWORD_BYTES =
      (USERNAME + ":" + PASSWORD).getBytes(Charsets.ISO_8859_1);

  @Test
  public void testUsernamePasswordProvided() {
    final ApiClient client = new ApiClient();
    new UsernamePasswordAuthentication(USERNAME, PASSWORD).provide(client);
    assertThat(getApiKeyAuthFromClient(client).getApiKeyPrefix(), is("Basic"));
    assertThat(
        getApiKeyAuthFromClient(client).getApiKey(),
        is(ByteString.of(USERNAME_PASSWORD_BYTES).base64()));
  }
}

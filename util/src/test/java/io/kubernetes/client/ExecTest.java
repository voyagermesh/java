/*
Copyright 2018 The Kubernetes Authors.
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
package io.kubernetes.client;

import static org.junit.Assert.*;

import io.kubernetes.client.util.ClientBuilder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.junit.Before;
import org.junit.Test;

/** Tests for the Exec helper class */
public class ExecTest {

  private static final String OUTPUT_EXIT0 = "{\"metadata\":{},\"status\":\"Success\"}";
  private static final String OUTPUT_EXIT1 =
      "{\"metadata\":{},\"status\":\"Failure\",\"message\":\"command terminated with non-zero exit code: Error executing in Docker Container: 1\",\"reason\":\"NonZeroExitCode\",\"details\":{\"causes\":[{\"reason\":\"ExitCode\",\"message\":\"1\"}]}}";
  private static final String OUTPUT_EXIT126 =
      "{\"metadata\":{},\"status\":\"Failure\",\"message\":\"command terminated with non-zero exit code: Error executing in Docker Container: 126\",\"reason\":\"NonZeroExitCode\",\"details\":{\"causes\":[{\"reason\":\"ExitCode\",\"message\":\"126\"}]}}";
  private static final String BAD_OUTPUT_INCOMPLETE_MSG1 =
      "{\"metadata\":{},\"status\":\"Failure\",\"message\":\"command terminated with non-zero exit code: Error executing in Docker Container: 1\",\"reas";

  private ApiClient client;

  @Before
  public void setup() throws IOException {
    client = ClientBuilder.defaultClient();
  }

  @Test
  public void testExit0() {
    InputStream inputStream =
        new ByteArrayInputStream(OUTPUT_EXIT0.getBytes(StandardCharsets.UTF_8));
    int exitCode = Exec.parseExitCode(client, inputStream);
    assertEquals(0, exitCode);
  }

  @Test
  public void testExit1() {
    InputStream inputStream =
        new ByteArrayInputStream(OUTPUT_EXIT1.getBytes(StandardCharsets.UTF_8));
    int exitCode = Exec.parseExitCode(client, inputStream);
    assertEquals(1, exitCode);
  }

  @Test
  public void testExit126() {
    InputStream inputStream =
        new ByteArrayInputStream(OUTPUT_EXIT126.getBytes(StandardCharsets.UTF_8));
    int exitCode = Exec.parseExitCode(client, inputStream);
    assertEquals(126, exitCode);
  }

  @Test
  public void testIncompleteData1() {
    InputStream inputStream =
        new ByteArrayInputStream(BAD_OUTPUT_INCOMPLETE_MSG1.getBytes(StandardCharsets.UTF_8));
    int exitCode = Exec.parseExitCode(client, inputStream);
    assertEquals(-1, exitCode);
  }
}

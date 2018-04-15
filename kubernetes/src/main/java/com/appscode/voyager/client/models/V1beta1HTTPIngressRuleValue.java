/*
 * voyager-server
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * Contact: hello@appscode.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.appscode.voyager.client.models;

import java.util.Objects;
import com.appscode.voyager.client.models.V1beta1HTTPIngressPath;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.custom.IntOrString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://&lt;host&gt;/&lt;path&gt;?&lt;searchpart&gt; -&gt; backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last &#39;/&#39; and before the first &#39;?&#39; or &#39;#&#39;.
 */
@ApiModel(description = "HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last '/' and before the first '?' or '#'.")

public class V1beta1HTTPIngressRuleValue {
  @SerializedName("address")
  private String address = null;

  @SerializedName("noTLS")
  private Boolean noTLS = null;

  @SerializedName("nodePort")
  private IntOrString nodePort = null;

  @SerializedName("paths")
  private List<V1beta1HTTPIngressPath> paths = new ArrayList<V1beta1HTTPIngressPath>();

  @SerializedName("port")
  private IntOrString port = null;

  public V1beta1HTTPIngressRuleValue address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The network address to listen HTTP(s) connections on.
   * @return address
  **/
  @ApiModelProperty(value = "The network address to listen HTTP(s) connections on.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public V1beta1HTTPIngressRuleValue noTLS(Boolean noTLS) {
    this.noTLS = noTLS;
    return this;
  }

   /**
   * Set noTLS &#x3D; true to force plain text. Else, auto detect like present
   * @return noTLS
  **/
  @ApiModelProperty(value = "Set noTLS = true to force plain text. Else, auto detect like present")
  public Boolean isNoTLS() {
    return noTLS;
  }

  public void setNoTLS(Boolean noTLS) {
    this.noTLS = noTLS;
  }

  public V1beta1HTTPIngressRuleValue nodePort(IntOrString nodePort) {
    this.nodePort = nodePort;
    return this;
  }

   /**
   * Specifies the node port of the referenced service.
   * @return nodePort
  **/
  @ApiModelProperty(value = "Specifies the node port of the referenced service.")
  public IntOrString getNodePort() {
    return nodePort;
  }

  public void setNodePort(IntOrString nodePort) {
    this.nodePort = nodePort;
  }

  public V1beta1HTTPIngressRuleValue paths(List<V1beta1HTTPIngressPath> paths) {
    this.paths = paths;
    return this;
  }

  public V1beta1HTTPIngressRuleValue addPathsItem(V1beta1HTTPIngressPath pathsItem) {
    this.paths.add(pathsItem);
    return this;
  }

   /**
   * A collection of paths that map requests to backends.
   * @return paths
  **/
  @ApiModelProperty(required = true, value = "A collection of paths that map requests to backends.")
  public List<V1beta1HTTPIngressPath> getPaths() {
    return paths;
  }

  public void setPaths(List<V1beta1HTTPIngressPath> paths) {
    this.paths = paths;
  }

  public V1beta1HTTPIngressRuleValue port(IntOrString port) {
    this.port = port;
    return this;
  }

   /**
   * port to listen http(s) connections.
   * @return port
  **/
  @ApiModelProperty(value = "port to listen http(s) connections.")
  public IntOrString getPort() {
    return port;
  }

  public void setPort(IntOrString port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1HTTPIngressRuleValue v1beta1HTTPIngressRuleValue = (V1beta1HTTPIngressRuleValue) o;
    return Objects.equals(this.address, v1beta1HTTPIngressRuleValue.address) &&
        Objects.equals(this.noTLS, v1beta1HTTPIngressRuleValue.noTLS) &&
        Objects.equals(this.nodePort, v1beta1HTTPIngressRuleValue.nodePort) &&
        Objects.equals(this.paths, v1beta1HTTPIngressRuleValue.paths) &&
        Objects.equals(this.port, v1beta1HTTPIngressRuleValue.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, noTLS, nodePort, paths, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1HTTPIngressRuleValue {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    noTLS: ").append(toIndentedString(noTLS)).append("\n");
    sb.append("    nodePort: ").append(toIndentedString(nodePort)).append("\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


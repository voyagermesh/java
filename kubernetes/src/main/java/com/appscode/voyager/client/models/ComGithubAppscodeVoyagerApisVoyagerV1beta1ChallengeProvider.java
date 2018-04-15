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
import com.appscode.voyager.client.models.ComGithubAppscodeVoyagerApisVoyagerV1beta1DNSChallengeProvider;
import com.appscode.voyager.client.models.ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPChallengeProvider;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComGithubAppscodeVoyagerApisVoyagerV1beta1ChallengeProvider
 */

public class ComGithubAppscodeVoyagerApisVoyagerV1beta1ChallengeProvider {
  @SerializedName("dns")
  private ComGithubAppscodeVoyagerApisVoyagerV1beta1DNSChallengeProvider dns = null;

  @SerializedName("http")
  private ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPChallengeProvider http = null;

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1ChallengeProvider dns(ComGithubAppscodeVoyagerApisVoyagerV1beta1DNSChallengeProvider dns) {
    this.dns = dns;
    return this;
  }

   /**
   * Get dns
   * @return dns
  **/
  @ApiModelProperty(value = "")
  public ComGithubAppscodeVoyagerApisVoyagerV1beta1DNSChallengeProvider getDns() {
    return dns;
  }

  public void setDns(ComGithubAppscodeVoyagerApisVoyagerV1beta1DNSChallengeProvider dns) {
    this.dns = dns;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1ChallengeProvider http(ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPChallengeProvider http) {
    this.http = http;
    return this;
  }

   /**
   * Get http
   * @return http
  **/
  @ApiModelProperty(value = "")
  public ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPChallengeProvider getHttp() {
    return http;
  }

  public void setHttp(ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPChallengeProvider http) {
    this.http = http;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubAppscodeVoyagerApisVoyagerV1beta1ChallengeProvider comGithubAppscodeVoyagerApisVoyagerV1beta1ChallengeProvider = (ComGithubAppscodeVoyagerApisVoyagerV1beta1ChallengeProvider) o;
    return Objects.equals(this.dns, comGithubAppscodeVoyagerApisVoyagerV1beta1ChallengeProvider.dns) &&
        Objects.equals(this.http, comGithubAppscodeVoyagerApisVoyagerV1beta1ChallengeProvider.http);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dns, http);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubAppscodeVoyagerApisVoyagerV1beta1ChallengeProvider {\n");
    
    sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
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


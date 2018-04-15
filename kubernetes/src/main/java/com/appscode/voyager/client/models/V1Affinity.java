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
import com.appscode.voyager.client.models.V1NodeAffinity;
import com.appscode.voyager.client.models.V1PodAffinity;
import com.appscode.voyager.client.models.V1PodAntiAffinity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Affinity is a group of affinity scheduling rules.
 */
@ApiModel(description = "Affinity is a group of affinity scheduling rules.")

public class V1Affinity {
  @SerializedName("nodeAffinity")
  private V1NodeAffinity nodeAffinity = null;

  @SerializedName("podAffinity")
  private V1PodAffinity podAffinity = null;

  @SerializedName("podAntiAffinity")
  private V1PodAntiAffinity podAntiAffinity = null;

  public V1Affinity nodeAffinity(V1NodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
    return this;
  }

   /**
   * Describes node affinity scheduling rules for the pod.
   * @return nodeAffinity
  **/
  @ApiModelProperty(value = "Describes node affinity scheduling rules for the pod.")
  public V1NodeAffinity getNodeAffinity() {
    return nodeAffinity;
  }

  public void setNodeAffinity(V1NodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
  }

  public V1Affinity podAffinity(V1PodAffinity podAffinity) {
    this.podAffinity = podAffinity;
    return this;
  }

   /**
   * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
   * @return podAffinity
  **/
  @ApiModelProperty(value = "Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).")
  public V1PodAffinity getPodAffinity() {
    return podAffinity;
  }

  public void setPodAffinity(V1PodAffinity podAffinity) {
    this.podAffinity = podAffinity;
  }

  public V1Affinity podAntiAffinity(V1PodAntiAffinity podAntiAffinity) {
    this.podAntiAffinity = podAntiAffinity;
    return this;
  }

   /**
   * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
   * @return podAntiAffinity
  **/
  @ApiModelProperty(value = "Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).")
  public V1PodAntiAffinity getPodAntiAffinity() {
    return podAntiAffinity;
  }

  public void setPodAntiAffinity(V1PodAntiAffinity podAntiAffinity) {
    this.podAntiAffinity = podAntiAffinity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Affinity v1Affinity = (V1Affinity) o;
    return Objects.equals(this.nodeAffinity, v1Affinity.nodeAffinity) &&
        Objects.equals(this.podAffinity, v1Affinity.podAffinity) &&
        Objects.equals(this.podAntiAffinity, v1Affinity.podAntiAffinity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeAffinity, podAffinity, podAntiAffinity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Affinity {\n");
    
    sb.append("    nodeAffinity: ").append(toIndentedString(nodeAffinity)).append("\n");
    sb.append("    podAffinity: ").append(toIndentedString(podAffinity)).append("\n");
    sb.append("    podAntiAffinity: ").append(toIndentedString(podAntiAffinity)).append("\n");
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


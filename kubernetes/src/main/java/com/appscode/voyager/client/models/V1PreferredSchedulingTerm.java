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
import com.appscode.voyager.client.models.V1NodeSelectorTerm;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it&#39;s a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
 */
@ApiModel(description = "An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).")

public class V1PreferredSchedulingTerm {
  @SerializedName("preference")
  private V1NodeSelectorTerm preference = null;

  @SerializedName("weight")
  private Integer weight = null;

  public V1PreferredSchedulingTerm preference(V1NodeSelectorTerm preference) {
    this.preference = preference;
    return this;
  }

   /**
   * A node selector term, associated with the corresponding weight.
   * @return preference
  **/
  @ApiModelProperty(required = true, value = "A node selector term, associated with the corresponding weight.")
  public V1NodeSelectorTerm getPreference() {
    return preference;
  }

  public void setPreference(V1NodeSelectorTerm preference) {
    this.preference = preference;
  }

  public V1PreferredSchedulingTerm weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PreferredSchedulingTerm v1PreferredSchedulingTerm = (V1PreferredSchedulingTerm) o;
    return Objects.equals(this.preference, v1PreferredSchedulingTerm.preference) &&
        Objects.equals(this.weight, v1PreferredSchedulingTerm.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preference, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PreferredSchedulingTerm {\n");
    
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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


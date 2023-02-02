/*
 * Togai Apis
 * APIs for Togai App
 *
 * The version of the OpenAPI document: 1.0
 * Contact: engg@togai.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.togai.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.togai.client.JSON;

/**
 * Represents a pricing strategy (rates + slabs) for usage price plan
 */
@ApiModel(description = "Represents a pricing strategy (rates + slabs) for usage price plan")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageStrategy implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private BigDecimal rate;

  public static final String SERIALIZED_NAME_START_AFTER = "startAfter";
  @SerializedName(SERIALIZED_NAME_START_AFTER)
  private Double startAfter;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public UsageStrategy() {
  }

  public UsageStrategy rate(BigDecimal rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getRate() {
    return rate;
  }


  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }


  public UsageStrategy startAfter(Double startAfter) {
    
    this.startAfter = startAfter;
    return this;
  }

   /**
   * Get startAfter
   * @return startAfter
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getStartAfter() {
    return startAfter;
  }


  public void setStartAfter(Double startAfter) {
    this.startAfter = startAfter;
  }


  public UsageStrategy order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * minimum: 1
   * maximum: 10
   * @return order
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageStrategy usageStrategy = (UsageStrategy) o;
    return Objects.equals(this.rate, usageStrategy.rate) &&
        Objects.equals(this.startAfter, usageStrategy.startAfter) &&
        Objects.equals(this.order, usageStrategy.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, startAfter, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageStrategy {\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    startAfter: ").append(toIndentedString(startAfter)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("rate");
    openapiFields.add("startAfter");
    openapiFields.add("order");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("rate");
    openapiRequiredFields.add("startAfter");
    openapiRequiredFields.add("order");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsageStrategy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UsageStrategy.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsageStrategy is not found in the empty JSON string", UsageStrategy.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UsageStrategy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UsageStrategy` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UsageStrategy.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsageStrategy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsageStrategy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsageStrategy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsageStrategy.class));

       return (TypeAdapter<T>) new TypeAdapter<UsageStrategy>() {
           @Override
           public void write(JsonWriter out, UsageStrategy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UsageStrategy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UsageStrategy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsageStrategy
  * @throws IOException if the JSON string is invalid with respect to UsageStrategy
  */
  public static UsageStrategy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsageStrategy.class);
  }

 /**
  * Convert an instance of UsageStrategy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

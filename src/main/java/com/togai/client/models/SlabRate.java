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
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.togai.client.JSON;

/**
 * Represents a rate for a slab
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SlabRate implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private BigDecimal rate;

  public static final String SERIALIZED_NAME_SLAB_RATE_CONFIG = "slabRateConfig";
  @SerializedName(SERIALIZED_NAME_SLAB_RATE_CONFIG)
  private Map<String, String> slabRateConfig = new HashMap<>();

  public SlabRate() {
  }

  public SlabRate order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nonnull

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }


  public SlabRate rate(BigDecimal rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @javax.annotation.Nonnull

  public BigDecimal getRate() {
    return rate;
  }


  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }


  public SlabRate slabRateConfig(Map<String, String> slabRateConfig) {
    
    this.slabRateConfig = slabRateConfig;
    return this;
  }

  public SlabRate putSlabRateConfigItem(String key, String slabRateConfigItem) {
    if (this.slabRateConfig == null) {
      this.slabRateConfig = new HashMap<>();
    }
    this.slabRateConfig.put(key, slabRateConfigItem);
    return this;
  }

   /**
   * Get slabRateConfig
   * @return slabRateConfig
  **/
  @javax.annotation.Nullable

  public Map<String, String> getSlabRateConfig() {
    return slabRateConfig;
  }


  public void setSlabRateConfig(Map<String, String> slabRateConfig) {
    this.slabRateConfig = slabRateConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlabRate slabRate = (SlabRate) o;
    return Objects.equals(this.order, slabRate.order) &&
        Objects.equals(this.rate, slabRate.rate) &&
        Objects.equals(this.slabRateConfig, slabRate.slabRateConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, rate, slabRateConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlabRate {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    slabRateConfig: ").append(toIndentedString(slabRateConfig)).append("\n");
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
    openapiFields.add("order");
    openapiFields.add("rate");
    openapiFields.add("slabRateConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("order");
    openapiRequiredFields.add("rate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SlabRate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SlabRate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SlabRate is not found in the empty JSON string", SlabRate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SlabRate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SlabRate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SlabRate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SlabRate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SlabRate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SlabRate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SlabRate.class));

       return (TypeAdapter<T>) new TypeAdapter<SlabRate>() {
           @Override
           public void write(JsonWriter out, SlabRate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SlabRate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SlabRate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SlabRate
  * @throws IOException if the JSON string is invalid with respect to SlabRate
  */
  public static SlabRate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SlabRate.class);
  }

 /**
  * Convert an instance of SlabRate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


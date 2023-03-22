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
import com.togai.client.models.PricingCycleConfigStartOffset;
import java.io.IOException;
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
 * Represents configurations related to pricing cycle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PricingCycleConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Interval field allow you to define the billing interval you would like to set
   */
  @JsonAdapter(IntervalEnum.Adapter.class)
  public enum IntervalEnum {
    MONTHLY("MONTHLY"),
    
    QUARTERLY("QUARTERLY"),
    
    HALF_YEARLY("HALF_YEARLY"),
    
    ANNUALLY("ANNUALLY");

    private String value;

    IntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IntervalEnum fromValue(String value) {
      for (IntervalEnum b : IntervalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IntervalEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private IntervalEnum interval;

  public static final String SERIALIZED_NAME_START_OFFSET = "startOffset";
  @SerializedName(SERIALIZED_NAME_START_OFFSET)
  private PricingCycleConfigStartOffset startOffset;

  public static final String SERIALIZED_NAME_GRACE_PERIOD = "gracePeriod";
  @SerializedName(SERIALIZED_NAME_GRACE_PERIOD)
  private Integer gracePeriod;

  public PricingCycleConfig() {
  }

  public PricingCycleConfig interval(IntervalEnum interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Interval field allow you to define the billing interval you would like to set
   * @return interval
  **/
  @javax.annotation.Nonnull

  public IntervalEnum getInterval() {
    return interval;
  }


  public void setInterval(IntervalEnum interval) {
    this.interval = interval;
  }


  public PricingCycleConfig startOffset(PricingCycleConfigStartOffset startOffset) {
    
    this.startOffset = startOffset;
    return this;
  }

   /**
   * Get startOffset
   * @return startOffset
  **/
  @javax.annotation.Nonnull

  public PricingCycleConfigStartOffset getStartOffset() {
    return startOffset;
  }


  public void setStartOffset(PricingCycleConfigStartOffset startOffset) {
    this.startOffset = startOffset;
  }


  public PricingCycleConfig gracePeriod(Integer gracePeriod) {
    
    this.gracePeriod = gracePeriod;
    return this;
  }

   /**
   * Togai allows you to ingest past dated events that will be processed by a pricing cycle till the end grace period.  For example: Pricing cycle is Monthly from 1st to 30th and gracePeriod is 5 days which next month 1 to 5th date, you can ingest past dated events during this grace period. 
   * @return gracePeriod
  **/
  @javax.annotation.Nonnull

  public Integer getGracePeriod() {
    return gracePeriod;
  }


  public void setGracePeriod(Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingCycleConfig pricingCycleConfig = (PricingCycleConfig) o;
    return Objects.equals(this.interval, pricingCycleConfig.interval) &&
        Objects.equals(this.startOffset, pricingCycleConfig.startOffset) &&
        Objects.equals(this.gracePeriod, pricingCycleConfig.gracePeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, startOffset, gracePeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingCycleConfig {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    startOffset: ").append(toIndentedString(startOffset)).append("\n");
    sb.append("    gracePeriod: ").append(toIndentedString(gracePeriod)).append("\n");
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
    openapiFields.add("interval");
    openapiFields.add("startOffset");
    openapiFields.add("gracePeriod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("interval");
    openapiRequiredFields.add("startOffset");
    openapiRequiredFields.add("gracePeriod");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PricingCycleConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PricingCycleConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricingCycleConfig is not found in the empty JSON string", PricingCycleConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PricingCycleConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PricingCycleConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PricingCycleConfig.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interval").toString()));
      }
      // validate the required field `startOffset`
      PricingCycleConfigStartOffset.validateJsonObject(jsonObj.getAsJsonObject("startOffset"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PricingCycleConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PricingCycleConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PricingCycleConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PricingCycleConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<PricingCycleConfig>() {
           @Override
           public void write(JsonWriter out, PricingCycleConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PricingCycleConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PricingCycleConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PricingCycleConfig
  * @throws IOException if the JSON string is invalid with respect to PricingCycleConfig
  */
  public static PricingCycleConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PricingCycleConfig.class);
  }

 /**
  * Convert an instance of PricingCycleConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


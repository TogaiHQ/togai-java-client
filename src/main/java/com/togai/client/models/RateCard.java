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
import com.togai.client.models.RateCardBundle;
import com.togai.client.models.RateCardUsageValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.togai.client.JSON;

/**
 * Represents a rate card
 */
@ApiModel(description = "Represents a rate card")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RateCard implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    USAGE("USAGE"),
    
    BUNDLE("BUNDLE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_USAGE_CONFIG = "usageConfig";
  @SerializedName(SERIALIZED_NAME_USAGE_CONFIG)
  private Map<String, RateCardUsageValue> usageConfig = null;

  public static final String SERIALIZED_NAME_BUNDLE_CONFIG = "bundleConfig";
  @SerializedName(SERIALIZED_NAME_BUNDLE_CONFIG)
  private RateCardBundle bundleConfig;

  public RateCard() {
  }

  public RateCard type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public RateCard usageConfig(Map<String, RateCardUsageValue> usageConfig) {
    
    this.usageConfig = usageConfig;
    return this;
  }

  public RateCard putUsageConfigItem(String key, RateCardUsageValue usageConfigItem) {
    if (this.usageConfig == null) {
      this.usageConfig = new HashMap<>();
    }
    this.usageConfig.put(key, usageConfigItem);
    return this;
  }

   /**
   * Get usageConfig
   * @return usageConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, RateCardUsageValue> getUsageConfig() {
    return usageConfig;
  }


  public void setUsageConfig(Map<String, RateCardUsageValue> usageConfig) {
    this.usageConfig = usageConfig;
  }


  public RateCard bundleConfig(RateCardBundle bundleConfig) {
    
    this.bundleConfig = bundleConfig;
    return this;
  }

   /**
   * Get bundleConfig
   * @return bundleConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RateCardBundle getBundleConfig() {
    return bundleConfig;
  }


  public void setBundleConfig(RateCardBundle bundleConfig) {
    this.bundleConfig = bundleConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateCard rateCard = (RateCard) o;
    return Objects.equals(this.type, rateCard.type) &&
        Objects.equals(this.usageConfig, rateCard.usageConfig) &&
        Objects.equals(this.bundleConfig, rateCard.bundleConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, usageConfig, bundleConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateCard {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usageConfig: ").append(toIndentedString(usageConfig)).append("\n");
    sb.append("    bundleConfig: ").append(toIndentedString(bundleConfig)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("usageConfig");
    openapiFields.add("bundleConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RateCard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RateCard.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RateCard is not found in the empty JSON string", RateCard.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RateCard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RateCard` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RateCard.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `bundleConfig`
      if (jsonObj.get("bundleConfig") != null && !jsonObj.get("bundleConfig").isJsonNull()) {
        RateCardBundle.validateJsonObject(jsonObj.getAsJsonObject("bundleConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RateCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RateCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RateCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RateCard.class));

       return (TypeAdapter<T>) new TypeAdapter<RateCard>() {
           @Override
           public void write(JsonWriter out, RateCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RateCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RateCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RateCard
  * @throws IOException if the JSON string is invalid with respect to RateCard
  */
  public static RateCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RateCard.class);
  }

 /**
  * Convert an instance of RateCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

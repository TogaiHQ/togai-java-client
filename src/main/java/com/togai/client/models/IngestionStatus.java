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
 * Status about the event ingestion.
 */
@ApiModel(description = "Status about the event ingestion.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IngestionStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Ingestion status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    INGESTION_IN_PROGRESS("INGESTION_IN_PROGRESS"),
    
    INGESTION_FAILED("INGESTION_FAILED"),
    
    INGESTION_FAILED_SCHEMA_NOT_DEFINED("INGESTION_FAILED_SCHEMA_NOT_DEFINED"),
    
    INGESTION_FAILED_UNITS_INVALID("INGESTION_FAILED_UNITS_INVALID"),
    
    INGESTION_FAILED_EVENT_INVALID("INGESTION_FAILED_EVENT_INVALID"),
    
    INGESTION_COMPLETED_NO_MATCHING_METERS("INGESTION_COMPLETED_NO_MATCHING_METERS"),
    
    INGESTION_COMPLETED_EVENT_METERED("INGESTION_COMPLETED_EVENT_METERED"),
    
    INGESTION_COMPLETED_EVENT_NOT_METERED("INGESTION_COMPLETED_EVENT_NOT_METERED"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_STATUS_DESCRIPTION = "statusDescription";
  @SerializedName(SERIALIZED_NAME_STATUS_DESCRIPTION)
  private String statusDescription;

  public IngestionStatus() {
  }

  public IngestionStatus status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Ingestion status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "INGESTION_COMPLETED", required = true, value = "Ingestion status")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public IngestionStatus statusDescription(String statusDescription) {
    
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Get statusDescription
   * @return statusDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ingestion Completed successfully", value = "")

  public String getStatusDescription() {
    return statusDescription;
  }


  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngestionStatus ingestionStatus = (IngestionStatus) o;
    return Objects.equals(this.status, ingestionStatus.status) &&
        Objects.equals(this.statusDescription, ingestionStatus.statusDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngestionStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("statusDescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IngestionStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IngestionStatus.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IngestionStatus is not found in the empty JSON string", IngestionStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IngestionStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IngestionStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IngestionStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("statusDescription") != null && !jsonObj.get("statusDescription").isJsonNull()) && !jsonObj.get("statusDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusDescription").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IngestionStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IngestionStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IngestionStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IngestionStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<IngestionStatus>() {
           @Override
           public void write(JsonWriter out, IngestionStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IngestionStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IngestionStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IngestionStatus
  * @throws IOException if the JSON string is invalid with respect to IngestionStatus
  */
  public static IngestionStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IngestionStatus.class);
  }

 /**
  * Convert an instance of IngestionStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


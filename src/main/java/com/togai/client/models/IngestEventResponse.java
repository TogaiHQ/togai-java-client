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
 * IngestEventResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IngestEventResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_INGESTION_REQUEST_ID = "ingestionRequestId";
  @SerializedName(SERIALIZED_NAME_INGESTION_REQUEST_ID)
  private String ingestionRequestId;

  public IngestEventResponse() {
  }

  public IngestEventResponse ingestionRequestId(String ingestionRequestId) {
    
    this.ingestionRequestId = ingestionRequestId;
    return this;
  }

   /**
   * On successful ingestion acceptance request, ingestion request id will be returned. This ingestion id can be used by clients to query the status of ingestion (IN_PROGRESS, COMPLETED).
   * @return ingestionRequestId
  **/
  @javax.annotation.Nonnull

  public String getIngestionRequestId() {
    return ingestionRequestId;
  }


  public void setIngestionRequestId(String ingestionRequestId) {
    this.ingestionRequestId = ingestionRequestId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngestEventResponse ingestEventResponse = (IngestEventResponse) o;
    return Objects.equals(this.ingestionRequestId, ingestEventResponse.ingestionRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingestionRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngestEventResponse {\n");
    sb.append("    ingestionRequestId: ").append(toIndentedString(ingestionRequestId)).append("\n");
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
    openapiFields.add("ingestionRequestId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ingestionRequestId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IngestEventResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IngestEventResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IngestEventResponse is not found in the empty JSON string", IngestEventResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IngestEventResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IngestEventResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IngestEventResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("ingestionRequestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingestionRequestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingestionRequestId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IngestEventResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IngestEventResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IngestEventResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IngestEventResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<IngestEventResponse>() {
           @Override
           public void write(JsonWriter out, IngestEventResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IngestEventResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IngestEventResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IngestEventResponse
  * @throws IOException if the JSON string is invalid with respect to IngestEventResponse
  */
  public static IngestEventResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IngestEventResponse.class);
  }

 /**
  * Convert an instance of IngestEventResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


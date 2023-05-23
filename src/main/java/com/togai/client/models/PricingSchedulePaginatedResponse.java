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
import com.togai.client.models.PricingScheduleWithPricePlanId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * PricingSchedulePaginatedResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PricingSchedulePaginatedResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<PricingScheduleWithPricePlanId> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "nextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_PREVIOUS_TOKEN = "previousToken";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_TOKEN)
  private String previousToken;

  public PricingSchedulePaginatedResponse() {
  }

  public PricingSchedulePaginatedResponse data(List<PricingScheduleWithPricePlanId> data) {
    
    this.data = data;
    return this;
  }

  public PricingSchedulePaginatedResponse addDataItem(PricingScheduleWithPricePlanId dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable

  public List<PricingScheduleWithPricePlanId> getData() {
    return data;
  }


  public void setData(List<PricingScheduleWithPricePlanId> data) {
    this.data = data;
  }


  public PricingSchedulePaginatedResponse nextToken(String nextToken) {
    
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @javax.annotation.Nullable

  public String getNextToken() {
    return nextToken;
  }


  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  public PricingSchedulePaginatedResponse previousToken(String previousToken) {
    
    this.previousToken = previousToken;
    return this;
  }

   /**
   * Get previousToken
   * @return previousToken
  **/
  @javax.annotation.Nullable

  public String getPreviousToken() {
    return previousToken;
  }


  public void setPreviousToken(String previousToken) {
    this.previousToken = previousToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingSchedulePaginatedResponse pricingSchedulePaginatedResponse = (PricingSchedulePaginatedResponse) o;
    return Objects.equals(this.data, pricingSchedulePaginatedResponse.data) &&
        Objects.equals(this.nextToken, pricingSchedulePaginatedResponse.nextToken) &&
        Objects.equals(this.previousToken, pricingSchedulePaginatedResponse.previousToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, nextToken, previousToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingSchedulePaginatedResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    previousToken: ").append(toIndentedString(previousToken)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("nextToken");
    openapiFields.add("previousToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PricingSchedulePaginatedResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PricingSchedulePaginatedResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricingSchedulePaginatedResponse is not found in the empty JSON string", PricingSchedulePaginatedResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PricingSchedulePaginatedResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PricingSchedulePaginatedResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            PricingScheduleWithPricePlanId.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("nextToken") != null && !jsonObj.get("nextToken").isJsonNull()) && !jsonObj.get("nextToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextToken").toString()));
      }
      if ((jsonObj.get("previousToken") != null && !jsonObj.get("previousToken").isJsonNull()) && !jsonObj.get("previousToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PricingSchedulePaginatedResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PricingSchedulePaginatedResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PricingSchedulePaginatedResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PricingSchedulePaginatedResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PricingSchedulePaginatedResponse>() {
           @Override
           public void write(JsonWriter out, PricingSchedulePaginatedResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PricingSchedulePaginatedResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PricingSchedulePaginatedResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PricingSchedulePaginatedResponse
  * @throws IOException if the JSON string is invalid with respect to PricingSchedulePaginatedResponse
  */
  public static PricingSchedulePaginatedResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PricingSchedulePaginatedResponse.class);
  }

 /**
  * Convert an instance of PricingSchedulePaginatedResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

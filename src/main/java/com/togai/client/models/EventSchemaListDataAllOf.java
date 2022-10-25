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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.togai.client.JSON;

/**
 * EventSchemaListDataAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventSchemaListDataAllOf implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ASSOCIATED_USAGE_METERS = "associatedUsageMeters";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_USAGE_METERS)
  private List<String> associatedUsageMeters = null;

  public EventSchemaListDataAllOf() {
  }

  public EventSchemaListDataAllOf associatedUsageMeters(List<String> associatedUsageMeters) {
    
    this.associatedUsageMeters = associatedUsageMeters;
    return this;
  }

  public EventSchemaListDataAllOf addAssociatedUsageMetersItem(String associatedUsageMetersItem) {
    if (this.associatedUsageMeters == null) {
      this.associatedUsageMeters = new ArrayList<>();
    }
    this.associatedUsageMeters.add(associatedUsageMetersItem);
    return this;
  }

   /**
   * Get associatedUsageMeters
   * @return associatedUsageMeters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAssociatedUsageMeters() {
    return associatedUsageMeters;
  }


  public void setAssociatedUsageMeters(List<String> associatedUsageMeters) {
    this.associatedUsageMeters = associatedUsageMeters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSchemaListDataAllOf eventSchemaListDataAllOf = (EventSchemaListDataAllOf) o;
    return Objects.equals(this.associatedUsageMeters, eventSchemaListDataAllOf.associatedUsageMeters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedUsageMeters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSchemaListDataAllOf {\n");
    sb.append("    associatedUsageMeters: ").append(toIndentedString(associatedUsageMeters)).append("\n");
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
    openapiFields.add("associatedUsageMeters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EventSchemaListDataAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EventSchemaListDataAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventSchemaListDataAllOf is not found in the empty JSON string", EventSchemaListDataAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EventSchemaListDataAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventSchemaListDataAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("associatedUsageMeters") != null && !jsonObj.get("associatedUsageMeters").isJsonNull()) && !jsonObj.get("associatedUsageMeters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `associatedUsageMeters` to be an array in the JSON string but got `%s`", jsonObj.get("associatedUsageMeters").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventSchemaListDataAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventSchemaListDataAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventSchemaListDataAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventSchemaListDataAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<EventSchemaListDataAllOf>() {
           @Override
           public void write(JsonWriter out, EventSchemaListDataAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventSchemaListDataAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventSchemaListDataAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventSchemaListDataAllOf
  * @throws IOException if the JSON string is invalid with respect to EventSchemaListDataAllOf
  */
  public static EventSchemaListDataAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventSchemaListDataAllOf.class);
  }

 /**
  * Convert an instance of EventSchemaListDataAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

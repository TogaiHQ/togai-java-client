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
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
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
 * EventPipelineInfoPricePlansInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventPipelineInfoPricePlansInner implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CYCLE_START = "cycleStart";
  @SerializedName(SERIALIZED_NAME_CYCLE_START)
  private LocalDate cycleStart;

  public static final String SERIALIZED_NAME_CYCLE_END = "cycleEnd";
  @SerializedName(SERIALIZED_NAME_CYCLE_END)
  private LocalDate cycleEnd;

  public static final String SERIALIZED_NAME_USAGE_METERS = "usageMeters";
  @SerializedName(SERIALIZED_NAME_USAGE_METERS)
  private Set<String> usageMeters = null;

  public EventPipelineInfoPricePlansInner() {
  }

  public EventPipelineInfoPricePlansInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public EventPipelineInfoPricePlansInner id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public EventPipelineInfoPricePlansInner cycleStart(LocalDate cycleStart) {
    
    this.cycleStart = cycleStart;
    return this;
  }

   /**
   * Get cycleStart
   * @return cycleStart
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LocalDate getCycleStart() {
    return cycleStart;
  }


  public void setCycleStart(LocalDate cycleStart) {
    this.cycleStart = cycleStart;
  }


  public EventPipelineInfoPricePlansInner cycleEnd(LocalDate cycleEnd) {
    
    this.cycleEnd = cycleEnd;
    return this;
  }

   /**
   * Get cycleEnd
   * @return cycleEnd
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LocalDate getCycleEnd() {
    return cycleEnd;
  }


  public void setCycleEnd(LocalDate cycleEnd) {
    this.cycleEnd = cycleEnd;
  }


  public EventPipelineInfoPricePlansInner usageMeters(Set<String> usageMeters) {
    
    this.usageMeters = usageMeters;
    return this;
  }

  public EventPipelineInfoPricePlansInner addUsageMetersItem(String usageMetersItem) {
    if (this.usageMeters == null) {
      this.usageMeters = new LinkedHashSet<>();
    }
    this.usageMeters.add(usageMetersItem);
    return this;
  }

   /**
   * Get usageMeters
   * @return usageMeters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getUsageMeters() {
    return usageMeters;
  }


  public void setUsageMeters(Set<String> usageMeters) {
    this.usageMeters = usageMeters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventPipelineInfoPricePlansInner eventPipelineInfoPricePlansInner = (EventPipelineInfoPricePlansInner) o;
    return Objects.equals(this.name, eventPipelineInfoPricePlansInner.name) &&
        Objects.equals(this.id, eventPipelineInfoPricePlansInner.id) &&
        Objects.equals(this.cycleStart, eventPipelineInfoPricePlansInner.cycleStart) &&
        Objects.equals(this.cycleEnd, eventPipelineInfoPricePlansInner.cycleEnd) &&
        Objects.equals(this.usageMeters, eventPipelineInfoPricePlansInner.usageMeters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, cycleStart, cycleEnd, usageMeters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventPipelineInfoPricePlansInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cycleStart: ").append(toIndentedString(cycleStart)).append("\n");
    sb.append("    cycleEnd: ").append(toIndentedString(cycleEnd)).append("\n");
    sb.append("    usageMeters: ").append(toIndentedString(usageMeters)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("id");
    openapiFields.add("cycleStart");
    openapiFields.add("cycleEnd");
    openapiFields.add("usageMeters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("cycleStart");
    openapiRequiredFields.add("cycleEnd");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EventPipelineInfoPricePlansInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EventPipelineInfoPricePlansInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventPipelineInfoPricePlansInner is not found in the empty JSON string", EventPipelineInfoPricePlansInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EventPipelineInfoPricePlansInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventPipelineInfoPricePlansInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventPipelineInfoPricePlansInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("usageMeters") != null && !jsonObj.get("usageMeters").isJsonNull()) && !jsonObj.get("usageMeters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `usageMeters` to be an array in the JSON string but got `%s`", jsonObj.get("usageMeters").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventPipelineInfoPricePlansInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventPipelineInfoPricePlansInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventPipelineInfoPricePlansInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventPipelineInfoPricePlansInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EventPipelineInfoPricePlansInner>() {
           @Override
           public void write(JsonWriter out, EventPipelineInfoPricePlansInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventPipelineInfoPricePlansInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventPipelineInfoPricePlansInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventPipelineInfoPricePlansInner
  * @throws IOException if the JSON string is invalid with respect to EventPipelineInfoPricePlansInner
  */
  public static EventPipelineInfoPricePlansInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventPipelineInfoPricePlansInner.class);
  }

 /**
  * Convert an instance of EventPipelineInfoPricePlansInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


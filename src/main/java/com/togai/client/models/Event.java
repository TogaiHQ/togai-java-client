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
import com.togai.client.models.Attribute;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * Contents of the event
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Event implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SCHEMA_NAME = "schemaName";
  @SerializedName(SERIALIZED_NAME_SCHEMA_NAME)
  private String schemaName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<Attribute> attributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private Map<String, String> dimensions = new HashMap<>();

  public Event() {
  }

  public Event schemaName(String schemaName) {
    
    this.schemaName = schemaName;
    return this;
  }

   /**
   * Name of the Event Schema.  Know more about [event schema](https://docs.togai.com/docs/event-schemas) 
   * @return schemaName
  **/
  @javax.annotation.Nonnull

  public String getSchemaName() {
    return schemaName;
  }


  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }


  public Event id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique value to identify the event instance. This unique value should be generated by the client and it acts as the **idempotency key**. Togai server will use this key to recognize subsequent retries of the same request and avoid metering multiple times for that same request. This id can be created in any format but we recommend using UUIDv4 to reduce collision occurance.    NOTE1: Expiry time for idempotency validation will be until the end of the billing cycle. Any request which comes after the billing cycle with the same id will be treated as new request and ingested for metering.   NOTE2: If the billing cycle is not configured for the idempotency validation will be until **10 days** of the event ingestion.
   * @return id
  **/
  @javax.annotation.Nonnull

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Event timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Source time stamp of the event. This timestamp must be in ISO 8601 format.
   * @return timestamp
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public Event accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The event will be associated with the provided account
   * @return accountId
  **/
  @javax.annotation.Nonnull

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public Event attributes(List<Attribute> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public Event addAttributesItem(Attribute attributesItem) {
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Attributes are numeric values. It can be usage metric which you push to Togai
   * @return attributes
  **/
  @javax.annotation.Nonnull

  public List<Attribute> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }


  public Event dimensions(Map<String, String> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public Event putDimensionsItem(String key, String dimensionsItem) {
    this.dimensions.put(key, dimensionsItem);
    return this;
  }

   /**
   * Dimensions are tags/labels associated with the events.
   * @return dimensions
  **/
  @javax.annotation.Nonnull

  public Map<String, String> getDimensions() {
    return dimensions;
  }


  public void setDimensions(Map<String, String> dimensions) {
    this.dimensions = dimensions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.schemaName, event.schemaName) &&
        Objects.equals(this.id, event.id) &&
        Objects.equals(this.timestamp, event.timestamp) &&
        Objects.equals(this.accountId, event.accountId) &&
        Objects.equals(this.attributes, event.attributes) &&
        Objects.equals(this.dimensions, event.dimensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaName, id, timestamp, accountId, attributes, dimensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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
    openapiFields.add("schemaName");
    openapiFields.add("id");
    openapiFields.add("timestamp");
    openapiFields.add("accountId");
    openapiFields.add("attributes");
    openapiFields.add("dimensions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemaName");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("timestamp");
    openapiRequiredFields.add("accountId");
    openapiRequiredFields.add("attributes");
    openapiRequiredFields.add("dimensions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Event
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Event.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Event is not found in the empty JSON string", Event.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Event.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Event` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Event.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("schemaName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemaName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schemaName").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("attributes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
      }

      JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
      // validate the required field `attributes` (array)
      for (int i = 0; i < jsonArrayattributes.size(); i++) {
        Attribute.validateJsonObject(jsonArrayattributes.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Event.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Event' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Event> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Event.class));

       return (TypeAdapter<T>) new TypeAdapter<Event>() {
           @Override
           public void write(JsonWriter out, Event value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Event read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Event given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Event
  * @throws IOException if the JSON string is invalid with respect to Event
  */
  public static Event fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Event.class);
  }

 /**
  * Convert an instance of Event to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


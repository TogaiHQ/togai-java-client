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
import com.togai.client.models.EnrichedField;
import com.togai.client.models.EnrichmentDependency;
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
 * EventPipelineInfoEnrichments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventPipelineInfoEnrichments implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<EnrichedField> attributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private List<EnrichedField> dimensions = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEPENDENCIES = "dependencies";
  @SerializedName(SERIALIZED_NAME_DEPENDENCIES)
  private List<EnrichmentDependency> dependencies = new ArrayList<>();

  public EventPipelineInfoEnrichments() {
  }

  public EventPipelineInfoEnrichments attributes(List<EnrichedField> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public EventPipelineInfoEnrichments addAttributesItem(EnrichedField attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable

  public List<EnrichedField> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<EnrichedField> attributes) {
    this.attributes = attributes;
  }


  public EventPipelineInfoEnrichments dimensions(List<EnrichedField> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public EventPipelineInfoEnrichments addDimensionsItem(EnrichedField dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @javax.annotation.Nullable

  public List<EnrichedField> getDimensions() {
    return dimensions;
  }


  public void setDimensions(List<EnrichedField> dimensions) {
    this.dimensions = dimensions;
  }


  public EventPipelineInfoEnrichments dependencies(List<EnrichmentDependency> dependencies) {
    
    this.dependencies = dependencies;
    return this;
  }

  public EventPipelineInfoEnrichments addDependenciesItem(EnrichmentDependency dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * Get dependencies
   * @return dependencies
  **/
  @javax.annotation.Nullable

  public List<EnrichmentDependency> getDependencies() {
    return dependencies;
  }


  public void setDependencies(List<EnrichmentDependency> dependencies) {
    this.dependencies = dependencies;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventPipelineInfoEnrichments eventPipelineInfoEnrichments = (EventPipelineInfoEnrichments) o;
    return Objects.equals(this.attributes, eventPipelineInfoEnrichments.attributes) &&
        Objects.equals(this.dimensions, eventPipelineInfoEnrichments.dimensions) &&
        Objects.equals(this.dependencies, eventPipelineInfoEnrichments.dependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, dimensions, dependencies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventPipelineInfoEnrichments {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
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
    openapiFields.add("attributes");
    openapiFields.add("dimensions");
    openapiFields.add("dependencies");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EventPipelineInfoEnrichments
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EventPipelineInfoEnrichments.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventPipelineInfoEnrichments is not found in the empty JSON string", EventPipelineInfoEnrichments.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EventPipelineInfoEnrichments.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventPipelineInfoEnrichments` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
        if (jsonArrayattributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
          }

          // validate the optional field `attributes` (array)
          for (int i = 0; i < jsonArrayattributes.size(); i++) {
            EnrichedField.validateJsonObject(jsonArrayattributes.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("dimensions") != null && !jsonObj.get("dimensions").isJsonNull()) {
        JsonArray jsonArraydimensions = jsonObj.getAsJsonArray("dimensions");
        if (jsonArraydimensions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dimensions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dimensions` to be an array in the JSON string but got `%s`", jsonObj.get("dimensions").toString()));
          }

          // validate the optional field `dimensions` (array)
          for (int i = 0; i < jsonArraydimensions.size(); i++) {
            EnrichedField.validateJsonObject(jsonArraydimensions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("dependencies") != null && !jsonObj.get("dependencies").isJsonNull()) {
        JsonArray jsonArraydependencies = jsonObj.getAsJsonArray("dependencies");
        if (jsonArraydependencies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dependencies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dependencies` to be an array in the JSON string but got `%s`", jsonObj.get("dependencies").toString()));
          }

          // validate the optional field `dependencies` (array)
          for (int i = 0; i < jsonArraydependencies.size(); i++) {
            EnrichmentDependency.validateJsonObject(jsonArraydependencies.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventPipelineInfoEnrichments.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventPipelineInfoEnrichments' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventPipelineInfoEnrichments> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventPipelineInfoEnrichments.class));

       return (TypeAdapter<T>) new TypeAdapter<EventPipelineInfoEnrichments>() {
           @Override
           public void write(JsonWriter out, EventPipelineInfoEnrichments value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventPipelineInfoEnrichments read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventPipelineInfoEnrichments given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventPipelineInfoEnrichments
  * @throws IOException if the JSON string is invalid with respect to EventPipelineInfoEnrichments
  */
  public static EventPipelineInfoEnrichments fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventPipelineInfoEnrichments.class);
  }

 /**
  * Convert an instance of EventPipelineInfoEnrichments to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


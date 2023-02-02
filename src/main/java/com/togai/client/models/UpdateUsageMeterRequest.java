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
import com.togai.client.models.Computation;
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
 * Request to update usage meter
 */
@ApiModel(description = "Request to update usage meter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateUsageMeterRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Type of usage meter * COUNTER - Count usage  
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    COUNTER("COUNTER");

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

  /**
   * Aggregation to be applied on usage meter result * COUNT - Counts number of events matching the usage meter * SUM - Sums up results of computation of all events matching usage meter 
   */
  @JsonAdapter(AggregationEnum.Adapter.class)
  public enum AggregationEnum {
    COUNT("COUNT"),
    
    SUM("SUM");

    private String value;

    AggregationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AggregationEnum fromValue(String value) {
      for (AggregationEnum b : AggregationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AggregationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AggregationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AggregationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AggregationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AGGREGATION = "aggregation";
  @SerializedName(SERIALIZED_NAME_AGGREGATION)
  private AggregationEnum aggregation;

  public static final String SERIALIZED_NAME_COMPUTATIONS = "computations";
  @SerializedName(SERIALIZED_NAME_COMPUTATIONS)
  private List<Computation> computations = null;

  public UpdateUsageMeterRequest() {
  }

  public UpdateUsageMeterRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the event
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the event")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateUsageMeterRequest type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of usage meter * COUNTER - Count usage  
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "COUNTER", required = true, value = "Type of usage meter * COUNTER - Count usage  ")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public UpdateUsageMeterRequest aggregation(AggregationEnum aggregation) {
    
    this.aggregation = aggregation;
    return this;
  }

   /**
   * Aggregation to be applied on usage meter result * COUNT - Counts number of events matching the usage meter * SUM - Sums up results of computation of all events matching usage meter 
   * @return aggregation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "COUNT", required = true, value = "Aggregation to be applied on usage meter result * COUNT - Counts number of events matching the usage meter * SUM - Sums up results of computation of all events matching usage meter ")

  public AggregationEnum getAggregation() {
    return aggregation;
  }


  public void setAggregation(AggregationEnum aggregation) {
    this.aggregation = aggregation;
  }


  public UpdateUsageMeterRequest computations(List<Computation> computations) {
    
    this.computations = computations;
    return this;
  }

  public UpdateUsageMeterRequest addComputationsItem(Computation computationsItem) {
    if (this.computations == null) {
      this.computations = new ArrayList<>();
    }
    this.computations.add(computationsItem);
    return this;
  }

   /**
   * Get computations
   * @return computations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Computation> getComputations() {
    return computations;
  }


  public void setComputations(List<Computation> computations) {
    this.computations = computations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUsageMeterRequest updateUsageMeterRequest = (UpdateUsageMeterRequest) o;
    return Objects.equals(this.description, updateUsageMeterRequest.description) &&
        Objects.equals(this.type, updateUsageMeterRequest.type) &&
        Objects.equals(this.aggregation, updateUsageMeterRequest.aggregation) &&
        Objects.equals(this.computations, updateUsageMeterRequest.computations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, type, aggregation, computations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUsageMeterRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    computations: ").append(toIndentedString(computations)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("type");
    openapiFields.add("aggregation");
    openapiFields.add("computations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("aggregation");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateUsageMeterRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateUsageMeterRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateUsageMeterRequest is not found in the empty JSON string", UpdateUsageMeterRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateUsageMeterRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateUsageMeterRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateUsageMeterRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("aggregation") != null && !jsonObj.get("aggregation").isJsonNull()) && !jsonObj.get("aggregation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aggregation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aggregation").toString()));
      }
      JsonArray jsonArraycomputations = jsonObj.getAsJsonArray("computations");
      if (jsonArraycomputations != null) {
        // ensure the json data is an array
        if (!jsonObj.get("computations").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `computations` to be an array in the JSON string but got `%s`", jsonObj.get("computations").toString()));
        }

        // validate the optional field `computations` (array)
        for (int i = 0; i < jsonArraycomputations.size(); i++) {
          Computation.validateJsonObject(jsonArraycomputations.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateUsageMeterRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateUsageMeterRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateUsageMeterRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateUsageMeterRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateUsageMeterRequest>() {
           @Override
           public void write(JsonWriter out, UpdateUsageMeterRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateUsageMeterRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateUsageMeterRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateUsageMeterRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateUsageMeterRequest
  */
  public static UpdateUsageMeterRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateUsageMeterRequest.class);
  }

 /**
  * Convert an instance of UpdateUsageMeterRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


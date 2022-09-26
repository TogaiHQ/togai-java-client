/*
 * Togai Apis
 * APIs for Togai App
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: engg@togai.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.togai.core.service.client.model;

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

/**
 * Request to create usage meter
 */
@ApiModel(description = "Request to create usage meter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-26T12:56:18.144176+05:30[Asia/Kolkata]")
public class CreateUsageMeterRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Type of usage meter
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    COUNTER("COUNTER"),
    
    GAUGE("GAUGE"),
    
    TIMER("TIMER");

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
   * Aggregation to be applied on usage meter result
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

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private String filters;

  public static final String SERIALIZED_NAME_COMPUTATION = "computation";
  @SerializedName(SERIALIZED_NAME_COMPUTATION)
  private String computation;

  public CreateUsageMeterRequest() {
  }

  public CreateUsageMeterRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the event. Must be unique for an organization.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the event. Must be unique for an organization.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateUsageMeterRequest description(String description) {
    
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


  public CreateUsageMeterRequest type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of usage meter
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "COUNTER", required = true, value = "Type of usage meter")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CreateUsageMeterRequest aggregation(AggregationEnum aggregation) {
    
    this.aggregation = aggregation;
    return this;
  }

   /**
   * Aggregation to be applied on usage meter result
   * @return aggregation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "DRAFT", required = true, value = "Aggregation to be applied on usage meter result")

  public AggregationEnum getAggregation() {
    return aggregation;
  }


  public void setAggregation(AggregationEnum aggregation) {
    this.aggregation = aggregation;
  }


  public CreateUsageMeterRequest filters(String filters) {
    
    this.filters = filters;
    return this;
  }

   /**
   * Filters to be applied on event before matching to usage meter in JSONLogic format (https://jsonlogic.com/) 
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{   \"and\": [     {\"in\": [{\"var\": \"dimension.city\"}, \"chennai\", \"mumbai\"]},     \"or\": [       {\">\": [{\"var\": \"attribute.distance\"}, 100]},       {\"<\": [{\"var\": \"attribute.distance\"}, 20]}     ]   ] } ", value = "Filters to be applied on event before matching to usage meter in JSONLogic format (https://jsonlogic.com/) ")

  public String getFilters() {
    return filters;
  }


  public void setFilters(String filters) {
    this.filters = filters;
  }


  public CreateUsageMeterRequest computation(String computation) {
    
    this.computation = computation;
    return this;
  }

   /**
   * Computation. Has no effect if aggregation is &#39;count&#39;
   * @return computation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"*\":[{\"var\":\"attributes.distance\"},0.4]}", value = "Computation. Has no effect if aggregation is 'count'")

  public String getComputation() {
    return computation;
  }


  public void setComputation(String computation) {
    this.computation = computation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUsageMeterRequest createUsageMeterRequest = (CreateUsageMeterRequest) o;
    return Objects.equals(this.name, createUsageMeterRequest.name) &&
        Objects.equals(this.description, createUsageMeterRequest.description) &&
        Objects.equals(this.type, createUsageMeterRequest.type) &&
        Objects.equals(this.aggregation, createUsageMeterRequest.aggregation) &&
        Objects.equals(this.filters, createUsageMeterRequest.filters) &&
        Objects.equals(this.computation, createUsageMeterRequest.computation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, aggregation, filters, computation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUsageMeterRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    computation: ").append(toIndentedString(computation)).append("\n");
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

}

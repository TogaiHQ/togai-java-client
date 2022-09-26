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
import com.togai.core.service.client.model.UsageStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Represents rate card of a price plan of usage type
 */
@ApiModel(description = "Represents rate card of a price plan of usage type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-26T12:56:18.144176+05:30[Asia/Kolkata]")
public class RateCardUsageValue implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets rateStrategy
   */
  @JsonAdapter(RateStrategyEnum.Adapter.class)
  public enum RateStrategyEnum {
    FLAT("FLAT"),
    
    PER_UNIT("PER_UNIT");

    private String value;

    RateStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RateStrategyEnum fromValue(String value) {
      for (RateStrategyEnum b : RateStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RateStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RateStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RateStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RateStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RATE_STRATEGY = "rateStrategy";
  @SerializedName(SERIALIZED_NAME_RATE_STRATEGY)
  private RateStrategyEnum rateStrategy;

  /**
   * Gets or Sets slabStrategy
   */
  @JsonAdapter(SlabStrategyEnum.Adapter.class)
  public enum SlabStrategyEnum {
    TIER("TIER");

    private String value;

    SlabStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SlabStrategyEnum fromValue(String value) {
      for (SlabStrategyEnum b : SlabStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SlabStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SlabStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SlabStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SlabStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SLAB_STRATEGY = "slabStrategy";
  @SerializedName(SERIALIZED_NAME_SLAB_STRATEGY)
  private SlabStrategyEnum slabStrategy;

  public static final String SERIALIZED_NAME_SLABS = "slabs";
  @SerializedName(SERIALIZED_NAME_SLABS)
  private List<UsageStrategy> slabs = new ArrayList<>();

  public RateCardUsageValue() {
  }

  public RateCardUsageValue name(String name) {
    
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


  public RateCardUsageValue rateStrategy(RateStrategyEnum rateStrategy) {
    
    this.rateStrategy = rateStrategy;
    return this;
  }

   /**
   * Get rateStrategy
   * @return rateStrategy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public RateStrategyEnum getRateStrategy() {
    return rateStrategy;
  }


  public void setRateStrategy(RateStrategyEnum rateStrategy) {
    this.rateStrategy = rateStrategy;
  }


  public RateCardUsageValue slabStrategy(SlabStrategyEnum slabStrategy) {
    
    this.slabStrategy = slabStrategy;
    return this;
  }

   /**
   * Get slabStrategy
   * @return slabStrategy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SlabStrategyEnum getSlabStrategy() {
    return slabStrategy;
  }


  public void setSlabStrategy(SlabStrategyEnum slabStrategy) {
    this.slabStrategy = slabStrategy;
  }


  public RateCardUsageValue slabs(List<UsageStrategy> slabs) {
    
    this.slabs = slabs;
    return this;
  }

  public RateCardUsageValue addSlabsItem(UsageStrategy slabsItem) {
    this.slabs.add(slabsItem);
    return this;
  }

   /**
   * Get slabs
   * @return slabs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<UsageStrategy> getSlabs() {
    return slabs;
  }


  public void setSlabs(List<UsageStrategy> slabs) {
    this.slabs = slabs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateCardUsageValue rateCardUsageValue = (RateCardUsageValue) o;
    return Objects.equals(this.name, rateCardUsageValue.name) &&
        Objects.equals(this.rateStrategy, rateCardUsageValue.rateStrategy) &&
        Objects.equals(this.slabStrategy, rateCardUsageValue.slabStrategy) &&
        Objects.equals(this.slabs, rateCardUsageValue.slabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rateStrategy, slabStrategy, slabs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateCardUsageValue {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rateStrategy: ").append(toIndentedString(rateStrategy)).append("\n");
    sb.append("    slabStrategy: ").append(toIndentedString(slabStrategy)).append("\n");
    sb.append("    slabs: ").append(toIndentedString(slabs)).append("\n");
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

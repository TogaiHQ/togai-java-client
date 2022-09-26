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
import com.togai.core.service.client.model.RateCardBundle;
import com.togai.core.service.client.model.RateCardUsageValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

/**
 * Represents a rate card
 */
@ApiModel(description = "Represents a rate card")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-26T12:56:18.144176+05:30[Asia/Kolkata]")
public class RateCard implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    USAGE("USAGE"),
    
    BUNDLE("BUNDLE");

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

  public static final String SERIALIZED_NAME_USAGE_CONFIG = "usageConfig";
  @SerializedName(SERIALIZED_NAME_USAGE_CONFIG)
  private Map<String, RateCardUsageValue> usageConfig = null;

  public static final String SERIALIZED_NAME_BUNDLE_CONFIG = "bundleConfig";
  @SerializedName(SERIALIZED_NAME_BUNDLE_CONFIG)
  private RateCardBundle bundleConfig;

  public RateCard() {
  }

  public RateCard type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public RateCard usageConfig(Map<String, RateCardUsageValue> usageConfig) {
    
    this.usageConfig = usageConfig;
    return this;
  }

  public RateCard putUsageConfigItem(String key, RateCardUsageValue usageConfigItem) {
    if (this.usageConfig == null) {
      this.usageConfig = new HashMap<>();
    }
    this.usageConfig.put(key, usageConfigItem);
    return this;
  }

   /**
   * Get usageConfig
   * @return usageConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, RateCardUsageValue> getUsageConfig() {
    return usageConfig;
  }


  public void setUsageConfig(Map<String, RateCardUsageValue> usageConfig) {
    this.usageConfig = usageConfig;
  }


  public RateCard bundleConfig(RateCardBundle bundleConfig) {
    
    this.bundleConfig = bundleConfig;
    return this;
  }

   /**
   * Get bundleConfig
   * @return bundleConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RateCardBundle getBundleConfig() {
    return bundleConfig;
  }


  public void setBundleConfig(RateCardBundle bundleConfig) {
    this.bundleConfig = bundleConfig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateCard rateCard = (RateCard) o;
    return Objects.equals(this.type, rateCard.type) &&
        Objects.equals(this.usageConfig, rateCard.usageConfig) &&
        Objects.equals(this.bundleConfig, rateCard.bundleConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, usageConfig, bundleConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateCard {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usageConfig: ").append(toIndentedString(usageConfig)).append("\n");
    sb.append("    bundleConfig: ").append(toIndentedString(bundleConfig)).append("\n");
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


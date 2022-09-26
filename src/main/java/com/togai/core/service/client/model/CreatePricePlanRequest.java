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
import com.togai.core.service.client.model.PricingCycle;
import com.togai.core.service.client.model.RateCard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Request to create a price plan
 */
@ApiModel(description = "Request to create a price plan")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-26T12:56:18.144176+05:30[Asia/Kolkata]")
public class CreatePricePlanRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PRICING_CYCLE = "pricingCycle";
  @SerializedName(SERIALIZED_NAME_PRICING_CYCLE)
  private PricingCycle pricingCycle;

  public static final String SERIALIZED_NAME_RATE_CARD = "rateCard";
  @SerializedName(SERIALIZED_NAME_RATE_CARD)
  private RateCard rateCard;

  public CreatePricePlanRequest() {
  }

  public CreatePricePlanRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the price plan
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the price plan")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreatePricePlanRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of price plan
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of price plan")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreatePricePlanRequest pricingCycle(PricingCycle pricingCycle) {
    
    this.pricingCycle = pricingCycle;
    return this;
  }

   /**
   * Get pricingCycle
   * @return pricingCycle
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PricingCycle getPricingCycle() {
    return pricingCycle;
  }


  public void setPricingCycle(PricingCycle pricingCycle) {
    this.pricingCycle = pricingCycle;
  }


  public CreatePricePlanRequest rateCard(RateCard rateCard) {
    
    this.rateCard = rateCard;
    return this;
  }

   /**
   * Get rateCard
   * @return rateCard
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public RateCard getRateCard() {
    return rateCard;
  }


  public void setRateCard(RateCard rateCard) {
    this.rateCard = rateCard;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePricePlanRequest createPricePlanRequest = (CreatePricePlanRequest) o;
    return Objects.equals(this.name, createPricePlanRequest.name) &&
        Objects.equals(this.description, createPricePlanRequest.description) &&
        Objects.equals(this.pricingCycle, createPricePlanRequest.pricingCycle) &&
        Objects.equals(this.rateCard, createPricePlanRequest.rateCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, pricingCycle, rateCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePricePlanRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    pricingCycle: ").append(toIndentedString(pricingCycle)).append("\n");
    sb.append("    rateCard: ").append(toIndentedString(rateCard)).append("\n");
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

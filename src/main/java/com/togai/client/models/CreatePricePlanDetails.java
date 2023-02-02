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
import com.togai.client.models.PricingCycleConfig;
import com.togai.client.models.UsageRateCard;
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
 * CreatePricePlanDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreatePricePlanDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRICING_CYCLE_CONFIG = "pricingCycleConfig";
  @SerializedName(SERIALIZED_NAME_PRICING_CYCLE_CONFIG)
  private PricingCycleConfig pricingCycleConfig;

  public static final String SERIALIZED_NAME_USAGE_RATE_CARDS = "usageRateCards";
  @SerializedName(SERIALIZED_NAME_USAGE_RATE_CARDS)
  private List<UsageRateCard> usageRateCards = new ArrayList<>();

  public CreatePricePlanDetails() {
  }

  public CreatePricePlanDetails pricingCycleConfig(PricingCycleConfig pricingCycleConfig) {
    
    this.pricingCycleConfig = pricingCycleConfig;
    return this;
  }

   /**
   * Get pricingCycleConfig
   * @return pricingCycleConfig
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PricingCycleConfig getPricingCycleConfig() {
    return pricingCycleConfig;
  }


  public void setPricingCycleConfig(PricingCycleConfig pricingCycleConfig) {
    this.pricingCycleConfig = pricingCycleConfig;
  }


  public CreatePricePlanDetails usageRateCards(List<UsageRateCard> usageRateCards) {
    
    this.usageRateCards = usageRateCards;
    return this;
  }

  public CreatePricePlanDetails addUsageRateCardsItem(UsageRateCard usageRateCardsItem) {
    this.usageRateCards.add(usageRateCardsItem);
    return this;
  }

   /**
   * List of usage rate cards
   * @return usageRateCards
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of usage rate cards")

  public List<UsageRateCard> getUsageRateCards() {
    return usageRateCards;
  }


  public void setUsageRateCards(List<UsageRateCard> usageRateCards) {
    this.usageRateCards = usageRateCards;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePricePlanDetails createPricePlanDetails = (CreatePricePlanDetails) o;
    return Objects.equals(this.pricingCycleConfig, createPricePlanDetails.pricingCycleConfig) &&
        Objects.equals(this.usageRateCards, createPricePlanDetails.usageRateCards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pricingCycleConfig, usageRateCards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePricePlanDetails {\n");
    sb.append("    pricingCycleConfig: ").append(toIndentedString(pricingCycleConfig)).append("\n");
    sb.append("    usageRateCards: ").append(toIndentedString(usageRateCards)).append("\n");
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
    openapiFields.add("pricingCycleConfig");
    openapiFields.add("usageRateCards");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pricingCycleConfig");
    openapiRequiredFields.add("usageRateCards");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreatePricePlanDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreatePricePlanDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePricePlanDetails is not found in the empty JSON string", CreatePricePlanDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreatePricePlanDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatePricePlanDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatePricePlanDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `pricingCycleConfig`
      if (jsonObj.get("pricingCycleConfig") != null && !jsonObj.get("pricingCycleConfig").isJsonNull()) {
        PricingCycleConfig.validateJsonObject(jsonObj.getAsJsonObject("pricingCycleConfig"));
      }
      JsonArray jsonArrayusageRateCards = jsonObj.getAsJsonArray("usageRateCards");
      if (jsonArrayusageRateCards != null) {
        // ensure the json data is an array
        if (!jsonObj.get("usageRateCards").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `usageRateCards` to be an array in the JSON string but got `%s`", jsonObj.get("usageRateCards").toString()));
        }

        // validate the optional field `usageRateCards` (array)
        for (int i = 0; i < jsonArrayusageRateCards.size(); i++) {
          UsageRateCard.validateJsonObject(jsonArrayusageRateCards.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePricePlanDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePricePlanDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePricePlanDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePricePlanDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePricePlanDetails>() {
           @Override
           public void write(JsonWriter out, CreatePricePlanDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePricePlanDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreatePricePlanDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreatePricePlanDetails
  * @throws IOException if the JSON string is invalid with respect to CreatePricePlanDetails
  */
  public static CreatePricePlanDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePricePlanDetails.class);
  }

 /**
  * Convert an instance of CreatePricePlanDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

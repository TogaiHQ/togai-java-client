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
import com.togai.client.models.FixedFeeRateCard;
import com.togai.client.models.RevenueInfoFixedFeeRevenueSummary;
import com.togai.client.models.SlabRevenueSummary;
import com.togai.client.models.UsageRateCard;
import java.io.IOException;
import java.math.BigDecimal;
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
 * RevenueInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RevenueInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_USAGE_RATE_CARD = "usageRateCard";
  @SerializedName(SERIALIZED_NAME_USAGE_RATE_CARD)
  private UsageRateCard usageRateCard;

  public static final String SERIALIZED_NAME_FIXED_FEE_RATE_CARD = "fixedFeeRateCard";
  @SerializedName(SERIALIZED_NAME_FIXED_FEE_RATE_CARD)
  private FixedFeeRateCard fixedFeeRateCard;

  public static final String SERIALIZED_NAME_USAGES = "usages";
  @SerializedName(SERIALIZED_NAME_USAGES)
  private Map<String, BigDecimal> usages = new HashMap<>();

  public static final String SERIALIZED_NAME_FIXED_FEE_REVENUE_SUMMARY = "fixedFeeRevenueSummary";
  @SerializedName(SERIALIZED_NAME_FIXED_FEE_REVENUE_SUMMARY)
  private RevenueInfoFixedFeeRevenueSummary fixedFeeRevenueSummary;

  public static final String SERIALIZED_NAME_SLAB_REVENUE_SUMMARIES = "slabRevenueSummaries";
  @SerializedName(SERIALIZED_NAME_SLAB_REVENUE_SUMMARIES)
  private List<SlabRevenueSummary> slabRevenueSummaries = new ArrayList<>();

  public RevenueInfo() {
  }

  public RevenueInfo usageRateCard(UsageRateCard usageRateCard) {
    
    this.usageRateCard = usageRateCard;
    return this;
  }

   /**
   * Get usageRateCard
   * @return usageRateCard
  **/
  @javax.annotation.Nullable

  public UsageRateCard getUsageRateCard() {
    return usageRateCard;
  }


  public void setUsageRateCard(UsageRateCard usageRateCard) {
    this.usageRateCard = usageRateCard;
  }


  public RevenueInfo fixedFeeRateCard(FixedFeeRateCard fixedFeeRateCard) {
    
    this.fixedFeeRateCard = fixedFeeRateCard;
    return this;
  }

   /**
   * Get fixedFeeRateCard
   * @return fixedFeeRateCard
  **/
  @javax.annotation.Nullable

  public FixedFeeRateCard getFixedFeeRateCard() {
    return fixedFeeRateCard;
  }


  public void setFixedFeeRateCard(FixedFeeRateCard fixedFeeRateCard) {
    this.fixedFeeRateCard = fixedFeeRateCard;
  }


  public RevenueInfo usages(Map<String, BigDecimal> usages) {
    
    this.usages = usages;
    return this;
  }

  public RevenueInfo putUsagesItem(String key, BigDecimal usagesItem) {
    this.usages.put(key, usagesItem);
    return this;
  }

   /**
   * Get usages
   * @return usages
  **/
  @javax.annotation.Nonnull

  public Map<String, BigDecimal> getUsages() {
    return usages;
  }


  public void setUsages(Map<String, BigDecimal> usages) {
    this.usages = usages;
  }


  public RevenueInfo fixedFeeRevenueSummary(RevenueInfoFixedFeeRevenueSummary fixedFeeRevenueSummary) {
    
    this.fixedFeeRevenueSummary = fixedFeeRevenueSummary;
    return this;
  }

   /**
   * Get fixedFeeRevenueSummary
   * @return fixedFeeRevenueSummary
  **/
  @javax.annotation.Nullable

  public RevenueInfoFixedFeeRevenueSummary getFixedFeeRevenueSummary() {
    return fixedFeeRevenueSummary;
  }


  public void setFixedFeeRevenueSummary(RevenueInfoFixedFeeRevenueSummary fixedFeeRevenueSummary) {
    this.fixedFeeRevenueSummary = fixedFeeRevenueSummary;
  }


  public RevenueInfo slabRevenueSummaries(List<SlabRevenueSummary> slabRevenueSummaries) {
    
    this.slabRevenueSummaries = slabRevenueSummaries;
    return this;
  }

  public RevenueInfo addSlabRevenueSummariesItem(SlabRevenueSummary slabRevenueSummariesItem) {
    if (this.slabRevenueSummaries == null) {
      this.slabRevenueSummaries = new ArrayList<>();
    }
    this.slabRevenueSummaries.add(slabRevenueSummariesItem);
    return this;
  }

   /**
   * Get slabRevenueSummaries
   * @return slabRevenueSummaries
  **/
  @javax.annotation.Nullable

  public List<SlabRevenueSummary> getSlabRevenueSummaries() {
    return slabRevenueSummaries;
  }


  public void setSlabRevenueSummaries(List<SlabRevenueSummary> slabRevenueSummaries) {
    this.slabRevenueSummaries = slabRevenueSummaries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevenueInfo revenueInfo = (RevenueInfo) o;
    return Objects.equals(this.usageRateCard, revenueInfo.usageRateCard) &&
        Objects.equals(this.fixedFeeRateCard, revenueInfo.fixedFeeRateCard) &&
        Objects.equals(this.usages, revenueInfo.usages) &&
        Objects.equals(this.fixedFeeRevenueSummary, revenueInfo.fixedFeeRevenueSummary) &&
        Objects.equals(this.slabRevenueSummaries, revenueInfo.slabRevenueSummaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageRateCard, fixedFeeRateCard, usages, fixedFeeRevenueSummary, slabRevenueSummaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevenueInfo {\n");
    sb.append("    usageRateCard: ").append(toIndentedString(usageRateCard)).append("\n");
    sb.append("    fixedFeeRateCard: ").append(toIndentedString(fixedFeeRateCard)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
    sb.append("    fixedFeeRevenueSummary: ").append(toIndentedString(fixedFeeRevenueSummary)).append("\n");
    sb.append("    slabRevenueSummaries: ").append(toIndentedString(slabRevenueSummaries)).append("\n");
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
    openapiFields.add("usageRateCard");
    openapiFields.add("fixedFeeRateCard");
    openapiFields.add("usages");
    openapiFields.add("fixedFeeRevenueSummary");
    openapiFields.add("slabRevenueSummaries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("usages");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RevenueInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RevenueInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RevenueInfo is not found in the empty JSON string", RevenueInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RevenueInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RevenueInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RevenueInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `usageRateCard`
      if (jsonObj.get("usageRateCard") != null && !jsonObj.get("usageRateCard").isJsonNull()) {
        UsageRateCard.validateJsonObject(jsonObj.getAsJsonObject("usageRateCard"));
      }
      // validate the optional field `fixedFeeRateCard`
      if (jsonObj.get("fixedFeeRateCard") != null && !jsonObj.get("fixedFeeRateCard").isJsonNull()) {
        FixedFeeRateCard.validateJsonObject(jsonObj.getAsJsonObject("fixedFeeRateCard"));
      }
      // validate the optional field `fixedFeeRevenueSummary`
      if (jsonObj.get("fixedFeeRevenueSummary") != null && !jsonObj.get("fixedFeeRevenueSummary").isJsonNull()) {
        RevenueInfoFixedFeeRevenueSummary.validateJsonObject(jsonObj.getAsJsonObject("fixedFeeRevenueSummary"));
      }
      if (jsonObj.get("slabRevenueSummaries") != null && !jsonObj.get("slabRevenueSummaries").isJsonNull()) {
        JsonArray jsonArrayslabRevenueSummaries = jsonObj.getAsJsonArray("slabRevenueSummaries");
        if (jsonArrayslabRevenueSummaries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("slabRevenueSummaries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `slabRevenueSummaries` to be an array in the JSON string but got `%s`", jsonObj.get("slabRevenueSummaries").toString()));
          }

          // validate the optional field `slabRevenueSummaries` (array)
          for (int i = 0; i < jsonArrayslabRevenueSummaries.size(); i++) {
            SlabRevenueSummary.validateJsonObject(jsonArrayslabRevenueSummaries.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RevenueInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RevenueInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RevenueInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RevenueInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<RevenueInfo>() {
           @Override
           public void write(JsonWriter out, RevenueInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RevenueInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RevenueInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RevenueInfo
  * @throws IOException if the JSON string is invalid with respect to RevenueInfo
  */
  public static RevenueInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RevenueInfo.class);
  }

 /**
  * Convert an instance of RevenueInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


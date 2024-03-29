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
import java.io.IOException;
import java.math.BigDecimal;
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
 * Credit Balance response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreditBalanceResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTIVE_CREDITS = "activeCredits";
  @SerializedName(SERIALIZED_NAME_ACTIVE_CREDITS)
  private BigDecimal activeCredits;

  public static final String SERIALIZED_NAME_AVAILABLE_BALANCE = "availableBalance";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BALANCE)
  private BigDecimal availableBalance;

  public static final String SERIALIZED_NAME_RUNNING_BALANCE = "runningBalance";
  @SerializedName(SERIALIZED_NAME_RUNNING_BALANCE)
  private BigDecimal runningBalance;

  public static final String SERIALIZED_NAME_INAPPLICABLE_CREDITS = "inapplicableCredits";
  @SerializedName(SERIALIZED_NAME_INAPPLICABLE_CREDITS)
  private BigDecimal inapplicableCredits;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public CreditBalanceResponse() {
  }

  public CreditBalanceResponse activeCredits(BigDecimal activeCredits) {
    
    this.activeCredits = activeCredits;
    return this;
  }

   /**
   * Get activeCredits
   * @return activeCredits
  **/
  @javax.annotation.Nonnull

  public BigDecimal getActiveCredits() {
    return activeCredits;
  }


  public void setActiveCredits(BigDecimal activeCredits) {
    this.activeCredits = activeCredits;
  }


  public CreditBalanceResponse availableBalance(BigDecimal availableBalance) {
    
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * Get availableBalance
   * @return availableBalance
  **/
  @javax.annotation.Nonnull

  public BigDecimal getAvailableBalance() {
    return availableBalance;
  }


  public void setAvailableBalance(BigDecimal availableBalance) {
    this.availableBalance = availableBalance;
  }


  public CreditBalanceResponse runningBalance(BigDecimal runningBalance) {
    
    this.runningBalance = runningBalance;
    return this;
  }

   /**
   * Get runningBalance
   * @return runningBalance
  **/
  @javax.annotation.Nonnull

  public BigDecimal getRunningBalance() {
    return runningBalance;
  }


  public void setRunningBalance(BigDecimal runningBalance) {
    this.runningBalance = runningBalance;
  }


  public CreditBalanceResponse inapplicableCredits(BigDecimal inapplicableCredits) {
    
    this.inapplicableCredits = inapplicableCredits;
    return this;
  }

   /**
   * Get inapplicableCredits
   * @return inapplicableCredits
  **/
  @javax.annotation.Nonnull

  public BigDecimal getInapplicableCredits() {
    return inapplicableCredits;
  }


  public void setInapplicableCredits(BigDecimal inapplicableCredits) {
    this.inapplicableCredits = inapplicableCredits;
  }


  public CreditBalanceResponse unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nonnull

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBalanceResponse creditBalanceResponse = (CreditBalanceResponse) o;
    return Objects.equals(this.activeCredits, creditBalanceResponse.activeCredits) &&
        Objects.equals(this.availableBalance, creditBalanceResponse.availableBalance) &&
        Objects.equals(this.runningBalance, creditBalanceResponse.runningBalance) &&
        Objects.equals(this.inapplicableCredits, creditBalanceResponse.inapplicableCredits) &&
        Objects.equals(this.unit, creditBalanceResponse.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeCredits, availableBalance, runningBalance, inapplicableCredits, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBalanceResponse {\n");
    sb.append("    activeCredits: ").append(toIndentedString(activeCredits)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    runningBalance: ").append(toIndentedString(runningBalance)).append("\n");
    sb.append("    inapplicableCredits: ").append(toIndentedString(inapplicableCredits)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
    openapiFields.add("activeCredits");
    openapiFields.add("availableBalance");
    openapiFields.add("runningBalance");
    openapiFields.add("inapplicableCredits");
    openapiFields.add("unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("activeCredits");
    openapiRequiredFields.add("availableBalance");
    openapiRequiredFields.add("runningBalance");
    openapiRequiredFields.add("inapplicableCredits");
    openapiRequiredFields.add("unit");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreditBalanceResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreditBalanceResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreditBalanceResponse is not found in the empty JSON string", CreditBalanceResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreditBalanceResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreditBalanceResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreditBalanceResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreditBalanceResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreditBalanceResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreditBalanceResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreditBalanceResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreditBalanceResponse>() {
           @Override
           public void write(JsonWriter out, CreditBalanceResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreditBalanceResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreditBalanceResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreditBalanceResponse
  * @throws IOException if the JSON string is invalid with respect to CreditBalanceResponse
  */
  public static CreditBalanceResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreditBalanceResponse.class);
  }

 /**
  * Convert an instance of CreditBalanceResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


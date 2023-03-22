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
import com.togai.client.models.CurrencyRateValue;
import com.togai.client.models.InvoiceTiming;
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
 * FixedFeeRateCard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FixedFeeRateCard implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_INVOICE_TIMING = "invoiceTiming";
  @SerializedName(SERIALIZED_NAME_INVOICE_TIMING)
  private InvoiceTiming invoiceTiming;

  public static final String SERIALIZED_NAME_RATE_VALUES = "rateValues";
  @SerializedName(SERIALIZED_NAME_RATE_VALUES)
  private List<CurrencyRateValue> rateValues = new ArrayList<>();

  public FixedFeeRateCard() {
  }

  public FixedFeeRateCard id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Auto generated unique identifier for fixed fees.
   * @return id
  **/
  @javax.annotation.Nonnull

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FixedFeeRateCard displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Name of the fixed fee.
   * @return displayName
  **/
  @javax.annotation.Nullable

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public FixedFeeRateCard invoiceTiming(InvoiceTiming invoiceTiming) {
    
    this.invoiceTiming = invoiceTiming;
    return this;
  }

   /**
   * Get invoiceTiming
   * @return invoiceTiming
  **/
  @javax.annotation.Nullable

  public InvoiceTiming getInvoiceTiming() {
    return invoiceTiming;
  }


  public void setInvoiceTiming(InvoiceTiming invoiceTiming) {
    this.invoiceTiming = invoiceTiming;
  }


  public FixedFeeRateCard rateValues(List<CurrencyRateValue> rateValues) {
    
    this.rateValues = rateValues;
    return this;
  }

  public FixedFeeRateCard addRateValuesItem(CurrencyRateValue rateValuesItem) {
    this.rateValues.add(rateValuesItem);
    return this;
  }

   /**
   * Get rateValues
   * @return rateValues
  **/
  @javax.annotation.Nonnull

  public List<CurrencyRateValue> getRateValues() {
    return rateValues;
  }


  public void setRateValues(List<CurrencyRateValue> rateValues) {
    this.rateValues = rateValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FixedFeeRateCard fixedFeeRateCard = (FixedFeeRateCard) o;
    return Objects.equals(this.id, fixedFeeRateCard.id) &&
        Objects.equals(this.displayName, fixedFeeRateCard.displayName) &&
        Objects.equals(this.invoiceTiming, fixedFeeRateCard.invoiceTiming) &&
        Objects.equals(this.rateValues, fixedFeeRateCard.rateValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, invoiceTiming, rateValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FixedFeeRateCard {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    invoiceTiming: ").append(toIndentedString(invoiceTiming)).append("\n");
    sb.append("    rateValues: ").append(toIndentedString(rateValues)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("displayName");
    openapiFields.add("invoiceTiming");
    openapiFields.add("rateValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("rateValues");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FixedFeeRateCard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FixedFeeRateCard.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FixedFeeRateCard is not found in the empty JSON string", FixedFeeRateCard.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FixedFeeRateCard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FixedFeeRateCard` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FixedFeeRateCard.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("rateValues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rateValues` to be an array in the JSON string but got `%s`", jsonObj.get("rateValues").toString()));
      }

      JsonArray jsonArrayrateValues = jsonObj.getAsJsonArray("rateValues");
      // validate the required field `rateValues` (array)
      for (int i = 0; i < jsonArrayrateValues.size(); i++) {
        CurrencyRateValue.validateJsonObject(jsonArrayrateValues.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FixedFeeRateCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FixedFeeRateCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FixedFeeRateCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FixedFeeRateCard.class));

       return (TypeAdapter<T>) new TypeAdapter<FixedFeeRateCard>() {
           @Override
           public void write(JsonWriter out, FixedFeeRateCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FixedFeeRateCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FixedFeeRateCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FixedFeeRateCard
  * @throws IOException if the JSON string is invalid with respect to FixedFeeRateCard
  */
  public static FixedFeeRateCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FixedFeeRateCard.class);
  }

 /**
  * Convert an instance of FixedFeeRateCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

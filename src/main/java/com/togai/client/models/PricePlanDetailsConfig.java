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
import com.togai.client.models.CreatePricePlanDetails;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Configuration for getting the usage rate card
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PricePlanDetailsConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Mode to get the usage rate card - CUSTOM: Use the price plan details provided in the request - PRICE_PLAN: Use the usage rate cards of the given price plan - ACCOUNT: Use the usage rate cards of a associated price plan of the given account 
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    CUSTOM("CUSTOM"),
    
    PRICE_PLAN("PRICE_PLAN"),
    
    ACCOUNT("ACCOUNT");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private ModeEnum mode;

  public static final String SERIALIZED_NAME_PRICE_PLAN_DETAILS = "pricePlanDetails";
  @SerializedName(SERIALIZED_NAME_PRICE_PLAN_DETAILS)
  private CreatePricePlanDetails pricePlanDetails;

  public static final String SERIALIZED_NAME_PRICE_PLAN_ID = "pricePlanId";
  @SerializedName(SERIALIZED_NAME_PRICE_PLAN_ID)
  private String pricePlanId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_EFFECTIVE_ON = "effectiveOn";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_ON)
  private OffsetDateTime effectiveOn;

  public PricePlanDetailsConfig() {
  }

  public PricePlanDetailsConfig mode(ModeEnum mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Mode to get the usage rate card - CUSTOM: Use the price plan details provided in the request - PRICE_PLAN: Use the usage rate cards of the given price plan - ACCOUNT: Use the usage rate cards of a associated price plan of the given account 
   * @return mode
  **/
  @javax.annotation.Nonnull

  public ModeEnum getMode() {
    return mode;
  }


  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  public PricePlanDetailsConfig pricePlanDetails(CreatePricePlanDetails pricePlanDetails) {
    
    this.pricePlanDetails = pricePlanDetails;
    return this;
  }

   /**
   * Get pricePlanDetails
   * @return pricePlanDetails
  **/
  @javax.annotation.Nullable

  public CreatePricePlanDetails getPricePlanDetails() {
    return pricePlanDetails;
  }


  public void setPricePlanDetails(CreatePricePlanDetails pricePlanDetails) {
    this.pricePlanDetails = pricePlanDetails;
  }


  public PricePlanDetailsConfig pricePlanId(String pricePlanId) {
    
    this.pricePlanId = pricePlanId;
    return this;
  }

   /**
   * Id of the price plan, this will be considered if mode is PRICE_PLAN
   * @return pricePlanId
  **/
  @javax.annotation.Nullable

  public String getPricePlanId() {
    return pricePlanId;
  }


  public void setPricePlanId(String pricePlanId) {
    this.pricePlanId = pricePlanId;
  }


  public PricePlanDetailsConfig accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Id of the account, this will be considered if mode is ACCOUNT
   * @return accountId
  **/
  @javax.annotation.Nullable

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public PricePlanDetailsConfig effectiveOn(OffsetDateTime effectiveOn) {
    
    this.effectiveOn = effectiveOn;
    return this;
  }

   /**
   * Will be used for getting the usage rate card, only used if mode is ACCOUNT or PRICE_PLAN
   * @return effectiveOn
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getEffectiveOn() {
    return effectiveOn;
  }


  public void setEffectiveOn(OffsetDateTime effectiveOn) {
    this.effectiveOn = effectiveOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricePlanDetailsConfig pricePlanDetailsConfig = (PricePlanDetailsConfig) o;
    return Objects.equals(this.mode, pricePlanDetailsConfig.mode) &&
        Objects.equals(this.pricePlanDetails, pricePlanDetailsConfig.pricePlanDetails) &&
        Objects.equals(this.pricePlanId, pricePlanDetailsConfig.pricePlanId) &&
        Objects.equals(this.accountId, pricePlanDetailsConfig.accountId) &&
        Objects.equals(this.effectiveOn, pricePlanDetailsConfig.effectiveOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, pricePlanDetails, pricePlanId, accountId, effectiveOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricePlanDetailsConfig {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    pricePlanDetails: ").append(toIndentedString(pricePlanDetails)).append("\n");
    sb.append("    pricePlanId: ").append(toIndentedString(pricePlanId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    effectiveOn: ").append(toIndentedString(effectiveOn)).append("\n");
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
    openapiFields.add("mode");
    openapiFields.add("pricePlanDetails");
    openapiFields.add("pricePlanId");
    openapiFields.add("accountId");
    openapiFields.add("effectiveOn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("mode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PricePlanDetailsConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PricePlanDetailsConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricePlanDetailsConfig is not found in the empty JSON string", PricePlanDetailsConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PricePlanDetailsConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PricePlanDetailsConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PricePlanDetailsConfig.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mode").toString()));
      }
      // validate the optional field `pricePlanDetails`
      if (jsonObj.get("pricePlanDetails") != null && !jsonObj.get("pricePlanDetails").isJsonNull()) {
        CreatePricePlanDetails.validateJsonObject(jsonObj.getAsJsonObject("pricePlanDetails"));
      }
      if ((jsonObj.get("pricePlanId") != null && !jsonObj.get("pricePlanId").isJsonNull()) && !jsonObj.get("pricePlanId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pricePlanId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pricePlanId").toString()));
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PricePlanDetailsConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PricePlanDetailsConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PricePlanDetailsConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PricePlanDetailsConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<PricePlanDetailsConfig>() {
           @Override
           public void write(JsonWriter out, PricePlanDetailsConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PricePlanDetailsConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PricePlanDetailsConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PricePlanDetailsConfig
  * @throws IOException if the JSON string is invalid with respect to PricePlanDetailsConfig
  */
  public static PricePlanDetailsConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PricePlanDetailsConfig.class);
  }

 /**
  * Convert an instance of PricePlanDetailsConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


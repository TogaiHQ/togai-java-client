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
import com.togai.client.models.CreateAccountRequest;
import com.togai.client.models.CreateEntitySetting;
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
 * Payload to create customer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateCustomerRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIMARY_EMAIL = "primaryEmail";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EMAIL)
  private String primaryEmail;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private String billingAddress;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private List<CreateEntitySetting> settings = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private CreateAccountRequest account;

  public CreateCustomerRequest() {
  }

  public CreateCustomerRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Customer identifier
   * @return id
  **/
  @javax.annotation.Nonnull

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CreateCustomerRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the Customer
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateCustomerRequest primaryEmail(String primaryEmail) {
    
    this.primaryEmail = primaryEmail;
    return this;
  }

   /**
   * Primary email of the customer
   * @return primaryEmail
  **/
  @javax.annotation.Nonnull

  public String getPrimaryEmail() {
    return primaryEmail;
  }


  public void setPrimaryEmail(String primaryEmail) {
    this.primaryEmail = primaryEmail;
  }


  public CreateCustomerRequest billingAddress(String billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * billing address of the customer
   * @return billingAddress
  **/
  @javax.annotation.Nonnull

  public String getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }


  public CreateCustomerRequest settings(List<CreateEntitySetting> settings) {
    
    this.settings = settings;
    return this;
  }

  public CreateCustomerRequest addSettingsItem(CreateEntitySetting settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<>();
    }
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable

  public List<CreateEntitySetting> getSettings() {
    return settings;
  }


  public void setSettings(List<CreateEntitySetting> settings) {
    this.settings = settings;
  }


  public CreateCustomerRequest account(CreateAccountRequest account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable

  public CreateAccountRequest getAccount() {
    return account;
  }


  public void setAccount(CreateAccountRequest account) {
    this.account = account;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomerRequest createCustomerRequest = (CreateCustomerRequest) o;
    return Objects.equals(this.id, createCustomerRequest.id) &&
        Objects.equals(this.name, createCustomerRequest.name) &&
        Objects.equals(this.primaryEmail, createCustomerRequest.primaryEmail) &&
        Objects.equals(this.billingAddress, createCustomerRequest.billingAddress) &&
        Objects.equals(this.settings, createCustomerRequest.settings) &&
        Objects.equals(this.account, createCustomerRequest.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, primaryEmail, billingAddress, settings, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomerRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primaryEmail: ").append(toIndentedString(primaryEmail)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("primaryEmail");
    openapiFields.add("billingAddress");
    openapiFields.add("settings");
    openapiFields.add("account");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("primaryEmail");
    openapiRequiredFields.add("billingAddress");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCustomerRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateCustomerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCustomerRequest is not found in the empty JSON string", CreateCustomerRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCustomerRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCustomerRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCustomerRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("primaryEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryEmail").toString()));
      }
      if (!jsonObj.get("billingAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingAddress").toString()));
      }
      if (jsonObj.get("settings") != null && !jsonObj.get("settings").isJsonNull()) {
        JsonArray jsonArraysettings = jsonObj.getAsJsonArray("settings");
        if (jsonArraysettings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("settings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `settings` to be an array in the JSON string but got `%s`", jsonObj.get("settings").toString()));
          }

          // validate the optional field `settings` (array)
          for (int i = 0; i < jsonArraysettings.size(); i++) {
            CreateEntitySetting.validateJsonObject(jsonArraysettings.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        CreateAccountRequest.validateJsonObject(jsonObj.getAsJsonObject("account"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCustomerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCustomerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCustomerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCustomerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCustomerRequest>() {
           @Override
           public void write(JsonWriter out, CreateCustomerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCustomerRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCustomerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCustomerRequest
  * @throws IOException if the JSON string is invalid with respect to CreateCustomerRequest
  */
  public static CreateCustomerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCustomerRequest.class);
  }

 /**
  * Convert an instance of CreateCustomerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


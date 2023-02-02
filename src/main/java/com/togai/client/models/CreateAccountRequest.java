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
 * Payload to create account
 */
@ApiModel(description = "Payload to create account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAccountRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INVOICE_CURRENCY = "invoiceCurrency";
  @SerializedName(SERIALIZED_NAME_INVOICE_CURRENCY)
  private String invoiceCurrency;

  public static final String SERIALIZED_NAME_ALIASES = "aliases";
  @SerializedName(SERIALIZED_NAME_ALIASES)
  private List<String> aliases = null;

  public CreateAccountRequest() {
  }

  public CreateAccountRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier of the account
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ACC00001", required = true, value = "Identifier of the account")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CreateAccountRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the customer
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Primary Account", required = true, value = "Name of the customer")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateAccountRequest invoiceCurrency(String invoiceCurrency) {
    
    this.invoiceCurrency = invoiceCurrency;
    return this;
  }

   /**
   * [ISO_4217](https://en.wikipedia.org/wiki/ISO_4217) code of the currency in which the account must be invoiced Defaults to Base currency. 
   * @return invoiceCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[ISO_4217](https://en.wikipedia.org/wiki/ISO_4217) code of the currency in which the account must be invoiced Defaults to Base currency. ")

  public String getInvoiceCurrency() {
    return invoiceCurrency;
  }


  public void setInvoiceCurrency(String invoiceCurrency) {
    this.invoiceCurrency = invoiceCurrency;
  }


  public CreateAccountRequest aliases(List<String> aliases) {
    
    this.aliases = aliases;
    return this;
  }

  public CreateAccountRequest addAliasesItem(String aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Aliases are tags that are associated with an account. Multiple aliases are allowed for a single account.
   * @return aliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "acme_primary", value = "Aliases are tags that are associated with an account. Multiple aliases are allowed for a single account.")

  public List<String> getAliases() {
    return aliases;
  }


  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccountRequest createAccountRequest = (CreateAccountRequest) o;
    return Objects.equals(this.id, createAccountRequest.id) &&
        Objects.equals(this.name, createAccountRequest.name) &&
        Objects.equals(this.invoiceCurrency, createAccountRequest.invoiceCurrency) &&
        Objects.equals(this.aliases, createAccountRequest.aliases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, invoiceCurrency, aliases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    invoiceCurrency: ").append(toIndentedString(invoiceCurrency)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
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
    openapiFields.add("invoiceCurrency");
    openapiFields.add("aliases");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateAccountRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateAccountRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAccountRequest is not found in the empty JSON string", CreateAccountRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateAccountRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAccountRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAccountRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("invoiceCurrency") != null && !jsonObj.get("invoiceCurrency").isJsonNull()) && !jsonObj.get("invoiceCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceCurrency").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("aliases") != null && !jsonObj.get("aliases").isJsonNull()) && !jsonObj.get("aliases").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `aliases` to be an array in the JSON string but got `%s`", jsonObj.get("aliases").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAccountRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAccountRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAccountRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAccountRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAccountRequest>() {
           @Override
           public void write(JsonWriter out, CreateAccountRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAccountRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAccountRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAccountRequest
  * @throws IOException if the JSON string is invalid with respect to CreateAccountRequest
  */
  public static CreateAccountRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAccountRequest.class);
  }

 /**
  * Convert an instance of CreateAccountRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


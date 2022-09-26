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
import com.togai.core.service.client.model.CreateAccountRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Payload to create customer
 */
@ApiModel(description = "Payload to create customer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-26T12:56:18.144176+05:30[Asia/Kolkata]")
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
  @ApiModelProperty(required = true, value = "Customer identifier")

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
   * Name of the customer
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the customer")

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
  @ApiModelProperty(required = true, value = "Primary email of the customer")

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
  @ApiModelProperty(required = true, value = "billing address of the customer")

  public String getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
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
  @ApiModelProperty(value = "")

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
        Objects.equals(this.account, createCustomerRequest.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, primaryEmail, billingAddress, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomerRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primaryEmail: ").append(toIndentedString(primaryEmail)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
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

}


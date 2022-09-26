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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Payload to update customer
 */
@ApiModel(description = "Payload to update customer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-26T12:56:18.144176+05:30[Asia/Kolkata]")
public class UpdateCustomerRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIMARY_EMAIL = "primaryEmail";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EMAIL)
  private String primaryEmail;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private String billingAddress;

  public UpdateCustomerRequest() {
  }

  public UpdateCustomerRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the customer
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the customer")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateCustomerRequest primaryEmail(String primaryEmail) {
    
    this.primaryEmail = primaryEmail;
    return this;
  }

   /**
   * Primary email of the customer
   * @return primaryEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Primary email of the customer")

  public String getPrimaryEmail() {
    return primaryEmail;
  }


  public void setPrimaryEmail(String primaryEmail) {
    this.primaryEmail = primaryEmail;
  }


  public UpdateCustomerRequest billingAddress(String billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * billing address of the customer
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "billing address of the customer")

  public String getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomerRequest updateCustomerRequest = (UpdateCustomerRequest) o;
    return Objects.equals(this.name, updateCustomerRequest.name) &&
        Objects.equals(this.primaryEmail, updateCustomerRequest.primaryEmail) &&
        Objects.equals(this.billingAddress, updateCustomerRequest.billingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, primaryEmail, billingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomerRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primaryEmail: ").append(toIndentedString(primaryEmail)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
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

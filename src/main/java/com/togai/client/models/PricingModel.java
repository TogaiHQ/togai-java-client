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
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Togai supports two type of pricing model Tiered and Volume. Tiered pricing model applies respective slab and its rate to the usage value while volume pricing model applies the latest matching slab of the usage value and applies respective rate.  For more understanding read [Rate Cards](https://docs.togai.com/docs/priceplan#setting-up-multiple-rate-cards) 
 */
@JsonAdapter(PricingModel.Adapter.class)
public enum PricingModel {
  
  TIERED("TIERED"),
  
  VOLUME("VOLUME");

  private String value;

  PricingModel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PricingModel fromValue(String value) {
    for (PricingModel b : PricingModel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PricingModel> {
    @Override
    public void write(final JsonWriter jsonWriter, final PricingModel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PricingModel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PricingModel.fromValue(value);
    }
  }
}


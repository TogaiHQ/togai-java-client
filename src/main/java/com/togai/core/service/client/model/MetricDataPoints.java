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
import com.togai.core.service.client.model.MetricDataPointsGroupedBy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * MetricDataPoints
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-26T12:56:18.144176+05:30[Asia/Kolkata]")
public class MetricDataPoints implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GROUPED_BY = "groupedBy";
  @SerializedName(SERIALIZED_NAME_GROUPED_BY)
  private MetricDataPointsGroupedBy groupedBy;

  public static final String SERIALIZED_NAME_TIMESTAMPS = "timestamps";
  @SerializedName(SERIALIZED_NAME_TIMESTAMPS)
  private List<OffsetDateTime> timestamps = new ArrayList<>();

  public static final String SERIALIZED_NAME_METRIC_VALUES = "metricValues";
  @SerializedName(SERIALIZED_NAME_METRIC_VALUES)
  private List<BigDecimal> metricValues = new ArrayList<>();

  public MetricDataPoints() {
  }

  public MetricDataPoints groupedBy(MetricDataPointsGroupedBy groupedBy) {
    
    this.groupedBy = groupedBy;
    return this;
  }

   /**
   * Get groupedBy
   * @return groupedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MetricDataPointsGroupedBy getGroupedBy() {
    return groupedBy;
  }


  public void setGroupedBy(MetricDataPointsGroupedBy groupedBy) {
    this.groupedBy = groupedBy;
  }


  public MetricDataPoints timestamps(List<OffsetDateTime> timestamps) {
    
    this.timestamps = timestamps;
    return this;
  }

  public MetricDataPoints addTimestampsItem(OffsetDateTime timestampsItem) {
    this.timestamps.add(timestampsItem);
    return this;
  }

   /**
   * Get timestamps
   * @return timestamps
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<OffsetDateTime> getTimestamps() {
    return timestamps;
  }


  public void setTimestamps(List<OffsetDateTime> timestamps) {
    this.timestamps = timestamps;
  }


  public MetricDataPoints metricValues(List<BigDecimal> metricValues) {
    
    this.metricValues = metricValues;
    return this;
  }

  public MetricDataPoints addMetricValuesItem(BigDecimal metricValuesItem) {
    this.metricValues.add(metricValuesItem);
    return this;
  }

   /**
   * Get metricValues
   * @return metricValues
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<BigDecimal> getMetricValues() {
    return metricValues;
  }


  public void setMetricValues(List<BigDecimal> metricValues) {
    this.metricValues = metricValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricDataPoints metricDataPoints = (MetricDataPoints) o;
    return Objects.equals(this.groupedBy, metricDataPoints.groupedBy) &&
        Objects.equals(this.timestamps, metricDataPoints.timestamps) &&
        Objects.equals(this.metricValues, metricDataPoints.metricValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupedBy, timestamps, metricValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricDataPoints {\n");
    sb.append("    groupedBy: ").append(toIndentedString(groupedBy)).append("\n");
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
    sb.append("    metricValues: ").append(toIndentedString(metricValues)).append("\n");
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

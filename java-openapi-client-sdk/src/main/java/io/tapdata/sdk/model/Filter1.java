/*
 * Tapdata OpenAPI
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: moa-v1.1.0-117-g6b02a67
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.tapdata.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.tapdata.sdk.model.ApiV1TransactionLogFields;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Filter1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-29T11:08:48.431+08:00[Asia/Shanghai]")
public class Filter1 {
  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private Object where = null;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private ApiV1TransactionLogFields fields = null;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_SKIP = "skip";
  @SerializedName(SERIALIZED_NAME_SKIP)
  private Integer skip;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private List<String> order = new ArrayList<String>();

  public Filter1 where(Object where) {
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @ApiModelProperty(value = "")
  public Object getWhere() {
    return where;
  }

  public void setWhere(Object where) {
    this.where = where;
  }

  public Filter1 fields(ApiV1TransactionLogFields fields) {
    this.fields = fields;
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @ApiModelProperty(value = "")
  public ApiV1TransactionLogFields getFields() {
    return fields;
  }

  public void setFields(ApiV1TransactionLogFields fields) {
    this.fields = fields;
  }

  public Filter1 offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * minimum: 0
   * @return offset
  **/
  @ApiModelProperty(value = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public Filter1 limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * minimum: 0
   * @return limit
  **/
  @ApiModelProperty(value = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Filter1 skip(Integer skip) {
    this.skip = skip;
    return this;
  }

   /**
   * Get skip
   * minimum: 0
   * @return skip
  **/
  @ApiModelProperty(value = "")
  public Integer getSkip() {
    return skip;
  }

  public void setSkip(Integer skip) {
    this.skip = skip;
  }

  public Filter1 order(List<String> order) {
    this.order = order;
    return this;
  }

  public Filter1 addOrderItem(String orderItem) {
    if (this.order == null) {
      this.order = new ArrayList<String>();
    }
    this.order.add(orderItem);
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")
  public List<String> getOrder() {
    return order;
  }

  public void setOrder(List<String> order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filter1 filter1 = (Filter1) o;
    return Objects.equals(this.where, filter1.where) &&
        Objects.equals(this.fields, filter1.fields) &&
        Objects.equals(this.offset, filter1.offset) &&
        Objects.equals(this.limit, filter1.limit) &&
        Objects.equals(this.skip, filter1.skip) &&
        Objects.equals(this.order, filter1.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(where, fields, offset, limit, skip, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter1 {\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


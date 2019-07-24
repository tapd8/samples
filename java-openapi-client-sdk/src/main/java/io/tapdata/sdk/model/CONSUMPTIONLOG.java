/*
 * Tapdata OpenAPI
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: moa-v1.1.0-115-g56235c8
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
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * CONSUMPTIONLOG
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T21:22:02.841+08:00[Asia/Shanghai]")
public class CONSUMPTIONLOG {
  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_C_U_S_T_O_M_E_R_I_D = "CUSTOMER_ID";
  @SerializedName(SERIALIZED_NAME_C_U_S_T_O_M_E_R_I_D)
  private String CUSTOMER_ID;

  public static final String SERIALIZED_NAME_B_U_Y_T_I_M_E = "BUY_TIME";
  @SerializedName(SERIALIZED_NAME_B_U_Y_T_I_M_E)
  private OffsetDateTime BUY_TIME;

  public static final String SERIALIZED_NAME_A_M_O_U_N_T = "AMOUNT";
  @SerializedName(SERIALIZED_NAME_A_M_O_U_N_T)
  private BigDecimal AMOUNT;

  public static final String SERIALIZED_NAME_S_H_O_P = "SHOP";
  @SerializedName(SERIALIZED_NAME_S_H_O_P)
  private String SHOP;

  public CONSUMPTIONLOG id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CONSUMPTIONLOG CUSTOMER_ID(String CUSTOMER_ID) {
    this.CUSTOMER_ID = CUSTOMER_ID;
    return this;
  }

   /**
   * Get CUSTOMER_ID
   * @return CUSTOMER_ID
  **/
  @ApiModelProperty(value = "")
  public String getCUSTOMERID() {
    return CUSTOMER_ID;
  }

  public void setCUSTOMERID(String CUSTOMER_ID) {
    this.CUSTOMER_ID = CUSTOMER_ID;
  }

  public CONSUMPTIONLOG BUY_TIME(OffsetDateTime BUY_TIME) {
    this.BUY_TIME = BUY_TIME;
    return this;
  }

   /**
   * Get BUY_TIME
   * @return BUY_TIME
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getBUYTIME() {
    return BUY_TIME;
  }

  public void setBUYTIME(OffsetDateTime BUY_TIME) {
    this.BUY_TIME = BUY_TIME;
  }

  public CONSUMPTIONLOG AMOUNT(BigDecimal AMOUNT) {
    this.AMOUNT = AMOUNT;
    return this;
  }

   /**
   * Get AMOUNT
   * @return AMOUNT
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAMOUNT() {
    return AMOUNT;
  }

  public void setAMOUNT(BigDecimal AMOUNT) {
    this.AMOUNT = AMOUNT;
  }

  public CONSUMPTIONLOG SHOP(String SHOP) {
    this.SHOP = SHOP;
    return this;
  }

   /**
   * Get SHOP
   * @return SHOP
  **/
  @ApiModelProperty(value = "")
  public String getSHOP() {
    return SHOP;
  }

  public void setSHOP(String SHOP) {
    this.SHOP = SHOP;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CONSUMPTIONLOG CONSUMPTION_LOG = (CONSUMPTIONLOG) o;
    return Objects.equals(this.id, CONSUMPTION_LOG.id) &&
        Objects.equals(this.CUSTOMER_ID, CONSUMPTION_LOG.CUSTOMER_ID) &&
        Objects.equals(this.BUY_TIME, CONSUMPTION_LOG.BUY_TIME) &&
        Objects.equals(this.AMOUNT, CONSUMPTION_LOG.AMOUNT) &&
        Objects.equals(this.SHOP, CONSUMPTION_LOG.SHOP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, CUSTOMER_ID, BUY_TIME, AMOUNT, SHOP);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CONSUMPTIONLOG {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    CUSTOMER_ID: ").append(toIndentedString(CUSTOMER_ID)).append("\n");
    sb.append("    BUY_TIME: ").append(toIndentedString(BUY_TIME)).append("\n");
    sb.append("    AMOUNT: ").append(toIndentedString(AMOUNT)).append("\n");
    sb.append("    SHOP: ").append(toIndentedString(SHOP)).append("\n");
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


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
import java.io.IOException;

/**
 * ApiV1FINCUSTOMERFields
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-25T11:25:22.813+08:00[Asia/Shanghai]")
public class ApiV1FINCUSTOMERFields {
  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Boolean id;

  public static final String SERIALIZED_NAME_C_I_T_Y = "CITY";
  @SerializedName(SERIALIZED_NAME_C_I_T_Y)
  private Boolean CITY;

  public static final String SERIALIZED_NAME_C_O_U_N_T_R_Y_C_O_D_E = "COUNTRY_CODE";
  @SerializedName(SERIALIZED_NAME_C_O_U_N_T_R_Y_C_O_D_E)
  private Boolean COUNTRY_CODE;

  public static final String SERIALIZED_NAME_C_U_S_T_O_M_E_R_I_D = "CUSTOMER_ID";
  @SerializedName(SERIALIZED_NAME_C_U_S_T_O_M_E_R_I_D)
  private Boolean CUSTOMER_ID;

  public static final String SERIALIZED_NAME_D_A_T_E_O_F_B_I_R_T_H = "DATE_OF_BIRTH";
  @SerializedName(SERIALIZED_NAME_D_A_T_E_O_F_B_I_R_T_H)
  private Boolean DATE_OF_BIRTH;

  public static final String SERIALIZED_NAME_E_M_A_I_L = "EMAIL";
  @SerializedName(SERIALIZED_NAME_E_M_A_I_L)
  private Boolean EMAIL;

  public static final String SERIALIZED_NAME_F_I_R_S_T_N_A_M_E = "FIRST_NAME";
  @SerializedName(SERIALIZED_NAME_F_I_R_S_T_N_A_M_E)
  private Boolean FIRST_NAME;

  public static final String SERIALIZED_NAME_G_E_N_D_E_R = "GENDER";
  @SerializedName(SERIALIZED_NAME_G_E_N_D_E_R)
  private Boolean GENDER;

  public static final String SERIALIZED_NAME_H_O_M_E_I_N_S_U_R_A_N_C_E = "HOME_INSURANCE";
  @SerializedName(SERIALIZED_NAME_H_O_M_E_I_N_S_U_R_A_N_C_E)
  private Boolean HOME_INSURANCE;

  public static final String SERIALIZED_NAME_J_O_B = "JOB";
  @SerializedName(SERIALIZED_NAME_J_O_B)
  private Boolean JOB;

  public static final String SERIALIZED_NAME_L_A_S_T_C_H_A_N_G_E = "LAST_CHANGE";
  @SerializedName(SERIALIZED_NAME_L_A_S_T_C_H_A_N_G_E)
  private Boolean LAST_CHANGE;

  public static final String SERIALIZED_NAME_L_A_S_T_N_A_M_E = "LAST_NAME";
  @SerializedName(SERIALIZED_NAME_L_A_S_T_N_A_M_E)
  private Boolean LAST_NAME;

  public static final String SERIALIZED_NAME_M_A_R_I_T_A_L_S_T_A_T_U_S = "MARITAL_STATUS";
  @SerializedName(SERIALIZED_NAME_M_A_R_I_T_A_L_S_T_A_T_U_S)
  private Boolean MARITAL_STATUS;

  public static final String SERIALIZED_NAME_N_A_T_I_O_N_A_L_I_T_Y = "NATIONALITY";
  @SerializedName(SERIALIZED_NAME_N_A_T_I_O_N_A_L_I_T_Y)
  private Boolean NATIONALITY;

  public static final String SERIALIZED_NAME_N_U_M_B_E_R_C_H_I_L_D_R_E_N = "NUMBER_CHILDREN";
  @SerializedName(SERIALIZED_NAME_N_U_M_B_E_R_C_H_I_L_D_R_E_N)
  private Boolean NUMBER_CHILDREN;

  public static final String SERIALIZED_NAME_P_H_O_N_E = "PHONE";
  @SerializedName(SERIALIZED_NAME_P_H_O_N_E)
  private Boolean PHONE;

  public static final String SERIALIZED_NAME_S_T_R_E_E_T = "STREET";
  @SerializedName(SERIALIZED_NAME_S_T_R_E_E_T)
  private Boolean STREET;

  public static final String SERIALIZED_NAME_Z_I_P = "ZIP";
  @SerializedName(SERIALIZED_NAME_Z_I_P)
  private Boolean ZIP;

  public static final String SERIALIZED_NAME_C_A_R_I_N_S_U_R_A_N_C_E = "CAR_INSURANCE";
  @SerializedName(SERIALIZED_NAME_C_A_R_I_N_S_U_R_A_N_C_E)
  private Boolean CAR_INSURANCE;

  public ApiV1FINCUSTOMERFields id(Boolean id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Boolean getId() {
    return id;
  }

  public void setId(Boolean id) {
    this.id = id;
  }

  public ApiV1FINCUSTOMERFields CITY(Boolean CITY) {
    this.CITY = CITY;
    return this;
  }

   /**
   * Get CITY
   * @return CITY
  **/
  @ApiModelProperty(value = "")
  public Boolean getCITY() {
    return CITY;
  }

  public void setCITY(Boolean CITY) {
    this.CITY = CITY;
  }

  public ApiV1FINCUSTOMERFields COUNTRY_CODE(Boolean COUNTRY_CODE) {
    this.COUNTRY_CODE = COUNTRY_CODE;
    return this;
  }

   /**
   * Get COUNTRY_CODE
   * @return COUNTRY_CODE
  **/
  @ApiModelProperty(value = "")
  public Boolean getCOUNTRYCODE() {
    return COUNTRY_CODE;
  }

  public void setCOUNTRYCODE(Boolean COUNTRY_CODE) {
    this.COUNTRY_CODE = COUNTRY_CODE;
  }

  public ApiV1FINCUSTOMERFields CUSTOMER_ID(Boolean CUSTOMER_ID) {
    this.CUSTOMER_ID = CUSTOMER_ID;
    return this;
  }

   /**
   * Get CUSTOMER_ID
   * @return CUSTOMER_ID
  **/
  @ApiModelProperty(value = "")
  public Boolean getCUSTOMERID() {
    return CUSTOMER_ID;
  }

  public void setCUSTOMERID(Boolean CUSTOMER_ID) {
    this.CUSTOMER_ID = CUSTOMER_ID;
  }

  public ApiV1FINCUSTOMERFields DATE_OF_BIRTH(Boolean DATE_OF_BIRTH) {
    this.DATE_OF_BIRTH = DATE_OF_BIRTH;
    return this;
  }

   /**
   * Get DATE_OF_BIRTH
   * @return DATE_OF_BIRTH
  **/
  @ApiModelProperty(value = "")
  public Boolean getDATEOFBIRTH() {
    return DATE_OF_BIRTH;
  }

  public void setDATEOFBIRTH(Boolean DATE_OF_BIRTH) {
    this.DATE_OF_BIRTH = DATE_OF_BIRTH;
  }

  public ApiV1FINCUSTOMERFields EMAIL(Boolean EMAIL) {
    this.EMAIL = EMAIL;
    return this;
  }

   /**
   * Get EMAIL
   * @return EMAIL
  **/
  @ApiModelProperty(value = "")
  public Boolean getEMAIL() {
    return EMAIL;
  }

  public void setEMAIL(Boolean EMAIL) {
    this.EMAIL = EMAIL;
  }

  public ApiV1FINCUSTOMERFields FIRST_NAME(Boolean FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
    return this;
  }

   /**
   * Get FIRST_NAME
   * @return FIRST_NAME
  **/
  @ApiModelProperty(value = "")
  public Boolean getFIRSTNAME() {
    return FIRST_NAME;
  }

  public void setFIRSTNAME(Boolean FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
  }

  public ApiV1FINCUSTOMERFields GENDER(Boolean GENDER) {
    this.GENDER = GENDER;
    return this;
  }

   /**
   * Get GENDER
   * @return GENDER
  **/
  @ApiModelProperty(value = "")
  public Boolean getGENDER() {
    return GENDER;
  }

  public void setGENDER(Boolean GENDER) {
    this.GENDER = GENDER;
  }

  public ApiV1FINCUSTOMERFields HOME_INSURANCE(Boolean HOME_INSURANCE) {
    this.HOME_INSURANCE = HOME_INSURANCE;
    return this;
  }

   /**
   * Get HOME_INSURANCE
   * @return HOME_INSURANCE
  **/
  @ApiModelProperty(value = "")
  public Boolean getHOMEINSURANCE() {
    return HOME_INSURANCE;
  }

  public void setHOMEINSURANCE(Boolean HOME_INSURANCE) {
    this.HOME_INSURANCE = HOME_INSURANCE;
  }

  public ApiV1FINCUSTOMERFields JOB(Boolean JOB) {
    this.JOB = JOB;
    return this;
  }

   /**
   * Get JOB
   * @return JOB
  **/
  @ApiModelProperty(value = "")
  public Boolean getJOB() {
    return JOB;
  }

  public void setJOB(Boolean JOB) {
    this.JOB = JOB;
  }

  public ApiV1FINCUSTOMERFields LAST_CHANGE(Boolean LAST_CHANGE) {
    this.LAST_CHANGE = LAST_CHANGE;
    return this;
  }

   /**
   * Get LAST_CHANGE
   * @return LAST_CHANGE
  **/
  @ApiModelProperty(value = "")
  public Boolean getLASTCHANGE() {
    return LAST_CHANGE;
  }

  public void setLASTCHANGE(Boolean LAST_CHANGE) {
    this.LAST_CHANGE = LAST_CHANGE;
  }

  public ApiV1FINCUSTOMERFields LAST_NAME(Boolean LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
    return this;
  }

   /**
   * Get LAST_NAME
   * @return LAST_NAME
  **/
  @ApiModelProperty(value = "")
  public Boolean getLASTNAME() {
    return LAST_NAME;
  }

  public void setLASTNAME(Boolean LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
  }

  public ApiV1FINCUSTOMERFields MARITAL_STATUS(Boolean MARITAL_STATUS) {
    this.MARITAL_STATUS = MARITAL_STATUS;
    return this;
  }

   /**
   * Get MARITAL_STATUS
   * @return MARITAL_STATUS
  **/
  @ApiModelProperty(value = "")
  public Boolean getMARITALSTATUS() {
    return MARITAL_STATUS;
  }

  public void setMARITALSTATUS(Boolean MARITAL_STATUS) {
    this.MARITAL_STATUS = MARITAL_STATUS;
  }

  public ApiV1FINCUSTOMERFields NATIONALITY(Boolean NATIONALITY) {
    this.NATIONALITY = NATIONALITY;
    return this;
  }

   /**
   * Get NATIONALITY
   * @return NATIONALITY
  **/
  @ApiModelProperty(value = "")
  public Boolean getNATIONALITY() {
    return NATIONALITY;
  }

  public void setNATIONALITY(Boolean NATIONALITY) {
    this.NATIONALITY = NATIONALITY;
  }

  public ApiV1FINCUSTOMERFields NUMBER_CHILDREN(Boolean NUMBER_CHILDREN) {
    this.NUMBER_CHILDREN = NUMBER_CHILDREN;
    return this;
  }

   /**
   * Get NUMBER_CHILDREN
   * @return NUMBER_CHILDREN
  **/
  @ApiModelProperty(value = "")
  public Boolean getNUMBERCHILDREN() {
    return NUMBER_CHILDREN;
  }

  public void setNUMBERCHILDREN(Boolean NUMBER_CHILDREN) {
    this.NUMBER_CHILDREN = NUMBER_CHILDREN;
  }

  public ApiV1FINCUSTOMERFields PHONE(Boolean PHONE) {
    this.PHONE = PHONE;
    return this;
  }

   /**
   * Get PHONE
   * @return PHONE
  **/
  @ApiModelProperty(value = "")
  public Boolean getPHONE() {
    return PHONE;
  }

  public void setPHONE(Boolean PHONE) {
    this.PHONE = PHONE;
  }

  public ApiV1FINCUSTOMERFields STREET(Boolean STREET) {
    this.STREET = STREET;
    return this;
  }

   /**
   * Get STREET
   * @return STREET
  **/
  @ApiModelProperty(value = "")
  public Boolean getSTREET() {
    return STREET;
  }

  public void setSTREET(Boolean STREET) {
    this.STREET = STREET;
  }

  public ApiV1FINCUSTOMERFields ZIP(Boolean ZIP) {
    this.ZIP = ZIP;
    return this;
  }

   /**
   * Get ZIP
   * @return ZIP
  **/
  @ApiModelProperty(value = "")
  public Boolean getZIP() {
    return ZIP;
  }

  public void setZIP(Boolean ZIP) {
    this.ZIP = ZIP;
  }

  public ApiV1FINCUSTOMERFields CAR_INSURANCE(Boolean CAR_INSURANCE) {
    this.CAR_INSURANCE = CAR_INSURANCE;
    return this;
  }

   /**
   * Get CAR_INSURANCE
   * @return CAR_INSURANCE
  **/
  @ApiModelProperty(value = "")
  public Boolean getCARINSURANCE() {
    return CAR_INSURANCE;
  }

  public void setCARINSURANCE(Boolean CAR_INSURANCE) {
    this.CAR_INSURANCE = CAR_INSURANCE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1FINCUSTOMERFields apiV1FINCUSTOMERFields = (ApiV1FINCUSTOMERFields) o;
    return Objects.equals(this.id, apiV1FINCUSTOMERFields.id) &&
        Objects.equals(this.CITY, apiV1FINCUSTOMERFields.CITY) &&
        Objects.equals(this.COUNTRY_CODE, apiV1FINCUSTOMERFields.COUNTRY_CODE) &&
        Objects.equals(this.CUSTOMER_ID, apiV1FINCUSTOMERFields.CUSTOMER_ID) &&
        Objects.equals(this.DATE_OF_BIRTH, apiV1FINCUSTOMERFields.DATE_OF_BIRTH) &&
        Objects.equals(this.EMAIL, apiV1FINCUSTOMERFields.EMAIL) &&
        Objects.equals(this.FIRST_NAME, apiV1FINCUSTOMERFields.FIRST_NAME) &&
        Objects.equals(this.GENDER, apiV1FINCUSTOMERFields.GENDER) &&
        Objects.equals(this.HOME_INSURANCE, apiV1FINCUSTOMERFields.HOME_INSURANCE) &&
        Objects.equals(this.JOB, apiV1FINCUSTOMERFields.JOB) &&
        Objects.equals(this.LAST_CHANGE, apiV1FINCUSTOMERFields.LAST_CHANGE) &&
        Objects.equals(this.LAST_NAME, apiV1FINCUSTOMERFields.LAST_NAME) &&
        Objects.equals(this.MARITAL_STATUS, apiV1FINCUSTOMERFields.MARITAL_STATUS) &&
        Objects.equals(this.NATIONALITY, apiV1FINCUSTOMERFields.NATIONALITY) &&
        Objects.equals(this.NUMBER_CHILDREN, apiV1FINCUSTOMERFields.NUMBER_CHILDREN) &&
        Objects.equals(this.PHONE, apiV1FINCUSTOMERFields.PHONE) &&
        Objects.equals(this.STREET, apiV1FINCUSTOMERFields.STREET) &&
        Objects.equals(this.ZIP, apiV1FINCUSTOMERFields.ZIP) &&
        Objects.equals(this.CAR_INSURANCE, apiV1FINCUSTOMERFields.CAR_INSURANCE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, CITY, COUNTRY_CODE, CUSTOMER_ID, DATE_OF_BIRTH, EMAIL, FIRST_NAME, GENDER, HOME_INSURANCE, JOB, LAST_CHANGE, LAST_NAME, MARITAL_STATUS, NATIONALITY, NUMBER_CHILDREN, PHONE, STREET, ZIP, CAR_INSURANCE);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1FINCUSTOMERFields {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    CITY: ").append(toIndentedString(CITY)).append("\n");
    sb.append("    COUNTRY_CODE: ").append(toIndentedString(COUNTRY_CODE)).append("\n");
    sb.append("    CUSTOMER_ID: ").append(toIndentedString(CUSTOMER_ID)).append("\n");
    sb.append("    DATE_OF_BIRTH: ").append(toIndentedString(DATE_OF_BIRTH)).append("\n");
    sb.append("    EMAIL: ").append(toIndentedString(EMAIL)).append("\n");
    sb.append("    FIRST_NAME: ").append(toIndentedString(FIRST_NAME)).append("\n");
    sb.append("    GENDER: ").append(toIndentedString(GENDER)).append("\n");
    sb.append("    HOME_INSURANCE: ").append(toIndentedString(HOME_INSURANCE)).append("\n");
    sb.append("    JOB: ").append(toIndentedString(JOB)).append("\n");
    sb.append("    LAST_CHANGE: ").append(toIndentedString(LAST_CHANGE)).append("\n");
    sb.append("    LAST_NAME: ").append(toIndentedString(LAST_NAME)).append("\n");
    sb.append("    MARITAL_STATUS: ").append(toIndentedString(MARITAL_STATUS)).append("\n");
    sb.append("    NATIONALITY: ").append(toIndentedString(NATIONALITY)).append("\n");
    sb.append("    NUMBER_CHILDREN: ").append(toIndentedString(NUMBER_CHILDREN)).append("\n");
    sb.append("    PHONE: ").append(toIndentedString(PHONE)).append("\n");
    sb.append("    STREET: ").append(toIndentedString(STREET)).append("\n");
    sb.append("    ZIP: ").append(toIndentedString(ZIP)).append("\n");
    sb.append("    CAR_INSURANCE: ").append(toIndentedString(CAR_INSURANCE)).append("\n");
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

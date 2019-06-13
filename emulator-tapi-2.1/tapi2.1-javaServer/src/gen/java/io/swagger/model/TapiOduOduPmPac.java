/*
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API generated from yang definitions
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduUasChoice;
import javax.validation.constraints.*;

/**
 * TapiOduOduPmPac
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOduOduPmPac   {
  @JsonProperty("f-ses")
  private Integer fSes = null;

  @JsonProperty("n-bbe")
  private Integer nBbe = null;

  @JsonProperty("f-bbe")
  private Integer fBbe = null;

  @JsonProperty("uas")
  private TapiOduUasChoice uas = null;

  @JsonProperty("n-ses")
  private Integer nSes = null;

  public TapiOduOduPmPac fSes(Integer fSes) {
    this.fSes = fSes;
    return this;
  }

  /**
   * Far-end Severely Errored Second
   * @return fSes
   **/
  @JsonProperty("f-ses")
  @ApiModelProperty(value = "Far-end Severely Errored Second")
  public Integer getFSes() {
    return fSes;
  }

  public void setFSes(Integer fSes) {
    this.fSes = fSes;
  }

  public TapiOduOduPmPac nBbe(Integer nBbe) {
    this.nBbe = nBbe;
    return this;
  }

  /**
   * Near-end Background Block Error
   * @return nBbe
   **/
  @JsonProperty("n-bbe")
  @ApiModelProperty(value = "Near-end Background Block Error")
  public Integer getNBbe() {
    return nBbe;
  }

  public void setNBbe(Integer nBbe) {
    this.nBbe = nBbe;
  }

  public TapiOduOduPmPac fBbe(Integer fBbe) {
    this.fBbe = fBbe;
    return this;
  }

  /**
   * Far-end Background Block Error
   * @return fBbe
   **/
  @JsonProperty("f-bbe")
  @ApiModelProperty(value = "Far-end Background Block Error")
  public Integer getFBbe() {
    return fBbe;
  }

  public void setFBbe(Integer fBbe) {
    this.fBbe = fBbe;
  }

  public TapiOduOduPmPac uas(TapiOduUasChoice uas) {
    this.uas = uas;
    return this;
  }

  /**
   * UnAvailable Second
   * @return uas
   **/
  @JsonProperty("uas")
  @ApiModelProperty(value = "UnAvailable Second")
  public TapiOduUasChoice getUas() {
    return uas;
  }

  public void setUas(TapiOduUasChoice uas) {
    this.uas = uas;
  }

  public TapiOduOduPmPac nSes(Integer nSes) {
    this.nSes = nSes;
    return this;
  }

  /**
   * Near-end Severely Errored Second
   * @return nSes
   **/
  @JsonProperty("n-ses")
  @ApiModelProperty(value = "Near-end Severely Errored Second")
  public Integer getNSes() {
    return nSes;
  }

  public void setNSes(Integer nSes) {
    this.nSes = nSes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduPmPac tapiOduOduPmPac = (TapiOduOduPmPac) o;
    return Objects.equals(this.fSes, tapiOduOduPmPac.fSes) &&
        Objects.equals(this.nBbe, tapiOduOduPmPac.nBbe) &&
        Objects.equals(this.fBbe, tapiOduOduPmPac.fBbe) &&
        Objects.equals(this.uas, tapiOduOduPmPac.uas) &&
        Objects.equals(this.nSes, tapiOduOduPmPac.nSes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fSes, nBbe, fBbe, uas, nSes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduPmPac {\n");
    
    sb.append("    fSes: ").append(toIndentedString(fSes)).append("\n");
    sb.append("    nBbe: ").append(toIndentedString(nBbe)).append("\n");
    sb.append("    fBbe: ").append(toIndentedString(fBbe)).append("\n");
    sb.append("    uas: ").append(toIndentedString(uas)).append("\n");
    sb.append("    nSes: ").append(toIndentedString(nSes)).append("\n");
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


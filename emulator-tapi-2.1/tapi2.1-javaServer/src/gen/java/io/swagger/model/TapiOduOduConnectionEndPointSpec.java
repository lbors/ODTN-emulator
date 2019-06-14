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
import io.swagger.model.TapiOduOduCommonPac;
import io.swagger.model.TapiOduOduCtpPac;
import io.swagger.model.TapiOduOduProtectionPac;
import io.swagger.model.TapiOduOduTerminationAndClientAdaptationPac;
import javax.validation.constraints.*;

/**
 * TapiOduOduConnectionEndPointSpec
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOduOduConnectionEndPointSpec   {
  @JsonProperty("odu-term-and-adapter")
  private TapiOduOduTerminationAndClientAdaptationPac oduTermAndAdapter = null;

  @JsonProperty("odu-common")
  private TapiOduOduCommonPac oduCommon = null;

  @JsonProperty("odu-ctp")
  private TapiOduOduCtpPac oduCtp = null;

  @JsonProperty("odu-protection")
  private TapiOduOduProtectionPac oduProtection = null;

  public TapiOduOduConnectionEndPointSpec oduTermAndAdapter(TapiOduOduTerminationAndClientAdaptationPac oduTermAndAdapter) {
    this.oduTermAndAdapter = oduTermAndAdapter;
    return this;
  }

  /**
   * none
   * @return oduTermAndAdapter
   **/
  @JsonProperty("odu-term-and-adapter")
  @ApiModelProperty(value = "none")
  public TapiOduOduTerminationAndClientAdaptationPac getOduTermAndAdapter() {
    return oduTermAndAdapter;
  }

  public void setOduTermAndAdapter(TapiOduOduTerminationAndClientAdaptationPac oduTermAndAdapter) {
    this.oduTermAndAdapter = oduTermAndAdapter;
  }

  public TapiOduOduConnectionEndPointSpec oduCommon(TapiOduOduCommonPac oduCommon) {
    this.oduCommon = oduCommon;
    return this;
  }

  /**
   * none
   * @return oduCommon
   **/
  @JsonProperty("odu-common")
  @ApiModelProperty(value = "none")
  public TapiOduOduCommonPac getOduCommon() {
    return oduCommon;
  }

  public void setOduCommon(TapiOduOduCommonPac oduCommon) {
    this.oduCommon = oduCommon;
  }

  public TapiOduOduConnectionEndPointSpec oduCtp(TapiOduOduCtpPac oduCtp) {
    this.oduCtp = oduCtp;
    return this;
  }

  /**
   * none
   * @return oduCtp
   **/
  @JsonProperty("odu-ctp")
  @ApiModelProperty(value = "none")
  public TapiOduOduCtpPac getOduCtp() {
    return oduCtp;
  }

  public void setOduCtp(TapiOduOduCtpPac oduCtp) {
    this.oduCtp = oduCtp;
  }

  public TapiOduOduConnectionEndPointSpec oduProtection(TapiOduOduProtectionPac oduProtection) {
    this.oduProtection = oduProtection;
    return this;
  }

  /**
   * none
   * @return oduProtection
   **/
  @JsonProperty("odu-protection")
  @ApiModelProperty(value = "none")
  public TapiOduOduProtectionPac getOduProtection() {
    return oduProtection;
  }

  public void setOduProtection(TapiOduOduProtectionPac oduProtection) {
    this.oduProtection = oduProtection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduConnectionEndPointSpec tapiOduOduConnectionEndPointSpec = (TapiOduOduConnectionEndPointSpec) o;
    return Objects.equals(this.oduTermAndAdapter, tapiOduOduConnectionEndPointSpec.oduTermAndAdapter) &&
        Objects.equals(this.oduCommon, tapiOduOduConnectionEndPointSpec.oduCommon) &&
        Objects.equals(this.oduCtp, tapiOduOduConnectionEndPointSpec.oduCtp) &&
        Objects.equals(this.oduProtection, tapiOduOduConnectionEndPointSpec.oduProtection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oduTermAndAdapter, oduCommon, oduCtp, oduProtection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduConnectionEndPointSpec {\n");
    
    sb.append("    oduTermAndAdapter: ").append(toIndentedString(oduTermAndAdapter)).append("\n");
    sb.append("    oduCommon: ").append(toIndentedString(oduCommon)).append("\n");
    sb.append("    oduCtp: ").append(toIndentedString(oduCtp)).append("\n");
    sb.append("    oduProtection: ").append(toIndentedString(oduProtection)).append("\n");
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

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
import io.swagger.model.TapiVirtualNetworkVirtualNetworkConstraint;
import io.swagger.model.TapiVirtualNetworkVirtualNetworkServiceEndPoint;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiVirtualNetworkCreatevirtualnetworkserviceInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiVirtualNetworkCreatevirtualnetworkserviceInput   {
  @JsonProperty("conn-schedule")
  private String connSchedule = null;

  @JsonProperty("vnw-constraint")
  private TapiVirtualNetworkVirtualNetworkConstraint vnwConstraint = null;

  @JsonProperty("sep")
  private List<TapiVirtualNetworkVirtualNetworkServiceEndPoint> sep = null;

  public TapiVirtualNetworkCreatevirtualnetworkserviceInput connSchedule(String connSchedule) {
    this.connSchedule = connSchedule;
    return this;
  }

  /**
   * none
   * @return connSchedule
   **/
  @JsonProperty("conn-schedule")
  @ApiModelProperty(value = "none")
  public String getConnSchedule() {
    return connSchedule;
  }

  public void setConnSchedule(String connSchedule) {
    this.connSchedule = connSchedule;
  }

  public TapiVirtualNetworkCreatevirtualnetworkserviceInput vnwConstraint(TapiVirtualNetworkVirtualNetworkConstraint vnwConstraint) {
    this.vnwConstraint = vnwConstraint;
    return this;
  }

  /**
   * none
   * @return vnwConstraint
   **/
  @JsonProperty("vnw-constraint")
  @ApiModelProperty(value = "none")
  public TapiVirtualNetworkVirtualNetworkConstraint getVnwConstraint() {
    return vnwConstraint;
  }

  public void setVnwConstraint(TapiVirtualNetworkVirtualNetworkConstraint vnwConstraint) {
    this.vnwConstraint = vnwConstraint;
  }

  public TapiVirtualNetworkCreatevirtualnetworkserviceInput sep(List<TapiVirtualNetworkVirtualNetworkServiceEndPoint> sep) {
    this.sep = sep;
    return this;
  }

  public TapiVirtualNetworkCreatevirtualnetworkserviceInput addSepItem(TapiVirtualNetworkVirtualNetworkServiceEndPoint sepItem) {
    if (this.sep == null) {
      this.sep = new ArrayList<TapiVirtualNetworkVirtualNetworkServiceEndPoint>();
    }
    this.sep.add(sepItem);
    return this;
  }

  /**
   * none
   * @return sep
   **/
  @JsonProperty("sep")
  @ApiModelProperty(value = "none")
  public List<TapiVirtualNetworkVirtualNetworkServiceEndPoint> getSep() {
    return sep;
  }

  public void setSep(List<TapiVirtualNetworkVirtualNetworkServiceEndPoint> sep) {
    this.sep = sep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiVirtualNetworkCreatevirtualnetworkserviceInput tapiVirtualNetworkCreatevirtualnetworkserviceInput = (TapiVirtualNetworkCreatevirtualnetworkserviceInput) o;
    return Objects.equals(this.connSchedule, tapiVirtualNetworkCreatevirtualnetworkserviceInput.connSchedule) &&
        Objects.equals(this.vnwConstraint, tapiVirtualNetworkCreatevirtualnetworkserviceInput.vnwConstraint) &&
        Objects.equals(this.sep, tapiVirtualNetworkCreatevirtualnetworkserviceInput.sep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connSchedule, vnwConstraint, sep);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiVirtualNetworkCreatevirtualnetworkserviceInput {\n");
    
    sb.append("    connSchedule: ").append(toIndentedString(connSchedule)).append("\n");
    sb.append("    vnwConstraint: ").append(toIndentedString(vnwConstraint)).append("\n");
    sb.append("    sep: ").append(toIndentedString(sep)).append("\n");
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


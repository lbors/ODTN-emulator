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
import io.swagger.model.TapiVirtualNetworkVirtualNetworkService;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiVirtualNetworkGetvirtualnetworkservicelistOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiVirtualNetworkGetvirtualnetworkservicelistOutput   {
  @JsonProperty("service")
  private List<TapiVirtualNetworkVirtualNetworkService> service = null;

  public TapiVirtualNetworkGetvirtualnetworkservicelistOutput service(List<TapiVirtualNetworkVirtualNetworkService> service) {
    this.service = service;
    return this;
  }

  public TapiVirtualNetworkGetvirtualnetworkservicelistOutput addServiceItem(TapiVirtualNetworkVirtualNetworkService serviceItem) {
    if (this.service == null) {
      this.service = new ArrayList<TapiVirtualNetworkVirtualNetworkService>();
    }
    this.service.add(serviceItem);
    return this;
  }

  /**
   * none
   * @return service
   **/
  @JsonProperty("service")
  @ApiModelProperty(value = "none")
  public List<TapiVirtualNetworkVirtualNetworkService> getService() {
    return service;
  }

  public void setService(List<TapiVirtualNetworkVirtualNetworkService> service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiVirtualNetworkGetvirtualnetworkservicelistOutput tapiVirtualNetworkGetvirtualnetworkservicelistOutput = (TapiVirtualNetworkGetvirtualnetworkservicelistOutput) o;
    return Objects.equals(this.service, tapiVirtualNetworkGetvirtualnetworkservicelistOutput.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiVirtualNetworkGetvirtualnetworkservicelistOutput {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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


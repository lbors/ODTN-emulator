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
import io.swagger.model.TapiConnectivityConnectivityConstraint;
import io.swagger.model.TapiConnectivityConnectivityserviceEndPoint;
import io.swagger.model.TapiConnectivityResilienceConstraint;
import io.swagger.model.TapiPathComputationRoutingConstraint;
import io.swagger.model.TapiPathComputationTopologyConstraint;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiConnectivityCreateconnectivityserviceInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiConnectivityCreateconnectivityserviceInput   {
  @JsonProperty("topology-constraint")
  private TapiPathComputationTopologyConstraint topologyConstraint = null;

  @JsonProperty("end-point")
  private List<TapiConnectivityConnectivityserviceEndPoint> endPoint = null;

  @JsonProperty("resilience-constraint")
  private List<TapiConnectivityResilienceConstraint> resilienceConstraint = null;

  @JsonProperty("routing-constraint")
  private TapiPathComputationRoutingConstraint routingConstraint = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("connectivity-constraint")
  private TapiConnectivityConnectivityConstraint connectivityConstraint = null;

  public TapiConnectivityCreateconnectivityserviceInput topologyConstraint(TapiPathComputationTopologyConstraint topologyConstraint) {
    this.topologyConstraint = topologyConstraint;
    return this;
  }

  /**
   * none
   * @return topologyConstraint
   **/
  @JsonProperty("topology-constraint")
  @ApiModelProperty(value = "none")
  public TapiPathComputationTopologyConstraint getTopologyConstraint() {
    return topologyConstraint;
  }

  public void setTopologyConstraint(TapiPathComputationTopologyConstraint topologyConstraint) {
    this.topologyConstraint = topologyConstraint;
  }

  public TapiConnectivityCreateconnectivityserviceInput endPoint(List<TapiConnectivityConnectivityserviceEndPoint> endPoint) {
    this.endPoint = endPoint;
    return this;
  }

  public TapiConnectivityCreateconnectivityserviceInput addEndPointItem(TapiConnectivityConnectivityserviceEndPoint endPointItem) {
    if (this.endPoint == null) {
      this.endPoint = new ArrayList<TapiConnectivityConnectivityserviceEndPoint>();
    }
    this.endPoint.add(endPointItem);
    return this;
  }

  /**
   * none
   * @return endPoint
   **/
  @JsonProperty("end-point")
  @ApiModelProperty(value = "none")
  public List<TapiConnectivityConnectivityserviceEndPoint> getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(List<TapiConnectivityConnectivityserviceEndPoint> endPoint) {
    this.endPoint = endPoint;
  }

  public TapiConnectivityCreateconnectivityserviceInput resilienceConstraint(List<TapiConnectivityResilienceConstraint> resilienceConstraint) {
    this.resilienceConstraint = resilienceConstraint;
    return this;
  }

  public TapiConnectivityCreateconnectivityserviceInput addResilienceConstraintItem(TapiConnectivityResilienceConstraint resilienceConstraintItem) {
    if (this.resilienceConstraint == null) {
      this.resilienceConstraint = new ArrayList<TapiConnectivityResilienceConstraint>();
    }
    this.resilienceConstraint.add(resilienceConstraintItem);
    return this;
  }

  /**
   * none
   * @return resilienceConstraint
   **/
  @JsonProperty("resilience-constraint")
  @ApiModelProperty(value = "none")
  public List<TapiConnectivityResilienceConstraint> getResilienceConstraint() {
    return resilienceConstraint;
  }

  public void setResilienceConstraint(List<TapiConnectivityResilienceConstraint> resilienceConstraint) {
    this.resilienceConstraint = resilienceConstraint;
  }

  public TapiConnectivityCreateconnectivityserviceInput routingConstraint(TapiPathComputationRoutingConstraint routingConstraint) {
    this.routingConstraint = routingConstraint;
    return this;
  }

  /**
   * none
   * @return routingConstraint
   **/
  @JsonProperty("routing-constraint")
  @ApiModelProperty(value = "none")
  public TapiPathComputationRoutingConstraint getRoutingConstraint() {
    return routingConstraint;
  }

  public void setRoutingConstraint(TapiPathComputationRoutingConstraint routingConstraint) {
    this.routingConstraint = routingConstraint;
  }

  public TapiConnectivityCreateconnectivityserviceInput state(String state) {
    this.state = state;
    return this;
  }

  /**
   * none
   * @return state
   **/
  @JsonProperty("state")
  @ApiModelProperty(value = "none")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public TapiConnectivityCreateconnectivityserviceInput connectivityConstraint(TapiConnectivityConnectivityConstraint connectivityConstraint) {
    this.connectivityConstraint = connectivityConstraint;
    return this;
  }

  /**
   * none
   * @return connectivityConstraint
   **/
  @JsonProperty("connectivity-constraint")
  @ApiModelProperty(value = "none")
  public TapiConnectivityConnectivityConstraint getConnectivityConstraint() {
    return connectivityConstraint;
  }

  public void setConnectivityConstraint(TapiConnectivityConnectivityConstraint connectivityConstraint) {
    this.connectivityConstraint = connectivityConstraint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityCreateconnectivityserviceInput tapiConnectivityCreateconnectivityserviceInput = (TapiConnectivityCreateconnectivityserviceInput) o;
    return Objects.equals(this.topologyConstraint, tapiConnectivityCreateconnectivityserviceInput.topologyConstraint) &&
        Objects.equals(this.endPoint, tapiConnectivityCreateconnectivityserviceInput.endPoint) &&
        Objects.equals(this.resilienceConstraint, tapiConnectivityCreateconnectivityserviceInput.resilienceConstraint) &&
        Objects.equals(this.routingConstraint, tapiConnectivityCreateconnectivityserviceInput.routingConstraint) &&
        Objects.equals(this.state, tapiConnectivityCreateconnectivityserviceInput.state) &&
        Objects.equals(this.connectivityConstraint, tapiConnectivityCreateconnectivityserviceInput.connectivityConstraint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topologyConstraint, endPoint, resilienceConstraint, routingConstraint, state, connectivityConstraint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityCreateconnectivityserviceInput {\n");
    
    sb.append("    topologyConstraint: ").append(toIndentedString(topologyConstraint)).append("\n");
    sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
    sb.append("    resilienceConstraint: ").append(toIndentedString(resilienceConstraint)).append("\n");
    sb.append("    routingConstraint: ").append(toIndentedString(routingConstraint)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    connectivityConstraint: ").append(toIndentedString(connectivityConstraint)).append("\n");
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


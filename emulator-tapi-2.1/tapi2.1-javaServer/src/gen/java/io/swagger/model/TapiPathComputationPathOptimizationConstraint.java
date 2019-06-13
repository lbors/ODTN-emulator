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
import io.swagger.model.TapiCommonDirectiveValue;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiPathComputationPathOptimizationConstraint
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiPathComputationPathOptimizationConstraint   {
  @JsonProperty("name")
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("local-id")
  private String localId = null;

  @JsonProperty("traffic-interruption")
  private TapiCommonDirectiveValue trafficInterruption = null;

  public TapiPathComputationPathOptimizationConstraint name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiPathComputationPathOptimizationConstraint addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<TapiCommonNameAndValue>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(value = "List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.")
  public List<TapiCommonNameAndValue> getName() {
    return name;
  }

  public void setName(List<TapiCommonNameAndValue> name) {
    this.name = name;
  }

  public TapiPathComputationPathOptimizationConstraint localId(String localId) {
    this.localId = localId;
    return this;
  }

  /**
   * none
   * @return localId
   **/
  @JsonProperty("local-id")
  @ApiModelProperty(value = "none")
  public String getLocalId() {
    return localId;
  }

  public void setLocalId(String localId) {
    this.localId = localId;
  }

  public TapiPathComputationPathOptimizationConstraint trafficInterruption(TapiCommonDirectiveValue trafficInterruption) {
    this.trafficInterruption = trafficInterruption;
    return this;
  }

  /**
   * none
   * @return trafficInterruption
   **/
  @JsonProperty("traffic-interruption")
  @ApiModelProperty(value = "none")
  public TapiCommonDirectiveValue getTrafficInterruption() {
    return trafficInterruption;
  }

  public void setTrafficInterruption(TapiCommonDirectiveValue trafficInterruption) {
    this.trafficInterruption = trafficInterruption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPathComputationPathOptimizationConstraint tapiPathComputationPathOptimizationConstraint = (TapiPathComputationPathOptimizationConstraint) o;
    return Objects.equals(this.name, tapiPathComputationPathOptimizationConstraint.name) &&
        Objects.equals(this.localId, tapiPathComputationPathOptimizationConstraint.localId) &&
        Objects.equals(this.trafficInterruption, tapiPathComputationPathOptimizationConstraint.trafficInterruption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, localId, trafficInterruption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPathComputationPathOptimizationConstraint {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    trafficInterruption: ").append(toIndentedString(trafficInterruption)).append("\n");
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


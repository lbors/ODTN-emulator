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
import io.swagger.model.TapiCommonCapacity;
import io.swagger.model.TapiCommonCapacityPac;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiTopologyCostCharacteristic;
import io.swagger.model.TapiTopologyLatencyCharacteristic;
import io.swagger.model.TapiTopologyNodeRuleGroupRef;
import io.swagger.model.TapiTopologyRiskCharacteristic;
import io.swagger.model.TapiTopologyRiskParameterPac;
import io.swagger.model.TapiTopologyRule;
import io.swagger.model.TapiTopologyTransferCostPac;
import io.swagger.model.TapiTopologyTransferTimingPac;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiTopologyInterRuleGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiTopologyInterRuleGroup   {
  @JsonProperty("available-capacity")
  private TapiCommonCapacity availableCapacity = null;

  @JsonProperty("total-potential-capacity")
  private TapiCommonCapacity totalPotentialCapacity = null;

  @JsonProperty("name")
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("risk-characteristic")
  private List<TapiTopologyRiskCharacteristic> riskCharacteristic = null;

  @JsonProperty("cost-characteristic")
  private List<TapiTopologyCostCharacteristic> costCharacteristic = null;

  @JsonProperty("latency-characteristic")
  private List<TapiTopologyLatencyCharacteristic> latencyCharacteristic = null;

  @JsonProperty("associated-node-rule-group")
  private List<TapiTopologyNodeRuleGroupRef> associatedNodeRuleGroup = null;

  @JsonProperty("rule")
  private List<TapiTopologyRule> rule = null;

  public TapiTopologyInterRuleGroup availableCapacity(TapiCommonCapacity availableCapacity) {
    this.availableCapacity = availableCapacity;
    return this;
  }

  /**
   * Capacity available to be assigned.
   * @return availableCapacity
   **/
  @JsonProperty("available-capacity")
  @ApiModelProperty(value = "Capacity available to be assigned.")
  public TapiCommonCapacity getAvailableCapacity() {
    return availableCapacity;
  }

  public void setAvailableCapacity(TapiCommonCapacity availableCapacity) {
    this.availableCapacity = availableCapacity;
  }

  public TapiTopologyInterRuleGroup totalPotentialCapacity(TapiCommonCapacity totalPotentialCapacity) {
    this.totalPotentialCapacity = totalPotentialCapacity;
    return this;
  }

  /**
   * An optimistic view of the capacity of the TopologicalEntity assuming that any shared capacity is available to be taken.
   * @return totalPotentialCapacity
   **/
  @JsonProperty("total-potential-capacity")
  @ApiModelProperty(value = "An optimistic view of the capacity of the TopologicalEntity assuming that any shared capacity is available to be taken.")
  public TapiCommonCapacity getTotalPotentialCapacity() {
    return totalPotentialCapacity;
  }

  public void setTotalPotentialCapacity(TapiCommonCapacity totalPotentialCapacity) {
    this.totalPotentialCapacity = totalPotentialCapacity;
  }

  public TapiTopologyInterRuleGroup name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiTopologyInterRuleGroup addNameItem(TapiCommonNameAndValue nameItem) {
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

  public TapiTopologyInterRuleGroup uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-&#39; + &#39;[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
   **/
  @JsonProperty("uuid")
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public TapiTopologyInterRuleGroup riskCharacteristic(List<TapiTopologyRiskCharacteristic> riskCharacteristic) {
    this.riskCharacteristic = riskCharacteristic;
    return this;
  }

  public TapiTopologyInterRuleGroup addRiskCharacteristicItem(TapiTopologyRiskCharacteristic riskCharacteristicItem) {
    if (this.riskCharacteristic == null) {
      this.riskCharacteristic = new ArrayList<TapiTopologyRiskCharacteristic>();
    }
    this.riskCharacteristic.add(riskCharacteristicItem);
    return this;
  }

  /**
   * A list of risk characteristics for consideration in an analysis of shared risk. Each element of the list represents a specific risk consideration.
   * @return riskCharacteristic
   **/
  @JsonProperty("risk-characteristic")
  @ApiModelProperty(value = "A list of risk characteristics for consideration in an analysis of shared risk. Each element of the list represents a specific risk consideration.")
  public List<TapiTopologyRiskCharacteristic> getRiskCharacteristic() {
    return riskCharacteristic;
  }

  public void setRiskCharacteristic(List<TapiTopologyRiskCharacteristic> riskCharacteristic) {
    this.riskCharacteristic = riskCharacteristic;
  }

  public TapiTopologyInterRuleGroup costCharacteristic(List<TapiTopologyCostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
    return this;
  }

  public TapiTopologyInterRuleGroup addCostCharacteristicItem(TapiTopologyCostCharacteristic costCharacteristicItem) {
    if (this.costCharacteristic == null) {
      this.costCharacteristic = new ArrayList<TapiTopologyCostCharacteristic>();
    }
    this.costCharacteristic.add(costCharacteristicItem);
    return this;
  }

  /**
   * The list of costs where each cost relates to some aspect of the TopologicalEntity.
   * @return costCharacteristic
   **/
  @JsonProperty("cost-characteristic")
  @ApiModelProperty(value = "The list of costs where each cost relates to some aspect of the TopologicalEntity.")
  public List<TapiTopologyCostCharacteristic> getCostCharacteristic() {
    return costCharacteristic;
  }

  public void setCostCharacteristic(List<TapiTopologyCostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
  }

  public TapiTopologyInterRuleGroup latencyCharacteristic(List<TapiTopologyLatencyCharacteristic> latencyCharacteristic) {
    this.latencyCharacteristic = latencyCharacteristic;
    return this;
  }

  public TapiTopologyInterRuleGroup addLatencyCharacteristicItem(TapiTopologyLatencyCharacteristic latencyCharacteristicItem) {
    if (this.latencyCharacteristic == null) {
      this.latencyCharacteristic = new ArrayList<TapiTopologyLatencyCharacteristic>();
    }
    this.latencyCharacteristic.add(latencyCharacteristicItem);
    return this;
  }

  /**
   * The effect on the latency of a queuing process. This only has significant effect for packet based systems and has a complex characteristic.
   * @return latencyCharacteristic
   **/
  @JsonProperty("latency-characteristic")
  @ApiModelProperty(value = "The effect on the latency of a queuing process. This only has significant effect for packet based systems and has a complex characteristic.")
  public List<TapiTopologyLatencyCharacteristic> getLatencyCharacteristic() {
    return latencyCharacteristic;
  }

  public void setLatencyCharacteristic(List<TapiTopologyLatencyCharacteristic> latencyCharacteristic) {
    this.latencyCharacteristic = latencyCharacteristic;
  }

  public TapiTopologyInterRuleGroup associatedNodeRuleGroup(List<TapiTopologyNodeRuleGroupRef> associatedNodeRuleGroup) {
    this.associatedNodeRuleGroup = associatedNodeRuleGroup;
    return this;
  }

  public TapiTopologyInterRuleGroup addAssociatedNodeRuleGroupItem(TapiTopologyNodeRuleGroupRef associatedNodeRuleGroupItem) {
    if (this.associatedNodeRuleGroup == null) {
      this.associatedNodeRuleGroup = new ArrayList<TapiTopologyNodeRuleGroupRef>();
    }
    this.associatedNodeRuleGroup.add(associatedNodeRuleGroupItem);
    return this;
  }

  /**
   * none
   * @return associatedNodeRuleGroup
   **/
  @JsonProperty("associated-node-rule-group")
  @ApiModelProperty(value = "none")
  public List<TapiTopologyNodeRuleGroupRef> getAssociatedNodeRuleGroup() {
    return associatedNodeRuleGroup;
  }

  public void setAssociatedNodeRuleGroup(List<TapiTopologyNodeRuleGroupRef> associatedNodeRuleGroup) {
    this.associatedNodeRuleGroup = associatedNodeRuleGroup;
  }

  public TapiTopologyInterRuleGroup rule(List<TapiTopologyRule> rule) {
    this.rule = rule;
    return this;
  }

  public TapiTopologyInterRuleGroup addRuleItem(TapiTopologyRule ruleItem) {
    if (this.rule == null) {
      this.rule = new ArrayList<TapiTopologyRule>();
    }
    this.rule.add(ruleItem);
    return this;
  }

  /**
   * none
   * @return rule
   **/
  @JsonProperty("rule")
  @ApiModelProperty(value = "none")
  public List<TapiTopologyRule> getRule() {
    return rule;
  }

  public void setRule(List<TapiTopologyRule> rule) {
    this.rule = rule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyInterRuleGroup tapiTopologyInterRuleGroup = (TapiTopologyInterRuleGroup) o;
    return Objects.equals(this.availableCapacity, tapiTopologyInterRuleGroup.availableCapacity) &&
        Objects.equals(this.totalPotentialCapacity, tapiTopologyInterRuleGroup.totalPotentialCapacity) &&
        Objects.equals(this.name, tapiTopologyInterRuleGroup.name) &&
        Objects.equals(this.uuid, tapiTopologyInterRuleGroup.uuid) &&
        Objects.equals(this.riskCharacteristic, tapiTopologyInterRuleGroup.riskCharacteristic) &&
        Objects.equals(this.costCharacteristic, tapiTopologyInterRuleGroup.costCharacteristic) &&
        Objects.equals(this.latencyCharacteristic, tapiTopologyInterRuleGroup.latencyCharacteristic) &&
        Objects.equals(this.associatedNodeRuleGroup, tapiTopologyInterRuleGroup.associatedNodeRuleGroup) &&
        Objects.equals(this.rule, tapiTopologyInterRuleGroup.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableCapacity, totalPotentialCapacity, name, uuid, riskCharacteristic, costCharacteristic, latencyCharacteristic, associatedNodeRuleGroup, rule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyInterRuleGroup {\n");
    
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    totalPotentialCapacity: ").append(toIndentedString(totalPotentialCapacity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    riskCharacteristic: ").append(toIndentedString(riskCharacteristic)).append("\n");
    sb.append("    costCharacteristic: ").append(toIndentedString(costCharacteristic)).append("\n");
    sb.append("    latencyCharacteristic: ").append(toIndentedString(latencyCharacteristic)).append("\n");
    sb.append("    associatedNodeRuleGroup: ").append(toIndentedString(associatedNodeRuleGroup)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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


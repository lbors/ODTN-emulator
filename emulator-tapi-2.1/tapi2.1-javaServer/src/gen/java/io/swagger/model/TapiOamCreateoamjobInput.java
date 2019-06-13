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
import io.swagger.model.TapiOamOamProfile;
import io.swagger.model.TapiOamOamServiceEndPoint;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiOamCreateoamjobInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOamCreateoamjobInput   {
  @JsonProperty("schedule")
  private String schedule = null;

  @JsonProperty("oam-service-end-point")
  private List<TapiOamOamServiceEndPoint> oamServiceEndPoint = null;

  @JsonProperty("oam-job-type")
  private String oamJobType = null;

  @JsonProperty("oam-profile")
  private TapiOamOamProfile oamProfile = null;

  @JsonProperty("state")
  private String state = null;

  public TapiOamCreateoamjobInput schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * none
   * @return schedule
   **/
  @JsonProperty("schedule")
  @ApiModelProperty(value = "none")
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  public TapiOamCreateoamjobInput oamServiceEndPoint(List<TapiOamOamServiceEndPoint> oamServiceEndPoint) {
    this.oamServiceEndPoint = oamServiceEndPoint;
    return this;
  }

  public TapiOamCreateoamjobInput addOamServiceEndPointItem(TapiOamOamServiceEndPoint oamServiceEndPointItem) {
    if (this.oamServiceEndPoint == null) {
      this.oamServiceEndPoint = new ArrayList<TapiOamOamServiceEndPoint>();
    }
    this.oamServiceEndPoint.add(oamServiceEndPointItem);
    return this;
  }

  /**
   * none
   * @return oamServiceEndPoint
   **/
  @JsonProperty("oam-service-end-point")
  @ApiModelProperty(value = "none")
  public List<TapiOamOamServiceEndPoint> getOamServiceEndPoint() {
    return oamServiceEndPoint;
  }

  public void setOamServiceEndPoint(List<TapiOamOamServiceEndPoint> oamServiceEndPoint) {
    this.oamServiceEndPoint = oamServiceEndPoint;
  }

  public TapiOamCreateoamjobInput oamJobType(String oamJobType) {
    this.oamJobType = oamJobType;
    return this;
  }

  /**
   * none
   * @return oamJobType
   **/
  @JsonProperty("oam-job-type")
  @ApiModelProperty(value = "none")
  public String getOamJobType() {
    return oamJobType;
  }

  public void setOamJobType(String oamJobType) {
    this.oamJobType = oamJobType;
  }

  public TapiOamCreateoamjobInput oamProfile(TapiOamOamProfile oamProfile) {
    this.oamProfile = oamProfile;
    return this;
  }

  /**
   * none
   * @return oamProfile
   **/
  @JsonProperty("oam-profile")
  @ApiModelProperty(value = "none")
  public TapiOamOamProfile getOamProfile() {
    return oamProfile;
  }

  public void setOamProfile(TapiOamOamProfile oamProfile) {
    this.oamProfile = oamProfile;
  }

  public TapiOamCreateoamjobInput state(String state) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamCreateoamjobInput tapiOamCreateoamjobInput = (TapiOamCreateoamjobInput) o;
    return Objects.equals(this.schedule, tapiOamCreateoamjobInput.schedule) &&
        Objects.equals(this.oamServiceEndPoint, tapiOamCreateoamjobInput.oamServiceEndPoint) &&
        Objects.equals(this.oamJobType, tapiOamCreateoamjobInput.oamJobType) &&
        Objects.equals(this.oamProfile, tapiOamCreateoamjobInput.oamProfile) &&
        Objects.equals(this.state, tapiOamCreateoamjobInput.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedule, oamServiceEndPoint, oamJobType, oamProfile, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamCreateoamjobInput {\n");
    
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    oamServiceEndPoint: ").append(toIndentedString(oamServiceEndPoint)).append("\n");
    sb.append("    oamJobType: ").append(toIndentedString(oamJobType)).append("\n");
    sb.append("    oamProfile: ").append(toIndentedString(oamProfile)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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


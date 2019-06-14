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
import io.swagger.model.TapiOamMepRef;
import io.swagger.model.TapiOamMipRef;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiOamMepMipList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOamMepMipList   {
  @JsonProperty("mip")
  private List<TapiOamMipRef> mip = null;

  @JsonProperty("mep")
  private List<TapiOamMepRef> mep = null;

  public TapiOamMepMipList mip(List<TapiOamMipRef> mip) {
    this.mip = mip;
    return this;
  }

  public TapiOamMepMipList addMipItem(TapiOamMipRef mipItem) {
    if (this.mip == null) {
      this.mip = new ArrayList<TapiOamMipRef>();
    }
    this.mip.add(mipItem);
    return this;
  }

  /**
   * none
   * @return mip
   **/
  @JsonProperty("mip")
  @ApiModelProperty(value = "none")
  public List<TapiOamMipRef> getMip() {
    return mip;
  }

  public void setMip(List<TapiOamMipRef> mip) {
    this.mip = mip;
  }

  public TapiOamMepMipList mep(List<TapiOamMepRef> mep) {
    this.mep = mep;
    return this;
  }

  public TapiOamMepMipList addMepItem(TapiOamMepRef mepItem) {
    if (this.mep == null) {
      this.mep = new ArrayList<TapiOamMepRef>();
    }
    this.mep.add(mepItem);
    return this;
  }

  /**
   * none
   * @return mep
   **/
  @JsonProperty("mep")
  @ApiModelProperty(value = "none")
  public List<TapiOamMepRef> getMep() {
    return mep;
  }

  public void setMep(List<TapiOamMepRef> mep) {
    this.mep = mep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamMepMipList tapiOamMepMipList = (TapiOamMepMipList) o;
    return Objects.equals(this.mip, tapiOamMepMipList.mip) &&
        Objects.equals(this.mep, tapiOamMepMipList.mep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mip, mep);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamMepMipList {\n");
    
    sb.append("    mip: ").append(toIndentedString(mip)).append("\n");
    sb.append("    mep: ").append(toIndentedString(mep)).append("\n");
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

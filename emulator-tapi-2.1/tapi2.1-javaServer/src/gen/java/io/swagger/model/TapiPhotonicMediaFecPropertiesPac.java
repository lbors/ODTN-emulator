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
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaFecPropertiesPac
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiPhotonicMediaFecPropertiesPac   {
  @JsonProperty("uncorrectable-bytes")
  private Integer uncorrectableBytes = null;

  @JsonProperty("corrected-bits")
  private Integer correctedBits = null;

  @JsonProperty("pre-fec-ber")
  private Integer preFecBer = null;

  @JsonProperty("uncorrectable-bits")
  private Integer uncorrectableBits = null;

  @JsonProperty("corrected-bytes")
  private Integer correctedBytes = null;

  @JsonProperty("post-fec-ber")
  private Integer postFecBer = null;

  public TapiPhotonicMediaFecPropertiesPac uncorrectableBytes(Integer uncorrectableBytes) {
    this.uncorrectableBytes = uncorrectableBytes;
    return this;
  }

  /**
   * Bytes that could not be corrected by FEC
   * @return uncorrectableBytes
   **/
  @JsonProperty("uncorrectable-bytes")
  @ApiModelProperty(value = "Bytes that could not be corrected by FEC")
  public Integer getUncorrectableBytes() {
    return uncorrectableBytes;
  }

  public void setUncorrectableBytes(Integer uncorrectableBytes) {
    this.uncorrectableBytes = uncorrectableBytes;
  }

  public TapiPhotonicMediaFecPropertiesPac correctedBits(Integer correctedBits) {
    this.correctedBits = correctedBits;
    return this;
  }

  /**
   * Bits corrected between those that were received corrupted
   * @return correctedBits
   **/
  @JsonProperty("corrected-bits")
  @ApiModelProperty(value = "Bits corrected between those that were received corrupted")
  public Integer getCorrectedBits() {
    return correctedBits;
  }

  public void setCorrectedBits(Integer correctedBits) {
    this.correctedBits = correctedBits;
  }

  public TapiPhotonicMediaFecPropertiesPac preFecBer(Integer preFecBer) {
    this.preFecBer = preFecBer;
    return this;
  }

  /**
   * counter: bit error rate before correction by FEC
   * @return preFecBer
   **/
  @JsonProperty("pre-fec-ber")
  @ApiModelProperty(value = "counter: bit error rate before correction by FEC")
  public Integer getPreFecBer() {
    return preFecBer;
  }

  public void setPreFecBer(Integer preFecBer) {
    this.preFecBer = preFecBer;
  }

  public TapiPhotonicMediaFecPropertiesPac uncorrectableBits(Integer uncorrectableBits) {
    this.uncorrectableBits = uncorrectableBits;
    return this;
  }

  /**
   * Bits that could not be corrected by FEC
   * @return uncorrectableBits
   **/
  @JsonProperty("uncorrectable-bits")
  @ApiModelProperty(value = "Bits that could not be corrected by FEC")
  public Integer getUncorrectableBits() {
    return uncorrectableBits;
  }

  public void setUncorrectableBits(Integer uncorrectableBits) {
    this.uncorrectableBits = uncorrectableBits;
  }

  public TapiPhotonicMediaFecPropertiesPac correctedBytes(Integer correctedBytes) {
    this.correctedBytes = correctedBytes;
    return this;
  }

  /**
   * Bytes corrected between those that were received corrupted
   * @return correctedBytes
   **/
  @JsonProperty("corrected-bytes")
  @ApiModelProperty(value = "Bytes corrected between those that were received corrupted")
  public Integer getCorrectedBytes() {
    return correctedBytes;
  }

  public void setCorrectedBytes(Integer correctedBytes) {
    this.correctedBytes = correctedBytes;
  }

  public TapiPhotonicMediaFecPropertiesPac postFecBer(Integer postFecBer) {
    this.postFecBer = postFecBer;
    return this;
  }

  /**
   * counter: bit error rate after correction by FEC
   * @return postFecBer
   **/
  @JsonProperty("post-fec-ber")
  @ApiModelProperty(value = "counter: bit error rate after correction by FEC")
  public Integer getPostFecBer() {
    return postFecBer;
  }

  public void setPostFecBer(Integer postFecBer) {
    this.postFecBer = postFecBer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaFecPropertiesPac tapiPhotonicMediaFecPropertiesPac = (TapiPhotonicMediaFecPropertiesPac) o;
    return Objects.equals(this.uncorrectableBytes, tapiPhotonicMediaFecPropertiesPac.uncorrectableBytes) &&
        Objects.equals(this.correctedBits, tapiPhotonicMediaFecPropertiesPac.correctedBits) &&
        Objects.equals(this.preFecBer, tapiPhotonicMediaFecPropertiesPac.preFecBer) &&
        Objects.equals(this.uncorrectableBits, tapiPhotonicMediaFecPropertiesPac.uncorrectableBits) &&
        Objects.equals(this.correctedBytes, tapiPhotonicMediaFecPropertiesPac.correctedBytes) &&
        Objects.equals(this.postFecBer, tapiPhotonicMediaFecPropertiesPac.postFecBer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uncorrectableBytes, correctedBits, preFecBer, uncorrectableBits, correctedBytes, postFecBer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaFecPropertiesPac {\n");
    
    sb.append("    uncorrectableBytes: ").append(toIndentedString(uncorrectableBytes)).append("\n");
    sb.append("    correctedBits: ").append(toIndentedString(correctedBits)).append("\n");
    sb.append("    preFecBer: ").append(toIndentedString(preFecBer)).append("\n");
    sb.append("    uncorrectableBits: ").append(toIndentedString(uncorrectableBits)).append("\n");
    sb.append("    correctedBytes: ").append(toIndentedString(correctedBytes)).append("\n");
    sb.append("    postFecBer: ").append(toIndentedString(postFecBer)).append("\n");
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


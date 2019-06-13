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
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.eth.FrameType
 */
public enum TapiEthFrameType {
  
  ONLY_VLAN_TAGGED_FRAMES("ADMIT_ONLY_VLAN_TAGGED_FRAMES"),
  
  ONLY_UNTAGGED_AND_PRIORITY_TAGGED_FRAMES("ADMIT_ONLY_UNTAGGED_AND_PRIORITY_TAGGED_FRAMES"),
  
  ALL_FRAMES("ADMIT_ALL_FRAMES");

  private String value;

  TapiEthFrameType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiEthFrameType fromValue(String text) {
    for (TapiEthFrameType b : TapiEthFrameType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


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
 * Gets or Sets tapi.photonic.media.LaserType
 */
public enum TapiPhotonicMediaLaserType {
  
  PUMP("PUMP"),
  
  MODULATED("MODULATED"),
  
  PULSE("PULSE");

  private String value;

  TapiPhotonicMediaLaserType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiPhotonicMediaLaserType fromValue(String text) {
    for (TapiPhotonicMediaLaserType b : TapiPhotonicMediaLaserType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


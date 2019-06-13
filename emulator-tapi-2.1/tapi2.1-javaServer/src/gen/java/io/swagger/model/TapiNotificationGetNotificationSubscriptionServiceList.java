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
import io.swagger.model.TapiNotificationGetnotificationsubscriptionservicelistOutput;
import javax.validation.constraints.*;

/**
 * TapiNotificationGetNotificationSubscriptionServiceList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiNotificationGetNotificationSubscriptionServiceList   {
  @JsonProperty("output")
  private TapiNotificationGetnotificationsubscriptionservicelistOutput output = null;

  public TapiNotificationGetNotificationSubscriptionServiceList output(TapiNotificationGetnotificationsubscriptionservicelistOutput output) {
    this.output = output;
    return this;
  }

  /**
   * Get output
   * @return output
   **/
  @JsonProperty("output")
  @ApiModelProperty(value = "")
  public TapiNotificationGetnotificationsubscriptionservicelistOutput getOutput() {
    return output;
  }

  public void setOutput(TapiNotificationGetnotificationsubscriptionservicelistOutput output) {
    this.output = output;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiNotificationGetNotificationSubscriptionServiceList tapiNotificationGetNotificationSubscriptionServiceList = (TapiNotificationGetNotificationSubscriptionServiceList) o;
    return Objects.equals(this.output, tapiNotificationGetNotificationSubscriptionServiceList.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(output);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiNotificationGetNotificationSubscriptionServiceList {\n");
    
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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


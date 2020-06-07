package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-07T13:28:51.174Z[GMT]")
public class InlineResponse200   {
  @JsonProperty("authType")
  private String authType = null;

  @JsonProperty("tokenValue")
  private String tokenValue = null;

  public InlineResponse200 authType(String authType) {
    this.authType = authType;
    return this;
  }

  /**
   * Get authType
   * @return authType
  **/
  @ApiModelProperty(value = "")
  
    public String getAuthType() {
    return authType;
  }

  public void setAuthType(String authType) {
    this.authType = authType;
  }

  public InlineResponse200 tokenValue(String tokenValue) {
    this.tokenValue = tokenValue;
    return this;
  }

  /**
   * Get tokenValue
   * @return tokenValue
  **/
  @ApiModelProperty(value = "")
  
    public String getTokenValue() {
    return tokenValue;
  }

  public void setTokenValue(String tokenValue) {
    this.tokenValue = tokenValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.authType, inlineResponse200.authType) &&
        Objects.equals(this.tokenValue, inlineResponse200.tokenValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, tokenValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    tokenValue: ").append(toIndentedString(tokenValue)).append("\n");
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

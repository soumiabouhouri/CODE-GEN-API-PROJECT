package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-07T13:28:51.174Z[GMT]")
public class User   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("FirstName")
  private String firstName = null;

  @JsonProperty("LastName")
  private String lastName = null;

  @JsonProperty("UserName")
  private String userName = null;

  @JsonProperty("Password")
  private String password = null;

  @JsonProperty("Gender")
  private String gender = null;

  @JsonProperty("dayLimimt")
  private BigDecimal dayLimimt = null;

  @JsonProperty("transactionLimit")
  private Double transactionLimit = null;

  @JsonProperty("absoluteLimit")
  private Double absoluteLimit = null;

  public User id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1L3", required = true, value = "")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "John", required = true, value = "")
      @NotNull

    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "Doe", value = "")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(example = "johndoe", value = "")
  
    public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(example = "password", required = true, value = "")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(example = "Male", value = "")
  
    public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public User dayLimimt(BigDecimal dayLimimt) {
    this.dayLimimt = dayLimimt;
    return this;
  }

  /**
   * Get dayLimimt
   * @return dayLimimt
  **/
  @ApiModelProperty(example = "15", value = "")
  
    @Valid
    public BigDecimal getDayLimimt() {
    return dayLimimt;
  }

  public void setDayLimimt(BigDecimal dayLimimt) {
    this.dayLimimt = dayLimimt;
  }

  public User transactionLimit(Double transactionLimit) {
    this.transactionLimit = transactionLimit;
    return this;
  }

  /**
   * Get transactionLimit
   * @return transactionLimit
  **/
  @ApiModelProperty(example = "10000", value = "")
  
    public Double getTransactionLimit() {
    return transactionLimit;
  }

  public void setTransactionLimit(Double transactionLimit) {
    this.transactionLimit = transactionLimit;
  }

  public User absoluteLimit(Double absoluteLimit) {
    this.absoluteLimit = absoluteLimit;
    return this;
  }

  /**
   * Get absoluteLimit
   * @return absoluteLimit
  **/
  @ApiModelProperty(example = "100", value = "")
  
    public Double getAbsoluteLimit() {
    return absoluteLimit;
  }

  public void setAbsoluteLimit(Double absoluteLimit) {
    this.absoluteLimit = absoluteLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.userName, user.userName) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.gender, user.gender) &&
        Objects.equals(this.dayLimimt, user.dayLimimt) &&
        Objects.equals(this.transactionLimit, user.transactionLimit) &&
        Objects.equals(this.absoluteLimit, user.absoluteLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, userName, password, gender, dayLimimt, transactionLimit, absoluteLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dayLimimt: ").append(toIndentedString(dayLimimt)).append("\n");
    sb.append("    transactionLimit: ").append(toIndentedString(transactionLimit)).append("\n");
    sb.append("    absoluteLimit: ").append(toIndentedString(absoluteLimit)).append("\n");
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

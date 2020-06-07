package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Transaction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-07T13:28:51.174Z[GMT]")
public class Transaction   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("userAccount")
  private String userAccount = null;

  @JsonProperty("receiverAccount")
  private String receiverAccount = null;

  @JsonProperty("user")
  private String user = null;

  @JsonProperty("amount")
  private Double amount = null;

  public Transaction id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
      @NotNull

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Transaction timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", required = true, value = "")
      @NotNull

    @Valid
    public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Transaction userAccount(String userAccount) {
    this.userAccount = userAccount;
    return this;
  }

  /**
   * Get userAccount
   * @return userAccount
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getUserAccount() {
    return userAccount;
  }

  public void setUserAccount(String userAccount) {
    this.userAccount = userAccount;
  }

  public Transaction receiverAccount(String receiverAccount) {
    this.receiverAccount = receiverAccount;
    return this;
  }

  /**
   * Get receiverAccount
   * @return receiverAccount
  **/
  @ApiModelProperty(value = "")
  
    public String getReceiverAccount() {
    return receiverAccount;
  }

  public void setReceiverAccount(String receiverAccount) {
    this.receiverAccount = receiverAccount;
  }

  public Transaction user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public Transaction amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "500", required = true, value = "")
      @NotNull

    public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.timestamp, transaction.timestamp) &&
        Objects.equals(this.userAccount, transaction.userAccount) &&
        Objects.equals(this.receiverAccount, transaction.receiverAccount) &&
        Objects.equals(this.user, transaction.user) &&
        Objects.equals(this.amount, transaction.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, userAccount, receiverAccount, user, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    userAccount: ").append(toIndentedString(userAccount)).append("\n");
    sb.append("    receiverAccount: ").append(toIndentedString(receiverAccount)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

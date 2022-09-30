package com.ibm.dip.model.customer agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer agreement.EvaluateLegalTermsRequestCustomerAgreement;
import com.ibm.dip.model.customer agreement.EvaluateLegalTermsRequestLegalTerms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateLegalTermsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T09:18:46.905Z[GMT]")

public class EvaluateLegalTermsRequest   {
  @JsonProperty("CustomerAgreement")
  private EvaluateLegalTermsRequestCustomerAgreement customerAgreement;

  @JsonProperty("LegalTerms")
  private EvaluateLegalTermsRequestLegalTerms legalTerms;

  public EvaluateLegalTermsRequest customerAgreement(EvaluateLegalTermsRequestCustomerAgreement customerAgreement) {
    this.customerAgreement = customerAgreement;
    return this;
  }

  /**
   * Get customerAgreement
   * @return customerAgreement
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateLegalTermsRequestCustomerAgreement getCustomerAgreement() {
    return customerAgreement;
  }

  public void setCustomerAgreement(EvaluateLegalTermsRequestCustomerAgreement customerAgreement) {
    this.customerAgreement = customerAgreement;
  }

  public EvaluateLegalTermsRequest legalTerms(EvaluateLegalTermsRequestLegalTerms legalTerms) {
    this.legalTerms = legalTerms;
    return this;
  }

  /**
   * Get legalTerms
   * @return legalTerms
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateLegalTermsRequestLegalTerms getLegalTerms() {
    return legalTerms;
  }

  public void setLegalTerms(EvaluateLegalTermsRequestLegalTerms legalTerms) {
    this.legalTerms = legalTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateLegalTermsRequest evaluateLegalTermsRequest = (EvaluateLegalTermsRequest) o;
    return Objects.equals(this.customerAgreement, evaluateLegalTermsRequest.customerAgreement) &&
        Objects.equals(this.legalTerms, evaluateLegalTermsRequest.legalTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerAgreement, legalTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateLegalTermsRequest {\n");
    
    sb.append("    customerAgreement: ").append(toIndentedString(customerAgreement)).append("\n");
    sb.append("    legalTerms: ").append(toIndentedString(legalTerms)).append("\n");
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


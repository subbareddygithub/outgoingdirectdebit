package com.ibm.dip.model.regulatory compliance;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.regulatory compliance.EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateRegulatoryComplianceAssessmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T09:18:49.096Z[GMT]")

public class EvaluateRegulatoryComplianceAssessmentResponse   {
  @JsonProperty("RegulatoryComplianceAssessment")
  private EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulatoryComplianceAssessment;

  public EvaluateRegulatoryComplianceAssessmentResponse regulatoryComplianceAssessment(EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulatoryComplianceAssessment) {
    this.regulatoryComplianceAssessment = regulatoryComplianceAssessment;
    return this;
  }

  /**
   * Get regulatoryComplianceAssessment
   * @return regulatoryComplianceAssessment
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment getRegulatoryComplianceAssessment() {
    return regulatoryComplianceAssessment;
  }

  public void setRegulatoryComplianceAssessment(EvaluateRegulatoryComplianceAssessmentResponseRegulatoryComplianceAssessment regulatoryComplianceAssessment) {
    this.regulatoryComplianceAssessment = regulatoryComplianceAssessment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateRegulatoryComplianceAssessmentResponse evaluateRegulatoryComplianceAssessmentResponse = (EvaluateRegulatoryComplianceAssessmentResponse) o;
    return Objects.equals(this.regulatoryComplianceAssessment, evaluateRegulatoryComplianceAssessmentResponse.regulatoryComplianceAssessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatoryComplianceAssessment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateRegulatoryComplianceAssessmentResponse {\n");
    
    sb.append("    regulatoryComplianceAssessment: ").append(toIndentedString(regulatoryComplianceAssessment)).append("\n");
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


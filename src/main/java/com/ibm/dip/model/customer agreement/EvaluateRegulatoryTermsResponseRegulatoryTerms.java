package com.ibm.dip.model.customer agreement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateRegulatoryTermsResponseRegulatoryTerms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T09:18:46.905Z[GMT]")

public class EvaluateRegulatoryTermsResponseRegulatoryTerms   {
  @JsonProperty("ApplicableRegulationInterpretation")
  private String applicableRegulationInterpretation;

  public EvaluateRegulatoryTermsResponseRegulatoryTerms applicableRegulationInterpretation(String applicableRegulationInterpretation) {
    this.applicableRegulationInterpretation = applicableRegulationInterpretation;
    return this;
  }

  /**
   * Get applicableRegulationInterpretation
   * @return applicableRegulationInterpretation
  */
  @ApiModelProperty(value = "")


  public String getApplicableRegulationInterpretation() {
    return applicableRegulationInterpretation;
  }

  public void setApplicableRegulationInterpretation(String applicableRegulationInterpretation) {
    this.applicableRegulationInterpretation = applicableRegulationInterpretation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateRegulatoryTermsResponseRegulatoryTerms evaluateRegulatoryTermsResponseRegulatoryTerms = (EvaluateRegulatoryTermsResponseRegulatoryTerms) o;
    return Objects.equals(this.applicableRegulationInterpretation, evaluateRegulatoryTermsResponseRegulatoryTerms.applicableRegulationInterpretation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicableRegulationInterpretation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateRegulatoryTermsResponseRegulatoryTerms {\n");
    
    sb.append("    applicableRegulationInterpretation: ").append(toIndentedString(applicableRegulationInterpretation)).append("\n");
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


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDebtFactoringRetrieveInputModelDebtFactoringInstanceReport
 */
public class BQDebtFactoringRetrieveInputModelDebtFactoringInstanceReport   {
  private String debtFactoringInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return debtFactoringInstanceReportReference
  **/

  public String getDebtFactoringInstanceReportReference() {
    return debtFactoringInstanceReportReference;
  }

  public void setDebtFactoringInstanceReportReference(String debtFactoringInstanceReportReference) {
    this.debtFactoringInstanceReportReference = debtFactoringInstanceReportReference;
  }


}


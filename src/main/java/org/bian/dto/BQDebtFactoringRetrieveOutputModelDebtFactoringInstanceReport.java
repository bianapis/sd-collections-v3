package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDebtFactoringRetrieveOutputModelDebtFactoringInstanceReport
 */
public class BQDebtFactoringRetrieveOutputModelDebtFactoringInstanceReport   {
  private Object debtFactoringInstanceReportRecord = null;

  private String debtFactoringInstanceReportType = null;

  private String debtFactoringInstanceReportParameters = null;

  private Object debtFactoringInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return debtFactoringInstanceReportRecord
  **/

  public Object getDebtFactoringInstanceReportRecord() {
    return debtFactoringInstanceReportRecord;
  }

  public void setDebtFactoringInstanceReportRecord(Object debtFactoringInstanceReportRecord) {
    this.debtFactoringInstanceReportRecord = debtFactoringInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return debtFactoringInstanceReportType
  **/

  public String getDebtFactoringInstanceReportType() {
    return debtFactoringInstanceReportType;
  }

  public void setDebtFactoringInstanceReportType(String debtFactoringInstanceReportType) {
    this.debtFactoringInstanceReportType = debtFactoringInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return debtFactoringInstanceReportParameters
  **/

  public String getDebtFactoringInstanceReportParameters() {
    return debtFactoringInstanceReportParameters;
  }

  public void setDebtFactoringInstanceReportParameters(String debtFactoringInstanceReportParameters) {
    this.debtFactoringInstanceReportParameters = debtFactoringInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return debtFactoringInstanceReport
  **/

  public Object getDebtFactoringInstanceReport() {
    return debtFactoringInstanceReport;
  }

  public void setDebtFactoringInstanceReport(Object debtFactoringInstanceReport) {
    this.debtFactoringInstanceReport = debtFactoringInstanceReport;
  }


}


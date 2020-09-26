package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDebtFactoringRetrieveOutputModelDebtFactoringInstanceAnalysis
 */
public class BQDebtFactoringRetrieveOutputModelDebtFactoringInstanceAnalysis   {
  private Object debtFactoringInstanceAnalysisRecord = null;

  private String debtFactoringInstanceAnalysisReportType = null;

  private String debtFactoringInstanceAnalysisParameters = null;

  private Object debtFactoringInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return debtFactoringInstanceAnalysisRecord
  **/

  public Object getDebtFactoringInstanceAnalysisRecord() {
    return debtFactoringInstanceAnalysisRecord;
  }

  public void setDebtFactoringInstanceAnalysisRecord(Object debtFactoringInstanceAnalysisRecord) {
    this.debtFactoringInstanceAnalysisRecord = debtFactoringInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return debtFactoringInstanceAnalysisReportType
  **/

  public String getDebtFactoringInstanceAnalysisReportType() {
    return debtFactoringInstanceAnalysisReportType;
  }

  public void setDebtFactoringInstanceAnalysisReportType(String debtFactoringInstanceAnalysisReportType) {
    this.debtFactoringInstanceAnalysisReportType = debtFactoringInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return debtFactoringInstanceAnalysisParameters
  **/

  public String getDebtFactoringInstanceAnalysisParameters() {
    return debtFactoringInstanceAnalysisParameters;
  }

  public void setDebtFactoringInstanceAnalysisParameters(String debtFactoringInstanceAnalysisParameters) {
    this.debtFactoringInstanceAnalysisParameters = debtFactoringInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return debtFactoringInstanceAnalysisReport
  **/

  public Object getDebtFactoringInstanceAnalysisReport() {
    return debtFactoringInstanceAnalysisReport;
  }

  public void setDebtFactoringInstanceAnalysisReport(Object debtFactoringInstanceAnalysisReport) {
    this.debtFactoringInstanceAnalysisReport = debtFactoringInstanceAnalysisReport;
  }


}


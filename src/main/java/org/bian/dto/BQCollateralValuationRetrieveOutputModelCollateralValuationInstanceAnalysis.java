package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollateralValuationRetrieveOutputModelCollateralValuationInstanceAnalysis
 */
public class BQCollateralValuationRetrieveOutputModelCollateralValuationInstanceAnalysis   {
  private Object collateralValuationInstanceAnalysisRecord = null;

  private String collateralValuationInstanceAnalysisReportType = null;

  private String collateralValuationInstanceAnalysisParameters = null;

  private Object collateralValuationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return collateralValuationInstanceAnalysisRecord
  **/

  public Object getCollateralValuationInstanceAnalysisRecord() {
    return collateralValuationInstanceAnalysisRecord;
  }

  public void setCollateralValuationInstanceAnalysisRecord(Object collateralValuationInstanceAnalysisRecord) {
    this.collateralValuationInstanceAnalysisRecord = collateralValuationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return collateralValuationInstanceAnalysisReportType
  **/

  public String getCollateralValuationInstanceAnalysisReportType() {
    return collateralValuationInstanceAnalysisReportType;
  }

  public void setCollateralValuationInstanceAnalysisReportType(String collateralValuationInstanceAnalysisReportType) {
    this.collateralValuationInstanceAnalysisReportType = collateralValuationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return collateralValuationInstanceAnalysisParameters
  **/

  public String getCollateralValuationInstanceAnalysisParameters() {
    return collateralValuationInstanceAnalysisParameters;
  }

  public void setCollateralValuationInstanceAnalysisParameters(String collateralValuationInstanceAnalysisParameters) {
    this.collateralValuationInstanceAnalysisParameters = collateralValuationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return collateralValuationInstanceAnalysisReport
  **/

  public Object getCollateralValuationInstanceAnalysisReport() {
    return collateralValuationInstanceAnalysisReport;
  }

  public void setCollateralValuationInstanceAnalysisReport(Object collateralValuationInstanceAnalysisReport) {
    this.collateralValuationInstanceAnalysisReport = collateralValuationInstanceAnalysisReport;
  }


}


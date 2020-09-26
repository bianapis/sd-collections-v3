package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollateralLiquidationRetrieveOutputModelCollateralLiquidationInstanceAnalysis
 */
public class BQCollateralLiquidationRetrieveOutputModelCollateralLiquidationInstanceAnalysis   {
  private Object collateralLiquidationInstanceAnalysisRecord = null;

  private String collateralLiquidationInstanceAnalysisReportType = null;

  private String collateralLiquidationInstanceAnalysisParameters = null;

  private Object collateralLiquidationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return collateralLiquidationInstanceAnalysisRecord
  **/

  public Object getCollateralLiquidationInstanceAnalysisRecord() {
    return collateralLiquidationInstanceAnalysisRecord;
  }

  public void setCollateralLiquidationInstanceAnalysisRecord(Object collateralLiquidationInstanceAnalysisRecord) {
    this.collateralLiquidationInstanceAnalysisRecord = collateralLiquidationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return collateralLiquidationInstanceAnalysisReportType
  **/

  public String getCollateralLiquidationInstanceAnalysisReportType() {
    return collateralLiquidationInstanceAnalysisReportType;
  }

  public void setCollateralLiquidationInstanceAnalysisReportType(String collateralLiquidationInstanceAnalysisReportType) {
    this.collateralLiquidationInstanceAnalysisReportType = collateralLiquidationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return collateralLiquidationInstanceAnalysisParameters
  **/

  public String getCollateralLiquidationInstanceAnalysisParameters() {
    return collateralLiquidationInstanceAnalysisParameters;
  }

  public void setCollateralLiquidationInstanceAnalysisParameters(String collateralLiquidationInstanceAnalysisParameters) {
    this.collateralLiquidationInstanceAnalysisParameters = collateralLiquidationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return collateralLiquidationInstanceAnalysisReport
  **/

  public Object getCollateralLiquidationInstanceAnalysisReport() {
    return collateralLiquidationInstanceAnalysisReport;
  }

  public void setCollateralLiquidationInstanceAnalysisReport(Object collateralLiquidationInstanceAnalysisReport) {
    this.collateralLiquidationInstanceAnalysisReport = collateralLiquidationInstanceAnalysisReport;
  }


}


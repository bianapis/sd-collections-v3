package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetLiquidationProcedureRetrieveOutputModelCollateralAssetLiquidationProcedureInstanceAnalysis
 */
public class CRCollateralAssetLiquidationProcedureRetrieveOutputModelCollateralAssetLiquidationProcedureInstanceAnalysis   {
  private String collateralAssetLiquidationProcedureInstanceAnalysisData = null;

  private String collateralAssetLiquidationProcedureInstanceAnalysisReportType = null;

  private Object collateralAssetLiquidationProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return collateralAssetLiquidationProcedureInstanceAnalysisData
  **/

  public String getCollateralAssetLiquidationProcedureInstanceAnalysisData() {
    return collateralAssetLiquidationProcedureInstanceAnalysisData;
  }

  public void setCollateralAssetLiquidationProcedureInstanceAnalysisData(String collateralAssetLiquidationProcedureInstanceAnalysisData) {
    this.collateralAssetLiquidationProcedureInstanceAnalysisData = collateralAssetLiquidationProcedureInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return collateralAssetLiquidationProcedureInstanceAnalysisReportType
  **/

  public String getCollateralAssetLiquidationProcedureInstanceAnalysisReportType() {
    return collateralAssetLiquidationProcedureInstanceAnalysisReportType;
  }

  public void setCollateralAssetLiquidationProcedureInstanceAnalysisReportType(String collateralAssetLiquidationProcedureInstanceAnalysisReportType) {
    this.collateralAssetLiquidationProcedureInstanceAnalysisReportType = collateralAssetLiquidationProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return collateralAssetLiquidationProcedureInstanceAnalysisReport
  **/

  public Object getCollateralAssetLiquidationProcedureInstanceAnalysisReport() {
    return collateralAssetLiquidationProcedureInstanceAnalysisReport;
  }

  public void setCollateralAssetLiquidationProcedureInstanceAnalysisReport(Object collateralAssetLiquidationProcedureInstanceAnalysisReport) {
    this.collateralAssetLiquidationProcedureInstanceAnalysisReport = collateralAssetLiquidationProcedureInstanceAnalysisReport;
  }


}


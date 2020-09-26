package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetLiquidationProcedureRetrieveInputModelCollateralAssetLiquidationProcedureInstanceAnalysis
 */
public class CRCollateralAssetLiquidationProcedureRetrieveInputModelCollateralAssetLiquidationProcedureInstanceAnalysis   {
  private String collateralAssetLiquidationProcedureInstanceAnalysisReference = null;

  private String collateralAssetLiquidationProcedureInstanceAnalysisReportType = null;

  private String collateralAssetLiquidationProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return collateralAssetLiquidationProcedureInstanceAnalysisReference
  **/

  public String getCollateralAssetLiquidationProcedureInstanceAnalysisReference() {
    return collateralAssetLiquidationProcedureInstanceAnalysisReference;
  }

  public void setCollateralAssetLiquidationProcedureInstanceAnalysisReference(String collateralAssetLiquidationProcedureInstanceAnalysisReference) {
    this.collateralAssetLiquidationProcedureInstanceAnalysisReference = collateralAssetLiquidationProcedureInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return collateralAssetLiquidationProcedureInstanceAnalysisParameters
  **/

  public String getCollateralAssetLiquidationProcedureInstanceAnalysisParameters() {
    return collateralAssetLiquidationProcedureInstanceAnalysisParameters;
  }

  public void setCollateralAssetLiquidationProcedureInstanceAnalysisParameters(String collateralAssetLiquidationProcedureInstanceAnalysisParameters) {
    this.collateralAssetLiquidationProcedureInstanceAnalysisParameters = collateralAssetLiquidationProcedureInstanceAnalysisParameters;
  }


}


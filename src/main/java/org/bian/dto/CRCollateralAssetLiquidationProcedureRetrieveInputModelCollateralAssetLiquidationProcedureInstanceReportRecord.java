package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetLiquidationProcedureRetrieveInputModelCollateralAssetLiquidationProcedureInstanceReportRecord
 */
public class CRCollateralAssetLiquidationProcedureRetrieveInputModelCollateralAssetLiquidationProcedureInstanceReportRecord   {
  private String collateralAssetLiquidationProcedureInstanceReportReference = null;

  private String collateralAssetLiquidationProcedureInstanceReportType = null;

  private String collateralAssetLiquidationProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return collateralAssetLiquidationProcedureInstanceReportReference
  **/

  public String getCollateralAssetLiquidationProcedureInstanceReportReference() {
    return collateralAssetLiquidationProcedureInstanceReportReference;
  }

  public void setCollateralAssetLiquidationProcedureInstanceReportReference(String collateralAssetLiquidationProcedureInstanceReportReference) {
    this.collateralAssetLiquidationProcedureInstanceReportReference = collateralAssetLiquidationProcedureInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return collateralAssetLiquidationProcedureInstanceReportType
  **/

  public String getCollateralAssetLiquidationProcedureInstanceReportType() {
    return collateralAssetLiquidationProcedureInstanceReportType;
  }

  public void setCollateralAssetLiquidationProcedureInstanceReportType(String collateralAssetLiquidationProcedureInstanceReportType) {
    this.collateralAssetLiquidationProcedureInstanceReportType = collateralAssetLiquidationProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return collateralAssetLiquidationProcedureInstanceReportParameters
  **/

  public String getCollateralAssetLiquidationProcedureInstanceReportParameters() {
    return collateralAssetLiquidationProcedureInstanceReportParameters;
  }

  public void setCollateralAssetLiquidationProcedureInstanceReportParameters(String collateralAssetLiquidationProcedureInstanceReportParameters) {
    this.collateralAssetLiquidationProcedureInstanceReportParameters = collateralAssetLiquidationProcedureInstanceReportParameters;
  }


}


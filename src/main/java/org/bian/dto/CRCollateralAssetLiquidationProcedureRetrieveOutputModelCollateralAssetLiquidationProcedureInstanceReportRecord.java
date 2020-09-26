package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetLiquidationProcedureRetrieveOutputModelCollateralAssetLiquidationProcedureInstanceReportRecord
 */
public class CRCollateralAssetLiquidationProcedureRetrieveOutputModelCollateralAssetLiquidationProcedureInstanceReportRecord   {
  private String collateralAssetLiquidationProcedureInstanceReportData = null;

  private String collateralAssetLiquidationProcedureInstanceReportType = null;

  private Object collateralAssetLiquidationProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return collateralAssetLiquidationProcedureInstanceReportData
  **/

  public String getCollateralAssetLiquidationProcedureInstanceReportData() {
    return collateralAssetLiquidationProcedureInstanceReportData;
  }

  public void setCollateralAssetLiquidationProcedureInstanceReportData(String collateralAssetLiquidationProcedureInstanceReportData) {
    this.collateralAssetLiquidationProcedureInstanceReportData = collateralAssetLiquidationProcedureInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return collateralAssetLiquidationProcedureInstanceReport
  **/

  public Object getCollateralAssetLiquidationProcedureInstanceReport() {
    return collateralAssetLiquidationProcedureInstanceReport;
  }

  public void setCollateralAssetLiquidationProcedureInstanceReport(Object collateralAssetLiquidationProcedureInstanceReport) {
    this.collateralAssetLiquidationProcedureInstanceReport = collateralAssetLiquidationProcedureInstanceReport;
  }


}


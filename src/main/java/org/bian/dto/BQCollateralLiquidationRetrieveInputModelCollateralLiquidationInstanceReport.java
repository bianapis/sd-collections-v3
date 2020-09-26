package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollateralLiquidationRetrieveInputModelCollateralLiquidationInstanceReport
 */
public class BQCollateralLiquidationRetrieveInputModelCollateralLiquidationInstanceReport   {
  private String collateralLiquidationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return collateralLiquidationInstanceReportReference
  **/

  public String getCollateralLiquidationInstanceReportReference() {
    return collateralLiquidationInstanceReportReference;
  }

  public void setCollateralLiquidationInstanceReportReference(String collateralLiquidationInstanceReportReference) {
    this.collateralLiquidationInstanceReportReference = collateralLiquidationInstanceReportReference;
  }


}


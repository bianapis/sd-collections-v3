package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollateralLiquidationRetrieveInputModelCollateralLiquidationInstanceAnalysis
 */
public class BQCollateralLiquidationRetrieveInputModelCollateralLiquidationInstanceAnalysis   {
  private String collateralLiquidationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return collateralLiquidationInstanceAnalysisReference
  **/

  public String getCollateralLiquidationInstanceAnalysisReference() {
    return collateralLiquidationInstanceAnalysisReference;
  }

  public void setCollateralLiquidationInstanceAnalysisReference(String collateralLiquidationInstanceAnalysisReference) {
    this.collateralLiquidationInstanceAnalysisReference = collateralLiquidationInstanceAnalysisReference;
  }


}


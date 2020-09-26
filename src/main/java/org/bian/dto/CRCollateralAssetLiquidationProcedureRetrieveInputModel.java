package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCollateralAssetLiquidationProcedureRetrieveInputModelCollateralAssetLiquidationProcedureInstanceAnalysis;
import org.bian.dto.CRCollateralAssetLiquidationProcedureRetrieveInputModelCollateralAssetLiquidationProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetLiquidationProcedureRetrieveInputModel
 */
public class CRCollateralAssetLiquidationProcedureRetrieveInputModel   {
  private Object collateralAssetLiquidationProcedureRetrieveActionTaskRecord = null;

  private String collateralAssetLiquidationProcedureRetrieveActionRequest = null;

  private CRCollateralAssetLiquidationProcedureRetrieveInputModelCollateralAssetLiquidationProcedureInstanceReportRecord collateralAssetLiquidationProcedureInstanceReportRecord = null;

  private CRCollateralAssetLiquidationProcedureRetrieveInputModelCollateralAssetLiquidationProcedureInstanceAnalysis collateralAssetLiquidationProcedureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return collateralAssetLiquidationProcedureRetrieveActionTaskRecord
  **/

  public Object getCollateralAssetLiquidationProcedureRetrieveActionTaskRecord() {
    return collateralAssetLiquidationProcedureRetrieveActionTaskRecord;
  }

  public void setCollateralAssetLiquidationProcedureRetrieveActionTaskRecord(Object collateralAssetLiquidationProcedureRetrieveActionTaskRecord) {
    this.collateralAssetLiquidationProcedureRetrieveActionTaskRecord = collateralAssetLiquidationProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return collateralAssetLiquidationProcedureRetrieveActionRequest
  **/

  public String getCollateralAssetLiquidationProcedureRetrieveActionRequest() {
    return collateralAssetLiquidationProcedureRetrieveActionRequest;
  }

  public void setCollateralAssetLiquidationProcedureRetrieveActionRequest(String collateralAssetLiquidationProcedureRetrieveActionRequest) {
    this.collateralAssetLiquidationProcedureRetrieveActionRequest = collateralAssetLiquidationProcedureRetrieveActionRequest;
  }


  /**
   * Get collateralAssetLiquidationProcedureInstanceReportRecord
   * @return collateralAssetLiquidationProcedureInstanceReportRecord
  **/

  public CRCollateralAssetLiquidationProcedureRetrieveInputModelCollateralAssetLiquidationProcedureInstanceReportRecord getCollateralAssetLiquidationProcedureInstanceReportRecord() {
    return collateralAssetLiquidationProcedureInstanceReportRecord;
  }

  public void setCollateralAssetLiquidationProcedureInstanceReportRecord(CRCollateralAssetLiquidationProcedureRetrieveInputModelCollateralAssetLiquidationProcedureInstanceReportRecord collateralAssetLiquidationProcedureInstanceReportRecord) {
    this.collateralAssetLiquidationProcedureInstanceReportRecord = collateralAssetLiquidationProcedureInstanceReportRecord;
  }


  /**
   * Get collateralAssetLiquidationProcedureInstanceAnalysis
   * @return collateralAssetLiquidationProcedureInstanceAnalysis
  **/

  public CRCollateralAssetLiquidationProcedureRetrieveInputModelCollateralAssetLiquidationProcedureInstanceAnalysis getCollateralAssetLiquidationProcedureInstanceAnalysis() {
    return collateralAssetLiquidationProcedureInstanceAnalysis;
  }

  public void setCollateralAssetLiquidationProcedureInstanceAnalysis(CRCollateralAssetLiquidationProcedureRetrieveInputModelCollateralAssetLiquidationProcedureInstanceAnalysis collateralAssetLiquidationProcedureInstanceAnalysis) {
    this.collateralAssetLiquidationProcedureInstanceAnalysis = collateralAssetLiquidationProcedureInstanceAnalysis;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCollateralLiquidationRetrieveInputModelCollateralLiquidationInstanceAnalysis;
import org.bian.dto.BQCollateralLiquidationRetrieveInputModelCollateralLiquidationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCollateralLiquidationRetrieveInputModel
 */
public class BQCollateralLiquidationRetrieveInputModel   {
  private Object collateralLiquidationRetrieveActionTaskRecord = null;

  private String collateralLiquidationRetrieveActionRequest = null;

  private BQCollateralLiquidationRetrieveInputModelCollateralLiquidationInstanceReport collateralLiquidationInstanceReport = null;

  private BQCollateralLiquidationRetrieveInputModelCollateralLiquidationInstanceAnalysis collateralLiquidationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return collateralLiquidationRetrieveActionTaskRecord
  **/

  public Object getCollateralLiquidationRetrieveActionTaskRecord() {
    return collateralLiquidationRetrieveActionTaskRecord;
  }

  public void setCollateralLiquidationRetrieveActionTaskRecord(Object collateralLiquidationRetrieveActionTaskRecord) {
    this.collateralLiquidationRetrieveActionTaskRecord = collateralLiquidationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return collateralLiquidationRetrieveActionRequest
  **/

  public String getCollateralLiquidationRetrieveActionRequest() {
    return collateralLiquidationRetrieveActionRequest;
  }

  public void setCollateralLiquidationRetrieveActionRequest(String collateralLiquidationRetrieveActionRequest) {
    this.collateralLiquidationRetrieveActionRequest = collateralLiquidationRetrieveActionRequest;
  }


  /**
   * Get collateralLiquidationInstanceReport
   * @return collateralLiquidationInstanceReport
  **/

  public BQCollateralLiquidationRetrieveInputModelCollateralLiquidationInstanceReport getCollateralLiquidationInstanceReport() {
    return collateralLiquidationInstanceReport;
  }

  public void setCollateralLiquidationInstanceReport(BQCollateralLiquidationRetrieveInputModelCollateralLiquidationInstanceReport collateralLiquidationInstanceReport) {
    this.collateralLiquidationInstanceReport = collateralLiquidationInstanceReport;
  }


  /**
   * Get collateralLiquidationInstanceAnalysis
   * @return collateralLiquidationInstanceAnalysis
  **/

  public BQCollateralLiquidationRetrieveInputModelCollateralLiquidationInstanceAnalysis getCollateralLiquidationInstanceAnalysis() {
    return collateralLiquidationInstanceAnalysis;
  }

  public void setCollateralLiquidationInstanceAnalysis(BQCollateralLiquidationRetrieveInputModelCollateralLiquidationInstanceAnalysis collateralLiquidationInstanceAnalysis) {
    this.collateralLiquidationInstanceAnalysis = collateralLiquidationInstanceAnalysis;
  }


}


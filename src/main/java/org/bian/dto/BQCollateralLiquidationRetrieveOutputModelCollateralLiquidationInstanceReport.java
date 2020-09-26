package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollateralLiquidationRetrieveOutputModelCollateralLiquidationInstanceReport
 */
public class BQCollateralLiquidationRetrieveOutputModelCollateralLiquidationInstanceReport   {
  private Object collateralLiquidationInstanceReportRecord = null;

  private String collateralLiquidationInstanceReportType = null;

  private String collateralLiquidationInstanceReportParameters = null;

  private Object collateralLiquidationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return collateralLiquidationInstanceReportRecord
  **/

  public Object getCollateralLiquidationInstanceReportRecord() {
    return collateralLiquidationInstanceReportRecord;
  }

  public void setCollateralLiquidationInstanceReportRecord(Object collateralLiquidationInstanceReportRecord) {
    this.collateralLiquidationInstanceReportRecord = collateralLiquidationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return collateralLiquidationInstanceReportType
  **/

  public String getCollateralLiquidationInstanceReportType() {
    return collateralLiquidationInstanceReportType;
  }

  public void setCollateralLiquidationInstanceReportType(String collateralLiquidationInstanceReportType) {
    this.collateralLiquidationInstanceReportType = collateralLiquidationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return collateralLiquidationInstanceReportParameters
  **/

  public String getCollateralLiquidationInstanceReportParameters() {
    return collateralLiquidationInstanceReportParameters;
  }

  public void setCollateralLiquidationInstanceReportParameters(String collateralLiquidationInstanceReportParameters) {
    this.collateralLiquidationInstanceReportParameters = collateralLiquidationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return collateralLiquidationInstanceReport
  **/

  public Object getCollateralLiquidationInstanceReport() {
    return collateralLiquidationInstanceReport;
  }

  public void setCollateralLiquidationInstanceReport(Object collateralLiquidationInstanceReport) {
    this.collateralLiquidationInstanceReport = collateralLiquidationInstanceReport;
  }


}


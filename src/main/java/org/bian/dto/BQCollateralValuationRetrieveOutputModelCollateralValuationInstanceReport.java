package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollateralValuationRetrieveOutputModelCollateralValuationInstanceReport
 */
public class BQCollateralValuationRetrieveOutputModelCollateralValuationInstanceReport   {
  private Object collateralValuationInstanceReportRecord = null;

  private String collateralValuationInstanceReportType = null;

  private String collateralValuationInstanceReportParameters = null;

  private Object collateralValuationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return collateralValuationInstanceReportRecord
  **/

  public Object getCollateralValuationInstanceReportRecord() {
    return collateralValuationInstanceReportRecord;
  }

  public void setCollateralValuationInstanceReportRecord(Object collateralValuationInstanceReportRecord) {
    this.collateralValuationInstanceReportRecord = collateralValuationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return collateralValuationInstanceReportType
  **/

  public String getCollateralValuationInstanceReportType() {
    return collateralValuationInstanceReportType;
  }

  public void setCollateralValuationInstanceReportType(String collateralValuationInstanceReportType) {
    this.collateralValuationInstanceReportType = collateralValuationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return collateralValuationInstanceReportParameters
  **/

  public String getCollateralValuationInstanceReportParameters() {
    return collateralValuationInstanceReportParameters;
  }

  public void setCollateralValuationInstanceReportParameters(String collateralValuationInstanceReportParameters) {
    this.collateralValuationInstanceReportParameters = collateralValuationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return collateralValuationInstanceReport
  **/

  public Object getCollateralValuationInstanceReport() {
    return collateralValuationInstanceReport;
  }

  public void setCollateralValuationInstanceReport(Object collateralValuationInstanceReport) {
    this.collateralValuationInstanceReport = collateralValuationInstanceReport;
  }


}


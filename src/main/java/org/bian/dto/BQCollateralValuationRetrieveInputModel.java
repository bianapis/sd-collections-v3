package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCollateralValuationRetrieveInputModelCollateralValuationInstanceAnalysis;
import org.bian.dto.BQCollateralValuationRetrieveInputModelCollateralValuationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCollateralValuationRetrieveInputModel
 */
public class BQCollateralValuationRetrieveInputModel   {
  private Object collateralValuationRetrieveActionTaskRecord = null;

  private String collateralValuationRetrieveActionRequest = null;

  private BQCollateralValuationRetrieveInputModelCollateralValuationInstanceReport collateralValuationInstanceReport = null;

  private BQCollateralValuationRetrieveInputModelCollateralValuationInstanceAnalysis collateralValuationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return collateralValuationRetrieveActionTaskRecord
  **/

  public Object getCollateralValuationRetrieveActionTaskRecord() {
    return collateralValuationRetrieveActionTaskRecord;
  }

  public void setCollateralValuationRetrieveActionTaskRecord(Object collateralValuationRetrieveActionTaskRecord) {
    this.collateralValuationRetrieveActionTaskRecord = collateralValuationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return collateralValuationRetrieveActionRequest
  **/

  public String getCollateralValuationRetrieveActionRequest() {
    return collateralValuationRetrieveActionRequest;
  }

  public void setCollateralValuationRetrieveActionRequest(String collateralValuationRetrieveActionRequest) {
    this.collateralValuationRetrieveActionRequest = collateralValuationRetrieveActionRequest;
  }


  /**
   * Get collateralValuationInstanceReport
   * @return collateralValuationInstanceReport
  **/

  public BQCollateralValuationRetrieveInputModelCollateralValuationInstanceReport getCollateralValuationInstanceReport() {
    return collateralValuationInstanceReport;
  }

  public void setCollateralValuationInstanceReport(BQCollateralValuationRetrieveInputModelCollateralValuationInstanceReport collateralValuationInstanceReport) {
    this.collateralValuationInstanceReport = collateralValuationInstanceReport;
  }


  /**
   * Get collateralValuationInstanceAnalysis
   * @return collateralValuationInstanceAnalysis
  **/

  public BQCollateralValuationRetrieveInputModelCollateralValuationInstanceAnalysis getCollateralValuationInstanceAnalysis() {
    return collateralValuationInstanceAnalysis;
  }

  public void setCollateralValuationInstanceAnalysis(BQCollateralValuationRetrieveInputModelCollateralValuationInstanceAnalysis collateralValuationInstanceAnalysis) {
    this.collateralValuationInstanceAnalysis = collateralValuationInstanceAnalysis;
  }


}


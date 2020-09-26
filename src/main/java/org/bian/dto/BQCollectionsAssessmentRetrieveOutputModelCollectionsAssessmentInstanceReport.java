package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollectionsAssessmentRetrieveOutputModelCollectionsAssessmentInstanceReport
 */
public class BQCollectionsAssessmentRetrieveOutputModelCollectionsAssessmentInstanceReport   {
  private Object collectionsAssessmentInstanceReportRecord = null;

  private String collectionsAssessmentInstanceReportType = null;

  private String collectionsAssessmentInstanceReportParameters = null;

  private Object collectionsAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return collectionsAssessmentInstanceReportRecord
  **/

  public Object getCollectionsAssessmentInstanceReportRecord() {
    return collectionsAssessmentInstanceReportRecord;
  }

  public void setCollectionsAssessmentInstanceReportRecord(Object collectionsAssessmentInstanceReportRecord) {
    this.collectionsAssessmentInstanceReportRecord = collectionsAssessmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return collectionsAssessmentInstanceReportType
  **/

  public String getCollectionsAssessmentInstanceReportType() {
    return collectionsAssessmentInstanceReportType;
  }

  public void setCollectionsAssessmentInstanceReportType(String collectionsAssessmentInstanceReportType) {
    this.collectionsAssessmentInstanceReportType = collectionsAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return collectionsAssessmentInstanceReportParameters
  **/

  public String getCollectionsAssessmentInstanceReportParameters() {
    return collectionsAssessmentInstanceReportParameters;
  }

  public void setCollectionsAssessmentInstanceReportParameters(String collectionsAssessmentInstanceReportParameters) {
    this.collectionsAssessmentInstanceReportParameters = collectionsAssessmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return collectionsAssessmentInstanceReport
  **/

  public Object getCollectionsAssessmentInstanceReport() {
    return collectionsAssessmentInstanceReport;
  }

  public void setCollectionsAssessmentInstanceReport(Object collectionsAssessmentInstanceReport) {
    this.collectionsAssessmentInstanceReport = collectionsAssessmentInstanceReport;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollectionsAssessmentRetrieveOutputModelCollectionsAssessmentInstanceAnalysis
 */
public class BQCollectionsAssessmentRetrieveOutputModelCollectionsAssessmentInstanceAnalysis   {
  private Object collectionsAssessmentInstanceAnalysisRecord = null;

  private String collectionsAssessmentInstanceAnalysisReportType = null;

  private String collectionsAssessmentInstanceAnalysisParameters = null;

  private Object collectionsAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return collectionsAssessmentInstanceAnalysisRecord
  **/

  public Object getCollectionsAssessmentInstanceAnalysisRecord() {
    return collectionsAssessmentInstanceAnalysisRecord;
  }

  public void setCollectionsAssessmentInstanceAnalysisRecord(Object collectionsAssessmentInstanceAnalysisRecord) {
    this.collectionsAssessmentInstanceAnalysisRecord = collectionsAssessmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return collectionsAssessmentInstanceAnalysisReportType
  **/

  public String getCollectionsAssessmentInstanceAnalysisReportType() {
    return collectionsAssessmentInstanceAnalysisReportType;
  }

  public void setCollectionsAssessmentInstanceAnalysisReportType(String collectionsAssessmentInstanceAnalysisReportType) {
    this.collectionsAssessmentInstanceAnalysisReportType = collectionsAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return collectionsAssessmentInstanceAnalysisParameters
  **/

  public String getCollectionsAssessmentInstanceAnalysisParameters() {
    return collectionsAssessmentInstanceAnalysisParameters;
  }

  public void setCollectionsAssessmentInstanceAnalysisParameters(String collectionsAssessmentInstanceAnalysisParameters) {
    this.collectionsAssessmentInstanceAnalysisParameters = collectionsAssessmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return collectionsAssessmentInstanceAnalysisReport
  **/

  public Object getCollectionsAssessmentInstanceAnalysisReport() {
    return collectionsAssessmentInstanceAnalysisReport;
  }

  public void setCollectionsAssessmentInstanceAnalysisReport(Object collectionsAssessmentInstanceAnalysisReport) {
    this.collectionsAssessmentInstanceAnalysisReport = collectionsAssessmentInstanceAnalysisReport;
  }


}


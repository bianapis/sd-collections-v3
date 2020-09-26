package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCollectionsAssessmentRetrieveInputModelCollectionsAssessmentInstanceAnalysis;
import org.bian.dto.BQCollectionsAssessmentRetrieveInputModelCollectionsAssessmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCollectionsAssessmentRetrieveInputModel
 */
public class BQCollectionsAssessmentRetrieveInputModel   {
  private Object collectionsAssessmentRetrieveActionTaskRecord = null;

  private String collectionsAssessmentRetrieveActionRequest = null;

  private BQCollectionsAssessmentRetrieveInputModelCollectionsAssessmentInstanceReport collectionsAssessmentInstanceReport = null;

  private BQCollectionsAssessmentRetrieveInputModelCollectionsAssessmentInstanceAnalysis collectionsAssessmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return collectionsAssessmentRetrieveActionTaskRecord
  **/

  public Object getCollectionsAssessmentRetrieveActionTaskRecord() {
    return collectionsAssessmentRetrieveActionTaskRecord;
  }

  public void setCollectionsAssessmentRetrieveActionTaskRecord(Object collectionsAssessmentRetrieveActionTaskRecord) {
    this.collectionsAssessmentRetrieveActionTaskRecord = collectionsAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return collectionsAssessmentRetrieveActionRequest
  **/

  public String getCollectionsAssessmentRetrieveActionRequest() {
    return collectionsAssessmentRetrieveActionRequest;
  }

  public void setCollectionsAssessmentRetrieveActionRequest(String collectionsAssessmentRetrieveActionRequest) {
    this.collectionsAssessmentRetrieveActionRequest = collectionsAssessmentRetrieveActionRequest;
  }


  /**
   * Get collectionsAssessmentInstanceReport
   * @return collectionsAssessmentInstanceReport
  **/

  public BQCollectionsAssessmentRetrieveInputModelCollectionsAssessmentInstanceReport getCollectionsAssessmentInstanceReport() {
    return collectionsAssessmentInstanceReport;
  }

  public void setCollectionsAssessmentInstanceReport(BQCollectionsAssessmentRetrieveInputModelCollectionsAssessmentInstanceReport collectionsAssessmentInstanceReport) {
    this.collectionsAssessmentInstanceReport = collectionsAssessmentInstanceReport;
  }


  /**
   * Get collectionsAssessmentInstanceAnalysis
   * @return collectionsAssessmentInstanceAnalysis
  **/

  public BQCollectionsAssessmentRetrieveInputModelCollectionsAssessmentInstanceAnalysis getCollectionsAssessmentInstanceAnalysis() {
    return collectionsAssessmentInstanceAnalysis;
  }

  public void setCollectionsAssessmentInstanceAnalysis(BQCollectionsAssessmentRetrieveInputModelCollectionsAssessmentInstanceAnalysis collectionsAssessmentInstanceAnalysis) {
    this.collectionsAssessmentInstanceAnalysis = collectionsAssessmentInstanceAnalysis;
  }


}


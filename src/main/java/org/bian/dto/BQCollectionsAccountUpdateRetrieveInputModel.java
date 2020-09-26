package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCollectionsAccountUpdateRetrieveInputModelCollectionsAccountUpdateInstanceAnalysis;
import org.bian.dto.BQCollectionsAccountUpdateRetrieveInputModelCollectionsAccountUpdateInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCollectionsAccountUpdateRetrieveInputModel
 */
public class BQCollectionsAccountUpdateRetrieveInputModel   {
  private Object collectionsAccountUpdateRetrieveActionTaskRecord = null;

  private String collectionsAccountUpdateRetrieveActionRequest = null;

  private BQCollectionsAccountUpdateRetrieveInputModelCollectionsAccountUpdateInstanceReport collectionsAccountUpdateInstanceReport = null;

  private BQCollectionsAccountUpdateRetrieveInputModelCollectionsAccountUpdateInstanceAnalysis collectionsAccountUpdateInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return collectionsAccountUpdateRetrieveActionTaskRecord
  **/

  public Object getCollectionsAccountUpdateRetrieveActionTaskRecord() {
    return collectionsAccountUpdateRetrieveActionTaskRecord;
  }

  public void setCollectionsAccountUpdateRetrieveActionTaskRecord(Object collectionsAccountUpdateRetrieveActionTaskRecord) {
    this.collectionsAccountUpdateRetrieveActionTaskRecord = collectionsAccountUpdateRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return collectionsAccountUpdateRetrieveActionRequest
  **/

  public String getCollectionsAccountUpdateRetrieveActionRequest() {
    return collectionsAccountUpdateRetrieveActionRequest;
  }

  public void setCollectionsAccountUpdateRetrieveActionRequest(String collectionsAccountUpdateRetrieveActionRequest) {
    this.collectionsAccountUpdateRetrieveActionRequest = collectionsAccountUpdateRetrieveActionRequest;
  }


  /**
   * Get collectionsAccountUpdateInstanceReport
   * @return collectionsAccountUpdateInstanceReport
  **/

  public BQCollectionsAccountUpdateRetrieveInputModelCollectionsAccountUpdateInstanceReport getCollectionsAccountUpdateInstanceReport() {
    return collectionsAccountUpdateInstanceReport;
  }

  public void setCollectionsAccountUpdateInstanceReport(BQCollectionsAccountUpdateRetrieveInputModelCollectionsAccountUpdateInstanceReport collectionsAccountUpdateInstanceReport) {
    this.collectionsAccountUpdateInstanceReport = collectionsAccountUpdateInstanceReport;
  }


  /**
   * Get collectionsAccountUpdateInstanceAnalysis
   * @return collectionsAccountUpdateInstanceAnalysis
  **/

  public BQCollectionsAccountUpdateRetrieveInputModelCollectionsAccountUpdateInstanceAnalysis getCollectionsAccountUpdateInstanceAnalysis() {
    return collectionsAccountUpdateInstanceAnalysis;
  }

  public void setCollectionsAccountUpdateInstanceAnalysis(BQCollectionsAccountUpdateRetrieveInputModelCollectionsAccountUpdateInstanceAnalysis collectionsAccountUpdateInstanceAnalysis) {
    this.collectionsAccountUpdateInstanceAnalysis = collectionsAccountUpdateInstanceAnalysis;
  }


}


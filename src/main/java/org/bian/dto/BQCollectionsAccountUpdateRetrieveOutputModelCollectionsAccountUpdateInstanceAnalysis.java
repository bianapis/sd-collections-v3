package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollectionsAccountUpdateRetrieveOutputModelCollectionsAccountUpdateInstanceAnalysis
 */
public class BQCollectionsAccountUpdateRetrieveOutputModelCollectionsAccountUpdateInstanceAnalysis   {
  private Object collectionsAccountUpdateInstanceAnalysisRecord = null;

  private String collectionsAccountUpdateInstanceAnalysisReportType = null;

  private String collectionsAccountUpdateInstanceAnalysisParameters = null;

  private Object collectionsAccountUpdateInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return collectionsAccountUpdateInstanceAnalysisRecord
  **/

  public Object getCollectionsAccountUpdateInstanceAnalysisRecord() {
    return collectionsAccountUpdateInstanceAnalysisRecord;
  }

  public void setCollectionsAccountUpdateInstanceAnalysisRecord(Object collectionsAccountUpdateInstanceAnalysisRecord) {
    this.collectionsAccountUpdateInstanceAnalysisRecord = collectionsAccountUpdateInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return collectionsAccountUpdateInstanceAnalysisReportType
  **/

  public String getCollectionsAccountUpdateInstanceAnalysisReportType() {
    return collectionsAccountUpdateInstanceAnalysisReportType;
  }

  public void setCollectionsAccountUpdateInstanceAnalysisReportType(String collectionsAccountUpdateInstanceAnalysisReportType) {
    this.collectionsAccountUpdateInstanceAnalysisReportType = collectionsAccountUpdateInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return collectionsAccountUpdateInstanceAnalysisParameters
  **/

  public String getCollectionsAccountUpdateInstanceAnalysisParameters() {
    return collectionsAccountUpdateInstanceAnalysisParameters;
  }

  public void setCollectionsAccountUpdateInstanceAnalysisParameters(String collectionsAccountUpdateInstanceAnalysisParameters) {
    this.collectionsAccountUpdateInstanceAnalysisParameters = collectionsAccountUpdateInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return collectionsAccountUpdateInstanceAnalysisReport
  **/

  public Object getCollectionsAccountUpdateInstanceAnalysisReport() {
    return collectionsAccountUpdateInstanceAnalysisReport;
  }

  public void setCollectionsAccountUpdateInstanceAnalysisReport(Object collectionsAccountUpdateInstanceAnalysisReport) {
    this.collectionsAccountUpdateInstanceAnalysisReport = collectionsAccountUpdateInstanceAnalysisReport;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollectionsAccountUpdateRetrieveOutputModelCollectionsAccountUpdateInstanceReport
 */
public class BQCollectionsAccountUpdateRetrieveOutputModelCollectionsAccountUpdateInstanceReport   {
  private Object collectionsAccountUpdateInstanceReportRecord = null;

  private String collectionsAccountUpdateInstanceReportType = null;

  private String collectionsAccountUpdateInstanceReportParameters = null;

  private Object collectionsAccountUpdateInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return collectionsAccountUpdateInstanceReportRecord
  **/

  public Object getCollectionsAccountUpdateInstanceReportRecord() {
    return collectionsAccountUpdateInstanceReportRecord;
  }

  public void setCollectionsAccountUpdateInstanceReportRecord(Object collectionsAccountUpdateInstanceReportRecord) {
    this.collectionsAccountUpdateInstanceReportRecord = collectionsAccountUpdateInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return collectionsAccountUpdateInstanceReportType
  **/

  public String getCollectionsAccountUpdateInstanceReportType() {
    return collectionsAccountUpdateInstanceReportType;
  }

  public void setCollectionsAccountUpdateInstanceReportType(String collectionsAccountUpdateInstanceReportType) {
    this.collectionsAccountUpdateInstanceReportType = collectionsAccountUpdateInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return collectionsAccountUpdateInstanceReportParameters
  **/

  public String getCollectionsAccountUpdateInstanceReportParameters() {
    return collectionsAccountUpdateInstanceReportParameters;
  }

  public void setCollectionsAccountUpdateInstanceReportParameters(String collectionsAccountUpdateInstanceReportParameters) {
    this.collectionsAccountUpdateInstanceReportParameters = collectionsAccountUpdateInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return collectionsAccountUpdateInstanceReport
  **/

  public Object getCollectionsAccountUpdateInstanceReport() {
    return collectionsAccountUpdateInstanceReport;
  }

  public void setCollectionsAccountUpdateInstanceReport(Object collectionsAccountUpdateInstanceReport) {
    this.collectionsAccountUpdateInstanceReport = collectionsAccountUpdateInstanceReport;
  }


}


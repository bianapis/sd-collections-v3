package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollectionsAssessmentRetrieveInputModelCollectionsAssessmentInstanceReport
 */
public class BQCollectionsAssessmentRetrieveInputModelCollectionsAssessmentInstanceReport   {
  private String collectionsAssessmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return collectionsAssessmentInstanceReportReference
  **/

  public String getCollectionsAssessmentInstanceReportReference() {
    return collectionsAssessmentInstanceReportReference;
  }

  public void setCollectionsAssessmentInstanceReportReference(String collectionsAssessmentInstanceReportReference) {
    this.collectionsAssessmentInstanceReportReference = collectionsAssessmentInstanceReportReference;
  }


}


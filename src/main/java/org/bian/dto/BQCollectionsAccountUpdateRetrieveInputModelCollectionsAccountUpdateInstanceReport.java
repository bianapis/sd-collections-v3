package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollectionsAccountUpdateRetrieveInputModelCollectionsAccountUpdateInstanceReport
 */
public class BQCollectionsAccountUpdateRetrieveInputModelCollectionsAccountUpdateInstanceReport   {
  private String collectionsAccountUpdateInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return collectionsAccountUpdateInstanceReportReference
  **/

  public String getCollectionsAccountUpdateInstanceReportReference() {
    return collectionsAccountUpdateInstanceReportReference;
  }

  public void setCollectionsAccountUpdateInstanceReportReference(String collectionsAccountUpdateInstanceReportReference) {
    this.collectionsAccountUpdateInstanceReportReference = collectionsAccountUpdateInstanceReportReference;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollectionsAccountUpdateRetrieveInputModelCollectionsAccountUpdateInstanceAnalysis
 */
public class BQCollectionsAccountUpdateRetrieveInputModelCollectionsAccountUpdateInstanceAnalysis   {
  private String collectionsAccountUpdateInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return collectionsAccountUpdateInstanceAnalysisReference
  **/

  public String getCollectionsAccountUpdateInstanceAnalysisReference() {
    return collectionsAccountUpdateInstanceAnalysisReference;
  }

  public void setCollectionsAccountUpdateInstanceAnalysisReference(String collectionsAccountUpdateInstanceAnalysisReference) {
    this.collectionsAccountUpdateInstanceAnalysisReference = collectionsAccountUpdateInstanceAnalysisReference;
  }


}


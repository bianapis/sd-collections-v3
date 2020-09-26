package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCollectionsRetrieveInputModelCollectionsOfferedServiceCollectionsServiceRecord
 */
public class SDCollectionsRetrieveInputModelCollectionsOfferedServiceCollectionsServiceRecord   {
  private String collectionsServiceVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return collectionsServiceVersion
  **/

  public String getCollectionsServiceVersion() {
    return collectionsServiceVersion;
  }

  public void setCollectionsServiceVersion(String collectionsServiceVersion) {
    this.collectionsServiceVersion = collectionsServiceVersion;
  }


}


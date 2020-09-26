package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCollectionsActivateInputModelCollectionsServiceConfigurationRecordCollectionsServiceConfigurationSetup
 */
public class SDCollectionsActivateInputModelCollectionsServiceConfigurationRecordCollectionsServiceConfigurationSetup   {
  private String collectionsServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return collectionsServiceConfigurationParameter
  **/

  public String getCollectionsServiceConfigurationParameter() {
    return collectionsServiceConfigurationParameter;
  }

  public void setCollectionsServiceConfigurationParameter(String collectionsServiceConfigurationParameter) {
    this.collectionsServiceConfigurationParameter = collectionsServiceConfigurationParameter;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceConfigurationSetup
 */
public class SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceConfigurationSetup   {
  private String collectionsServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return collectionsServiceConfigurationParameter
  **/

  public String getCollectionsServiceConfigurationParameter() {
    return collectionsServiceConfigurationParameter;
  }

  public void setCollectionsServiceConfigurationParameter(String collectionsServiceConfigurationParameter) {
    this.collectionsServiceConfigurationParameter = collectionsServiceConfigurationParameter;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCollectionsActivateInputModelCollectionsServiceConfigurationRecordCollectionsServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDCollectionsActivateInputModelCollectionsServiceConfigurationRecord
 */
public class SDCollectionsActivateInputModelCollectionsServiceConfigurationRecord   {
  private String collectionsServiceConfigurationSettingReference = null;

  private String collectionsServiceConfigurationSettingType = null;

  private SDCollectionsActivateInputModelCollectionsServiceConfigurationRecordCollectionsServiceConfigurationSetup collectionsServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return collectionsServiceConfigurationSettingReference
  **/

  public String getCollectionsServiceConfigurationSettingReference() {
    return collectionsServiceConfigurationSettingReference;
  }

  public void setCollectionsServiceConfigurationSettingReference(String collectionsServiceConfigurationSettingReference) {
    this.collectionsServiceConfigurationSettingReference = collectionsServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return collectionsServiceConfigurationSettingType
  **/

  public String getCollectionsServiceConfigurationSettingType() {
    return collectionsServiceConfigurationSettingType;
  }

  public void setCollectionsServiceConfigurationSettingType(String collectionsServiceConfigurationSettingType) {
    this.collectionsServiceConfigurationSettingType = collectionsServiceConfigurationSettingType;
  }


  /**
   * Get collectionsServiceConfigurationSetup
   * @return collectionsServiceConfigurationSetup
  **/

  public SDCollectionsActivateInputModelCollectionsServiceConfigurationRecordCollectionsServiceConfigurationSetup getCollectionsServiceConfigurationSetup() {
    return collectionsServiceConfigurationSetup;
  }

  public void setCollectionsServiceConfigurationSetup(SDCollectionsActivateInputModelCollectionsServiceConfigurationRecordCollectionsServiceConfigurationSetup collectionsServiceConfigurationSetup) {
    this.collectionsServiceConfigurationSetup = collectionsServiceConfigurationSetup;
  }


}


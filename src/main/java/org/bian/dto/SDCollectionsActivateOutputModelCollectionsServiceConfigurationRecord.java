package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCollectionsActivateInputModelCollectionsServiceConfigurationRecordCollectionsServiceConfigurationSetup;
import org.bian.dto.SDCollectionsActivateOutputModelCollectionsServiceConfigurationRecordCollectionsServiceAgreement;
import org.bian.dto.SDCollectionsActivateOutputModelCollectionsServiceConfigurationRecordCollectionsServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCollectionsActivateOutputModelCollectionsServiceConfigurationRecord
 */
public class SDCollectionsActivateOutputModelCollectionsServiceConfigurationRecord   {
  private String collectionsServiceConfigurationSettingReference = null;

  private String collectionsServiceConfigurationSettingDescription = null;

  private SDCollectionsActivateInputModelCollectionsServiceConfigurationRecordCollectionsServiceConfigurationSetup collectionsServiceConfigurationSetup = null;

  private SDCollectionsActivateOutputModelCollectionsServiceConfigurationRecordCollectionsServiceSubscription collectionsServiceSubscription = null;

  private SDCollectionsActivateOutputModelCollectionsServiceConfigurationRecordCollectionsServiceAgreement collectionsServiceAgreement = null;

  private String collectionsServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return collectionsServiceConfigurationSettingDescription
  **/

  public String getCollectionsServiceConfigurationSettingDescription() {
    return collectionsServiceConfigurationSettingDescription;
  }

  public void setCollectionsServiceConfigurationSettingDescription(String collectionsServiceConfigurationSettingDescription) {
    this.collectionsServiceConfigurationSettingDescription = collectionsServiceConfigurationSettingDescription;
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


  /**
   * Get collectionsServiceSubscription
   * @return collectionsServiceSubscription
  **/

  public SDCollectionsActivateOutputModelCollectionsServiceConfigurationRecordCollectionsServiceSubscription getCollectionsServiceSubscription() {
    return collectionsServiceSubscription;
  }

  public void setCollectionsServiceSubscription(SDCollectionsActivateOutputModelCollectionsServiceConfigurationRecordCollectionsServiceSubscription collectionsServiceSubscription) {
    this.collectionsServiceSubscription = collectionsServiceSubscription;
  }


  /**
   * Get collectionsServiceAgreement
   * @return collectionsServiceAgreement
  **/

  public SDCollectionsActivateOutputModelCollectionsServiceConfigurationRecordCollectionsServiceAgreement getCollectionsServiceAgreement() {
    return collectionsServiceAgreement;
  }

  public void setCollectionsServiceAgreement(SDCollectionsActivateOutputModelCollectionsServiceConfigurationRecordCollectionsServiceAgreement collectionsServiceAgreement) {
    this.collectionsServiceAgreement = collectionsServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return collectionsServiceStatus
  **/

  public String getCollectionsServiceStatus() {
    return collectionsServiceStatus;
  }

  public void setCollectionsServiceStatus(String collectionsServiceStatus) {
    this.collectionsServiceStatus = collectionsServiceStatus;
  }


}


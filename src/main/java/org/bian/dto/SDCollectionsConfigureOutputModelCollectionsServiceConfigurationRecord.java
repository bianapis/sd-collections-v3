package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceAgreement;
import org.bian.dto.SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceConfigurationSetup;
import org.bian.dto.SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCollectionsConfigureOutputModelCollectionsServiceConfigurationRecord
 */
public class SDCollectionsConfigureOutputModelCollectionsServiceConfigurationRecord   {
  private String collectionsServiceConfigurationSettingDescription = null;

  private SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceConfigurationSetup collectionsServiceConfigurationSetup = null;

  private SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceSubscription collectionsServiceSubscription = null;

  private SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceAgreement collectionsServiceAgreement = null;

  private String collectionsServiceStatus = null;


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

  public SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceConfigurationSetup getCollectionsServiceConfigurationSetup() {
    return collectionsServiceConfigurationSetup;
  }

  public void setCollectionsServiceConfigurationSetup(SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceConfigurationSetup collectionsServiceConfigurationSetup) {
    this.collectionsServiceConfigurationSetup = collectionsServiceConfigurationSetup;
  }


  /**
   * Get collectionsServiceSubscription
   * @return collectionsServiceSubscription
  **/

  public SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceSubscription getCollectionsServiceSubscription() {
    return collectionsServiceSubscription;
  }

  public void setCollectionsServiceSubscription(SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceSubscription collectionsServiceSubscription) {
    this.collectionsServiceSubscription = collectionsServiceSubscription;
  }


  /**
   * Get collectionsServiceAgreement
   * @return collectionsServiceAgreement
  **/

  public SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceAgreement getCollectionsServiceAgreement() {
    return collectionsServiceAgreement;
  }

  public void setCollectionsServiceAgreement(SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceAgreement collectionsServiceAgreement) {
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


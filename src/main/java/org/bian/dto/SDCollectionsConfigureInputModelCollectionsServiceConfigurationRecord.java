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
 * SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecord
 */
public class SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecord   {
  private String collectionsServiceConfigurationSettingReference = null;

  private String collectionsServiceConfigurationSettingType = null;

  private SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceConfigurationSetup collectionsServiceConfigurationSetup = null;

  private SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceSubscription collectionsServiceSubscription = null;

  private SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceAgreement collectionsServiceAgreement = null;


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


}


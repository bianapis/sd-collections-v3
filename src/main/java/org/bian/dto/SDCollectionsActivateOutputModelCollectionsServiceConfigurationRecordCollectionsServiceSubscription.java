package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCollectionsActivateOutputModelCollectionsServiceConfigurationRecordCollectionsServiceSubscription
 */
public class SDCollectionsActivateOutputModelCollectionsServiceConfigurationRecordCollectionsServiceSubscription   {
  private String collectionsServiceSubscriberReference = null;

  private String collectionsServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return collectionsServiceSubscriberReference
  **/

  public String getCollectionsServiceSubscriberReference() {
    return collectionsServiceSubscriberReference;
  }

  public void setCollectionsServiceSubscriberReference(String collectionsServiceSubscriberReference) {
    this.collectionsServiceSubscriberReference = collectionsServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return collectionsServiceSubscriberAccessProfile
  **/

  public String getCollectionsServiceSubscriberAccessProfile() {
    return collectionsServiceSubscriberAccessProfile;
  }

  public void setCollectionsServiceSubscriberAccessProfile(String collectionsServiceSubscriberAccessProfile) {
    this.collectionsServiceSubscriberAccessProfile = collectionsServiceSubscriberAccessProfile;
  }


}


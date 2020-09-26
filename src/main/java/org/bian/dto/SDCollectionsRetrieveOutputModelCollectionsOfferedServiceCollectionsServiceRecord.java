package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCollectionsRetrieveOutputModelCollectionsOfferedServiceCollectionsServiceRecordCollectionsServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDCollectionsRetrieveOutputModelCollectionsOfferedServiceCollectionsServiceRecord
 */
public class SDCollectionsRetrieveOutputModelCollectionsOfferedServiceCollectionsServiceRecord   {
  private String collectionsServiceType = null;

  private String collectionsServiceVersion = null;

  private String collectionsServiceDescription = null;

  private SDCollectionsRetrieveOutputModelCollectionsOfferedServiceCollectionsServiceRecordCollectionsServicePoliciesandGuidelines collectionsServicePoliciesandGuidelines = null;

  private String collectionsServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return collectionsServiceType
  **/

  public String getCollectionsServiceType() {
    return collectionsServiceType;
  }

  public void setCollectionsServiceType(String collectionsServiceType) {
    this.collectionsServiceType = collectionsServiceType;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return collectionsServiceDescription
  **/

  public String getCollectionsServiceDescription() {
    return collectionsServiceDescription;
  }

  public void setCollectionsServiceDescription(String collectionsServiceDescription) {
    this.collectionsServiceDescription = collectionsServiceDescription;
  }


  /**
   * Get collectionsServicePoliciesandGuidelines
   * @return collectionsServicePoliciesandGuidelines
  **/

  public SDCollectionsRetrieveOutputModelCollectionsOfferedServiceCollectionsServiceRecordCollectionsServicePoliciesandGuidelines getCollectionsServicePoliciesandGuidelines() {
    return collectionsServicePoliciesandGuidelines;
  }

  public void setCollectionsServicePoliciesandGuidelines(SDCollectionsRetrieveOutputModelCollectionsOfferedServiceCollectionsServiceRecordCollectionsServicePoliciesandGuidelines collectionsServicePoliciesandGuidelines) {
    this.collectionsServicePoliciesandGuidelines = collectionsServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return collectionsServiceSchedule
  **/

  public String getCollectionsServiceSchedule() {
    return collectionsServiceSchedule;
  }

  public void setCollectionsServiceSchedule(String collectionsServiceSchedule) {
    this.collectionsServiceSchedule = collectionsServiceSchedule;
  }


}


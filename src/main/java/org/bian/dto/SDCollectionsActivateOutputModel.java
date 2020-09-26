package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCollectionsActivateOutputModelCollectionsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCollectionsActivateOutputModel
 */
public class SDCollectionsActivateOutputModel   {
  private String collectionsActivationActionTaskReference = null;

  private Object collectionsActivationActionTaskRecord = null;

  private String collectionsServicingSessionReference = null;

  private Object collectionsServicingSessionRecord = null;

  private SDCollectionsActivateOutputModelCollectionsServiceConfigurationRecord collectionsServiceConfigurationRecord = null;

  private String collectionsServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return collectionsActivationActionTaskReference
  **/

  public String getCollectionsActivationActionTaskReference() {
    return collectionsActivationActionTaskReference;
  }

  public void setCollectionsActivationActionTaskReference(String collectionsActivationActionTaskReference) {
    this.collectionsActivationActionTaskReference = collectionsActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return collectionsActivationActionTaskRecord
  **/

  public Object getCollectionsActivationActionTaskRecord() {
    return collectionsActivationActionTaskRecord;
  }

  public void setCollectionsActivationActionTaskRecord(Object collectionsActivationActionTaskRecord) {
    this.collectionsActivationActionTaskRecord = collectionsActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return collectionsServicingSessionReference
  **/

  public String getCollectionsServicingSessionReference() {
    return collectionsServicingSessionReference;
  }

  public void setCollectionsServicingSessionReference(String collectionsServicingSessionReference) {
    this.collectionsServicingSessionReference = collectionsServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return collectionsServicingSessionRecord
  **/

  public Object getCollectionsServicingSessionRecord() {
    return collectionsServicingSessionRecord;
  }

  public void setCollectionsServicingSessionRecord(Object collectionsServicingSessionRecord) {
    this.collectionsServicingSessionRecord = collectionsServicingSessionRecord;
  }


  /**
   * Get collectionsServiceConfigurationRecord
   * @return collectionsServiceConfigurationRecord
  **/

  public SDCollectionsActivateOutputModelCollectionsServiceConfigurationRecord getCollectionsServiceConfigurationRecord() {
    return collectionsServiceConfigurationRecord;
  }

  public void setCollectionsServiceConfigurationRecord(SDCollectionsActivateOutputModelCollectionsServiceConfigurationRecord collectionsServiceConfigurationRecord) {
    this.collectionsServiceConfigurationRecord = collectionsServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return collectionsServicingSessionStatus
  **/

  public String getCollectionsServicingSessionStatus() {
    return collectionsServicingSessionStatus;
  }

  public void setCollectionsServicingSessionStatus(String collectionsServicingSessionStatus) {
    this.collectionsServicingSessionStatus = collectionsServicingSessionStatus;
  }


}


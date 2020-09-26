package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCollectionsConfigureOutputModelCollectionsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCollectionsConfigureOutputModel
 */
public class SDCollectionsConfigureOutputModel   {
  private String collectionsConfigurationActionTaskReference = null;

  private Object collectionsConfigurationActionTaskRecord = null;

  private SDCollectionsConfigureOutputModelCollectionsServiceConfigurationRecord collectionsServiceConfigurationRecord = null;

  private String collectionsServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return collectionsConfigurationActionTaskReference
  **/

  public String getCollectionsConfigurationActionTaskReference() {
    return collectionsConfigurationActionTaskReference;
  }

  public void setCollectionsConfigurationActionTaskReference(String collectionsConfigurationActionTaskReference) {
    this.collectionsConfigurationActionTaskReference = collectionsConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return collectionsConfigurationActionTaskRecord
  **/

  public Object getCollectionsConfigurationActionTaskRecord() {
    return collectionsConfigurationActionTaskRecord;
  }

  public void setCollectionsConfigurationActionTaskRecord(Object collectionsConfigurationActionTaskRecord) {
    this.collectionsConfigurationActionTaskRecord = collectionsConfigurationActionTaskRecord;
  }


  /**
   * Get collectionsServiceConfigurationRecord
   * @return collectionsServiceConfigurationRecord
  **/

  public SDCollectionsConfigureOutputModelCollectionsServiceConfigurationRecord getCollectionsServiceConfigurationRecord() {
    return collectionsServiceConfigurationRecord;
  }

  public void setCollectionsServiceConfigurationRecord(SDCollectionsConfigureOutputModelCollectionsServiceConfigurationRecord collectionsServiceConfigurationRecord) {
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


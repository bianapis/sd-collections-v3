package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCollectionsConfigureInputModel
 */
public class SDCollectionsConfigureInputModel   {
  private Object collectionsConfigurationActionTaskRecord = null;

  private String collectionsServicingSessionReference = null;

  private String collectionsServiceReference = null;

  private SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecord collectionsServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return collectionsServiceReference
  **/

  public String getCollectionsServiceReference() {
    return collectionsServiceReference;
  }

  public void setCollectionsServiceReference(String collectionsServiceReference) {
    this.collectionsServiceReference = collectionsServiceReference;
  }


  /**
   * Get collectionsServiceConfigurationRecord
   * @return collectionsServiceConfigurationRecord
  **/

  public SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecord getCollectionsServiceConfigurationRecord() {
    return collectionsServiceConfigurationRecord;
  }

  public void setCollectionsServiceConfigurationRecord(SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecord collectionsServiceConfigurationRecord) {
    this.collectionsServiceConfigurationRecord = collectionsServiceConfigurationRecord;
  }


}


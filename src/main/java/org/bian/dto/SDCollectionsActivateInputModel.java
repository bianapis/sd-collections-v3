package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCollectionsActivateInputModelCollectionsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCollectionsActivateInputModel
 */
public class SDCollectionsActivateInputModel   {
  private Object collectionsActivationActionTaskRecord = null;

  private String collectionsCenterReference = null;

  private String collectionsServiceReference = null;

  private SDCollectionsActivateInputModelCollectionsServiceConfigurationRecord collectionsServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return collectionsCenterReference
  **/

  public String getCollectionsCenterReference() {
    return collectionsCenterReference;
  }

  public void setCollectionsCenterReference(String collectionsCenterReference) {
    this.collectionsCenterReference = collectionsCenterReference;
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

  public SDCollectionsActivateInputModelCollectionsServiceConfigurationRecord getCollectionsServiceConfigurationRecord() {
    return collectionsServiceConfigurationRecord;
  }

  public void setCollectionsServiceConfigurationRecord(SDCollectionsActivateInputModelCollectionsServiceConfigurationRecord collectionsServiceConfigurationRecord) {
    this.collectionsServiceConfigurationRecord = collectionsServiceConfigurationRecord;
  }


}


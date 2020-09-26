package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCollectionsRetrieveOutputModelCollectionsOfferedServiceCollectionsServiceRecord;

import javax.validation.Valid;
  
/**
 * SDCollectionsRetrieveOutputModelCollectionsOfferedService
 */
public class SDCollectionsRetrieveOutputModelCollectionsOfferedService   {
  private String collectionsServiceReference = null;

  private SDCollectionsRetrieveOutputModelCollectionsOfferedServiceCollectionsServiceRecord collectionsServiceRecord = null;


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
   * Get collectionsServiceRecord
   * @return collectionsServiceRecord
  **/

  public SDCollectionsRetrieveOutputModelCollectionsOfferedServiceCollectionsServiceRecord getCollectionsServiceRecord() {
    return collectionsServiceRecord;
  }

  public void setCollectionsServiceRecord(SDCollectionsRetrieveOutputModelCollectionsOfferedServiceCollectionsServiceRecord collectionsServiceRecord) {
    this.collectionsServiceRecord = collectionsServiceRecord;
  }


}


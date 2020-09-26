package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCollectionsRetrieveOutputModelCollectionsOfferedService;
import org.bian.dto.SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCollectionsRetrieveOutputModel
 */
public class SDCollectionsRetrieveOutputModel   {
  private String collectionsRetrieveActionTaskReference = null;

  private Object collectionsRetrieveActionTaskRecord = null;

  private String collectionsRetrieveActionResponse = null;

  private SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecord collectionsRetrieveActionRecord = null;

  private SDCollectionsRetrieveOutputModelCollectionsOfferedService collectionsOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return collectionsRetrieveActionTaskReference
  **/

  public String getCollectionsRetrieveActionTaskReference() {
    return collectionsRetrieveActionTaskReference;
  }

  public void setCollectionsRetrieveActionTaskReference(String collectionsRetrieveActionTaskReference) {
    this.collectionsRetrieveActionTaskReference = collectionsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return collectionsRetrieveActionTaskRecord
  **/

  public Object getCollectionsRetrieveActionTaskRecord() {
    return collectionsRetrieveActionTaskRecord;
  }

  public void setCollectionsRetrieveActionTaskRecord(Object collectionsRetrieveActionTaskRecord) {
    this.collectionsRetrieveActionTaskRecord = collectionsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return collectionsRetrieveActionResponse
  **/

  public String getCollectionsRetrieveActionResponse() {
    return collectionsRetrieveActionResponse;
  }

  public void setCollectionsRetrieveActionResponse(String collectionsRetrieveActionResponse) {
    this.collectionsRetrieveActionResponse = collectionsRetrieveActionResponse;
  }


  /**
   * Get collectionsRetrieveActionRecord
   * @return collectionsRetrieveActionRecord
  **/

  public SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecord getCollectionsRetrieveActionRecord() {
    return collectionsRetrieveActionRecord;
  }

  public void setCollectionsRetrieveActionRecord(SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecord collectionsRetrieveActionRecord) {
    this.collectionsRetrieveActionRecord = collectionsRetrieveActionRecord;
  }


  /**
   * Get collectionsOfferedService
   * @return collectionsOfferedService
  **/

  public SDCollectionsRetrieveOutputModelCollectionsOfferedService getCollectionsOfferedService() {
    return collectionsOfferedService;
  }

  public void setCollectionsOfferedService(SDCollectionsRetrieveOutputModelCollectionsOfferedService collectionsOfferedService) {
    this.collectionsOfferedService = collectionsOfferedService;
  }


}


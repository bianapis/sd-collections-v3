package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCollectionsRetrieveInputModelCollectionsOfferedService;
import org.bian.dto.SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCollectionsRetrieveInputModel
 */
public class SDCollectionsRetrieveInputModel   {
  private Object collectionsRetrieveActionTaskRecord = null;

  private String collectionsRetrieveActionRequest = null;

  private SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecord collectionsRetrieveActionRecord = null;

  private SDCollectionsRetrieveInputModelCollectionsOfferedService collectionsOfferedService = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return collectionsRetrieveActionRequest
  **/

  public String getCollectionsRetrieveActionRequest() {
    return collectionsRetrieveActionRequest;
  }

  public void setCollectionsRetrieveActionRequest(String collectionsRetrieveActionRequest) {
    this.collectionsRetrieveActionRequest = collectionsRetrieveActionRequest;
  }


  /**
   * Get collectionsRetrieveActionRecord
   * @return collectionsRetrieveActionRecord
  **/

  public SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecord getCollectionsRetrieveActionRecord() {
    return collectionsRetrieveActionRecord;
  }

  public void setCollectionsRetrieveActionRecord(SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecord collectionsRetrieveActionRecord) {
    this.collectionsRetrieveActionRecord = collectionsRetrieveActionRecord;
  }


  /**
   * Get collectionsOfferedService
   * @return collectionsOfferedService
  **/

  public SDCollectionsRetrieveInputModelCollectionsOfferedService getCollectionsOfferedService() {
    return collectionsOfferedService;
  }

  public void setCollectionsOfferedService(SDCollectionsRetrieveInputModelCollectionsOfferedService collectionsOfferedService) {
    this.collectionsOfferedService = collectionsOfferedService;
  }


}


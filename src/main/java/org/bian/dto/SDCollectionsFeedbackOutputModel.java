package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCollectionsFeedbackOutputModelCollectionsFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCollectionsFeedbackOutputModel
 */
public class SDCollectionsFeedbackOutputModel   {
  private String collectionsFeedbackActionTaskReference = null;

  private Object collectionsFeedbackActionTaskRecord = null;

  private SDCollectionsFeedbackOutputModelCollectionsFeedbackActionRecord collectionsFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return collectionsFeedbackActionTaskReference
  **/

  public String getCollectionsFeedbackActionTaskReference() {
    return collectionsFeedbackActionTaskReference;
  }

  public void setCollectionsFeedbackActionTaskReference(String collectionsFeedbackActionTaskReference) {
    this.collectionsFeedbackActionTaskReference = collectionsFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return collectionsFeedbackActionTaskRecord
  **/

  public Object getCollectionsFeedbackActionTaskRecord() {
    return collectionsFeedbackActionTaskRecord;
  }

  public void setCollectionsFeedbackActionTaskRecord(Object collectionsFeedbackActionTaskRecord) {
    this.collectionsFeedbackActionTaskRecord = collectionsFeedbackActionTaskRecord;
  }


  /**
   * Get collectionsFeedbackActionRecord
   * @return collectionsFeedbackActionRecord
  **/

  public SDCollectionsFeedbackOutputModelCollectionsFeedbackActionRecord getCollectionsFeedbackActionRecord() {
    return collectionsFeedbackActionRecord;
  }

  public void setCollectionsFeedbackActionRecord(SDCollectionsFeedbackOutputModelCollectionsFeedbackActionRecord collectionsFeedbackActionRecord) {
    this.collectionsFeedbackActionRecord = collectionsFeedbackActionRecord;
  }


}


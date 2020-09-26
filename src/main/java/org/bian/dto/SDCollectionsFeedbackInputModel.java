package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCollectionsFeedbackInputModelCollectionsFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCollectionsFeedbackInputModel
 */
public class SDCollectionsFeedbackInputModel   {
  private Object collectionsFeedbackActionTaskRecord = null;

  private SDCollectionsFeedbackInputModelCollectionsFeedbackActionRecord collectionsFeedbackActionRecord = null;


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

  public SDCollectionsFeedbackInputModelCollectionsFeedbackActionRecord getCollectionsFeedbackActionRecord() {
    return collectionsFeedbackActionRecord;
  }

  public void setCollectionsFeedbackActionRecord(SDCollectionsFeedbackInputModelCollectionsFeedbackActionRecord collectionsFeedbackActionRecord) {
    this.collectionsFeedbackActionRecord = collectionsFeedbackActionRecord;
  }


}


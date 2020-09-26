package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollectionsAssessmentUpdateOutputModel
 */
public class BQCollectionsAssessmentUpdateOutputModel   {
  private String collectionsAssessmentPreconditions = null;

  private String collectionsAssessmentBusinessUnitEmployeeReference = null;

  private String collectionsAssessmentWorkSchedule = null;

  private String collectionsAssessmentPostconditions = null;

  private String collectionsAssessmentCollectionsAssessmentServiceType = null;

  private String collectionsAssessmentCollectionsAssessmentServiceDescription = null;

  private String collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs = null;

  private String collectionsAssessmentCollectionsAssessmentServiceWorkProduct = null;

  private String collectionsAssessmentCollectionsAssessmentServiceName = null;

  private String collectionsAssessmentUpdateActionTaskReference = null;

  private Object collectionsAssessmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return collectionsAssessmentPreconditions
  **/

  public String getCollectionsAssessmentPreconditions() {
    return collectionsAssessmentPreconditions;
  }

  public void setCollectionsAssessmentPreconditions(String collectionsAssessmentPreconditions) {
    this.collectionsAssessmentPreconditions = collectionsAssessmentPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return collectionsAssessmentBusinessUnitEmployeeReference
  **/

  public String getCollectionsAssessmentBusinessUnitEmployeeReference() {
    return collectionsAssessmentBusinessUnitEmployeeReference;
  }

  public void setCollectionsAssessmentBusinessUnitEmployeeReference(String collectionsAssessmentBusinessUnitEmployeeReference) {
    this.collectionsAssessmentBusinessUnitEmployeeReference = collectionsAssessmentBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return collectionsAssessmentWorkSchedule
  **/

  public String getCollectionsAssessmentWorkSchedule() {
    return collectionsAssessmentWorkSchedule;
  }

  public void setCollectionsAssessmentWorkSchedule(String collectionsAssessmentWorkSchedule) {
    this.collectionsAssessmentWorkSchedule = collectionsAssessmentWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return collectionsAssessmentPostconditions
  **/

  public String getCollectionsAssessmentPostconditions() {
    return collectionsAssessmentPostconditions;
  }

  public void setCollectionsAssessmentPostconditions(String collectionsAssessmentPostconditions) {
    this.collectionsAssessmentPostconditions = collectionsAssessmentPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return collectionsAssessmentCollectionsAssessmentServiceType
  **/

  public String getCollectionsAssessmentCollectionsAssessmentServiceType() {
    return collectionsAssessmentCollectionsAssessmentServiceType;
  }

  public void setCollectionsAssessmentCollectionsAssessmentServiceType(String collectionsAssessmentCollectionsAssessmentServiceType) {
    this.collectionsAssessmentCollectionsAssessmentServiceType = collectionsAssessmentCollectionsAssessmentServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return collectionsAssessmentCollectionsAssessmentServiceDescription
  **/

  public String getCollectionsAssessmentCollectionsAssessmentServiceDescription() {
    return collectionsAssessmentCollectionsAssessmentServiceDescription;
  }

  public void setCollectionsAssessmentCollectionsAssessmentServiceDescription(String collectionsAssessmentCollectionsAssessmentServiceDescription) {
    this.collectionsAssessmentCollectionsAssessmentServiceDescription = collectionsAssessmentCollectionsAssessmentServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs
  **/

  public String getCollectionsAssessmentCollectionsAssessmentServiceInputsandOuputs() {
    return collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs;
  }

  public void setCollectionsAssessmentCollectionsAssessmentServiceInputsandOuputs(String collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs) {
    this.collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs = collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return collectionsAssessmentCollectionsAssessmentServiceWorkProduct
  **/

  public String getCollectionsAssessmentCollectionsAssessmentServiceWorkProduct() {
    return collectionsAssessmentCollectionsAssessmentServiceWorkProduct;
  }

  public void setCollectionsAssessmentCollectionsAssessmentServiceWorkProduct(String collectionsAssessmentCollectionsAssessmentServiceWorkProduct) {
    this.collectionsAssessmentCollectionsAssessmentServiceWorkProduct = collectionsAssessmentCollectionsAssessmentServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return collectionsAssessmentCollectionsAssessmentServiceName
  **/

  public String getCollectionsAssessmentCollectionsAssessmentServiceName() {
    return collectionsAssessmentCollectionsAssessmentServiceName;
  }

  public void setCollectionsAssessmentCollectionsAssessmentServiceName(String collectionsAssessmentCollectionsAssessmentServiceName) {
    this.collectionsAssessmentCollectionsAssessmentServiceName = collectionsAssessmentCollectionsAssessmentServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return collectionsAssessmentUpdateActionTaskReference
  **/

  public String getCollectionsAssessmentUpdateActionTaskReference() {
    return collectionsAssessmentUpdateActionTaskReference;
  }

  public void setCollectionsAssessmentUpdateActionTaskReference(String collectionsAssessmentUpdateActionTaskReference) {
    this.collectionsAssessmentUpdateActionTaskReference = collectionsAssessmentUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return collectionsAssessmentUpdateActionTaskRecord
  **/

  public Object getCollectionsAssessmentUpdateActionTaskRecord() {
    return collectionsAssessmentUpdateActionTaskRecord;
  }

  public void setCollectionsAssessmentUpdateActionTaskRecord(Object collectionsAssessmentUpdateActionTaskRecord) {
    this.collectionsAssessmentUpdateActionTaskRecord = collectionsAssessmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}


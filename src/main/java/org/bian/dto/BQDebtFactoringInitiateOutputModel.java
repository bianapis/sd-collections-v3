package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDebtFactoringInitiateOutputModel
 */
public class BQDebtFactoringInitiateOutputModel   {
  private String debtFactoringInstanceReference = null;

  private String debtFactoringInitiateActionReference = null;

  private Object debtFactoringInitiateActionRecord = null;

  private String debtFactoringInstanceStatus = null;

  private String debtFactoringPreconditions = null;

  private String debtFactoringBusinessUnitEmployeeReference = null;

  private String debtFactoringWorkSchedule = null;

  private String debtFactoringPostconditions = null;

  private String debtFactoringFactoringServiceType = null;

  private String debtFactoringFactoringServiceDescription = null;

  private String debtFactoringFactoringServiceInputsandOuputs = null;

  private String debtFactoringFactoringServiceWorkProduct = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Debt Factoring instance 
   * @return debtFactoringInstanceReference
  **/

  public String getDebtFactoringInstanceReference() {
    return debtFactoringInstanceReference;
  }

  public void setDebtFactoringInstanceReference(String debtFactoringInstanceReference) {
    this.debtFactoringInstanceReference = debtFactoringInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return debtFactoringInitiateActionReference
  **/

  public String getDebtFactoringInitiateActionReference() {
    return debtFactoringInitiateActionReference;
  }

  public void setDebtFactoringInitiateActionReference(String debtFactoringInitiateActionReference) {
    this.debtFactoringInitiateActionReference = debtFactoringInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return debtFactoringInitiateActionRecord
  **/

  public Object getDebtFactoringInitiateActionRecord() {
    return debtFactoringInitiateActionRecord;
  }

  public void setDebtFactoringInitiateActionRecord(Object debtFactoringInitiateActionRecord) {
    this.debtFactoringInitiateActionRecord = debtFactoringInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Debt Factoring instance (e.g. initialised, pending, active) 
   * @return debtFactoringInstanceStatus
  **/

  public String getDebtFactoringInstanceStatus() {
    return debtFactoringInstanceStatus;
  }

  public void setDebtFactoringInstanceStatus(String debtFactoringInstanceStatus) {
    this.debtFactoringInstanceStatus = debtFactoringInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return debtFactoringPreconditions
  **/

  public String getDebtFactoringPreconditions() {
    return debtFactoringPreconditions;
  }

  public void setDebtFactoringPreconditions(String debtFactoringPreconditions) {
    this.debtFactoringPreconditions = debtFactoringPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return debtFactoringBusinessUnitEmployeeReference
  **/

  public String getDebtFactoringBusinessUnitEmployeeReference() {
    return debtFactoringBusinessUnitEmployeeReference;
  }

  public void setDebtFactoringBusinessUnitEmployeeReference(String debtFactoringBusinessUnitEmployeeReference) {
    this.debtFactoringBusinessUnitEmployeeReference = debtFactoringBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return debtFactoringWorkSchedule
  **/

  public String getDebtFactoringWorkSchedule() {
    return debtFactoringWorkSchedule;
  }

  public void setDebtFactoringWorkSchedule(String debtFactoringWorkSchedule) {
    this.debtFactoringWorkSchedule = debtFactoringWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return debtFactoringPostconditions
  **/

  public String getDebtFactoringPostconditions() {
    return debtFactoringPostconditions;
  }

  public void setDebtFactoringPostconditions(String debtFactoringPostconditions) {
    this.debtFactoringPostconditions = debtFactoringPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return debtFactoringFactoringServiceType
  **/

  public String getDebtFactoringFactoringServiceType() {
    return debtFactoringFactoringServiceType;
  }

  public void setDebtFactoringFactoringServiceType(String debtFactoringFactoringServiceType) {
    this.debtFactoringFactoringServiceType = debtFactoringFactoringServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return debtFactoringFactoringServiceDescription
  **/

  public String getDebtFactoringFactoringServiceDescription() {
    return debtFactoringFactoringServiceDescription;
  }

  public void setDebtFactoringFactoringServiceDescription(String debtFactoringFactoringServiceDescription) {
    this.debtFactoringFactoringServiceDescription = debtFactoringFactoringServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return debtFactoringFactoringServiceInputsandOuputs
  **/

  public String getDebtFactoringFactoringServiceInputsandOuputs() {
    return debtFactoringFactoringServiceInputsandOuputs;
  }

  public void setDebtFactoringFactoringServiceInputsandOuputs(String debtFactoringFactoringServiceInputsandOuputs) {
    this.debtFactoringFactoringServiceInputsandOuputs = debtFactoringFactoringServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return debtFactoringFactoringServiceWorkProduct
  **/

  public String getDebtFactoringFactoringServiceWorkProduct() {
    return debtFactoringFactoringServiceWorkProduct;
  }

  public void setDebtFactoringFactoringServiceWorkProduct(String debtFactoringFactoringServiceWorkProduct) {
    this.debtFactoringFactoringServiceWorkProduct = debtFactoringFactoringServiceWorkProduct;
  }


}


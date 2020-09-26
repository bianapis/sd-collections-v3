package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollateralLiquidationExchangeOutputModel
 */
public class BQCollateralLiquidationExchangeOutputModel   {
  private String collateralLiquidationPreconditions = null;

  private String collateralLiquidationBusinessUnitEmployeeReference = null;

  private String collateralLiquidationWorkSchedule = null;

  private String collateralLiquidationPostconditions = null;

  private String collateralLiquidationCollateralLiquidationServiceType = null;

  private String collateralLiquidationCollateralLiquidationServiceDescription = null;

  private String collateralLiquidationCollateralLiquidationServiceInputsandOuputs = null;

  private String collateralLiquidationCollateralLiquidationServiceWorkProduct = null;

  private String collateralLiquidationCollateralLiquidationServiceName = null;

  private String collateralLiquidationExchangeActionTaskReference = null;

  private Object collateralLiquidationExchangeActionTaskRecord = null;

  private String collateralLiquidationExchangeActionResponse = null;

  private String collateralLiquidationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return collateralLiquidationPreconditions
  **/

  public String getCollateralLiquidationPreconditions() {
    return collateralLiquidationPreconditions;
  }

  public void setCollateralLiquidationPreconditions(String collateralLiquidationPreconditions) {
    this.collateralLiquidationPreconditions = collateralLiquidationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return collateralLiquidationBusinessUnitEmployeeReference
  **/

  public String getCollateralLiquidationBusinessUnitEmployeeReference() {
    return collateralLiquidationBusinessUnitEmployeeReference;
  }

  public void setCollateralLiquidationBusinessUnitEmployeeReference(String collateralLiquidationBusinessUnitEmployeeReference) {
    this.collateralLiquidationBusinessUnitEmployeeReference = collateralLiquidationBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return collateralLiquidationWorkSchedule
  **/

  public String getCollateralLiquidationWorkSchedule() {
    return collateralLiquidationWorkSchedule;
  }

  public void setCollateralLiquidationWorkSchedule(String collateralLiquidationWorkSchedule) {
    this.collateralLiquidationWorkSchedule = collateralLiquidationWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return collateralLiquidationPostconditions
  **/

  public String getCollateralLiquidationPostconditions() {
    return collateralLiquidationPostconditions;
  }

  public void setCollateralLiquidationPostconditions(String collateralLiquidationPostconditions) {
    this.collateralLiquidationPostconditions = collateralLiquidationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return collateralLiquidationCollateralLiquidationServiceType
  **/

  public String getCollateralLiquidationCollateralLiquidationServiceType() {
    return collateralLiquidationCollateralLiquidationServiceType;
  }

  public void setCollateralLiquidationCollateralLiquidationServiceType(String collateralLiquidationCollateralLiquidationServiceType) {
    this.collateralLiquidationCollateralLiquidationServiceType = collateralLiquidationCollateralLiquidationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return collateralLiquidationCollateralLiquidationServiceDescription
  **/

  public String getCollateralLiquidationCollateralLiquidationServiceDescription() {
    return collateralLiquidationCollateralLiquidationServiceDescription;
  }

  public void setCollateralLiquidationCollateralLiquidationServiceDescription(String collateralLiquidationCollateralLiquidationServiceDescription) {
    this.collateralLiquidationCollateralLiquidationServiceDescription = collateralLiquidationCollateralLiquidationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return collateralLiquidationCollateralLiquidationServiceInputsandOuputs
  **/

  public String getCollateralLiquidationCollateralLiquidationServiceInputsandOuputs() {
    return collateralLiquidationCollateralLiquidationServiceInputsandOuputs;
  }

  public void setCollateralLiquidationCollateralLiquidationServiceInputsandOuputs(String collateralLiquidationCollateralLiquidationServiceInputsandOuputs) {
    this.collateralLiquidationCollateralLiquidationServiceInputsandOuputs = collateralLiquidationCollateralLiquidationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return collateralLiquidationCollateralLiquidationServiceWorkProduct
  **/

  public String getCollateralLiquidationCollateralLiquidationServiceWorkProduct() {
    return collateralLiquidationCollateralLiquidationServiceWorkProduct;
  }

  public void setCollateralLiquidationCollateralLiquidationServiceWorkProduct(String collateralLiquidationCollateralLiquidationServiceWorkProduct) {
    this.collateralLiquidationCollateralLiquidationServiceWorkProduct = collateralLiquidationCollateralLiquidationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return collateralLiquidationCollateralLiquidationServiceName
  **/

  public String getCollateralLiquidationCollateralLiquidationServiceName() {
    return collateralLiquidationCollateralLiquidationServiceName;
  }

  public void setCollateralLiquidationCollateralLiquidationServiceName(String collateralLiquidationCollateralLiquidationServiceName) {
    this.collateralLiquidationCollateralLiquidationServiceName = collateralLiquidationCollateralLiquidationServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Collateral Liquidation instance exchange service call 
   * @return collateralLiquidationExchangeActionTaskReference
  **/

  public String getCollateralLiquidationExchangeActionTaskReference() {
    return collateralLiquidationExchangeActionTaskReference;
  }

  public void setCollateralLiquidationExchangeActionTaskReference(String collateralLiquidationExchangeActionTaskReference) {
    this.collateralLiquidationExchangeActionTaskReference = collateralLiquidationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return collateralLiquidationExchangeActionTaskRecord
  **/

  public Object getCollateralLiquidationExchangeActionTaskRecord() {
    return collateralLiquidationExchangeActionTaskRecord;
  }

  public void setCollateralLiquidationExchangeActionTaskRecord(Object collateralLiquidationExchangeActionTaskRecord) {
    this.collateralLiquidationExchangeActionTaskRecord = collateralLiquidationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return collateralLiquidationExchangeActionResponse
  **/

  public String getCollateralLiquidationExchangeActionResponse() {
    return collateralLiquidationExchangeActionResponse;
  }

  public void setCollateralLiquidationExchangeActionResponse(String collateralLiquidationExchangeActionResponse) {
    this.collateralLiquidationExchangeActionResponse = collateralLiquidationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Collateral Liquidation instance (e.g. accepted, rejected, verified) 
   * @return collateralLiquidationInstanceStatus
  **/

  public String getCollateralLiquidationInstanceStatus() {
    return collateralLiquidationInstanceStatus;
  }

  public void setCollateralLiquidationInstanceStatus(String collateralLiquidationInstanceStatus) {
    this.collateralLiquidationInstanceStatus = collateralLiquidationInstanceStatus;
  }


}


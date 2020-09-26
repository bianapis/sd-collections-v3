package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollectionsAccountUpdateUpdateInputModel
 */
public class BQCollectionsAccountUpdateUpdateInputModel   {
  private String collateralAssetLiquidationProcedureInstanceReference = null;

  private String collectionsAccountUpdateInstanceReference = null;

  private String collectionsAccountUpdatePreconditions = null;

  private String collectionsAccountUpdateBusinessUnitEmployeeReference = null;

  private String collectionsAccountUpdateWorkSchedule = null;

  private String collectionsAccountUpdatePostconditions = null;

  private String collectionsAccountUpdateCollectionsAccountUpdateServiceType = null;

  private String collectionsAccountUpdateCollectionsAccountUpdateServiceDescription = null;

  private String collectionsAccountUpdateCollectionsAccountUpdateServiceInputsandOuputs = null;

  private String collectionsAccountUpdateCollectionsAccountUpdateServiceWorkProduct = null;

  private String collectionsAccountUpdateCollectionsAccountUpdateServiceName = null;

  private Object collectionsAccountUpdateUpdateActionTaskRecord = null;

  private String collectionsAccountUpdateUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Collateral Asset Liquidation Procedure instance 
   * @return collateralAssetLiquidationProcedureInstanceReference
  **/

  public String getCollateralAssetLiquidationProcedureInstanceReference() {
    return collateralAssetLiquidationProcedureInstanceReference;
  }

  public void setCollateralAssetLiquidationProcedureInstanceReference(String collateralAssetLiquidationProcedureInstanceReference) {
    this.collateralAssetLiquidationProcedureInstanceReference = collateralAssetLiquidationProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Collections Account Update instance 
   * @return collectionsAccountUpdateInstanceReference
  **/

  public String getCollectionsAccountUpdateInstanceReference() {
    return collectionsAccountUpdateInstanceReference;
  }

  public void setCollectionsAccountUpdateInstanceReference(String collectionsAccountUpdateInstanceReference) {
    this.collectionsAccountUpdateInstanceReference = collectionsAccountUpdateInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return collectionsAccountUpdatePreconditions
  **/

  public String getCollectionsAccountUpdatePreconditions() {
    return collectionsAccountUpdatePreconditions;
  }

  public void setCollectionsAccountUpdatePreconditions(String collectionsAccountUpdatePreconditions) {
    this.collectionsAccountUpdatePreconditions = collectionsAccountUpdatePreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return collectionsAccountUpdateBusinessUnitEmployeeReference
  **/

  public String getCollectionsAccountUpdateBusinessUnitEmployeeReference() {
    return collectionsAccountUpdateBusinessUnitEmployeeReference;
  }

  public void setCollectionsAccountUpdateBusinessUnitEmployeeReference(String collectionsAccountUpdateBusinessUnitEmployeeReference) {
    this.collectionsAccountUpdateBusinessUnitEmployeeReference = collectionsAccountUpdateBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return collectionsAccountUpdateWorkSchedule
  **/

  public String getCollectionsAccountUpdateWorkSchedule() {
    return collectionsAccountUpdateWorkSchedule;
  }

  public void setCollectionsAccountUpdateWorkSchedule(String collectionsAccountUpdateWorkSchedule) {
    this.collectionsAccountUpdateWorkSchedule = collectionsAccountUpdateWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return collectionsAccountUpdatePostconditions
  **/

  public String getCollectionsAccountUpdatePostconditions() {
    return collectionsAccountUpdatePostconditions;
  }

  public void setCollectionsAccountUpdatePostconditions(String collectionsAccountUpdatePostconditions) {
    this.collectionsAccountUpdatePostconditions = collectionsAccountUpdatePostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return collectionsAccountUpdateCollectionsAccountUpdateServiceType
  **/

  public String getCollectionsAccountUpdateCollectionsAccountUpdateServiceType() {
    return collectionsAccountUpdateCollectionsAccountUpdateServiceType;
  }

  public void setCollectionsAccountUpdateCollectionsAccountUpdateServiceType(String collectionsAccountUpdateCollectionsAccountUpdateServiceType) {
    this.collectionsAccountUpdateCollectionsAccountUpdateServiceType = collectionsAccountUpdateCollectionsAccountUpdateServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return collectionsAccountUpdateCollectionsAccountUpdateServiceDescription
  **/

  public String getCollectionsAccountUpdateCollectionsAccountUpdateServiceDescription() {
    return collectionsAccountUpdateCollectionsAccountUpdateServiceDescription;
  }

  public void setCollectionsAccountUpdateCollectionsAccountUpdateServiceDescription(String collectionsAccountUpdateCollectionsAccountUpdateServiceDescription) {
    this.collectionsAccountUpdateCollectionsAccountUpdateServiceDescription = collectionsAccountUpdateCollectionsAccountUpdateServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return collectionsAccountUpdateCollectionsAccountUpdateServiceInputsandOuputs
  **/

  public String getCollectionsAccountUpdateCollectionsAccountUpdateServiceInputsandOuputs() {
    return collectionsAccountUpdateCollectionsAccountUpdateServiceInputsandOuputs;
  }

  public void setCollectionsAccountUpdateCollectionsAccountUpdateServiceInputsandOuputs(String collectionsAccountUpdateCollectionsAccountUpdateServiceInputsandOuputs) {
    this.collectionsAccountUpdateCollectionsAccountUpdateServiceInputsandOuputs = collectionsAccountUpdateCollectionsAccountUpdateServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return collectionsAccountUpdateCollectionsAccountUpdateServiceWorkProduct
  **/

  public String getCollectionsAccountUpdateCollectionsAccountUpdateServiceWorkProduct() {
    return collectionsAccountUpdateCollectionsAccountUpdateServiceWorkProduct;
  }

  public void setCollectionsAccountUpdateCollectionsAccountUpdateServiceWorkProduct(String collectionsAccountUpdateCollectionsAccountUpdateServiceWorkProduct) {
    this.collectionsAccountUpdateCollectionsAccountUpdateServiceWorkProduct = collectionsAccountUpdateCollectionsAccountUpdateServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return collectionsAccountUpdateCollectionsAccountUpdateServiceName
  **/

  public String getCollectionsAccountUpdateCollectionsAccountUpdateServiceName() {
    return collectionsAccountUpdateCollectionsAccountUpdateServiceName;
  }

  public void setCollectionsAccountUpdateCollectionsAccountUpdateServiceName(String collectionsAccountUpdateCollectionsAccountUpdateServiceName) {
    this.collectionsAccountUpdateCollectionsAccountUpdateServiceName = collectionsAccountUpdateCollectionsAccountUpdateServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return collectionsAccountUpdateUpdateActionTaskRecord
  **/

  public Object getCollectionsAccountUpdateUpdateActionTaskRecord() {
    return collectionsAccountUpdateUpdateActionTaskRecord;
  }

  public void setCollectionsAccountUpdateUpdateActionTaskRecord(Object collectionsAccountUpdateUpdateActionTaskRecord) {
    this.collectionsAccountUpdateUpdateActionTaskRecord = collectionsAccountUpdateUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return collectionsAccountUpdateUpdateActionRequest
  **/

  public String getCollectionsAccountUpdateUpdateActionRequest() {
    return collectionsAccountUpdateUpdateActionRequest;
  }

  public void setCollectionsAccountUpdateUpdateActionRequest(String collectionsAccountUpdateUpdateActionRequest) {
    this.collectionsAccountUpdateUpdateActionRequest = collectionsAccountUpdateUpdateActionRequest;
  }


}


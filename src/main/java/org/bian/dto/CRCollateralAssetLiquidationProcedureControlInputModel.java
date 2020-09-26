package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCollateralAssetLiquidationProcedureControlInputModelCollateralAssetLiquidationProcedureControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetLiquidationProcedureControlInputModel
 */
public class CRCollateralAssetLiquidationProcedureControlInputModel   {
  private String collectionsServicingSessionReference = null;

  private String collateralAssetLiquidationProcedureInstanceReference = null;

  private String collateralAssetLiquidationProcedureParameterType = null;

  private String collateralAssetLiquidationProcedureSelectedOption = null;

  private String collateralAssetLiquidationProcedureRequest = null;

  private String collateralAssetLiquidationProcedureSchedule = null;

  private String collateralAssetLiquidationProcedureStatus = null;

  private String collateralAssetLiquidationProcedureReference = null;

  private String collateralAssetLiquidationProcedureBusinessUnitReference = null;

  private String collateralAssetLiquidationProcedureServiceProviderReference = null;

  private String collateralAssetLiquidationProcedureFinancialFacilityReference = null;

  private String collateralAssetLiquidationProcedureEmployeeReference = null;

  private String collateralAssetLiquidationProcedureCustomerReference = null;

  private String collateralAssetLiquidationProcedureType = null;

  private String collateralAssetLiquidationProcedureServiceProviderSchedule = null;

  private String collateralAssetLiquidationProcedureServiceType = null;

  private String collateralAssetLiquidationProcedureProductandServiceType = null;

  private String collateralAssetLiquidationProcedureProductandServiceInstance = null;

  private String collateralAssetLiquidationProcedureTransactionType = null;

  private String collateralAssetLiquidationProcedureFinancialTransactionArrangement = null;

  private String collateralAssetLiquidationProcedureCustomerAgreementReference = null;

  private Object collateralAssetLiquidationProcedureControlActionTaskRecord = null;

  private CRCollateralAssetLiquidationProcedureControlInputModelCollateralAssetLiquidationProcedureControlActionRequest collateralAssetLiquidationProcedureControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return collectionsServicingSessionReference
  **/

  public String getCollectionsServicingSessionReference() {
    return collectionsServicingSessionReference;
  }

  public void setCollectionsServicingSessionReference(String collectionsServicingSessionReference) {
    this.collectionsServicingSessionReference = collectionsServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Collateral Asset Liquidation Procedure instance 
   * @return collateralAssetLiquidationProcedureInstanceReference
  **/

  public String getCollateralAssetLiquidationProcedureInstanceReference() {
    return collateralAssetLiquidationProcedureInstanceReference;
  }

  public void setCollateralAssetLiquidationProcedureInstanceReference(String collateralAssetLiquidationProcedureInstanceReference) {
    this.collateralAssetLiquidationProcedureInstanceReference = collateralAssetLiquidationProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Collateral Asset Liquidation Procedure 
   * @return collateralAssetLiquidationProcedureParameterType
  **/

  public String getCollateralAssetLiquidationProcedureParameterType() {
    return collateralAssetLiquidationProcedureParameterType;
  }

  public void setCollateralAssetLiquidationProcedureParameterType(String collateralAssetLiquidationProcedureParameterType) {
    this.collateralAssetLiquidationProcedureParameterType = collateralAssetLiquidationProcedureParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Collateral Asset Liquidation Procedure 
   * @return collateralAssetLiquidationProcedureSelectedOption
  **/

  public String getCollateralAssetLiquidationProcedureSelectedOption() {
    return collateralAssetLiquidationProcedureSelectedOption;
  }

  public void setCollateralAssetLiquidationProcedureSelectedOption(String collateralAssetLiquidationProcedureSelectedOption) {
    this.collateralAssetLiquidationProcedureSelectedOption = collateralAssetLiquidationProcedureSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Request to process CollateralAssetLiquidation 
   * @return collateralAssetLiquidationProcedureRequest
  **/

  public String getCollateralAssetLiquidationProcedureRequest() {
    return collateralAssetLiquidationProcedureRequest;
  }

  public void setCollateralAssetLiquidationProcedureRequest(String collateralAssetLiquidationProcedureRequest) {
    this.collateralAssetLiquidationProcedureRequest = collateralAssetLiquidationProcedureRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to process CollateralAssetLiquidation 
   * @return collateralAssetLiquidationProcedureSchedule
  **/

  public String getCollateralAssetLiquidationProcedureSchedule() {
    return collateralAssetLiquidationProcedureSchedule;
  }

  public void setCollateralAssetLiquidationProcedureSchedule(String collateralAssetLiquidationProcedureSchedule) {
    this.collateralAssetLiquidationProcedureSchedule = collateralAssetLiquidationProcedureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Collateral Asset Liquidation Procedure 
   * @return collateralAssetLiquidationProcedureStatus
  **/

  public String getCollateralAssetLiquidationProcedureStatus() {
    return collateralAssetLiquidationProcedureStatus;
  }

  public void setCollateralAssetLiquidationProcedureStatus(String collateralAssetLiquidationProcedureStatus) {
    this.collateralAssetLiquidationProcedureStatus = collateralAssetLiquidationProcedureStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who is involved in Collateral Asset Liquidation Procedure 
   * @return collateralAssetLiquidationProcedureReference
  **/

  public String getCollateralAssetLiquidationProcedureReference() {
    return collateralAssetLiquidationProcedureReference;
  }

  public void setCollateralAssetLiquidationProcedureReference(String collateralAssetLiquidationProcedureReference) {
    this.collateralAssetLiquidationProcedureReference = collateralAssetLiquidationProcedureReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business unit which is involved in Collateral Asset Liquidation Procedure 
   * @return collateralAssetLiquidationProcedureBusinessUnitReference
  **/

  public String getCollateralAssetLiquidationProcedureBusinessUnitReference() {
    return collateralAssetLiquidationProcedureBusinessUnitReference;
  }

  public void setCollateralAssetLiquidationProcedureBusinessUnitReference(String collateralAssetLiquidationProcedureBusinessUnitReference) {
    this.collateralAssetLiquidationProcedureBusinessUnitReference = collateralAssetLiquidationProcedureBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who is the service provider of Collateral Asset Liquidation Procedure 
   * @return collateralAssetLiquidationProcedureServiceProviderReference
  **/

  public String getCollateralAssetLiquidationProcedureServiceProviderReference() {
    return collateralAssetLiquidationProcedureServiceProviderReference;
  }

  public void setCollateralAssetLiquidationProcedureServiceProviderReference(String collateralAssetLiquidationProcedureServiceProviderReference) {
    this.collateralAssetLiquidationProcedureServiceProviderReference = collateralAssetLiquidationProcedureServiceProviderReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Facility related to Collateral Asset Liquidation Procedure  
   * @return collateralAssetLiquidationProcedureFinancialFacilityReference
  **/

  public String getCollateralAssetLiquidationProcedureFinancialFacilityReference() {
    return collateralAssetLiquidationProcedureFinancialFacilityReference;
  }

  public void setCollateralAssetLiquidationProcedureFinancialFacilityReference(String collateralAssetLiquidationProcedureFinancialFacilityReference) {
    this.collateralAssetLiquidationProcedureFinancialFacilityReference = collateralAssetLiquidationProcedureFinancialFacilityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the employee who is involved in Collateral Asset Liquidation Procedure 
   * @return collateralAssetLiquidationProcedureEmployeeReference
  **/

  public String getCollateralAssetLiquidationProcedureEmployeeReference() {
    return collateralAssetLiquidationProcedureEmployeeReference;
  }

  public void setCollateralAssetLiquidationProcedureEmployeeReference(String collateralAssetLiquidationProcedureEmployeeReference) {
    this.collateralAssetLiquidationProcedureEmployeeReference = collateralAssetLiquidationProcedureEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer who is involved in Collateral Asset Liquidation Procedure 
   * @return collateralAssetLiquidationProcedureCustomerReference
  **/

  public String getCollateralAssetLiquidationProcedureCustomerReference() {
    return collateralAssetLiquidationProcedureCustomerReference;
  }

  public void setCollateralAssetLiquidationProcedureCustomerReference(String collateralAssetLiquidationProcedureCustomerReference) {
    this.collateralAssetLiquidationProcedureCustomerReference = collateralAssetLiquidationProcedureCustomerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of process undertaken within Collateral Asset Liquidation Procedure 
   * @return collateralAssetLiquidationProcedureType
  **/

  public String getCollateralAssetLiquidationProcedureType() {
    return collateralAssetLiquidationProcedureType;
  }

  public void setCollateralAssetLiquidationProcedureType(String collateralAssetLiquidationProcedureType) {
    this.collateralAssetLiquidationProcedureType = collateralAssetLiquidationProcedureType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule according to which the service provider will process the Collateral Asset Liquidation Procedure 
   * @return collateralAssetLiquidationProcedureServiceProviderSchedule
  **/

  public String getCollateralAssetLiquidationProcedureServiceProviderSchedule() {
    return collateralAssetLiquidationProcedureServiceProviderSchedule;
  }

  public void setCollateralAssetLiquidationProcedureServiceProviderSchedule(String collateralAssetLiquidationProcedureServiceProviderSchedule) {
    this.collateralAssetLiquidationProcedureServiceProviderSchedule = collateralAssetLiquidationProcedureServiceProviderSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of services in Collateral Asset Liquidation Procedure  
   * @return collateralAssetLiquidationProcedureServiceType
  **/

  public String getCollateralAssetLiquidationProcedureServiceType() {
    return collateralAssetLiquidationProcedureServiceType;
  }

  public void setCollateralAssetLiquidationProcedureServiceType(String collateralAssetLiquidationProcedureServiceType) {
    this.collateralAssetLiquidationProcedureServiceType = collateralAssetLiquidationProcedureServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of products/services related to Collateral Asset Liquidation Procedure  
   * @return collateralAssetLiquidationProcedureProductandServiceType
  **/

  public String getCollateralAssetLiquidationProcedureProductandServiceType() {
    return collateralAssetLiquidationProcedureProductandServiceType;
  }

  public void setCollateralAssetLiquidationProcedureProductandServiceType(String collateralAssetLiquidationProcedureProductandServiceType) {
    this.collateralAssetLiquidationProcedureProductandServiceType = collateralAssetLiquidationProcedureProductandServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the product or service that is related to Collateral Asset Liquidation Procedure 
   * @return collateralAssetLiquidationProcedureProductandServiceInstance
  **/

  public String getCollateralAssetLiquidationProcedureProductandServiceInstance() {
    return collateralAssetLiquidationProcedureProductandServiceInstance;
  }

  public void setCollateralAssetLiquidationProcedureProductandServiceInstance(String collateralAssetLiquidationProcedureProductandServiceInstance) {
    this.collateralAssetLiquidationProcedureProductandServiceInstance = collateralAssetLiquidationProcedureProductandServiceInstance;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of transactions in Collateral Asset Liquidation Procedure  
   * @return collateralAssetLiquidationProcedureTransactionType
  **/

  public String getCollateralAssetLiquidationProcedureTransactionType() {
    return collateralAssetLiquidationProcedureTransactionType;
  }

  public void setCollateralAssetLiquidationProcedureTransactionType(String collateralAssetLiquidationProcedureTransactionType) {
    this.collateralAssetLiquidationProcedureTransactionType = collateralAssetLiquidationProcedureTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the Financial Transaction Arrangement that is related to Collateral Asset Liquidation Procedure  
   * @return collateralAssetLiquidationProcedureFinancialTransactionArrangement
  **/

  public String getCollateralAssetLiquidationProcedureFinancialTransactionArrangement() {
    return collateralAssetLiquidationProcedureFinancialTransactionArrangement;
  }

  public void setCollateralAssetLiquidationProcedureFinancialTransactionArrangement(String collateralAssetLiquidationProcedureFinancialTransactionArrangement) {
    this.collateralAssetLiquidationProcedureFinancialTransactionArrangement = collateralAssetLiquidationProcedureFinancialTransactionArrangement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Agreement that is related to Collateral Asset Liquidation Procedure  
   * @return collateralAssetLiquidationProcedureCustomerAgreementReference
  **/

  public String getCollateralAssetLiquidationProcedureCustomerAgreementReference() {
    return collateralAssetLiquidationProcedureCustomerAgreementReference;
  }

  public void setCollateralAssetLiquidationProcedureCustomerAgreementReference(String collateralAssetLiquidationProcedureCustomerAgreementReference) {
    this.collateralAssetLiquidationProcedureCustomerAgreementReference = collateralAssetLiquidationProcedureCustomerAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return collateralAssetLiquidationProcedureControlActionTaskRecord
  **/

  public Object getCollateralAssetLiquidationProcedureControlActionTaskRecord() {
    return collateralAssetLiquidationProcedureControlActionTaskRecord;
  }

  public void setCollateralAssetLiquidationProcedureControlActionTaskRecord(Object collateralAssetLiquidationProcedureControlActionTaskRecord) {
    this.collateralAssetLiquidationProcedureControlActionTaskRecord = collateralAssetLiquidationProcedureControlActionTaskRecord;
  }


  /**
   * Get collateralAssetLiquidationProcedureControlActionRequest
   * @return collateralAssetLiquidationProcedureControlActionRequest
  **/

  public CRCollateralAssetLiquidationProcedureControlInputModelCollateralAssetLiquidationProcedureControlActionRequest getCollateralAssetLiquidationProcedureControlActionRequest() {
    return collateralAssetLiquidationProcedureControlActionRequest;
  }

  public void setCollateralAssetLiquidationProcedureControlActionRequest(CRCollateralAssetLiquidationProcedureControlInputModelCollateralAssetLiquidationProcedureControlActionRequest collateralAssetLiquidationProcedureControlActionRequest) {
    this.collateralAssetLiquidationProcedureControlActionRequest = collateralAssetLiquidationProcedureControlActionRequest;
  }


}


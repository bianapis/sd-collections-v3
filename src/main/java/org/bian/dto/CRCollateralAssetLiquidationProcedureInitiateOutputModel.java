package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetLiquidationProcedureInitiateOutputModel
 */
public class CRCollateralAssetLiquidationProcedureInitiateOutputModel   {
  private String collateralAssetLiquidationProcedureInstanceReference = null;

  private String collateralAssetLiquidationProcedureInitiateActionReference = null;

  private Object collateralAssetLiquidationProcedureInitiateActionRecord = null;

  private String collateralAssetLiquidationProcedureInstanceStatus = null;

  private String collateralAssetLiquidationProcedureParameterType = null;

  private String collateralAssetLiquidationProcedureSelectedOption = null;

  private String collateralAssetLiquidationProcedureRequest = null;

  private String collateralAssetLiquidationProcedureSchedule = null;

  private String collateralAssetLiquidationProcedureStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return collateralAssetLiquidationProcedureInitiateActionReference
  **/

  public String getCollateralAssetLiquidationProcedureInitiateActionReference() {
    return collateralAssetLiquidationProcedureInitiateActionReference;
  }

  public void setCollateralAssetLiquidationProcedureInitiateActionReference(String collateralAssetLiquidationProcedureInitiateActionReference) {
    this.collateralAssetLiquidationProcedureInitiateActionReference = collateralAssetLiquidationProcedureInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return collateralAssetLiquidationProcedureInitiateActionRecord
  **/

  public Object getCollateralAssetLiquidationProcedureInitiateActionRecord() {
    return collateralAssetLiquidationProcedureInitiateActionRecord;
  }

  public void setCollateralAssetLiquidationProcedureInitiateActionRecord(Object collateralAssetLiquidationProcedureInitiateActionRecord) {
    this.collateralAssetLiquidationProcedureInitiateActionRecord = collateralAssetLiquidationProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Collateral Asset Liquidation Procedure instance (e.g. initialised, pending, active) 
   * @return collateralAssetLiquidationProcedureInstanceStatus
  **/

  public String getCollateralAssetLiquidationProcedureInstanceStatus() {
    return collateralAssetLiquidationProcedureInstanceStatus;
  }

  public void setCollateralAssetLiquidationProcedureInstanceStatus(String collateralAssetLiquidationProcedureInstanceStatus) {
    this.collateralAssetLiquidationProcedureInstanceStatus = collateralAssetLiquidationProcedureInstanceStatus;
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


}


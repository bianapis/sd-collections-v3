package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetLiquidationProcedureExecuteOutputModel
 */
public class CRCollateralAssetLiquidationProcedureExecuteOutputModel   {
  private String collateralAssetLiquidationProcedureParameterType = null;

  private String collateralAssetLiquidationProcedureSelectedOption = null;

  private String collateralAssetLiquidationProcedureRequest = null;

  private String collateralAssetLiquidationProcedureSchedule = null;

  private String collateralAssetLiquidationProcedureStatus = null;

  private String collateralAssetLiquidationProcedureExecuteActionTaskReference = null;

  private Object collateralAssetLiquidationProcedureExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Collateral Asset Liquidation Procedure instance execute service call 
   * @return collateralAssetLiquidationProcedureExecuteActionTaskReference
  **/

  public String getCollateralAssetLiquidationProcedureExecuteActionTaskReference() {
    return collateralAssetLiquidationProcedureExecuteActionTaskReference;
  }

  public void setCollateralAssetLiquidationProcedureExecuteActionTaskReference(String collateralAssetLiquidationProcedureExecuteActionTaskReference) {
    this.collateralAssetLiquidationProcedureExecuteActionTaskReference = collateralAssetLiquidationProcedureExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return collateralAssetLiquidationProcedureExecuteActionTaskRecord
  **/

  public Object getCollateralAssetLiquidationProcedureExecuteActionTaskRecord() {
    return collateralAssetLiquidationProcedureExecuteActionTaskRecord;
  }

  public void setCollateralAssetLiquidationProcedureExecuteActionTaskRecord(Object collateralAssetLiquidationProcedureExecuteActionTaskRecord) {
    this.collateralAssetLiquidationProcedureExecuteActionTaskRecord = collateralAssetLiquidationProcedureExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}


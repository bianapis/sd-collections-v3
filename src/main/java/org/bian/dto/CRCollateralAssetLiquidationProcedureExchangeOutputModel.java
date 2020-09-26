package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetLiquidationProcedureExchangeOutputModel
 */
public class CRCollateralAssetLiquidationProcedureExchangeOutputModel   {
  private String collateralAssetLiquidationProcedureParameterType = null;

  private String collateralAssetLiquidationProcedureSelectedOption = null;

  private String collateralAssetLiquidationProcedureRequest = null;

  private String collateralAssetLiquidationProcedureSchedule = null;

  private String collateralAssetLiquidationProcedureStatus = null;

  private String collateralAssetLiquidationProcedureExchangeActionTaskReference = null;

  private Object collateralAssetLiquidationProcedureExchangeActionTaskRecord = null;

  private String collateralAssetLiquidationProcedureExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Collateral Asset Liquidation Procedure instance exchange service call 
   * @return collateralAssetLiquidationProcedureExchangeActionTaskReference
  **/

  public String getCollateralAssetLiquidationProcedureExchangeActionTaskReference() {
    return collateralAssetLiquidationProcedureExchangeActionTaskReference;
  }

  public void setCollateralAssetLiquidationProcedureExchangeActionTaskReference(String collateralAssetLiquidationProcedureExchangeActionTaskReference) {
    this.collateralAssetLiquidationProcedureExchangeActionTaskReference = collateralAssetLiquidationProcedureExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return collateralAssetLiquidationProcedureExchangeActionTaskRecord
  **/

  public Object getCollateralAssetLiquidationProcedureExchangeActionTaskRecord() {
    return collateralAssetLiquidationProcedureExchangeActionTaskRecord;
  }

  public void setCollateralAssetLiquidationProcedureExchangeActionTaskRecord(Object collateralAssetLiquidationProcedureExchangeActionTaskRecord) {
    this.collateralAssetLiquidationProcedureExchangeActionTaskRecord = collateralAssetLiquidationProcedureExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return collateralAssetLiquidationProcedureExchangeActionResponse
  **/

  public String getCollateralAssetLiquidationProcedureExchangeActionResponse() {
    return collateralAssetLiquidationProcedureExchangeActionResponse;
  }

  public void setCollateralAssetLiquidationProcedureExchangeActionResponse(String collateralAssetLiquidationProcedureExchangeActionResponse) {
    this.collateralAssetLiquidationProcedureExchangeActionResponse = collateralAssetLiquidationProcedureExchangeActionResponse;
  }


}


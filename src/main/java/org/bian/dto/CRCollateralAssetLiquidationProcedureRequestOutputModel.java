package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetLiquidationProcedureRequestOutputModel
 */
public class CRCollateralAssetLiquidationProcedureRequestOutputModel   {
  private String collateralAssetLiquidationProcedureParameterType = null;

  private String collateralAssetLiquidationProcedureSelectedOption = null;

  private String collateralAssetLiquidationProcedureRequest = null;

  private String collateralAssetLiquidationProcedureSchedule = null;

  private String collateralAssetLiquidationProcedureStatus = null;

  private String collateralAssetLiquidationProcedureRequestActionTaskReference = null;

  private Object collateralAssetLiquidationProcedureRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Collateral Asset Liquidation Procedure instance request service call 
   * @return collateralAssetLiquidationProcedureRequestActionTaskReference
  **/

  public String getCollateralAssetLiquidationProcedureRequestActionTaskReference() {
    return collateralAssetLiquidationProcedureRequestActionTaskReference;
  }

  public void setCollateralAssetLiquidationProcedureRequestActionTaskReference(String collateralAssetLiquidationProcedureRequestActionTaskReference) {
    this.collateralAssetLiquidationProcedureRequestActionTaskReference = collateralAssetLiquidationProcedureRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return collateralAssetLiquidationProcedureRequestActionTaskRecord
  **/

  public Object getCollateralAssetLiquidationProcedureRequestActionTaskRecord() {
    return collateralAssetLiquidationProcedureRequestActionTaskRecord;
  }

  public void setCollateralAssetLiquidationProcedureRequestActionTaskRecord(Object collateralAssetLiquidationProcedureRequestActionTaskRecord) {
    this.collateralAssetLiquidationProcedureRequestActionTaskRecord = collateralAssetLiquidationProcedureRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}


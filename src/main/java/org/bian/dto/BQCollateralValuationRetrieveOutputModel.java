package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCollateralValuationRetrieveOutputModelCollateralValuationInstanceAnalysis;
import org.bian.dto.BQCollateralValuationRetrieveOutputModelCollateralValuationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCollateralValuationRetrieveOutputModel
 */
public class BQCollateralValuationRetrieveOutputModel   {
  private String collateralValuationPreconditions = null;

  private String collateralValuationBusinessUnitEmployeeReference = null;

  private String collateralValuationWorkSchedule = null;

  private String collateralValuationPostconditions = null;

  private String collateralValuationCollateralValuationServiceType = null;

  private String collateralValuationCollateralValuationServiceDescription = null;

  private String collateralValuationCollateralValuationServiceInputsandOuputs = null;

  private String collateralValuationCollateralValuationServiceWorkProduct = null;

  private String collateralValuationCollateralValuationServiceName = null;

  private String collateralValuationRetrieveActionTaskReference = null;

  private Object collateralValuationRetrieveActionTaskRecord = null;

  private String collateralValuationRetrieveActionResponse = null;

  private BQCollateralValuationRetrieveOutputModelCollateralValuationInstanceReport collateralValuationInstanceReport = null;

  private BQCollateralValuationRetrieveOutputModelCollateralValuationInstanceAnalysis collateralValuationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return collateralValuationPreconditions
  **/

  public String getCollateralValuationPreconditions() {
    return collateralValuationPreconditions;
  }

  public void setCollateralValuationPreconditions(String collateralValuationPreconditions) {
    this.collateralValuationPreconditions = collateralValuationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return collateralValuationBusinessUnitEmployeeReference
  **/

  public String getCollateralValuationBusinessUnitEmployeeReference() {
    return collateralValuationBusinessUnitEmployeeReference;
  }

  public void setCollateralValuationBusinessUnitEmployeeReference(String collateralValuationBusinessUnitEmployeeReference) {
    this.collateralValuationBusinessUnitEmployeeReference = collateralValuationBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return collateralValuationWorkSchedule
  **/

  public String getCollateralValuationWorkSchedule() {
    return collateralValuationWorkSchedule;
  }

  public void setCollateralValuationWorkSchedule(String collateralValuationWorkSchedule) {
    this.collateralValuationWorkSchedule = collateralValuationWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return collateralValuationPostconditions
  **/

  public String getCollateralValuationPostconditions() {
    return collateralValuationPostconditions;
  }

  public void setCollateralValuationPostconditions(String collateralValuationPostconditions) {
    this.collateralValuationPostconditions = collateralValuationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return collateralValuationCollateralValuationServiceType
  **/

  public String getCollateralValuationCollateralValuationServiceType() {
    return collateralValuationCollateralValuationServiceType;
  }

  public void setCollateralValuationCollateralValuationServiceType(String collateralValuationCollateralValuationServiceType) {
    this.collateralValuationCollateralValuationServiceType = collateralValuationCollateralValuationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return collateralValuationCollateralValuationServiceDescription
  **/

  public String getCollateralValuationCollateralValuationServiceDescription() {
    return collateralValuationCollateralValuationServiceDescription;
  }

  public void setCollateralValuationCollateralValuationServiceDescription(String collateralValuationCollateralValuationServiceDescription) {
    this.collateralValuationCollateralValuationServiceDescription = collateralValuationCollateralValuationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return collateralValuationCollateralValuationServiceInputsandOuputs
  **/

  public String getCollateralValuationCollateralValuationServiceInputsandOuputs() {
    return collateralValuationCollateralValuationServiceInputsandOuputs;
  }

  public void setCollateralValuationCollateralValuationServiceInputsandOuputs(String collateralValuationCollateralValuationServiceInputsandOuputs) {
    this.collateralValuationCollateralValuationServiceInputsandOuputs = collateralValuationCollateralValuationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return collateralValuationCollateralValuationServiceWorkProduct
  **/

  public String getCollateralValuationCollateralValuationServiceWorkProduct() {
    return collateralValuationCollateralValuationServiceWorkProduct;
  }

  public void setCollateralValuationCollateralValuationServiceWorkProduct(String collateralValuationCollateralValuationServiceWorkProduct) {
    this.collateralValuationCollateralValuationServiceWorkProduct = collateralValuationCollateralValuationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return collateralValuationCollateralValuationServiceName
  **/

  public String getCollateralValuationCollateralValuationServiceName() {
    return collateralValuationCollateralValuationServiceName;
  }

  public void setCollateralValuationCollateralValuationServiceName(String collateralValuationCollateralValuationServiceName) {
    this.collateralValuationCollateralValuationServiceName = collateralValuationCollateralValuationServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Collateral Valuation instance retrieve service call 
   * @return collateralValuationRetrieveActionTaskReference
  **/

  public String getCollateralValuationRetrieveActionTaskReference() {
    return collateralValuationRetrieveActionTaskReference;
  }

  public void setCollateralValuationRetrieveActionTaskReference(String collateralValuationRetrieveActionTaskReference) {
    this.collateralValuationRetrieveActionTaskReference = collateralValuationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return collateralValuationRetrieveActionTaskRecord
  **/

  public Object getCollateralValuationRetrieveActionTaskRecord() {
    return collateralValuationRetrieveActionTaskRecord;
  }

  public void setCollateralValuationRetrieveActionTaskRecord(Object collateralValuationRetrieveActionTaskRecord) {
    this.collateralValuationRetrieveActionTaskRecord = collateralValuationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return collateralValuationRetrieveActionResponse
  **/

  public String getCollateralValuationRetrieveActionResponse() {
    return collateralValuationRetrieveActionResponse;
  }

  public void setCollateralValuationRetrieveActionResponse(String collateralValuationRetrieveActionResponse) {
    this.collateralValuationRetrieveActionResponse = collateralValuationRetrieveActionResponse;
  }


  /**
   * Get collateralValuationInstanceReport
   * @return collateralValuationInstanceReport
  **/

  public BQCollateralValuationRetrieveOutputModelCollateralValuationInstanceReport getCollateralValuationInstanceReport() {
    return collateralValuationInstanceReport;
  }

  public void setCollateralValuationInstanceReport(BQCollateralValuationRetrieveOutputModelCollateralValuationInstanceReport collateralValuationInstanceReport) {
    this.collateralValuationInstanceReport = collateralValuationInstanceReport;
  }


  /**
   * Get collateralValuationInstanceAnalysis
   * @return collateralValuationInstanceAnalysis
  **/

  public BQCollateralValuationRetrieveOutputModelCollateralValuationInstanceAnalysis getCollateralValuationInstanceAnalysis() {
    return collateralValuationInstanceAnalysis;
  }

  public void setCollateralValuationInstanceAnalysis(BQCollateralValuationRetrieveOutputModelCollateralValuationInstanceAnalysis collateralValuationInstanceAnalysis) {
    this.collateralValuationInstanceAnalysis = collateralValuationInstanceAnalysis;
  }


}


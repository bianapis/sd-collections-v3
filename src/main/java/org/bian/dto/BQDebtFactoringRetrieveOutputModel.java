package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDebtFactoringRetrieveOutputModelDebtFactoringInstanceAnalysis;
import org.bian.dto.BQDebtFactoringRetrieveOutputModelDebtFactoringInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDebtFactoringRetrieveOutputModel
 */
public class BQDebtFactoringRetrieveOutputModel   {
  private String debtFactoringPreconditions = null;

  private String debtFactoringBusinessUnitEmployeeReference = null;

  private String debtFactoringWorkSchedule = null;

  private String debtFactoringPostconditions = null;

  private String debtFactoringFactoringServiceType = null;

  private String debtFactoringFactoringServiceDescription = null;

  private String debtFactoringFactoringServiceInputsandOuputs = null;

  private String debtFactoringFactoringServiceWorkProduct = null;

  private String debtFactoringRetrieveActionTaskReference = null;

  private Object debtFactoringRetrieveActionTaskRecord = null;

  private String debtFactoringRetrieveActionResponse = null;

  private BQDebtFactoringRetrieveOutputModelDebtFactoringInstanceReport debtFactoringInstanceReport = null;

  private BQDebtFactoringRetrieveOutputModelDebtFactoringInstanceAnalysis debtFactoringInstanceAnalysis = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Debt Factoring instance retrieve service call 
   * @return debtFactoringRetrieveActionTaskReference
  **/

  public String getDebtFactoringRetrieveActionTaskReference() {
    return debtFactoringRetrieveActionTaskReference;
  }

  public void setDebtFactoringRetrieveActionTaskReference(String debtFactoringRetrieveActionTaskReference) {
    this.debtFactoringRetrieveActionTaskReference = debtFactoringRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return debtFactoringRetrieveActionTaskRecord
  **/

  public Object getDebtFactoringRetrieveActionTaskRecord() {
    return debtFactoringRetrieveActionTaskRecord;
  }

  public void setDebtFactoringRetrieveActionTaskRecord(Object debtFactoringRetrieveActionTaskRecord) {
    this.debtFactoringRetrieveActionTaskRecord = debtFactoringRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return debtFactoringRetrieveActionResponse
  **/

  public String getDebtFactoringRetrieveActionResponse() {
    return debtFactoringRetrieveActionResponse;
  }

  public void setDebtFactoringRetrieveActionResponse(String debtFactoringRetrieveActionResponse) {
    this.debtFactoringRetrieveActionResponse = debtFactoringRetrieveActionResponse;
  }


  /**
   * Get debtFactoringInstanceReport
   * @return debtFactoringInstanceReport
  **/

  public BQDebtFactoringRetrieveOutputModelDebtFactoringInstanceReport getDebtFactoringInstanceReport() {
    return debtFactoringInstanceReport;
  }

  public void setDebtFactoringInstanceReport(BQDebtFactoringRetrieveOutputModelDebtFactoringInstanceReport debtFactoringInstanceReport) {
    this.debtFactoringInstanceReport = debtFactoringInstanceReport;
  }


  /**
   * Get debtFactoringInstanceAnalysis
   * @return debtFactoringInstanceAnalysis
  **/

  public BQDebtFactoringRetrieveOutputModelDebtFactoringInstanceAnalysis getDebtFactoringInstanceAnalysis() {
    return debtFactoringInstanceAnalysis;
  }

  public void setDebtFactoringInstanceAnalysis(BQDebtFactoringRetrieveOutputModelDebtFactoringInstanceAnalysis debtFactoringInstanceAnalysis) {
    this.debtFactoringInstanceAnalysis = debtFactoringInstanceAnalysis;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCollectionsAssessmentRetrieveOutputModelCollectionsAssessmentInstanceAnalysis;
import org.bian.dto.BQCollectionsAssessmentRetrieveOutputModelCollectionsAssessmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCollectionsAssessmentRetrieveOutputModel
 */
public class BQCollectionsAssessmentRetrieveOutputModel   {
  private String collectionsAssessmentPreconditions = null;

  private String collectionsAssessmentBusinessUnitEmployeeReference = null;

  private String collectionsAssessmentWorkSchedule = null;

  private String collectionsAssessmentPostconditions = null;

  private String collectionsAssessmentCollectionsAssessmentServiceType = null;

  private String collectionsAssessmentCollectionsAssessmentServiceDescription = null;

  private String collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs = null;

  private String collectionsAssessmentCollectionsAssessmentServiceWorkProduct = null;

  private String collectionsAssessmentCollectionsAssessmentServiceName = null;

  private String collectionsAssessmentRetrieveActionTaskReference = null;

  private Object collectionsAssessmentRetrieveActionTaskRecord = null;

  private String collectionsAssessmentRetrieveActionResponse = null;

  private BQCollectionsAssessmentRetrieveOutputModelCollectionsAssessmentInstanceReport collectionsAssessmentInstanceReport = null;

  private BQCollectionsAssessmentRetrieveOutputModelCollectionsAssessmentInstanceAnalysis collectionsAssessmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return collectionsAssessmentPreconditions
  **/

  public String getCollectionsAssessmentPreconditions() {
    return collectionsAssessmentPreconditions;
  }

  public void setCollectionsAssessmentPreconditions(String collectionsAssessmentPreconditions) {
    this.collectionsAssessmentPreconditions = collectionsAssessmentPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return collectionsAssessmentBusinessUnitEmployeeReference
  **/

  public String getCollectionsAssessmentBusinessUnitEmployeeReference() {
    return collectionsAssessmentBusinessUnitEmployeeReference;
  }

  public void setCollectionsAssessmentBusinessUnitEmployeeReference(String collectionsAssessmentBusinessUnitEmployeeReference) {
    this.collectionsAssessmentBusinessUnitEmployeeReference = collectionsAssessmentBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return collectionsAssessmentWorkSchedule
  **/

  public String getCollectionsAssessmentWorkSchedule() {
    return collectionsAssessmentWorkSchedule;
  }

  public void setCollectionsAssessmentWorkSchedule(String collectionsAssessmentWorkSchedule) {
    this.collectionsAssessmentWorkSchedule = collectionsAssessmentWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return collectionsAssessmentPostconditions
  **/

  public String getCollectionsAssessmentPostconditions() {
    return collectionsAssessmentPostconditions;
  }

  public void setCollectionsAssessmentPostconditions(String collectionsAssessmentPostconditions) {
    this.collectionsAssessmentPostconditions = collectionsAssessmentPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return collectionsAssessmentCollectionsAssessmentServiceType
  **/

  public String getCollectionsAssessmentCollectionsAssessmentServiceType() {
    return collectionsAssessmentCollectionsAssessmentServiceType;
  }

  public void setCollectionsAssessmentCollectionsAssessmentServiceType(String collectionsAssessmentCollectionsAssessmentServiceType) {
    this.collectionsAssessmentCollectionsAssessmentServiceType = collectionsAssessmentCollectionsAssessmentServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return collectionsAssessmentCollectionsAssessmentServiceDescription
  **/

  public String getCollectionsAssessmentCollectionsAssessmentServiceDescription() {
    return collectionsAssessmentCollectionsAssessmentServiceDescription;
  }

  public void setCollectionsAssessmentCollectionsAssessmentServiceDescription(String collectionsAssessmentCollectionsAssessmentServiceDescription) {
    this.collectionsAssessmentCollectionsAssessmentServiceDescription = collectionsAssessmentCollectionsAssessmentServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs
  **/

  public String getCollectionsAssessmentCollectionsAssessmentServiceInputsandOuputs() {
    return collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs;
  }

  public void setCollectionsAssessmentCollectionsAssessmentServiceInputsandOuputs(String collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs) {
    this.collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs = collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return collectionsAssessmentCollectionsAssessmentServiceWorkProduct
  **/

  public String getCollectionsAssessmentCollectionsAssessmentServiceWorkProduct() {
    return collectionsAssessmentCollectionsAssessmentServiceWorkProduct;
  }

  public void setCollectionsAssessmentCollectionsAssessmentServiceWorkProduct(String collectionsAssessmentCollectionsAssessmentServiceWorkProduct) {
    this.collectionsAssessmentCollectionsAssessmentServiceWorkProduct = collectionsAssessmentCollectionsAssessmentServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return collectionsAssessmentCollectionsAssessmentServiceName
  **/

  public String getCollectionsAssessmentCollectionsAssessmentServiceName() {
    return collectionsAssessmentCollectionsAssessmentServiceName;
  }

  public void setCollectionsAssessmentCollectionsAssessmentServiceName(String collectionsAssessmentCollectionsAssessmentServiceName) {
    this.collectionsAssessmentCollectionsAssessmentServiceName = collectionsAssessmentCollectionsAssessmentServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Collections Assessment instance retrieve service call 
   * @return collectionsAssessmentRetrieveActionTaskReference
  **/

  public String getCollectionsAssessmentRetrieveActionTaskReference() {
    return collectionsAssessmentRetrieveActionTaskReference;
  }

  public void setCollectionsAssessmentRetrieveActionTaskReference(String collectionsAssessmentRetrieveActionTaskReference) {
    this.collectionsAssessmentRetrieveActionTaskReference = collectionsAssessmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return collectionsAssessmentRetrieveActionTaskRecord
  **/

  public Object getCollectionsAssessmentRetrieveActionTaskRecord() {
    return collectionsAssessmentRetrieveActionTaskRecord;
  }

  public void setCollectionsAssessmentRetrieveActionTaskRecord(Object collectionsAssessmentRetrieveActionTaskRecord) {
    this.collectionsAssessmentRetrieveActionTaskRecord = collectionsAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return collectionsAssessmentRetrieveActionResponse
  **/

  public String getCollectionsAssessmentRetrieveActionResponse() {
    return collectionsAssessmentRetrieveActionResponse;
  }

  public void setCollectionsAssessmentRetrieveActionResponse(String collectionsAssessmentRetrieveActionResponse) {
    this.collectionsAssessmentRetrieveActionResponse = collectionsAssessmentRetrieveActionResponse;
  }


  /**
   * Get collectionsAssessmentInstanceReport
   * @return collectionsAssessmentInstanceReport
  **/

  public BQCollectionsAssessmentRetrieveOutputModelCollectionsAssessmentInstanceReport getCollectionsAssessmentInstanceReport() {
    return collectionsAssessmentInstanceReport;
  }

  public void setCollectionsAssessmentInstanceReport(BQCollectionsAssessmentRetrieveOutputModelCollectionsAssessmentInstanceReport collectionsAssessmentInstanceReport) {
    this.collectionsAssessmentInstanceReport = collectionsAssessmentInstanceReport;
  }


  /**
   * Get collectionsAssessmentInstanceAnalysis
   * @return collectionsAssessmentInstanceAnalysis
  **/

  public BQCollectionsAssessmentRetrieveOutputModelCollectionsAssessmentInstanceAnalysis getCollectionsAssessmentInstanceAnalysis() {
    return collectionsAssessmentInstanceAnalysis;
  }

  public void setCollectionsAssessmentInstanceAnalysis(BQCollectionsAssessmentRetrieveOutputModelCollectionsAssessmentInstanceAnalysis collectionsAssessmentInstanceAnalysis) {
    this.collectionsAssessmentInstanceAnalysis = collectionsAssessmentInstanceAnalysis;
  }


}


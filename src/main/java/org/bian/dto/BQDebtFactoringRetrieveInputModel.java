package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDebtFactoringRetrieveInputModelDebtFactoringInstanceAnalysis;
import org.bian.dto.BQDebtFactoringRetrieveInputModelDebtFactoringInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDebtFactoringRetrieveInputModel
 */
public class BQDebtFactoringRetrieveInputModel   {
  private Object debtFactoringRetrieveActionTaskRecord = null;

  private String debtFactoringRetrieveActionRequest = null;

  private BQDebtFactoringRetrieveInputModelDebtFactoringInstanceReport debtFactoringInstanceReport = null;

  private BQDebtFactoringRetrieveInputModelDebtFactoringInstanceAnalysis debtFactoringInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return debtFactoringRetrieveActionRequest
  **/

  public String getDebtFactoringRetrieveActionRequest() {
    return debtFactoringRetrieveActionRequest;
  }

  public void setDebtFactoringRetrieveActionRequest(String debtFactoringRetrieveActionRequest) {
    this.debtFactoringRetrieveActionRequest = debtFactoringRetrieveActionRequest;
  }


  /**
   * Get debtFactoringInstanceReport
   * @return debtFactoringInstanceReport
  **/

  public BQDebtFactoringRetrieveInputModelDebtFactoringInstanceReport getDebtFactoringInstanceReport() {
    return debtFactoringInstanceReport;
  }

  public void setDebtFactoringInstanceReport(BQDebtFactoringRetrieveInputModelDebtFactoringInstanceReport debtFactoringInstanceReport) {
    this.debtFactoringInstanceReport = debtFactoringInstanceReport;
  }


  /**
   * Get debtFactoringInstanceAnalysis
   * @return debtFactoringInstanceAnalysis
  **/

  public BQDebtFactoringRetrieveInputModelDebtFactoringInstanceAnalysis getDebtFactoringInstanceAnalysis() {
    return debtFactoringInstanceAnalysis;
  }

  public void setDebtFactoringInstanceAnalysis(BQDebtFactoringRetrieveInputModelDebtFactoringInstanceAnalysis debtFactoringInstanceAnalysis) {
    this.debtFactoringInstanceAnalysis = debtFactoringInstanceAnalysis;
  }


}


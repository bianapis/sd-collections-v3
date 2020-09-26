package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecordCollectionsActivityAnalysis;
import org.bian.dto.SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecordCollectionsPerformanceAnalysis;
import org.bian.dto.SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecord
 */
public class SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecord   {
  private SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecordCollectionsActivityAnalysis collectionsActivityAnalysis = null;

  private SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecordCollectionsPerformanceAnalysis collectionsPerformanceAnalysis = null;

  private SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get collectionsActivityAnalysis
   * @return collectionsActivityAnalysis
  **/

  public SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecordCollectionsActivityAnalysis getCollectionsActivityAnalysis() {
    return collectionsActivityAnalysis;
  }

  public void setCollectionsActivityAnalysis(SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecordCollectionsActivityAnalysis collectionsActivityAnalysis) {
    this.collectionsActivityAnalysis = collectionsActivityAnalysis;
  }


  /**
   * Get collectionsPerformanceAnalysis
   * @return collectionsPerformanceAnalysis
  **/

  public SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecordCollectionsPerformanceAnalysis getCollectionsPerformanceAnalysis() {
    return collectionsPerformanceAnalysis;
  }

  public void setCollectionsPerformanceAnalysis(SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecordCollectionsPerformanceAnalysis collectionsPerformanceAnalysis) {
    this.collectionsPerformanceAnalysis = collectionsPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCollectionsRetrieveOutputModelCollectionsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}


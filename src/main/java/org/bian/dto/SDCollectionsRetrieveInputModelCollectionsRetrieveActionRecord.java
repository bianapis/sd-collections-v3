package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecordCollectionsActivityAnalysis;
import org.bian.dto.SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecordCollectionsPerformanceAnalysis;
import org.bian.dto.SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecord
 */
public class SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecord   {
  private SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecordCollectionsActivityAnalysis collectionsActivityAnalysis = null;

  private SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecordCollectionsPerformanceAnalysis collectionsPerformanceAnalysis = null;

  private SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get collectionsActivityAnalysis
   * @return collectionsActivityAnalysis
  **/

  public SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecordCollectionsActivityAnalysis getCollectionsActivityAnalysis() {
    return collectionsActivityAnalysis;
  }

  public void setCollectionsActivityAnalysis(SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecordCollectionsActivityAnalysis collectionsActivityAnalysis) {
    this.collectionsActivityAnalysis = collectionsActivityAnalysis;
  }


  /**
   * Get collectionsPerformanceAnalysis
   * @return collectionsPerformanceAnalysis
  **/

  public SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecordCollectionsPerformanceAnalysis getCollectionsPerformanceAnalysis() {
    return collectionsPerformanceAnalysis;
  }

  public void setCollectionsPerformanceAnalysis(SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecordCollectionsPerformanceAnalysis collectionsPerformanceAnalysis) {
    this.collectionsPerformanceAnalysis = collectionsPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCollectionsRetrieveInputModelCollectionsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}


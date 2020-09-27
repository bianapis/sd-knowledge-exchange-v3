package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecordKnowledgeExchangeActivityAnalysis;
import org.bian.dto.SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecordKnowledgeExchangePerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecord
 */
public class SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecord   {
  private SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecordKnowledgeExchangeActivityAnalysis knowledgeExchangeActivityAnalysis = null;

  private SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecordKnowledgeExchangePerformanceAnalysis knowledgeExchangePerformanceAnalysis = null;

  private SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get knowledgeExchangeActivityAnalysis
   * @return knowledgeExchangeActivityAnalysis
  **/

  public SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecordKnowledgeExchangeActivityAnalysis getKnowledgeExchangeActivityAnalysis() {
    return knowledgeExchangeActivityAnalysis;
  }

  public void setKnowledgeExchangeActivityAnalysis(SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecordKnowledgeExchangeActivityAnalysis knowledgeExchangeActivityAnalysis) {
    this.knowledgeExchangeActivityAnalysis = knowledgeExchangeActivityAnalysis;
  }


  /**
   * Get knowledgeExchangePerformanceAnalysis
   * @return knowledgeExchangePerformanceAnalysis
  **/

  public SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecordKnowledgeExchangePerformanceAnalysis getKnowledgeExchangePerformanceAnalysis() {
    return knowledgeExchangePerformanceAnalysis;
  }

  public void setKnowledgeExchangePerformanceAnalysis(SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecordKnowledgeExchangePerformanceAnalysis knowledgeExchangePerformanceAnalysis) {
    this.knowledgeExchangePerformanceAnalysis = knowledgeExchangePerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}


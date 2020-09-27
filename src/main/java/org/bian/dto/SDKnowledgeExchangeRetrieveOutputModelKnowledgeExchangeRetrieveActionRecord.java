package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecordKnowledgeExchangeActivityAnalysis;
import org.bian.dto.SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecordKnowledgeExchangePerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecord
 */
public class SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecord   {
  private SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecordKnowledgeExchangeActivityAnalysis knowledgeExchangeActivityAnalysis = null;

  private SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecordKnowledgeExchangePerformanceAnalysis knowledgeExchangePerformanceAnalysis = null;

  private SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get knowledgeExchangeActivityAnalysis
   * @return knowledgeExchangeActivityAnalysis
  **/

  public SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecordKnowledgeExchangeActivityAnalysis getKnowledgeExchangeActivityAnalysis() {
    return knowledgeExchangeActivityAnalysis;
  }

  public void setKnowledgeExchangeActivityAnalysis(SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecordKnowledgeExchangeActivityAnalysis knowledgeExchangeActivityAnalysis) {
    this.knowledgeExchangeActivityAnalysis = knowledgeExchangeActivityAnalysis;
  }


  /**
   * Get knowledgeExchangePerformanceAnalysis
   * @return knowledgeExchangePerformanceAnalysis
  **/

  public SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecordKnowledgeExchangePerformanceAnalysis getKnowledgeExchangePerformanceAnalysis() {
    return knowledgeExchangePerformanceAnalysis;
  }

  public void setKnowledgeExchangePerformanceAnalysis(SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecordKnowledgeExchangePerformanceAnalysis knowledgeExchangePerformanceAnalysis) {
    this.knowledgeExchangePerformanceAnalysis = knowledgeExchangePerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReviewRefinementandEditingRetrieveOutputModelReviewRefinementandEditingInstanceAnalysis
 */
public class BQReviewRefinementandEditingRetrieveOutputModelReviewRefinementandEditingInstanceAnalysis   {
  private Object reviewRefinementandEditingInstanceAnalysisRecord = null;

  private String reviewRefinementandEditingInstanceAnalysisReportType = null;

  private String reviewRefinementandEditingInstanceAnalysisParameters = null;

  private Object reviewRefinementandEditingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return reviewRefinementandEditingInstanceAnalysisRecord
  **/

  public Object getReviewRefinementandEditingInstanceAnalysisRecord() {
    return reviewRefinementandEditingInstanceAnalysisRecord;
  }

  public void setReviewRefinementandEditingInstanceAnalysisRecord(Object reviewRefinementandEditingInstanceAnalysisRecord) {
    this.reviewRefinementandEditingInstanceAnalysisRecord = reviewRefinementandEditingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return reviewRefinementandEditingInstanceAnalysisReportType
  **/

  public String getReviewRefinementandEditingInstanceAnalysisReportType() {
    return reviewRefinementandEditingInstanceAnalysisReportType;
  }

  public void setReviewRefinementandEditingInstanceAnalysisReportType(String reviewRefinementandEditingInstanceAnalysisReportType) {
    this.reviewRefinementandEditingInstanceAnalysisReportType = reviewRefinementandEditingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return reviewRefinementandEditingInstanceAnalysisParameters
  **/

  public String getReviewRefinementandEditingInstanceAnalysisParameters() {
    return reviewRefinementandEditingInstanceAnalysisParameters;
  }

  public void setReviewRefinementandEditingInstanceAnalysisParameters(String reviewRefinementandEditingInstanceAnalysisParameters) {
    this.reviewRefinementandEditingInstanceAnalysisParameters = reviewRefinementandEditingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return reviewRefinementandEditingInstanceAnalysisReport
  **/

  public Object getReviewRefinementandEditingInstanceAnalysisReport() {
    return reviewRefinementandEditingInstanceAnalysisReport;
  }

  public void setReviewRefinementandEditingInstanceAnalysisReport(Object reviewRefinementandEditingInstanceAnalysisReport) {
    this.reviewRefinementandEditingInstanceAnalysisReport = reviewRefinementandEditingInstanceAnalysisReport;
  }


}


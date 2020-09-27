package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReviewRefinementandEditingRetrieveInputModelReviewRefinementandEditingInstanceAnalysis;
import org.bian.dto.BQReviewRefinementandEditingRetrieveInputModelReviewRefinementandEditingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQReviewRefinementandEditingRetrieveInputModel
 */
public class BQReviewRefinementandEditingRetrieveInputModel   {
  private Object reviewRefinementandEditingRetrieveActionTaskRecord = null;

  private String reviewRefinementandEditingRetrieveActionRequest = null;

  private BQReviewRefinementandEditingRetrieveInputModelReviewRefinementandEditingInstanceReport reviewRefinementandEditingInstanceReport = null;

  private BQReviewRefinementandEditingRetrieveInputModelReviewRefinementandEditingInstanceAnalysis reviewRefinementandEditingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return reviewRefinementandEditingRetrieveActionTaskRecord
  **/

  public Object getReviewRefinementandEditingRetrieveActionTaskRecord() {
    return reviewRefinementandEditingRetrieveActionTaskRecord;
  }

  public void setReviewRefinementandEditingRetrieveActionTaskRecord(Object reviewRefinementandEditingRetrieveActionTaskRecord) {
    this.reviewRefinementandEditingRetrieveActionTaskRecord = reviewRefinementandEditingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return reviewRefinementandEditingRetrieveActionRequest
  **/

  public String getReviewRefinementandEditingRetrieveActionRequest() {
    return reviewRefinementandEditingRetrieveActionRequest;
  }

  public void setReviewRefinementandEditingRetrieveActionRequest(String reviewRefinementandEditingRetrieveActionRequest) {
    this.reviewRefinementandEditingRetrieveActionRequest = reviewRefinementandEditingRetrieveActionRequest;
  }


  /**
   * Get reviewRefinementandEditingInstanceReport
   * @return reviewRefinementandEditingInstanceReport
  **/

  public BQReviewRefinementandEditingRetrieveInputModelReviewRefinementandEditingInstanceReport getReviewRefinementandEditingInstanceReport() {
    return reviewRefinementandEditingInstanceReport;
  }

  public void setReviewRefinementandEditingInstanceReport(BQReviewRefinementandEditingRetrieveInputModelReviewRefinementandEditingInstanceReport reviewRefinementandEditingInstanceReport) {
    this.reviewRefinementandEditingInstanceReport = reviewRefinementandEditingInstanceReport;
  }


  /**
   * Get reviewRefinementandEditingInstanceAnalysis
   * @return reviewRefinementandEditingInstanceAnalysis
  **/

  public BQReviewRefinementandEditingRetrieveInputModelReviewRefinementandEditingInstanceAnalysis getReviewRefinementandEditingInstanceAnalysis() {
    return reviewRefinementandEditingInstanceAnalysis;
  }

  public void setReviewRefinementandEditingInstanceAnalysis(BQReviewRefinementandEditingRetrieveInputModelReviewRefinementandEditingInstanceAnalysis reviewRefinementandEditingInstanceAnalysis) {
    this.reviewRefinementandEditingInstanceAnalysis = reviewRefinementandEditingInstanceAnalysis;
  }


}


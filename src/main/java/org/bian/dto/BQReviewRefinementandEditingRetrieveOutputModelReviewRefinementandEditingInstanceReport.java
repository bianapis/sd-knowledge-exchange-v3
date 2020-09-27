package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReviewRefinementandEditingRetrieveOutputModelReviewRefinementandEditingInstanceReport
 */
public class BQReviewRefinementandEditingRetrieveOutputModelReviewRefinementandEditingInstanceReport   {
  private Object reviewRefinementandEditingInstanceReportRecord = null;

  private String reviewRefinementandEditingInstanceReportType = null;

  private String reviewRefinementandEditingInstanceReportParameters = null;

  private Object reviewRefinementandEditingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return reviewRefinementandEditingInstanceReportRecord
  **/

  public Object getReviewRefinementandEditingInstanceReportRecord() {
    return reviewRefinementandEditingInstanceReportRecord;
  }

  public void setReviewRefinementandEditingInstanceReportRecord(Object reviewRefinementandEditingInstanceReportRecord) {
    this.reviewRefinementandEditingInstanceReportRecord = reviewRefinementandEditingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return reviewRefinementandEditingInstanceReportType
  **/

  public String getReviewRefinementandEditingInstanceReportType() {
    return reviewRefinementandEditingInstanceReportType;
  }

  public void setReviewRefinementandEditingInstanceReportType(String reviewRefinementandEditingInstanceReportType) {
    this.reviewRefinementandEditingInstanceReportType = reviewRefinementandEditingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return reviewRefinementandEditingInstanceReportParameters
  **/

  public String getReviewRefinementandEditingInstanceReportParameters() {
    return reviewRefinementandEditingInstanceReportParameters;
  }

  public void setReviewRefinementandEditingInstanceReportParameters(String reviewRefinementandEditingInstanceReportParameters) {
    this.reviewRefinementandEditingInstanceReportParameters = reviewRefinementandEditingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return reviewRefinementandEditingInstanceReport
  **/

  public Object getReviewRefinementandEditingInstanceReport() {
    return reviewRefinementandEditingInstanceReport;
  }

  public void setReviewRefinementandEditingInstanceReport(Object reviewRefinementandEditingInstanceReport) {
    this.reviewRefinementandEditingInstanceReport = reviewRefinementandEditingInstanceReport;
  }


}


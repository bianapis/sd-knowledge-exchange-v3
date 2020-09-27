package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReviewRefinementandEditingRetrieveInputModelReviewRefinementandEditingInstanceReport
 */
public class BQReviewRefinementandEditingRetrieveInputModelReviewRefinementandEditingInstanceReport   {
  private String reviewRefinementandEditingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return reviewRefinementandEditingInstanceReportReference
  **/

  public String getReviewRefinementandEditingInstanceReportReference() {
    return reviewRefinementandEditingInstanceReportReference;
  }

  public void setReviewRefinementandEditingInstanceReportReference(String reviewRefinementandEditingInstanceReportReference) {
    this.reviewRefinementandEditingInstanceReportReference = reviewRefinementandEditingInstanceReportReference;
  }


}


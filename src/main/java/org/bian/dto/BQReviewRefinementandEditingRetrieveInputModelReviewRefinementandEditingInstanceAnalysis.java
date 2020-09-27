package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReviewRefinementandEditingRetrieveInputModelReviewRefinementandEditingInstanceAnalysis
 */
public class BQReviewRefinementandEditingRetrieveInputModelReviewRefinementandEditingInstanceAnalysis   {
  private String reviewRefinementandEditingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return reviewRefinementandEditingInstanceAnalysisReference
  **/

  public String getReviewRefinementandEditingInstanceAnalysisReference() {
    return reviewRefinementandEditingInstanceAnalysisReference;
  }

  public void setReviewRefinementandEditingInstanceAnalysisReference(String reviewRefinementandEditingInstanceAnalysisReference) {
    this.reviewRefinementandEditingInstanceAnalysisReference = reviewRefinementandEditingInstanceAnalysisReference;
  }


}


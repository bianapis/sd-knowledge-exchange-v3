package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaptureandClassificationRetrieveInputModelCaptureandClassificationInstanceAnalysis
 */
public class BQCaptureandClassificationRetrieveInputModelCaptureandClassificationInstanceAnalysis   {
  private String captureandClassificationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return captureandClassificationInstanceAnalysisReference
  **/

  public String getCaptureandClassificationInstanceAnalysisReference() {
    return captureandClassificationInstanceAnalysisReference;
  }

  public void setCaptureandClassificationInstanceAnalysisReference(String captureandClassificationInstanceAnalysisReference) {
    this.captureandClassificationInstanceAnalysisReference = captureandClassificationInstanceAnalysisReference;
  }


}


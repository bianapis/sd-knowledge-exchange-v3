package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaptureandClassificationRetrieveInputModelCaptureandClassificationInstanceReport
 */
public class BQCaptureandClassificationRetrieveInputModelCaptureandClassificationInstanceReport   {
  private String captureandClassificationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return captureandClassificationInstanceReportReference
  **/

  public String getCaptureandClassificationInstanceReportReference() {
    return captureandClassificationInstanceReportReference;
  }

  public void setCaptureandClassificationInstanceReportReference(String captureandClassificationInstanceReportReference) {
    this.captureandClassificationInstanceReportReference = captureandClassificationInstanceReportReference;
  }


}


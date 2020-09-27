package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaptureandClassificationRetrieveInputModelCaptureandClassificationInstanceAnalysis;
import org.bian.dto.BQCaptureandClassificationRetrieveInputModelCaptureandClassificationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCaptureandClassificationRetrieveInputModel
 */
public class BQCaptureandClassificationRetrieveInputModel   {
  private Object captureandClassificationRetrieveActionTaskRecord = null;

  private String captureandClassificationRetrieveActionRequest = null;

  private BQCaptureandClassificationRetrieveInputModelCaptureandClassificationInstanceReport captureandClassificationInstanceReport = null;

  private BQCaptureandClassificationRetrieveInputModelCaptureandClassificationInstanceAnalysis captureandClassificationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return captureandClassificationRetrieveActionTaskRecord
  **/

  public Object getCaptureandClassificationRetrieveActionTaskRecord() {
    return captureandClassificationRetrieveActionTaskRecord;
  }

  public void setCaptureandClassificationRetrieveActionTaskRecord(Object captureandClassificationRetrieveActionTaskRecord) {
    this.captureandClassificationRetrieveActionTaskRecord = captureandClassificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return captureandClassificationRetrieveActionRequest
  **/

  public String getCaptureandClassificationRetrieveActionRequest() {
    return captureandClassificationRetrieveActionRequest;
  }

  public void setCaptureandClassificationRetrieveActionRequest(String captureandClassificationRetrieveActionRequest) {
    this.captureandClassificationRetrieveActionRequest = captureandClassificationRetrieveActionRequest;
  }


  /**
   * Get captureandClassificationInstanceReport
   * @return captureandClassificationInstanceReport
  **/

  public BQCaptureandClassificationRetrieveInputModelCaptureandClassificationInstanceReport getCaptureandClassificationInstanceReport() {
    return captureandClassificationInstanceReport;
  }

  public void setCaptureandClassificationInstanceReport(BQCaptureandClassificationRetrieveInputModelCaptureandClassificationInstanceReport captureandClassificationInstanceReport) {
    this.captureandClassificationInstanceReport = captureandClassificationInstanceReport;
  }


  /**
   * Get captureandClassificationInstanceAnalysis
   * @return captureandClassificationInstanceAnalysis
  **/

  public BQCaptureandClassificationRetrieveInputModelCaptureandClassificationInstanceAnalysis getCaptureandClassificationInstanceAnalysis() {
    return captureandClassificationInstanceAnalysis;
  }

  public void setCaptureandClassificationInstanceAnalysis(BQCaptureandClassificationRetrieveInputModelCaptureandClassificationInstanceAnalysis captureandClassificationInstanceAnalysis) {
    this.captureandClassificationInstanceAnalysis = captureandClassificationInstanceAnalysis;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaptureandClassificationRetrieveOutputModelCaptureandClassificationInstanceReport
 */
public class BQCaptureandClassificationRetrieveOutputModelCaptureandClassificationInstanceReport   {
  private Object captureandClassificationInstanceReportRecord = null;

  private String captureandClassificationInstanceReportType = null;

  private String captureandClassificationInstanceReportParameters = null;

  private Object captureandClassificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return captureandClassificationInstanceReportRecord
  **/

  public Object getCaptureandClassificationInstanceReportRecord() {
    return captureandClassificationInstanceReportRecord;
  }

  public void setCaptureandClassificationInstanceReportRecord(Object captureandClassificationInstanceReportRecord) {
    this.captureandClassificationInstanceReportRecord = captureandClassificationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return captureandClassificationInstanceReportType
  **/

  public String getCaptureandClassificationInstanceReportType() {
    return captureandClassificationInstanceReportType;
  }

  public void setCaptureandClassificationInstanceReportType(String captureandClassificationInstanceReportType) {
    this.captureandClassificationInstanceReportType = captureandClassificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return captureandClassificationInstanceReportParameters
  **/

  public String getCaptureandClassificationInstanceReportParameters() {
    return captureandClassificationInstanceReportParameters;
  }

  public void setCaptureandClassificationInstanceReportParameters(String captureandClassificationInstanceReportParameters) {
    this.captureandClassificationInstanceReportParameters = captureandClassificationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return captureandClassificationInstanceReport
  **/

  public Object getCaptureandClassificationInstanceReport() {
    return captureandClassificationInstanceReport;
  }

  public void setCaptureandClassificationInstanceReport(Object captureandClassificationInstanceReport) {
    this.captureandClassificationInstanceReport = captureandClassificationInstanceReport;
  }


}


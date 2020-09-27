package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaptureandClassificationRetrieveOutputModelCaptureandClassificationInstanceAnalysis
 */
public class BQCaptureandClassificationRetrieveOutputModelCaptureandClassificationInstanceAnalysis   {
  private Object captureandClassificationInstanceAnalysisRecord = null;

  private String captureandClassificationInstanceAnalysisReportType = null;

  private String captureandClassificationInstanceAnalysisParameters = null;

  private Object captureandClassificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return captureandClassificationInstanceAnalysisRecord
  **/

  public Object getCaptureandClassificationInstanceAnalysisRecord() {
    return captureandClassificationInstanceAnalysisRecord;
  }

  public void setCaptureandClassificationInstanceAnalysisRecord(Object captureandClassificationInstanceAnalysisRecord) {
    this.captureandClassificationInstanceAnalysisRecord = captureandClassificationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return captureandClassificationInstanceAnalysisReportType
  **/

  public String getCaptureandClassificationInstanceAnalysisReportType() {
    return captureandClassificationInstanceAnalysisReportType;
  }

  public void setCaptureandClassificationInstanceAnalysisReportType(String captureandClassificationInstanceAnalysisReportType) {
    this.captureandClassificationInstanceAnalysisReportType = captureandClassificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return captureandClassificationInstanceAnalysisParameters
  **/

  public String getCaptureandClassificationInstanceAnalysisParameters() {
    return captureandClassificationInstanceAnalysisParameters;
  }

  public void setCaptureandClassificationInstanceAnalysisParameters(String captureandClassificationInstanceAnalysisParameters) {
    this.captureandClassificationInstanceAnalysisParameters = captureandClassificationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return captureandClassificationInstanceAnalysisReport
  **/

  public Object getCaptureandClassificationInstanceAnalysisReport() {
    return captureandClassificationInstanceAnalysisReport;
  }

  public void setCaptureandClassificationInstanceAnalysisReport(Object captureandClassificationInstanceAnalysisReport) {
    this.captureandClassificationInstanceAnalysisReport = captureandClassificationInstanceAnalysisReport;
  }


}


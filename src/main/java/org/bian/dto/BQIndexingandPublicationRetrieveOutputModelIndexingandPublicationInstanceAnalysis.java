package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIndexingandPublicationRetrieveOutputModelIndexingandPublicationInstanceAnalysis
 */
public class BQIndexingandPublicationRetrieveOutputModelIndexingandPublicationInstanceAnalysis   {
  private Object indexingandPublicationInstanceAnalysisRecord = null;

  private String indexingandPublicationInstanceAnalysisReportType = null;

  private String indexingandPublicationInstanceAnalysisParameters = null;

  private Object indexingandPublicationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return indexingandPublicationInstanceAnalysisRecord
  **/

  public Object getIndexingandPublicationInstanceAnalysisRecord() {
    return indexingandPublicationInstanceAnalysisRecord;
  }

  public void setIndexingandPublicationInstanceAnalysisRecord(Object indexingandPublicationInstanceAnalysisRecord) {
    this.indexingandPublicationInstanceAnalysisRecord = indexingandPublicationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return indexingandPublicationInstanceAnalysisReportType
  **/

  public String getIndexingandPublicationInstanceAnalysisReportType() {
    return indexingandPublicationInstanceAnalysisReportType;
  }

  public void setIndexingandPublicationInstanceAnalysisReportType(String indexingandPublicationInstanceAnalysisReportType) {
    this.indexingandPublicationInstanceAnalysisReportType = indexingandPublicationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return indexingandPublicationInstanceAnalysisParameters
  **/

  public String getIndexingandPublicationInstanceAnalysisParameters() {
    return indexingandPublicationInstanceAnalysisParameters;
  }

  public void setIndexingandPublicationInstanceAnalysisParameters(String indexingandPublicationInstanceAnalysisParameters) {
    this.indexingandPublicationInstanceAnalysisParameters = indexingandPublicationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return indexingandPublicationInstanceAnalysisReport
  **/

  public Object getIndexingandPublicationInstanceAnalysisReport() {
    return indexingandPublicationInstanceAnalysisReport;
  }

  public void setIndexingandPublicationInstanceAnalysisReport(Object indexingandPublicationInstanceAnalysisReport) {
    this.indexingandPublicationInstanceAnalysisReport = indexingandPublicationInstanceAnalysisReport;
  }


}


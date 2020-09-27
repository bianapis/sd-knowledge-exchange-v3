package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQArchivingRetrieveOutputModelArchivingInstanceAnalysis
 */
public class BQArchivingRetrieveOutputModelArchivingInstanceAnalysis   {
  private Object archivingInstanceAnalysisRecord = null;

  private String archivingInstanceAnalysisReportType = null;

  private String archivingInstanceAnalysisParameters = null;

  private Object archivingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return archivingInstanceAnalysisRecord
  **/

  public Object getArchivingInstanceAnalysisRecord() {
    return archivingInstanceAnalysisRecord;
  }

  public void setArchivingInstanceAnalysisRecord(Object archivingInstanceAnalysisRecord) {
    this.archivingInstanceAnalysisRecord = archivingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return archivingInstanceAnalysisReportType
  **/

  public String getArchivingInstanceAnalysisReportType() {
    return archivingInstanceAnalysisReportType;
  }

  public void setArchivingInstanceAnalysisReportType(String archivingInstanceAnalysisReportType) {
    this.archivingInstanceAnalysisReportType = archivingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return archivingInstanceAnalysisParameters
  **/

  public String getArchivingInstanceAnalysisParameters() {
    return archivingInstanceAnalysisParameters;
  }

  public void setArchivingInstanceAnalysisParameters(String archivingInstanceAnalysisParameters) {
    this.archivingInstanceAnalysisParameters = archivingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return archivingInstanceAnalysisReport
  **/

  public Object getArchivingInstanceAnalysisReport() {
    return archivingInstanceAnalysisReport;
  }

  public void setArchivingInstanceAnalysisReport(Object archivingInstanceAnalysisReport) {
    this.archivingInstanceAnalysisReport = archivingInstanceAnalysisReport;
  }


}


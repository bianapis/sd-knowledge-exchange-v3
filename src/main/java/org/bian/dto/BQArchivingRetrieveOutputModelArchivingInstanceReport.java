package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQArchivingRetrieveOutputModelArchivingInstanceReport
 */
public class BQArchivingRetrieveOutputModelArchivingInstanceReport   {
  private Object archivingInstanceReportRecord = null;

  private String archivingInstanceReportType = null;

  private String archivingInstanceReportParameters = null;

  private Object archivingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return archivingInstanceReportRecord
  **/

  public Object getArchivingInstanceReportRecord() {
    return archivingInstanceReportRecord;
  }

  public void setArchivingInstanceReportRecord(Object archivingInstanceReportRecord) {
    this.archivingInstanceReportRecord = archivingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return archivingInstanceReportType
  **/

  public String getArchivingInstanceReportType() {
    return archivingInstanceReportType;
  }

  public void setArchivingInstanceReportType(String archivingInstanceReportType) {
    this.archivingInstanceReportType = archivingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return archivingInstanceReportParameters
  **/

  public String getArchivingInstanceReportParameters() {
    return archivingInstanceReportParameters;
  }

  public void setArchivingInstanceReportParameters(String archivingInstanceReportParameters) {
    this.archivingInstanceReportParameters = archivingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return archivingInstanceReport
  **/

  public Object getArchivingInstanceReport() {
    return archivingInstanceReport;
  }

  public void setArchivingInstanceReport(Object archivingInstanceReport) {
    this.archivingInstanceReport = archivingInstanceReport;
  }


}


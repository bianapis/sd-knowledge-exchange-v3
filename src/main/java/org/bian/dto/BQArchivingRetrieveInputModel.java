package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQArchivingRetrieveInputModelArchivingInstanceAnalysis;
import org.bian.dto.BQArchivingRetrieveInputModelArchivingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQArchivingRetrieveInputModel
 */
public class BQArchivingRetrieveInputModel   {
  private Object archivingRetrieveActionTaskRecord = null;

  private String archivingRetrieveActionRequest = null;

  private BQArchivingRetrieveInputModelArchivingInstanceReport archivingInstanceReport = null;

  private BQArchivingRetrieveInputModelArchivingInstanceAnalysis archivingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return archivingRetrieveActionTaskRecord
  **/

  public Object getArchivingRetrieveActionTaskRecord() {
    return archivingRetrieveActionTaskRecord;
  }

  public void setArchivingRetrieveActionTaskRecord(Object archivingRetrieveActionTaskRecord) {
    this.archivingRetrieveActionTaskRecord = archivingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return archivingRetrieveActionRequest
  **/

  public String getArchivingRetrieveActionRequest() {
    return archivingRetrieveActionRequest;
  }

  public void setArchivingRetrieveActionRequest(String archivingRetrieveActionRequest) {
    this.archivingRetrieveActionRequest = archivingRetrieveActionRequest;
  }


  /**
   * Get archivingInstanceReport
   * @return archivingInstanceReport
  **/

  public BQArchivingRetrieveInputModelArchivingInstanceReport getArchivingInstanceReport() {
    return archivingInstanceReport;
  }

  public void setArchivingInstanceReport(BQArchivingRetrieveInputModelArchivingInstanceReport archivingInstanceReport) {
    this.archivingInstanceReport = archivingInstanceReport;
  }


  /**
   * Get archivingInstanceAnalysis
   * @return archivingInstanceAnalysis
  **/

  public BQArchivingRetrieveInputModelArchivingInstanceAnalysis getArchivingInstanceAnalysis() {
    return archivingInstanceAnalysis;
  }

  public void setArchivingInstanceAnalysis(BQArchivingRetrieveInputModelArchivingInstanceAnalysis archivingInstanceAnalysis) {
    this.archivingInstanceAnalysis = archivingInstanceAnalysis;
  }


}


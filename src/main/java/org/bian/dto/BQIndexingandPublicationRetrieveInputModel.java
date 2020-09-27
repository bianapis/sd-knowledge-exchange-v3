package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIndexingandPublicationRetrieveInputModelIndexingandPublicationInstanceAnalysis;
import org.bian.dto.BQIndexingandPublicationRetrieveInputModelIndexingandPublicationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQIndexingandPublicationRetrieveInputModel
 */
public class BQIndexingandPublicationRetrieveInputModel   {
  private Object indexingandPublicationRetrieveActionTaskRecord = null;

  private String indexingandPublicationRetrieveActionRequest = null;

  private BQIndexingandPublicationRetrieveInputModelIndexingandPublicationInstanceReport indexingandPublicationInstanceReport = null;

  private BQIndexingandPublicationRetrieveInputModelIndexingandPublicationInstanceAnalysis indexingandPublicationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return indexingandPublicationRetrieveActionTaskRecord
  **/

  public Object getIndexingandPublicationRetrieveActionTaskRecord() {
    return indexingandPublicationRetrieveActionTaskRecord;
  }

  public void setIndexingandPublicationRetrieveActionTaskRecord(Object indexingandPublicationRetrieveActionTaskRecord) {
    this.indexingandPublicationRetrieveActionTaskRecord = indexingandPublicationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return indexingandPublicationRetrieveActionRequest
  **/

  public String getIndexingandPublicationRetrieveActionRequest() {
    return indexingandPublicationRetrieveActionRequest;
  }

  public void setIndexingandPublicationRetrieveActionRequest(String indexingandPublicationRetrieveActionRequest) {
    this.indexingandPublicationRetrieveActionRequest = indexingandPublicationRetrieveActionRequest;
  }


  /**
   * Get indexingandPublicationInstanceReport
   * @return indexingandPublicationInstanceReport
  **/

  public BQIndexingandPublicationRetrieveInputModelIndexingandPublicationInstanceReport getIndexingandPublicationInstanceReport() {
    return indexingandPublicationInstanceReport;
  }

  public void setIndexingandPublicationInstanceReport(BQIndexingandPublicationRetrieveInputModelIndexingandPublicationInstanceReport indexingandPublicationInstanceReport) {
    this.indexingandPublicationInstanceReport = indexingandPublicationInstanceReport;
  }


  /**
   * Get indexingandPublicationInstanceAnalysis
   * @return indexingandPublicationInstanceAnalysis
  **/

  public BQIndexingandPublicationRetrieveInputModelIndexingandPublicationInstanceAnalysis getIndexingandPublicationInstanceAnalysis() {
    return indexingandPublicationInstanceAnalysis;
  }

  public void setIndexingandPublicationInstanceAnalysis(BQIndexingandPublicationRetrieveInputModelIndexingandPublicationInstanceAnalysis indexingandPublicationInstanceAnalysis) {
    this.indexingandPublicationInstanceAnalysis = indexingandPublicationInstanceAnalysis;
  }


}


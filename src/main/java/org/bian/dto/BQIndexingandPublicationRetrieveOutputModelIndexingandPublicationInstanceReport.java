package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIndexingandPublicationRetrieveOutputModelIndexingandPublicationInstanceReport
 */
public class BQIndexingandPublicationRetrieveOutputModelIndexingandPublicationInstanceReport   {
  private Object indexingandPublicationInstanceReportRecord = null;

  private String indexingandPublicationInstanceReportType = null;

  private String indexingandPublicationInstanceReportParameters = null;

  private Object indexingandPublicationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return indexingandPublicationInstanceReportRecord
  **/

  public Object getIndexingandPublicationInstanceReportRecord() {
    return indexingandPublicationInstanceReportRecord;
  }

  public void setIndexingandPublicationInstanceReportRecord(Object indexingandPublicationInstanceReportRecord) {
    this.indexingandPublicationInstanceReportRecord = indexingandPublicationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return indexingandPublicationInstanceReportType
  **/

  public String getIndexingandPublicationInstanceReportType() {
    return indexingandPublicationInstanceReportType;
  }

  public void setIndexingandPublicationInstanceReportType(String indexingandPublicationInstanceReportType) {
    this.indexingandPublicationInstanceReportType = indexingandPublicationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return indexingandPublicationInstanceReportParameters
  **/

  public String getIndexingandPublicationInstanceReportParameters() {
    return indexingandPublicationInstanceReportParameters;
  }

  public void setIndexingandPublicationInstanceReportParameters(String indexingandPublicationInstanceReportParameters) {
    this.indexingandPublicationInstanceReportParameters = indexingandPublicationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return indexingandPublicationInstanceReport
  **/

  public Object getIndexingandPublicationInstanceReport() {
    return indexingandPublicationInstanceReport;
  }

  public void setIndexingandPublicationInstanceReport(Object indexingandPublicationInstanceReport) {
    this.indexingandPublicationInstanceReport = indexingandPublicationInstanceReport;
  }


}


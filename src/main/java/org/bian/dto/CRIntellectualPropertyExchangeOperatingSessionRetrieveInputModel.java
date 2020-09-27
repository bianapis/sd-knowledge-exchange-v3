package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIntellectualPropertyExchangeOperatingSessionRetrieveInputModelIntellectualPropertyExchangeOperatingSessionInstanceAnalysis;
import org.bian.dto.CRIntellectualPropertyExchangeOperatingSessionRetrieveInputModelIntellectualPropertyExchangeOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyExchangeOperatingSessionRetrieveInputModel
 */
public class CRIntellectualPropertyExchangeOperatingSessionRetrieveInputModel   {
  private Object intellectualPropertyExchangeOperatingSessionRetrieveActionTaskRecord = null;

  private String intellectualPropertyExchangeOperatingSessionRetrieveActionRequest = null;

  private CRIntellectualPropertyExchangeOperatingSessionRetrieveInputModelIntellectualPropertyExchangeOperatingSessionInstanceReportRecord intellectualPropertyExchangeOperatingSessionInstanceReportRecord = null;

  private CRIntellectualPropertyExchangeOperatingSessionRetrieveInputModelIntellectualPropertyExchangeOperatingSessionInstanceAnalysis intellectualPropertyExchangeOperatingSessionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return intellectualPropertyExchangeOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getIntellectualPropertyExchangeOperatingSessionRetrieveActionTaskRecord() {
    return intellectualPropertyExchangeOperatingSessionRetrieveActionTaskRecord;
  }

  public void setIntellectualPropertyExchangeOperatingSessionRetrieveActionTaskRecord(Object intellectualPropertyExchangeOperatingSessionRetrieveActionTaskRecord) {
    this.intellectualPropertyExchangeOperatingSessionRetrieveActionTaskRecord = intellectualPropertyExchangeOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return intellectualPropertyExchangeOperatingSessionRetrieveActionRequest
  **/

  public String getIntellectualPropertyExchangeOperatingSessionRetrieveActionRequest() {
    return intellectualPropertyExchangeOperatingSessionRetrieveActionRequest;
  }

  public void setIntellectualPropertyExchangeOperatingSessionRetrieveActionRequest(String intellectualPropertyExchangeOperatingSessionRetrieveActionRequest) {
    this.intellectualPropertyExchangeOperatingSessionRetrieveActionRequest = intellectualPropertyExchangeOperatingSessionRetrieveActionRequest;
  }


  /**
   * Get intellectualPropertyExchangeOperatingSessionInstanceReportRecord
   * @return intellectualPropertyExchangeOperatingSessionInstanceReportRecord
  **/

  public CRIntellectualPropertyExchangeOperatingSessionRetrieveInputModelIntellectualPropertyExchangeOperatingSessionInstanceReportRecord getIntellectualPropertyExchangeOperatingSessionInstanceReportRecord() {
    return intellectualPropertyExchangeOperatingSessionInstanceReportRecord;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInstanceReportRecord(CRIntellectualPropertyExchangeOperatingSessionRetrieveInputModelIntellectualPropertyExchangeOperatingSessionInstanceReportRecord intellectualPropertyExchangeOperatingSessionInstanceReportRecord) {
    this.intellectualPropertyExchangeOperatingSessionInstanceReportRecord = intellectualPropertyExchangeOperatingSessionInstanceReportRecord;
  }


  /**
   * Get intellectualPropertyExchangeOperatingSessionInstanceAnalysis
   * @return intellectualPropertyExchangeOperatingSessionInstanceAnalysis
  **/

  public CRIntellectualPropertyExchangeOperatingSessionRetrieveInputModelIntellectualPropertyExchangeOperatingSessionInstanceAnalysis getIntellectualPropertyExchangeOperatingSessionInstanceAnalysis() {
    return intellectualPropertyExchangeOperatingSessionInstanceAnalysis;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInstanceAnalysis(CRIntellectualPropertyExchangeOperatingSessionRetrieveInputModelIntellectualPropertyExchangeOperatingSessionInstanceAnalysis intellectualPropertyExchangeOperatingSessionInstanceAnalysis) {
    this.intellectualPropertyExchangeOperatingSessionInstanceAnalysis = intellectualPropertyExchangeOperatingSessionInstanceAnalysis;
  }


}


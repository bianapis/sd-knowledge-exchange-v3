package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyExchangeOperatingSessionRetrieveOutputModelIntellectualPropertyExchangeOperatingSessionInstanceReportRecord
 */
public class CRIntellectualPropertyExchangeOperatingSessionRetrieveOutputModelIntellectualPropertyExchangeOperatingSessionInstanceReportRecord   {
  private String intellectualPropertyExchangeOperatingSessionInstanceReportData = null;

  private String intellectualPropertyExchangeOperatingSessionInstanceReportType = null;

  private Object intellectualPropertyExchangeOperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return intellectualPropertyExchangeOperatingSessionInstanceReportData
  **/

  public String getIntellectualPropertyExchangeOperatingSessionInstanceReportData() {
    return intellectualPropertyExchangeOperatingSessionInstanceReportData;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInstanceReportData(String intellectualPropertyExchangeOperatingSessionInstanceReportData) {
    this.intellectualPropertyExchangeOperatingSessionInstanceReportData = intellectualPropertyExchangeOperatingSessionInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return intellectualPropertyExchangeOperatingSessionInstanceReportType
  **/

  public String getIntellectualPropertyExchangeOperatingSessionInstanceReportType() {
    return intellectualPropertyExchangeOperatingSessionInstanceReportType;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInstanceReportType(String intellectualPropertyExchangeOperatingSessionInstanceReportType) {
    this.intellectualPropertyExchangeOperatingSessionInstanceReportType = intellectualPropertyExchangeOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return intellectualPropertyExchangeOperatingSessionInstanceReport
  **/

  public Object getIntellectualPropertyExchangeOperatingSessionInstanceReport() {
    return intellectualPropertyExchangeOperatingSessionInstanceReport;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInstanceReport(Object intellectualPropertyExchangeOperatingSessionInstanceReport) {
    this.intellectualPropertyExchangeOperatingSessionInstanceReport = intellectualPropertyExchangeOperatingSessionInstanceReport;
  }


}


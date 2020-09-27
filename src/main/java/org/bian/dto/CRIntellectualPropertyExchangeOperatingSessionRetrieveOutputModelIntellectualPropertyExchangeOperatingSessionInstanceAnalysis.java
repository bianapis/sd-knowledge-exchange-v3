package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyExchangeOperatingSessionRetrieveOutputModelIntellectualPropertyExchangeOperatingSessionInstanceAnalysis
 */
public class CRIntellectualPropertyExchangeOperatingSessionRetrieveOutputModelIntellectualPropertyExchangeOperatingSessionInstanceAnalysis   {
  private String intellectualPropertyExchangeOperatingSessionInstanceAnalysisData = null;

  private String intellectualPropertyExchangeOperatingSessionInstanceAnalysisReportType = null;

  private Object intellectualPropertyExchangeOperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return intellectualPropertyExchangeOperatingSessionInstanceAnalysisData
  **/

  public String getIntellectualPropertyExchangeOperatingSessionInstanceAnalysisData() {
    return intellectualPropertyExchangeOperatingSessionInstanceAnalysisData;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInstanceAnalysisData(String intellectualPropertyExchangeOperatingSessionInstanceAnalysisData) {
    this.intellectualPropertyExchangeOperatingSessionInstanceAnalysisData = intellectualPropertyExchangeOperatingSessionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return intellectualPropertyExchangeOperatingSessionInstanceAnalysisReportType
  **/

  public String getIntellectualPropertyExchangeOperatingSessionInstanceAnalysisReportType() {
    return intellectualPropertyExchangeOperatingSessionInstanceAnalysisReportType;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInstanceAnalysisReportType(String intellectualPropertyExchangeOperatingSessionInstanceAnalysisReportType) {
    this.intellectualPropertyExchangeOperatingSessionInstanceAnalysisReportType = intellectualPropertyExchangeOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return intellectualPropertyExchangeOperatingSessionInstanceAnalysisReport
  **/

  public Object getIntellectualPropertyExchangeOperatingSessionInstanceAnalysisReport() {
    return intellectualPropertyExchangeOperatingSessionInstanceAnalysisReport;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInstanceAnalysisReport(Object intellectualPropertyExchangeOperatingSessionInstanceAnalysisReport) {
    this.intellectualPropertyExchangeOperatingSessionInstanceAnalysisReport = intellectualPropertyExchangeOperatingSessionInstanceAnalysisReport;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyExchangeOperatingSessionRetrieveInputModelIntellectualPropertyExchangeOperatingSessionInstanceAnalysis
 */
public class CRIntellectualPropertyExchangeOperatingSessionRetrieveInputModelIntellectualPropertyExchangeOperatingSessionInstanceAnalysis   {
  private String intellectualPropertyExchangeOperatingSessionInstanceAnalysisReference = null;

  private String intellectualPropertyExchangeOperatingSessionInstanceAnalysisReportType = null;

  private String intellectualPropertyExchangeOperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return intellectualPropertyExchangeOperatingSessionInstanceAnalysisReference
  **/

  public String getIntellectualPropertyExchangeOperatingSessionInstanceAnalysisReference() {
    return intellectualPropertyExchangeOperatingSessionInstanceAnalysisReference;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInstanceAnalysisReference(String intellectualPropertyExchangeOperatingSessionInstanceAnalysisReference) {
    this.intellectualPropertyExchangeOperatingSessionInstanceAnalysisReference = intellectualPropertyExchangeOperatingSessionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return intellectualPropertyExchangeOperatingSessionInstanceAnalysisParameters
  **/

  public String getIntellectualPropertyExchangeOperatingSessionInstanceAnalysisParameters() {
    return intellectualPropertyExchangeOperatingSessionInstanceAnalysisParameters;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInstanceAnalysisParameters(String intellectualPropertyExchangeOperatingSessionInstanceAnalysisParameters) {
    this.intellectualPropertyExchangeOperatingSessionInstanceAnalysisParameters = intellectualPropertyExchangeOperatingSessionInstanceAnalysisParameters;
  }


}


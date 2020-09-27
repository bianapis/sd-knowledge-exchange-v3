package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyExchangeOperatingSessionRetrieveInputModelIntellectualPropertyExchangeOperatingSessionInstanceReportRecord
 */
public class CRIntellectualPropertyExchangeOperatingSessionRetrieveInputModelIntellectualPropertyExchangeOperatingSessionInstanceReportRecord   {
  private String intellectualPropertyExchangeOperatingSessionInstanceReportReference = null;

  private String intellectualPropertyExchangeOperatingSessionInstanceReportType = null;

  private String intellectualPropertyExchangeOperatingSessionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return intellectualPropertyExchangeOperatingSessionInstanceReportReference
  **/

  public String getIntellectualPropertyExchangeOperatingSessionInstanceReportReference() {
    return intellectualPropertyExchangeOperatingSessionInstanceReportReference;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInstanceReportReference(String intellectualPropertyExchangeOperatingSessionInstanceReportReference) {
    this.intellectualPropertyExchangeOperatingSessionInstanceReportReference = intellectualPropertyExchangeOperatingSessionInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return intellectualPropertyExchangeOperatingSessionInstanceReportParameters
  **/

  public String getIntellectualPropertyExchangeOperatingSessionInstanceReportParameters() {
    return intellectualPropertyExchangeOperatingSessionInstanceReportParameters;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInstanceReportParameters(String intellectualPropertyExchangeOperatingSessionInstanceReportParameters) {
    this.intellectualPropertyExchangeOperatingSessionInstanceReportParameters = intellectualPropertyExchangeOperatingSessionInstanceReportParameters;
  }


}


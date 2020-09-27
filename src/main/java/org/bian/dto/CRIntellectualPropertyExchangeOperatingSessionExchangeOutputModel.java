package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyExchangeOperatingSessionExchangeOutputModel
 */
public class CRIntellectualPropertyExchangeOperatingSessionExchangeOutputModel   {
  private String intellectualPropertyExchangeOperatingSessionReference = null;

  private String intellectualPropertyExchangeOperatingSessionServiceProviderReference = null;

  private String intellectualPropertyExchangeOperatingSessionType = null;

  private String intellectualPropertyExchangeOperatingSessionServiceProviderSchedule = null;

  private String intellectualPropertyExchangeOperatingSessionServiceType = null;

  private String intellectualPropertyExchangeOperatingSessionExchangeActionTaskReference = null;

  private Object intellectualPropertyExchangeOperatingSessionExchangeActionTaskRecord = null;

  private String intellectualPropertyExchangeOperatingSessionExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who is involved in Intellectual Property Exchange Operating Session 
   * @return intellectualPropertyExchangeOperatingSessionReference
  **/

  public String getIntellectualPropertyExchangeOperatingSessionReference() {
    return intellectualPropertyExchangeOperatingSessionReference;
  }

  public void setIntellectualPropertyExchangeOperatingSessionReference(String intellectualPropertyExchangeOperatingSessionReference) {
    this.intellectualPropertyExchangeOperatingSessionReference = intellectualPropertyExchangeOperatingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who provides the services of Intellectual Property Exchange Operating Session  
   * @return intellectualPropertyExchangeOperatingSessionServiceProviderReference
  **/

  public String getIntellectualPropertyExchangeOperatingSessionServiceProviderReference() {
    return intellectualPropertyExchangeOperatingSessionServiceProviderReference;
  }

  public void setIntellectualPropertyExchangeOperatingSessionServiceProviderReference(String intellectualPropertyExchangeOperatingSessionServiceProviderReference) {
    this.intellectualPropertyExchangeOperatingSessionServiceProviderReference = intellectualPropertyExchangeOperatingSessionServiceProviderReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of operations within Intellectual Property Exchange Operating Session  
   * @return intellectualPropertyExchangeOperatingSessionType
  **/

  public String getIntellectualPropertyExchangeOperatingSessionType() {
    return intellectualPropertyExchangeOperatingSessionType;
  }

  public void setIntellectualPropertyExchangeOperatingSessionType(String intellectualPropertyExchangeOperatingSessionType) {
    this.intellectualPropertyExchangeOperatingSessionType = intellectualPropertyExchangeOperatingSessionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule according to which the service provider will operate the Intellectual Property Exchange Operating Session 
   * @return intellectualPropertyExchangeOperatingSessionServiceProviderSchedule
  **/

  public String getIntellectualPropertyExchangeOperatingSessionServiceProviderSchedule() {
    return intellectualPropertyExchangeOperatingSessionServiceProviderSchedule;
  }

  public void setIntellectualPropertyExchangeOperatingSessionServiceProviderSchedule(String intellectualPropertyExchangeOperatingSessionServiceProviderSchedule) {
    this.intellectualPropertyExchangeOperatingSessionServiceProviderSchedule = intellectualPropertyExchangeOperatingSessionServiceProviderSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of services within Intellectual Property Exchange Operating Session  
   * @return intellectualPropertyExchangeOperatingSessionServiceType
  **/

  public String getIntellectualPropertyExchangeOperatingSessionServiceType() {
    return intellectualPropertyExchangeOperatingSessionServiceType;
  }

  public void setIntellectualPropertyExchangeOperatingSessionServiceType(String intellectualPropertyExchangeOperatingSessionServiceType) {
    this.intellectualPropertyExchangeOperatingSessionServiceType = intellectualPropertyExchangeOperatingSessionServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Intellectual Property Exchange Operating Session instance exchange service call 
   * @return intellectualPropertyExchangeOperatingSessionExchangeActionTaskReference
  **/

  public String getIntellectualPropertyExchangeOperatingSessionExchangeActionTaskReference() {
    return intellectualPropertyExchangeOperatingSessionExchangeActionTaskReference;
  }

  public void setIntellectualPropertyExchangeOperatingSessionExchangeActionTaskReference(String intellectualPropertyExchangeOperatingSessionExchangeActionTaskReference) {
    this.intellectualPropertyExchangeOperatingSessionExchangeActionTaskReference = intellectualPropertyExchangeOperatingSessionExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return intellectualPropertyExchangeOperatingSessionExchangeActionTaskRecord
  **/

  public Object getIntellectualPropertyExchangeOperatingSessionExchangeActionTaskRecord() {
    return intellectualPropertyExchangeOperatingSessionExchangeActionTaskRecord;
  }

  public void setIntellectualPropertyExchangeOperatingSessionExchangeActionTaskRecord(Object intellectualPropertyExchangeOperatingSessionExchangeActionTaskRecord) {
    this.intellectualPropertyExchangeOperatingSessionExchangeActionTaskRecord = intellectualPropertyExchangeOperatingSessionExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return intellectualPropertyExchangeOperatingSessionExchangeActionResponse
  **/

  public String getIntellectualPropertyExchangeOperatingSessionExchangeActionResponse() {
    return intellectualPropertyExchangeOperatingSessionExchangeActionResponse;
  }

  public void setIntellectualPropertyExchangeOperatingSessionExchangeActionResponse(String intellectualPropertyExchangeOperatingSessionExchangeActionResponse) {
    this.intellectualPropertyExchangeOperatingSessionExchangeActionResponse = intellectualPropertyExchangeOperatingSessionExchangeActionResponse;
  }


}


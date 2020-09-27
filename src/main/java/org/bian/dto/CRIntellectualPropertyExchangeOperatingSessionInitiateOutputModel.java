package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyExchangeOperatingSessionInitiateOutputModel
 */
public class CRIntellectualPropertyExchangeOperatingSessionInitiateOutputModel   {
  private String intellectualPropertyExchangeOperatingSessionInstanceReference = null;

  private String intellectualPropertyExchangeOperatingSessionInitiateActionReference = null;

  private Object intellectualPropertyExchangeOperatingSessionInitiateActionRecord = null;

  private String intellectualPropertyExchangeOperatingSessionInstanceStatus = null;

  private String intellectualPropertyExchangeOperatingSessionReference = null;

  private String intellectualPropertyExchangeOperatingSessionServiceProviderReference = null;

  private String intellectualPropertyExchangeOperatingSessionType = null;

  private String intellectualPropertyExchangeOperatingSessionServiceProviderSchedule = null;

  private String intellectualPropertyExchangeOperatingSessionServiceType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Intellectual Property Exchange Operating Session instance 
   * @return intellectualPropertyExchangeOperatingSessionInstanceReference
  **/

  public String getIntellectualPropertyExchangeOperatingSessionInstanceReference() {
    return intellectualPropertyExchangeOperatingSessionInstanceReference;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInstanceReference(String intellectualPropertyExchangeOperatingSessionInstanceReference) {
    this.intellectualPropertyExchangeOperatingSessionInstanceReference = intellectualPropertyExchangeOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return intellectualPropertyExchangeOperatingSessionInitiateActionReference
  **/

  public String getIntellectualPropertyExchangeOperatingSessionInitiateActionReference() {
    return intellectualPropertyExchangeOperatingSessionInitiateActionReference;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInitiateActionReference(String intellectualPropertyExchangeOperatingSessionInitiateActionReference) {
    this.intellectualPropertyExchangeOperatingSessionInitiateActionReference = intellectualPropertyExchangeOperatingSessionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return intellectualPropertyExchangeOperatingSessionInitiateActionRecord
  **/

  public Object getIntellectualPropertyExchangeOperatingSessionInitiateActionRecord() {
    return intellectualPropertyExchangeOperatingSessionInitiateActionRecord;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInitiateActionRecord(Object intellectualPropertyExchangeOperatingSessionInitiateActionRecord) {
    this.intellectualPropertyExchangeOperatingSessionInitiateActionRecord = intellectualPropertyExchangeOperatingSessionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Intellectual Property Exchange Operating Session instance (e.g. initialised, pending, active) 
   * @return intellectualPropertyExchangeOperatingSessionInstanceStatus
  **/

  public String getIntellectualPropertyExchangeOperatingSessionInstanceStatus() {
    return intellectualPropertyExchangeOperatingSessionInstanceStatus;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInstanceStatus(String intellectualPropertyExchangeOperatingSessionInstanceStatus) {
    this.intellectualPropertyExchangeOperatingSessionInstanceStatus = intellectualPropertyExchangeOperatingSessionInstanceStatus;
  }


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


}


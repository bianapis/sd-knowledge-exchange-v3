package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyExchangeOperatingSessionInitiateInputModel
 */
public class CRIntellectualPropertyExchangeOperatingSessionInitiateInputModel   {
  private String knowledgeExchangeServicingSessionReference = null;

  private Object intellectualPropertyExchangeOperatingSessionInitiateActionRecord = null;

  private String intellectualPropertyExchangeOperatingSessionInstanceStatus = null;

  private String intellectualPropertyExchangeOperatingSessionSchedule = null;

  private String intellectualPropertyExchangeOperatingSessionStatus = null;

  private String intellectualPropertyExchangeOperatingSessionUsageLog = null;

  private String intellectualPropertyExchangeOperatingSessionReference = null;

  private String intellectualPropertyExchangeOperatingSessionServiceProviderReference = null;

  private String intellectualPropertyExchangeOperatingSessionType = null;

  private String intellectualPropertyExchangeOperatingSessionServiceProviderSchedule = null;

  private String intellectualPropertyExchangeOperatingSessionServiceType = null;

  private String intellectualPropertyExchangeOperatingSessionServiceConfiguration = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return knowledgeExchangeServicingSessionReference
  **/

  public String getKnowledgeExchangeServicingSessionReference() {
    return knowledgeExchangeServicingSessionReference;
  }

  public void setKnowledgeExchangeServicingSessionReference(String knowledgeExchangeServicingSessionReference) {
    this.knowledgeExchangeServicingSessionReference = knowledgeExchangeServicingSessionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timetable of Intellectual Property Exchange Operating Session 
   * @return intellectualPropertyExchangeOperatingSessionSchedule
  **/

  public String getIntellectualPropertyExchangeOperatingSessionSchedule() {
    return intellectualPropertyExchangeOperatingSessionSchedule;
  }

  public void setIntellectualPropertyExchangeOperatingSessionSchedule(String intellectualPropertyExchangeOperatingSessionSchedule) {
    this.intellectualPropertyExchangeOperatingSessionSchedule = intellectualPropertyExchangeOperatingSessionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Intellectual Property Exchange Operating Session 
   * @return intellectualPropertyExchangeOperatingSessionStatus
  **/

  public String getIntellectualPropertyExchangeOperatingSessionStatus() {
    return intellectualPropertyExchangeOperatingSessionStatus;
  }

  public void setIntellectualPropertyExchangeOperatingSessionStatus(String intellectualPropertyExchangeOperatingSessionStatus) {
    this.intellectualPropertyExchangeOperatingSessionStatus = intellectualPropertyExchangeOperatingSessionStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (usage) ativities/events of Intellectual Property Exchange Operating Session 
   * @return intellectualPropertyExchangeOperatingSessionUsageLog
  **/

  public String getIntellectualPropertyExchangeOperatingSessionUsageLog() {
    return intellectualPropertyExchangeOperatingSessionUsageLog;
  }

  public void setIntellectualPropertyExchangeOperatingSessionUsageLog(String intellectualPropertyExchangeOperatingSessionUsageLog) {
    this.intellectualPropertyExchangeOperatingSessionUsageLog = intellectualPropertyExchangeOperatingSessionUsageLog;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The configuration of Intellectual Property Exchange Operating Session 
   * @return intellectualPropertyExchangeOperatingSessionServiceConfiguration
  **/

  public String getIntellectualPropertyExchangeOperatingSessionServiceConfiguration() {
    return intellectualPropertyExchangeOperatingSessionServiceConfiguration;
  }

  public void setIntellectualPropertyExchangeOperatingSessionServiceConfiguration(String intellectualPropertyExchangeOperatingSessionServiceConfiguration) {
    this.intellectualPropertyExchangeOperatingSessionServiceConfiguration = intellectualPropertyExchangeOperatingSessionServiceConfiguration;
  }


}


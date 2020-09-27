package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyExchangeOperatingSessionExecuteOutputModel
 */
public class CRIntellectualPropertyExchangeOperatingSessionExecuteOutputModel   {
  private String intellectualPropertyExchangeOperatingSessionReference = null;

  private String intellectualPropertyExchangeOperatingSessionServiceProviderReference = null;

  private String intellectualPropertyExchangeOperatingSessionType = null;

  private String intellectualPropertyExchangeOperatingSessionServiceProviderSchedule = null;

  private String intellectualPropertyExchangeOperatingSessionServiceType = null;

  private String intellectualPropertyExchangeOperatingSessionExecuteActionTaskReference = null;

  private Object intellectualPropertyExchangeOperatingSessionExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Intellectual Property Exchange Operating Session instance execute service call 
   * @return intellectualPropertyExchangeOperatingSessionExecuteActionTaskReference
  **/

  public String getIntellectualPropertyExchangeOperatingSessionExecuteActionTaskReference() {
    return intellectualPropertyExchangeOperatingSessionExecuteActionTaskReference;
  }

  public void setIntellectualPropertyExchangeOperatingSessionExecuteActionTaskReference(String intellectualPropertyExchangeOperatingSessionExecuteActionTaskReference) {
    this.intellectualPropertyExchangeOperatingSessionExecuteActionTaskReference = intellectualPropertyExchangeOperatingSessionExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return intellectualPropertyExchangeOperatingSessionExecuteActionTaskRecord
  **/

  public Object getIntellectualPropertyExchangeOperatingSessionExecuteActionTaskRecord() {
    return intellectualPropertyExchangeOperatingSessionExecuteActionTaskRecord;
  }

  public void setIntellectualPropertyExchangeOperatingSessionExecuteActionTaskRecord(Object intellectualPropertyExchangeOperatingSessionExecuteActionTaskRecord) {
    this.intellectualPropertyExchangeOperatingSessionExecuteActionTaskRecord = intellectualPropertyExchangeOperatingSessionExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}


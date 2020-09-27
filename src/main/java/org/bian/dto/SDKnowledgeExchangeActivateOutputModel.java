package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDKnowledgeExchangeActivateOutputModelKnowledgeExchangeServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeActivateOutputModel
 */
public class SDKnowledgeExchangeActivateOutputModel   {
  private String knowledgeExchangeActivationActionTaskReference = null;

  private Object knowledgeExchangeActivationActionTaskRecord = null;

  private String knowledgeExchangeServicingSessionReference = null;

  private Object knowledgeExchangeServicingSessionRecord = null;

  private SDKnowledgeExchangeActivateOutputModelKnowledgeExchangeServiceConfigurationRecord knowledgeExchangeServiceConfigurationRecord = null;

  private String knowledgeExchangeServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return knowledgeExchangeActivationActionTaskReference
  **/

  public String getKnowledgeExchangeActivationActionTaskReference() {
    return knowledgeExchangeActivationActionTaskReference;
  }

  public void setKnowledgeExchangeActivationActionTaskReference(String knowledgeExchangeActivationActionTaskReference) {
    this.knowledgeExchangeActivationActionTaskReference = knowledgeExchangeActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return knowledgeExchangeActivationActionTaskRecord
  **/

  public Object getKnowledgeExchangeActivationActionTaskRecord() {
    return knowledgeExchangeActivationActionTaskRecord;
  }

  public void setKnowledgeExchangeActivationActionTaskRecord(Object knowledgeExchangeActivationActionTaskRecord) {
    this.knowledgeExchangeActivationActionTaskRecord = knowledgeExchangeActivationActionTaskRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return knowledgeExchangeServicingSessionRecord
  **/

  public Object getKnowledgeExchangeServicingSessionRecord() {
    return knowledgeExchangeServicingSessionRecord;
  }

  public void setKnowledgeExchangeServicingSessionRecord(Object knowledgeExchangeServicingSessionRecord) {
    this.knowledgeExchangeServicingSessionRecord = knowledgeExchangeServicingSessionRecord;
  }


  /**
   * Get knowledgeExchangeServiceConfigurationRecord
   * @return knowledgeExchangeServiceConfigurationRecord
  **/

  public SDKnowledgeExchangeActivateOutputModelKnowledgeExchangeServiceConfigurationRecord getKnowledgeExchangeServiceConfigurationRecord() {
    return knowledgeExchangeServiceConfigurationRecord;
  }

  public void setKnowledgeExchangeServiceConfigurationRecord(SDKnowledgeExchangeActivateOutputModelKnowledgeExchangeServiceConfigurationRecord knowledgeExchangeServiceConfigurationRecord) {
    this.knowledgeExchangeServiceConfigurationRecord = knowledgeExchangeServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return knowledgeExchangeServicingSessionStatus
  **/

  public String getKnowledgeExchangeServicingSessionStatus() {
    return knowledgeExchangeServicingSessionStatus;
  }

  public void setKnowledgeExchangeServicingSessionStatus(String knowledgeExchangeServicingSessionStatus) {
    this.knowledgeExchangeServicingSessionStatus = knowledgeExchangeServicingSessionStatus;
  }


}


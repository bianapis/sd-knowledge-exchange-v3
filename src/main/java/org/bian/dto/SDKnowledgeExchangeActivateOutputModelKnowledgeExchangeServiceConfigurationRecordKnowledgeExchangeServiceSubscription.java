package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeActivateOutputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceSubscription
 */
public class SDKnowledgeExchangeActivateOutputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceSubscription   {
  private String knowledgeExchangeServiceSubscriberReference = null;

  private String knowledgeExchangeServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return knowledgeExchangeServiceSubscriberReference
  **/

  public String getKnowledgeExchangeServiceSubscriberReference() {
    return knowledgeExchangeServiceSubscriberReference;
  }

  public void setKnowledgeExchangeServiceSubscriberReference(String knowledgeExchangeServiceSubscriberReference) {
    this.knowledgeExchangeServiceSubscriberReference = knowledgeExchangeServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return knowledgeExchangeServiceSubscriberAccessProfile
  **/

  public String getKnowledgeExchangeServiceSubscriberAccessProfile() {
    return knowledgeExchangeServiceSubscriberAccessProfile;
  }

  public void setKnowledgeExchangeServiceSubscriberAccessProfile(String knowledgeExchangeServiceSubscriberAccessProfile) {
    this.knowledgeExchangeServiceSubscriberAccessProfile = knowledgeExchangeServiceSubscriberAccessProfile;
  }


}


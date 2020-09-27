package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDKnowledgeExchangeActivateInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceConfigurationSetup;
import org.bian.dto.SDKnowledgeExchangeActivateOutputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceAgreement;
import org.bian.dto.SDKnowledgeExchangeActivateOutputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeActivateOutputModelKnowledgeExchangeServiceConfigurationRecord
 */
public class SDKnowledgeExchangeActivateOutputModelKnowledgeExchangeServiceConfigurationRecord   {
  private String knowledgeExchangeServiceConfigurationSettingReference = null;

  private String knowledgeExchangeServiceConfigurationSettingDescription = null;

  private SDKnowledgeExchangeActivateInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceConfigurationSetup knowledgeExchangeServiceConfigurationSetup = null;

  private SDKnowledgeExchangeActivateOutputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceSubscription knowledgeExchangeServiceSubscription = null;

  private SDKnowledgeExchangeActivateOutputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceAgreement knowledgeExchangeServiceAgreement = null;

  private String knowledgeExchangeServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return knowledgeExchangeServiceConfigurationSettingReference
  **/

  public String getKnowledgeExchangeServiceConfigurationSettingReference() {
    return knowledgeExchangeServiceConfigurationSettingReference;
  }

  public void setKnowledgeExchangeServiceConfigurationSettingReference(String knowledgeExchangeServiceConfigurationSettingReference) {
    this.knowledgeExchangeServiceConfigurationSettingReference = knowledgeExchangeServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return knowledgeExchangeServiceConfigurationSettingDescription
  **/

  public String getKnowledgeExchangeServiceConfigurationSettingDescription() {
    return knowledgeExchangeServiceConfigurationSettingDescription;
  }

  public void setKnowledgeExchangeServiceConfigurationSettingDescription(String knowledgeExchangeServiceConfigurationSettingDescription) {
    this.knowledgeExchangeServiceConfigurationSettingDescription = knowledgeExchangeServiceConfigurationSettingDescription;
  }


  /**
   * Get knowledgeExchangeServiceConfigurationSetup
   * @return knowledgeExchangeServiceConfigurationSetup
  **/

  public SDKnowledgeExchangeActivateInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceConfigurationSetup getKnowledgeExchangeServiceConfigurationSetup() {
    return knowledgeExchangeServiceConfigurationSetup;
  }

  public void setKnowledgeExchangeServiceConfigurationSetup(SDKnowledgeExchangeActivateInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceConfigurationSetup knowledgeExchangeServiceConfigurationSetup) {
    this.knowledgeExchangeServiceConfigurationSetup = knowledgeExchangeServiceConfigurationSetup;
  }


  /**
   * Get knowledgeExchangeServiceSubscription
   * @return knowledgeExchangeServiceSubscription
  **/

  public SDKnowledgeExchangeActivateOutputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceSubscription getKnowledgeExchangeServiceSubscription() {
    return knowledgeExchangeServiceSubscription;
  }

  public void setKnowledgeExchangeServiceSubscription(SDKnowledgeExchangeActivateOutputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceSubscription knowledgeExchangeServiceSubscription) {
    this.knowledgeExchangeServiceSubscription = knowledgeExchangeServiceSubscription;
  }


  /**
   * Get knowledgeExchangeServiceAgreement
   * @return knowledgeExchangeServiceAgreement
  **/

  public SDKnowledgeExchangeActivateOutputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceAgreement getKnowledgeExchangeServiceAgreement() {
    return knowledgeExchangeServiceAgreement;
  }

  public void setKnowledgeExchangeServiceAgreement(SDKnowledgeExchangeActivateOutputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceAgreement knowledgeExchangeServiceAgreement) {
    this.knowledgeExchangeServiceAgreement = knowledgeExchangeServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return knowledgeExchangeServiceStatus
  **/

  public String getKnowledgeExchangeServiceStatus() {
    return knowledgeExchangeServiceStatus;
  }

  public void setKnowledgeExchangeServiceStatus(String knowledgeExchangeServiceStatus) {
    this.knowledgeExchangeServiceStatus = knowledgeExchangeServiceStatus;
  }


}


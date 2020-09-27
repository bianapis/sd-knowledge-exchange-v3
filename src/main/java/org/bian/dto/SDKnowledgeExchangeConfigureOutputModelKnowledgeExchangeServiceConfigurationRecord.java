package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceAgreement;
import org.bian.dto.SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceConfigurationSetup;
import org.bian.dto.SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeConfigureOutputModelKnowledgeExchangeServiceConfigurationRecord
 */
public class SDKnowledgeExchangeConfigureOutputModelKnowledgeExchangeServiceConfigurationRecord   {
  private String knowledgeExchangeServiceConfigurationSettingDescription = null;

  private SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceConfigurationSetup knowledgeExchangeServiceConfigurationSetup = null;

  private SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceSubscription knowledgeExchangeServiceSubscription = null;

  private SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceAgreement knowledgeExchangeServiceAgreement = null;

  private String knowledgeExchangeServiceStatus = null;


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

  public SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceConfigurationSetup getKnowledgeExchangeServiceConfigurationSetup() {
    return knowledgeExchangeServiceConfigurationSetup;
  }

  public void setKnowledgeExchangeServiceConfigurationSetup(SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceConfigurationSetup knowledgeExchangeServiceConfigurationSetup) {
    this.knowledgeExchangeServiceConfigurationSetup = knowledgeExchangeServiceConfigurationSetup;
  }


  /**
   * Get knowledgeExchangeServiceSubscription
   * @return knowledgeExchangeServiceSubscription
  **/

  public SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceSubscription getKnowledgeExchangeServiceSubscription() {
    return knowledgeExchangeServiceSubscription;
  }

  public void setKnowledgeExchangeServiceSubscription(SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceSubscription knowledgeExchangeServiceSubscription) {
    this.knowledgeExchangeServiceSubscription = knowledgeExchangeServiceSubscription;
  }


  /**
   * Get knowledgeExchangeServiceAgreement
   * @return knowledgeExchangeServiceAgreement
  **/

  public SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceAgreement getKnowledgeExchangeServiceAgreement() {
    return knowledgeExchangeServiceAgreement;
  }

  public void setKnowledgeExchangeServiceAgreement(SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceAgreement knowledgeExchangeServiceAgreement) {
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


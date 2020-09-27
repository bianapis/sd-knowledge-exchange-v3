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
 * SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecord
 */
public class SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecord   {
  private String knowledgeExchangeServiceConfigurationSettingReference = null;

  private String knowledgeExchangeServiceConfigurationSettingType = null;

  private SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceConfigurationSetup knowledgeExchangeServiceConfigurationSetup = null;

  private SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceSubscription knowledgeExchangeServiceSubscription = null;

  private SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceAgreement knowledgeExchangeServiceAgreement = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return knowledgeExchangeServiceConfigurationSettingType
  **/

  public String getKnowledgeExchangeServiceConfigurationSettingType() {
    return knowledgeExchangeServiceConfigurationSettingType;
  }

  public void setKnowledgeExchangeServiceConfigurationSettingType(String knowledgeExchangeServiceConfigurationSettingType) {
    this.knowledgeExchangeServiceConfigurationSettingType = knowledgeExchangeServiceConfigurationSettingType;
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


}


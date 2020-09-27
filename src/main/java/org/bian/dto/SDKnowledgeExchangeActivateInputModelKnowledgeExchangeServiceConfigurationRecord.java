package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDKnowledgeExchangeActivateInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeActivateInputModelKnowledgeExchangeServiceConfigurationRecord
 */
public class SDKnowledgeExchangeActivateInputModelKnowledgeExchangeServiceConfigurationRecord   {
  private String knowledgeExchangeServiceConfigurationSettingReference = null;

  private String knowledgeExchangeServiceConfigurationSettingType = null;

  private SDKnowledgeExchangeActivateInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceConfigurationSetup knowledgeExchangeServiceConfigurationSetup = null;


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

  public SDKnowledgeExchangeActivateInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceConfigurationSetup getKnowledgeExchangeServiceConfigurationSetup() {
    return knowledgeExchangeServiceConfigurationSetup;
  }

  public void setKnowledgeExchangeServiceConfigurationSetup(SDKnowledgeExchangeActivateInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceConfigurationSetup knowledgeExchangeServiceConfigurationSetup) {
    this.knowledgeExchangeServiceConfigurationSetup = knowledgeExchangeServiceConfigurationSetup;
  }


}


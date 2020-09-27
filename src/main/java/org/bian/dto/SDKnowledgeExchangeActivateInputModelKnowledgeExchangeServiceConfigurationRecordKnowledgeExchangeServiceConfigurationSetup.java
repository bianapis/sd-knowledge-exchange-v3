package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeActivateInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceConfigurationSetup
 */
public class SDKnowledgeExchangeActivateInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceConfigurationSetup   {
  private String knowledgeExchangeServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return knowledgeExchangeServiceConfigurationParameter
  **/

  public String getKnowledgeExchangeServiceConfigurationParameter() {
    return knowledgeExchangeServiceConfigurationParameter;
  }

  public void setKnowledgeExchangeServiceConfigurationParameter(String knowledgeExchangeServiceConfigurationParameter) {
    this.knowledgeExchangeServiceConfigurationParameter = knowledgeExchangeServiceConfigurationParameter;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceAgreement
 */
public class SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecordKnowledgeExchangeServiceAgreement   {
  private String knowledgeExchangeServiceAgreementReference = null;

  private String knowledgeExchangeServiceUserReference = null;

  private String knowledgeExchangeServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return knowledgeExchangeServiceAgreementReference
  **/

  public String getKnowledgeExchangeServiceAgreementReference() {
    return knowledgeExchangeServiceAgreementReference;
  }

  public void setKnowledgeExchangeServiceAgreementReference(String knowledgeExchangeServiceAgreementReference) {
    this.knowledgeExchangeServiceAgreementReference = knowledgeExchangeServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return knowledgeExchangeServiceUserReference
  **/

  public String getKnowledgeExchangeServiceUserReference() {
    return knowledgeExchangeServiceUserReference;
  }

  public void setKnowledgeExchangeServiceUserReference(String knowledgeExchangeServiceUserReference) {
    this.knowledgeExchangeServiceUserReference = knowledgeExchangeServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return knowledgeExchangeServiceAgreementTermsandConditions
  **/

  public String getKnowledgeExchangeServiceAgreementTermsandConditions() {
    return knowledgeExchangeServiceAgreementTermsandConditions;
  }

  public void setKnowledgeExchangeServiceAgreementTermsandConditions(String knowledgeExchangeServiceAgreementTermsandConditions) {
    this.knowledgeExchangeServiceAgreementTermsandConditions = knowledgeExchangeServiceAgreementTermsandConditions;
  }


}


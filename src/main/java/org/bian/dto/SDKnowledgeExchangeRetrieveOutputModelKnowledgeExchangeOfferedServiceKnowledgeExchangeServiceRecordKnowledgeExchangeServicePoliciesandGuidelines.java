package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedServiceKnowledgeExchangeServiceRecordKnowledgeExchangeServicePoliciesandGuidelines
 */
public class SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedServiceKnowledgeExchangeServiceRecordKnowledgeExchangeServicePoliciesandGuidelines   {
  private String knowledgeExchangeServiceEligibility = null;

  private String knowledgeExchangeServiceIntendedUses = null;

  private String knowledgeExchangeServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return knowledgeExchangeServiceEligibility
  **/

  public String getKnowledgeExchangeServiceEligibility() {
    return knowledgeExchangeServiceEligibility;
  }

  public void setKnowledgeExchangeServiceEligibility(String knowledgeExchangeServiceEligibility) {
    this.knowledgeExchangeServiceEligibility = knowledgeExchangeServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return knowledgeExchangeServiceIntendedUses
  **/

  public String getKnowledgeExchangeServiceIntendedUses() {
    return knowledgeExchangeServiceIntendedUses;
  }

  public void setKnowledgeExchangeServiceIntendedUses(String knowledgeExchangeServiceIntendedUses) {
    this.knowledgeExchangeServiceIntendedUses = knowledgeExchangeServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return knowledgeExchangeServicePricingandTerms
  **/

  public String getKnowledgeExchangeServicePricingandTerms() {
    return knowledgeExchangeServicePricingandTerms;
  }

  public void setKnowledgeExchangeServicePricingandTerms(String knowledgeExchangeServicePricingandTerms) {
    this.knowledgeExchangeServicePricingandTerms = knowledgeExchangeServicePricingandTerms;
  }


}


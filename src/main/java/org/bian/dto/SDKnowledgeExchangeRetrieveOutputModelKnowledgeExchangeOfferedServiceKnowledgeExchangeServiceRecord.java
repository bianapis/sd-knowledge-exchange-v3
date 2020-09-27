package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedServiceKnowledgeExchangeServiceRecordKnowledgeExchangeServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedServiceKnowledgeExchangeServiceRecord
 */
public class SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedServiceKnowledgeExchangeServiceRecord   {
  private String knowledgeExchangeServiceType = null;

  private String knowledgeExchangeServiceVersion = null;

  private String knowledgeExchangeServiceDescription = null;

  private SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedServiceKnowledgeExchangeServiceRecordKnowledgeExchangeServicePoliciesandGuidelines knowledgeExchangeServicePoliciesandGuidelines = null;

  private String knowledgeExchangeServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return knowledgeExchangeServiceType
  **/

  public String getKnowledgeExchangeServiceType() {
    return knowledgeExchangeServiceType;
  }

  public void setKnowledgeExchangeServiceType(String knowledgeExchangeServiceType) {
    this.knowledgeExchangeServiceType = knowledgeExchangeServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return knowledgeExchangeServiceVersion
  **/

  public String getKnowledgeExchangeServiceVersion() {
    return knowledgeExchangeServiceVersion;
  }

  public void setKnowledgeExchangeServiceVersion(String knowledgeExchangeServiceVersion) {
    this.knowledgeExchangeServiceVersion = knowledgeExchangeServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return knowledgeExchangeServiceDescription
  **/

  public String getKnowledgeExchangeServiceDescription() {
    return knowledgeExchangeServiceDescription;
  }

  public void setKnowledgeExchangeServiceDescription(String knowledgeExchangeServiceDescription) {
    this.knowledgeExchangeServiceDescription = knowledgeExchangeServiceDescription;
  }


  /**
   * Get knowledgeExchangeServicePoliciesandGuidelines
   * @return knowledgeExchangeServicePoliciesandGuidelines
  **/

  public SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedServiceKnowledgeExchangeServiceRecordKnowledgeExchangeServicePoliciesandGuidelines getKnowledgeExchangeServicePoliciesandGuidelines() {
    return knowledgeExchangeServicePoliciesandGuidelines;
  }

  public void setKnowledgeExchangeServicePoliciesandGuidelines(SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedServiceKnowledgeExchangeServiceRecordKnowledgeExchangeServicePoliciesandGuidelines knowledgeExchangeServicePoliciesandGuidelines) {
    this.knowledgeExchangeServicePoliciesandGuidelines = knowledgeExchangeServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return knowledgeExchangeServiceSchedule
  **/

  public String getKnowledgeExchangeServiceSchedule() {
    return knowledgeExchangeServiceSchedule;
  }

  public void setKnowledgeExchangeServiceSchedule(String knowledgeExchangeServiceSchedule) {
    this.knowledgeExchangeServiceSchedule = knowledgeExchangeServiceSchedule;
  }


}


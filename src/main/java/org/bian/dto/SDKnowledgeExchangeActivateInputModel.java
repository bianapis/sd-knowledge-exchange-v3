package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDKnowledgeExchangeActivateInputModelKnowledgeExchangeServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeActivateInputModel
 */
public class SDKnowledgeExchangeActivateInputModel   {
  private Object knowledgeExchangeActivationActionTaskRecord = null;

  private String knowledgeExchangeCenterReference = null;

  private String knowledgeExchangeServiceReference = null;

  private SDKnowledgeExchangeActivateInputModelKnowledgeExchangeServiceConfigurationRecord knowledgeExchangeServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return knowledgeExchangeCenterReference
  **/

  public String getKnowledgeExchangeCenterReference() {
    return knowledgeExchangeCenterReference;
  }

  public void setKnowledgeExchangeCenterReference(String knowledgeExchangeCenterReference) {
    this.knowledgeExchangeCenterReference = knowledgeExchangeCenterReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return knowledgeExchangeServiceReference
  **/

  public String getKnowledgeExchangeServiceReference() {
    return knowledgeExchangeServiceReference;
  }

  public void setKnowledgeExchangeServiceReference(String knowledgeExchangeServiceReference) {
    this.knowledgeExchangeServiceReference = knowledgeExchangeServiceReference;
  }


  /**
   * Get knowledgeExchangeServiceConfigurationRecord
   * @return knowledgeExchangeServiceConfigurationRecord
  **/

  public SDKnowledgeExchangeActivateInputModelKnowledgeExchangeServiceConfigurationRecord getKnowledgeExchangeServiceConfigurationRecord() {
    return knowledgeExchangeServiceConfigurationRecord;
  }

  public void setKnowledgeExchangeServiceConfigurationRecord(SDKnowledgeExchangeActivateInputModelKnowledgeExchangeServiceConfigurationRecord knowledgeExchangeServiceConfigurationRecord) {
    this.knowledgeExchangeServiceConfigurationRecord = knowledgeExchangeServiceConfigurationRecord;
  }


}


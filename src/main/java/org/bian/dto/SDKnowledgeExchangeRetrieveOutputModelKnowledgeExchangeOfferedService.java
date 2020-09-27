package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedServiceKnowledgeExchangeServiceRecord;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedService
 */
public class SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedService   {
  private String knowledgeExchangeServiceReference = null;

  private SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedServiceKnowledgeExchangeServiceRecord knowledgeExchangeServiceRecord = null;


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
   * Get knowledgeExchangeServiceRecord
   * @return knowledgeExchangeServiceRecord
  **/

  public SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedServiceKnowledgeExchangeServiceRecord getKnowledgeExchangeServiceRecord() {
    return knowledgeExchangeServiceRecord;
  }

  public void setKnowledgeExchangeServiceRecord(SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedServiceKnowledgeExchangeServiceRecord knowledgeExchangeServiceRecord) {
    this.knowledgeExchangeServiceRecord = knowledgeExchangeServiceRecord;
  }


}


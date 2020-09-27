package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeOfferedServiceKnowledgeExchangeServiceRecord;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeOfferedService
 */
public class SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeOfferedService   {
  private String knowledgeExchangeServiceReference = null;

  private SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeOfferedServiceKnowledgeExchangeServiceRecord knowledgeExchangeServiceRecord = null;


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

  public SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeOfferedServiceKnowledgeExchangeServiceRecord getKnowledgeExchangeServiceRecord() {
    return knowledgeExchangeServiceRecord;
  }

  public void setKnowledgeExchangeServiceRecord(SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeOfferedServiceKnowledgeExchangeServiceRecord knowledgeExchangeServiceRecord) {
    this.knowledgeExchangeServiceRecord = knowledgeExchangeServiceRecord;
  }


}


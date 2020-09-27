package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeOfferedService;
import org.bian.dto.SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeRetrieveInputModel
 */
public class SDKnowledgeExchangeRetrieveInputModel   {
  private Object knowledgeExchangeRetrieveActionTaskRecord = null;

  private String knowledgeExchangeRetrieveActionRequest = null;

  private SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecord knowledgeExchangeRetrieveActionRecord = null;

  private SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeOfferedService knowledgeExchangeOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return knowledgeExchangeRetrieveActionTaskRecord
  **/

  public Object getKnowledgeExchangeRetrieveActionTaskRecord() {
    return knowledgeExchangeRetrieveActionTaskRecord;
  }

  public void setKnowledgeExchangeRetrieveActionTaskRecord(Object knowledgeExchangeRetrieveActionTaskRecord) {
    this.knowledgeExchangeRetrieveActionTaskRecord = knowledgeExchangeRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return knowledgeExchangeRetrieveActionRequest
  **/

  public String getKnowledgeExchangeRetrieveActionRequest() {
    return knowledgeExchangeRetrieveActionRequest;
  }

  public void setKnowledgeExchangeRetrieveActionRequest(String knowledgeExchangeRetrieveActionRequest) {
    this.knowledgeExchangeRetrieveActionRequest = knowledgeExchangeRetrieveActionRequest;
  }


  /**
   * Get knowledgeExchangeRetrieveActionRecord
   * @return knowledgeExchangeRetrieveActionRecord
  **/

  public SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecord getKnowledgeExchangeRetrieveActionRecord() {
    return knowledgeExchangeRetrieveActionRecord;
  }

  public void setKnowledgeExchangeRetrieveActionRecord(SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeRetrieveActionRecord knowledgeExchangeRetrieveActionRecord) {
    this.knowledgeExchangeRetrieveActionRecord = knowledgeExchangeRetrieveActionRecord;
  }


  /**
   * Get knowledgeExchangeOfferedService
   * @return knowledgeExchangeOfferedService
  **/

  public SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeOfferedService getKnowledgeExchangeOfferedService() {
    return knowledgeExchangeOfferedService;
  }

  public void setKnowledgeExchangeOfferedService(SDKnowledgeExchangeRetrieveInputModelKnowledgeExchangeOfferedService knowledgeExchangeOfferedService) {
    this.knowledgeExchangeOfferedService = knowledgeExchangeOfferedService;
  }


}


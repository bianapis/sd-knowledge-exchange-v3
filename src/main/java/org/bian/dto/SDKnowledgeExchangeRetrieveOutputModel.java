package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedService;
import org.bian.dto.SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeRetrieveOutputModel
 */
public class SDKnowledgeExchangeRetrieveOutputModel   {
  private String knowledgeExchangeRetrieveActionTaskReference = null;

  private Object knowledgeExchangeRetrieveActionTaskRecord = null;

  private String knowledgeExchangeRetrieveActionResponse = null;

  private SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecord knowledgeExchangeRetrieveActionRecord = null;

  private SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedService knowledgeExchangeOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return knowledgeExchangeRetrieveActionTaskReference
  **/

  public String getKnowledgeExchangeRetrieveActionTaskReference() {
    return knowledgeExchangeRetrieveActionTaskReference;
  }

  public void setKnowledgeExchangeRetrieveActionTaskReference(String knowledgeExchangeRetrieveActionTaskReference) {
    this.knowledgeExchangeRetrieveActionTaskReference = knowledgeExchangeRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return knowledgeExchangeRetrieveActionResponse
  **/

  public String getKnowledgeExchangeRetrieveActionResponse() {
    return knowledgeExchangeRetrieveActionResponse;
  }

  public void setKnowledgeExchangeRetrieveActionResponse(String knowledgeExchangeRetrieveActionResponse) {
    this.knowledgeExchangeRetrieveActionResponse = knowledgeExchangeRetrieveActionResponse;
  }


  /**
   * Get knowledgeExchangeRetrieveActionRecord
   * @return knowledgeExchangeRetrieveActionRecord
  **/

  public SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecord getKnowledgeExchangeRetrieveActionRecord() {
    return knowledgeExchangeRetrieveActionRecord;
  }

  public void setKnowledgeExchangeRetrieveActionRecord(SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeRetrieveActionRecord knowledgeExchangeRetrieveActionRecord) {
    this.knowledgeExchangeRetrieveActionRecord = knowledgeExchangeRetrieveActionRecord;
  }


  /**
   * Get knowledgeExchangeOfferedService
   * @return knowledgeExchangeOfferedService
  **/

  public SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedService getKnowledgeExchangeOfferedService() {
    return knowledgeExchangeOfferedService;
  }

  public void setKnowledgeExchangeOfferedService(SDKnowledgeExchangeRetrieveOutputModelKnowledgeExchangeOfferedService knowledgeExchangeOfferedService) {
    this.knowledgeExchangeOfferedService = knowledgeExchangeOfferedService;
  }


}


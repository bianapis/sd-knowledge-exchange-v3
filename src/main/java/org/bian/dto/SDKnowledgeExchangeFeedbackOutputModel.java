package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDKnowledgeExchangeFeedbackOutputModelKnowledgeExchangeFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeFeedbackOutputModel
 */
public class SDKnowledgeExchangeFeedbackOutputModel   {
  private String knowledgeExchangeFeedbackActionTaskReference = null;

  private Object knowledgeExchangeFeedbackActionTaskRecord = null;

  private SDKnowledgeExchangeFeedbackOutputModelKnowledgeExchangeFeedbackActionRecord knowledgeExchangeFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return knowledgeExchangeFeedbackActionTaskReference
  **/

  public String getKnowledgeExchangeFeedbackActionTaskReference() {
    return knowledgeExchangeFeedbackActionTaskReference;
  }

  public void setKnowledgeExchangeFeedbackActionTaskReference(String knowledgeExchangeFeedbackActionTaskReference) {
    this.knowledgeExchangeFeedbackActionTaskReference = knowledgeExchangeFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return knowledgeExchangeFeedbackActionTaskRecord
  **/

  public Object getKnowledgeExchangeFeedbackActionTaskRecord() {
    return knowledgeExchangeFeedbackActionTaskRecord;
  }

  public void setKnowledgeExchangeFeedbackActionTaskRecord(Object knowledgeExchangeFeedbackActionTaskRecord) {
    this.knowledgeExchangeFeedbackActionTaskRecord = knowledgeExchangeFeedbackActionTaskRecord;
  }


  /**
   * Get knowledgeExchangeFeedbackActionRecord
   * @return knowledgeExchangeFeedbackActionRecord
  **/

  public SDKnowledgeExchangeFeedbackOutputModelKnowledgeExchangeFeedbackActionRecord getKnowledgeExchangeFeedbackActionRecord() {
    return knowledgeExchangeFeedbackActionRecord;
  }

  public void setKnowledgeExchangeFeedbackActionRecord(SDKnowledgeExchangeFeedbackOutputModelKnowledgeExchangeFeedbackActionRecord knowledgeExchangeFeedbackActionRecord) {
    this.knowledgeExchangeFeedbackActionRecord = knowledgeExchangeFeedbackActionRecord;
  }


}


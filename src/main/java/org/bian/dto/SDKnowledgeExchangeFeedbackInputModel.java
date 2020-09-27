package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDKnowledgeExchangeFeedbackInputModelKnowledgeExchangeFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeFeedbackInputModel
 */
public class SDKnowledgeExchangeFeedbackInputModel   {
  private Object knowledgeExchangeFeedbackActionTaskRecord = null;

  private SDKnowledgeExchangeFeedbackInputModelKnowledgeExchangeFeedbackActionRecord knowledgeExchangeFeedbackActionRecord = null;


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

  public SDKnowledgeExchangeFeedbackInputModelKnowledgeExchangeFeedbackActionRecord getKnowledgeExchangeFeedbackActionRecord() {
    return knowledgeExchangeFeedbackActionRecord;
  }

  public void setKnowledgeExchangeFeedbackActionRecord(SDKnowledgeExchangeFeedbackInputModelKnowledgeExchangeFeedbackActionRecord knowledgeExchangeFeedbackActionRecord) {
    this.knowledgeExchangeFeedbackActionRecord = knowledgeExchangeFeedbackActionRecord;
  }


}


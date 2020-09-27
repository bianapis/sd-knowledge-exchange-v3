package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDKnowledgeExchangeConfigureOutputModelKnowledgeExchangeServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeConfigureOutputModel
 */
public class SDKnowledgeExchangeConfigureOutputModel   {
  private String knowledgeExchangeConfigurationActionTaskReference = null;

  private Object knowledgeExchangeConfigurationActionTaskRecord = null;

  private SDKnowledgeExchangeConfigureOutputModelKnowledgeExchangeServiceConfigurationRecord knowledgeExchangeServiceConfigurationRecord = null;

  private String knowledgeExchangeServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return knowledgeExchangeConfigurationActionTaskReference
  **/

  public String getKnowledgeExchangeConfigurationActionTaskReference() {
    return knowledgeExchangeConfigurationActionTaskReference;
  }

  public void setKnowledgeExchangeConfigurationActionTaskReference(String knowledgeExchangeConfigurationActionTaskReference) {
    this.knowledgeExchangeConfigurationActionTaskReference = knowledgeExchangeConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return knowledgeExchangeConfigurationActionTaskRecord
  **/

  public Object getKnowledgeExchangeConfigurationActionTaskRecord() {
    return knowledgeExchangeConfigurationActionTaskRecord;
  }

  public void setKnowledgeExchangeConfigurationActionTaskRecord(Object knowledgeExchangeConfigurationActionTaskRecord) {
    this.knowledgeExchangeConfigurationActionTaskRecord = knowledgeExchangeConfigurationActionTaskRecord;
  }


  /**
   * Get knowledgeExchangeServiceConfigurationRecord
   * @return knowledgeExchangeServiceConfigurationRecord
  **/

  public SDKnowledgeExchangeConfigureOutputModelKnowledgeExchangeServiceConfigurationRecord getKnowledgeExchangeServiceConfigurationRecord() {
    return knowledgeExchangeServiceConfigurationRecord;
  }

  public void setKnowledgeExchangeServiceConfigurationRecord(SDKnowledgeExchangeConfigureOutputModelKnowledgeExchangeServiceConfigurationRecord knowledgeExchangeServiceConfigurationRecord) {
    this.knowledgeExchangeServiceConfigurationRecord = knowledgeExchangeServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return knowledgeExchangeServicingSessionStatus
  **/

  public String getKnowledgeExchangeServicingSessionStatus() {
    return knowledgeExchangeServicingSessionStatus;
  }

  public void setKnowledgeExchangeServicingSessionStatus(String knowledgeExchangeServicingSessionStatus) {
    this.knowledgeExchangeServicingSessionStatus = knowledgeExchangeServicingSessionStatus;
  }


}


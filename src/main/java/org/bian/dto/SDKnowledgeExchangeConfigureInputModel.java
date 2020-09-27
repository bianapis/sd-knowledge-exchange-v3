package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDKnowledgeExchangeConfigureInputModel
 */
public class SDKnowledgeExchangeConfigureInputModel   {
  private Object knowledgeExchangeConfigurationActionTaskRecord = null;

  private String knowledgeExchangeServicingSessionReference = null;

  private String knowledgeExchangeServiceReference = null;

  private SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecord knowledgeExchangeServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return knowledgeExchangeServicingSessionReference
  **/

  public String getKnowledgeExchangeServicingSessionReference() {
    return knowledgeExchangeServicingSessionReference;
  }

  public void setKnowledgeExchangeServicingSessionReference(String knowledgeExchangeServicingSessionReference) {
    this.knowledgeExchangeServicingSessionReference = knowledgeExchangeServicingSessionReference;
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

  public SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecord getKnowledgeExchangeServiceConfigurationRecord() {
    return knowledgeExchangeServiceConfigurationRecord;
  }

  public void setKnowledgeExchangeServiceConfigurationRecord(SDKnowledgeExchangeConfigureInputModelKnowledgeExchangeServiceConfigurationRecord knowledgeExchangeServiceConfigurationRecord) {
    this.knowledgeExchangeServiceConfigurationRecord = knowledgeExchangeServiceConfigurationRecord;
  }


}


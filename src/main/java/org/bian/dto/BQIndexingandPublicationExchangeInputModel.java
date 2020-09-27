package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIntellectualPropertyExchangeOperatingSessionExchangeInputModelIntellectualPropertyExchangeOperatingSessionExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQIndexingandPublicationExchangeInputModel
 */
public class BQIndexingandPublicationExchangeInputModel   {
  private String intellectualPropertyExchangeOperatingSessionInstanceReference = null;

  private String indexingandPublicationInstanceReference = null;

  private String indexingandPublicationPreconditions = null;

  private String indexingandPublicationFunctionSchedule = null;

  private String contentIndexingandPublication = null;

  private String contentIndexingandPublicationServiceType = null;

  private String contentIndexingandPublicationServiceDescription = null;

  private String contentIndexingandPublicationServiceInputsandOuputs = null;

  private String contentIndexingandPublicationServiceWorkProduct = null;

  private String contentIndexingandPublicationServiceName = null;

  private Object indexingandPublicationExchangeActionTaskRecord = null;

  private CRIntellectualPropertyExchangeOperatingSessionExchangeInputModelIntellectualPropertyExchangeOperatingSessionExchangeActionRequest indexingandPublicationExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Intellectual Property Exchange Operating Session instance 
   * @return intellectualPropertyExchangeOperatingSessionInstanceReference
  **/

  public String getIntellectualPropertyExchangeOperatingSessionInstanceReference() {
    return intellectualPropertyExchangeOperatingSessionInstanceReference;
  }

  public void setIntellectualPropertyExchangeOperatingSessionInstanceReference(String intellectualPropertyExchangeOperatingSessionInstanceReference) {
    this.intellectualPropertyExchangeOperatingSessionInstanceReference = intellectualPropertyExchangeOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Indexing and Publication instance 
   * @return indexingandPublicationInstanceReference
  **/

  public String getIndexingandPublicationInstanceReference() {
    return indexingandPublicationInstanceReference;
  }

  public void setIndexingandPublicationInstanceReference(String indexingandPublicationInstanceReference) {
    this.indexingandPublicationInstanceReference = indexingandPublicationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the invocation of the feature 
   * @return indexingandPublicationPreconditions
  **/

  public String getIndexingandPublicationPreconditions() {
    return indexingandPublicationPreconditions;
  }

  public void setIndexingandPublicationPreconditions(String indexingandPublicationPreconditions) {
    this.indexingandPublicationPreconditions = indexingandPublicationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the function 
   * @return indexingandPublicationFunctionSchedule
  **/

  public String getIndexingandPublicationFunctionSchedule() {
    return indexingandPublicationFunctionSchedule;
  }

  public void setIndexingandPublicationFunctionSchedule(String indexingandPublicationFunctionSchedule) {
    this.indexingandPublicationFunctionSchedule = indexingandPublicationFunctionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Intellectual Property Exchange Operating Session specific Business Service 
   * @return contentIndexingandPublication
  **/

  public String getContentIndexingandPublication() {
    return contentIndexingandPublication;
  }

  public void setContentIndexingandPublication(String contentIndexingandPublication) {
    this.contentIndexingandPublication = contentIndexingandPublication;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return contentIndexingandPublicationServiceType
  **/

  public String getContentIndexingandPublicationServiceType() {
    return contentIndexingandPublicationServiceType;
  }

  public void setContentIndexingandPublicationServiceType(String contentIndexingandPublicationServiceType) {
    this.contentIndexingandPublicationServiceType = contentIndexingandPublicationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return contentIndexingandPublicationServiceDescription
  **/

  public String getContentIndexingandPublicationServiceDescription() {
    return contentIndexingandPublicationServiceDescription;
  }

  public void setContentIndexingandPublicationServiceDescription(String contentIndexingandPublicationServiceDescription) {
    this.contentIndexingandPublicationServiceDescription = contentIndexingandPublicationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return contentIndexingandPublicationServiceInputsandOuputs
  **/

  public String getContentIndexingandPublicationServiceInputsandOuputs() {
    return contentIndexingandPublicationServiceInputsandOuputs;
  }

  public void setContentIndexingandPublicationServiceInputsandOuputs(String contentIndexingandPublicationServiceInputsandOuputs) {
    this.contentIndexingandPublicationServiceInputsandOuputs = contentIndexingandPublicationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return contentIndexingandPublicationServiceWorkProduct
  **/

  public String getContentIndexingandPublicationServiceWorkProduct() {
    return contentIndexingandPublicationServiceWorkProduct;
  }

  public void setContentIndexingandPublicationServiceWorkProduct(String contentIndexingandPublicationServiceWorkProduct) {
    this.contentIndexingandPublicationServiceWorkProduct = contentIndexingandPublicationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return contentIndexingandPublicationServiceName
  **/

  public String getContentIndexingandPublicationServiceName() {
    return contentIndexingandPublicationServiceName;
  }

  public void setContentIndexingandPublicationServiceName(String contentIndexingandPublicationServiceName) {
    this.contentIndexingandPublicationServiceName = contentIndexingandPublicationServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return indexingandPublicationExchangeActionTaskRecord
  **/

  public Object getIndexingandPublicationExchangeActionTaskRecord() {
    return indexingandPublicationExchangeActionTaskRecord;
  }

  public void setIndexingandPublicationExchangeActionTaskRecord(Object indexingandPublicationExchangeActionTaskRecord) {
    this.indexingandPublicationExchangeActionTaskRecord = indexingandPublicationExchangeActionTaskRecord;
  }


  /**
   * Get indexingandPublicationExchangeActionRequest
   * @return indexingandPublicationExchangeActionRequest
  **/

  public CRIntellectualPropertyExchangeOperatingSessionExchangeInputModelIntellectualPropertyExchangeOperatingSessionExchangeActionRequest getIndexingandPublicationExchangeActionRequest() {
    return indexingandPublicationExchangeActionRequest;
  }

  public void setIndexingandPublicationExchangeActionRequest(CRIntellectualPropertyExchangeOperatingSessionExchangeInputModelIntellectualPropertyExchangeOperatingSessionExchangeActionRequest indexingandPublicationExchangeActionRequest) {
    this.indexingandPublicationExchangeActionRequest = indexingandPublicationExchangeActionRequest;
  }


}


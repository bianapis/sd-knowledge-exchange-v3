package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIndexingandPublicationExchangeOutputModel
 */
public class BQIndexingandPublicationExchangeOutputModel   {
  private String indexingandPublicationPreconditions = null;

  private String indexingandPublicationFunctionSchedule = null;

  private String contentIndexingandPublication = null;

  private String contentIndexingandPublicationServiceType = null;

  private String contentIndexingandPublicationServiceDescription = null;

  private String contentIndexingandPublicationServiceInputsandOuputs = null;

  private String contentIndexingandPublicationServiceWorkProduct = null;

  private String contentIndexingandPublicationServiceName = null;

  private String indexingandPublicationExchangeActionTaskReference = null;

  private Object indexingandPublicationExchangeActionTaskRecord = null;

  private String indexingandPublicationExchangeActionResponse = null;

  private String indexingandPublicationInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Indexing and Publication instance exchange service call 
   * @return indexingandPublicationExchangeActionTaskReference
  **/

  public String getIndexingandPublicationExchangeActionTaskReference() {
    return indexingandPublicationExchangeActionTaskReference;
  }

  public void setIndexingandPublicationExchangeActionTaskReference(String indexingandPublicationExchangeActionTaskReference) {
    this.indexingandPublicationExchangeActionTaskReference = indexingandPublicationExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return indexingandPublicationExchangeActionResponse
  **/

  public String getIndexingandPublicationExchangeActionResponse() {
    return indexingandPublicationExchangeActionResponse;
  }

  public void setIndexingandPublicationExchangeActionResponse(String indexingandPublicationExchangeActionResponse) {
    this.indexingandPublicationExchangeActionResponse = indexingandPublicationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Indexing and Publication instance (e.g. accepted, rejected, verified) 
   * @return indexingandPublicationInstanceStatus
  **/

  public String getIndexingandPublicationInstanceStatus() {
    return indexingandPublicationInstanceStatus;
  }

  public void setIndexingandPublicationInstanceStatus(String indexingandPublicationInstanceStatus) {
    this.indexingandPublicationInstanceStatus = indexingandPublicationInstanceStatus;
  }


}


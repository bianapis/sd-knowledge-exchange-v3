package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIntellectualPropertyExchangeOperatingSessionExchangeInputModelIntellectualPropertyExchangeOperatingSessionExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQReviewRefinementandEditingExchangeInputModel
 */
public class BQReviewRefinementandEditingExchangeInputModel   {
  private String intellectualPropertyExchangeOperatingSessionInstanceReference = null;

  private String reviewRefinementandEditingInstanceReference = null;

  private String reviewRefinementandEditingPreconditions = null;

  private String reviewRefinementandEditingFunctionSchedule = null;

  private String contentReviewRefinementandEditing = null;

  private String contentReviewRefinementandEditingServiceType = null;

  private String contentReviewRefinementandEditingServiceDescription = null;

  private String contentReviewRefinementandEditingServiceInputsandOuputs = null;

  private String contentReviewRefinementandEditingServiceWorkProduct = null;

  private String contentReviewRefinementandEditingServiceName = null;

  private Object reviewRefinementandEditingExchangeActionTaskRecord = null;

  private CRIntellectualPropertyExchangeOperatingSessionExchangeInputModelIntellectualPropertyExchangeOperatingSessionExchangeActionRequest reviewRefinementandEditingExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Review Refinement and Editing instance 
   * @return reviewRefinementandEditingInstanceReference
  **/

  public String getReviewRefinementandEditingInstanceReference() {
    return reviewRefinementandEditingInstanceReference;
  }

  public void setReviewRefinementandEditingInstanceReference(String reviewRefinementandEditingInstanceReference) {
    this.reviewRefinementandEditingInstanceReference = reviewRefinementandEditingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the invocation of the feature 
   * @return reviewRefinementandEditingPreconditions
  **/

  public String getReviewRefinementandEditingPreconditions() {
    return reviewRefinementandEditingPreconditions;
  }

  public void setReviewRefinementandEditingPreconditions(String reviewRefinementandEditingPreconditions) {
    this.reviewRefinementandEditingPreconditions = reviewRefinementandEditingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the function 
   * @return reviewRefinementandEditingFunctionSchedule
  **/

  public String getReviewRefinementandEditingFunctionSchedule() {
    return reviewRefinementandEditingFunctionSchedule;
  }

  public void setReviewRefinementandEditingFunctionSchedule(String reviewRefinementandEditingFunctionSchedule) {
    this.reviewRefinementandEditingFunctionSchedule = reviewRefinementandEditingFunctionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Intellectual Property Exchange Operating Session specific Business Service 
   * @return contentReviewRefinementandEditing
  **/

  public String getContentReviewRefinementandEditing() {
    return contentReviewRefinementandEditing;
  }

  public void setContentReviewRefinementandEditing(String contentReviewRefinementandEditing) {
    this.contentReviewRefinementandEditing = contentReviewRefinementandEditing;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return contentReviewRefinementandEditingServiceType
  **/

  public String getContentReviewRefinementandEditingServiceType() {
    return contentReviewRefinementandEditingServiceType;
  }

  public void setContentReviewRefinementandEditingServiceType(String contentReviewRefinementandEditingServiceType) {
    this.contentReviewRefinementandEditingServiceType = contentReviewRefinementandEditingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return contentReviewRefinementandEditingServiceDescription
  **/

  public String getContentReviewRefinementandEditingServiceDescription() {
    return contentReviewRefinementandEditingServiceDescription;
  }

  public void setContentReviewRefinementandEditingServiceDescription(String contentReviewRefinementandEditingServiceDescription) {
    this.contentReviewRefinementandEditingServiceDescription = contentReviewRefinementandEditingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return contentReviewRefinementandEditingServiceInputsandOuputs
  **/

  public String getContentReviewRefinementandEditingServiceInputsandOuputs() {
    return contentReviewRefinementandEditingServiceInputsandOuputs;
  }

  public void setContentReviewRefinementandEditingServiceInputsandOuputs(String contentReviewRefinementandEditingServiceInputsandOuputs) {
    this.contentReviewRefinementandEditingServiceInputsandOuputs = contentReviewRefinementandEditingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return contentReviewRefinementandEditingServiceWorkProduct
  **/

  public String getContentReviewRefinementandEditingServiceWorkProduct() {
    return contentReviewRefinementandEditingServiceWorkProduct;
  }

  public void setContentReviewRefinementandEditingServiceWorkProduct(String contentReviewRefinementandEditingServiceWorkProduct) {
    this.contentReviewRefinementandEditingServiceWorkProduct = contentReviewRefinementandEditingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return contentReviewRefinementandEditingServiceName
  **/

  public String getContentReviewRefinementandEditingServiceName() {
    return contentReviewRefinementandEditingServiceName;
  }

  public void setContentReviewRefinementandEditingServiceName(String contentReviewRefinementandEditingServiceName) {
    this.contentReviewRefinementandEditingServiceName = contentReviewRefinementandEditingServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return reviewRefinementandEditingExchangeActionTaskRecord
  **/

  public Object getReviewRefinementandEditingExchangeActionTaskRecord() {
    return reviewRefinementandEditingExchangeActionTaskRecord;
  }

  public void setReviewRefinementandEditingExchangeActionTaskRecord(Object reviewRefinementandEditingExchangeActionTaskRecord) {
    this.reviewRefinementandEditingExchangeActionTaskRecord = reviewRefinementandEditingExchangeActionTaskRecord;
  }


  /**
   * Get reviewRefinementandEditingExchangeActionRequest
   * @return reviewRefinementandEditingExchangeActionRequest
  **/

  public CRIntellectualPropertyExchangeOperatingSessionExchangeInputModelIntellectualPropertyExchangeOperatingSessionExchangeActionRequest getReviewRefinementandEditingExchangeActionRequest() {
    return reviewRefinementandEditingExchangeActionRequest;
  }

  public void setReviewRefinementandEditingExchangeActionRequest(CRIntellectualPropertyExchangeOperatingSessionExchangeInputModelIntellectualPropertyExchangeOperatingSessionExchangeActionRequest reviewRefinementandEditingExchangeActionRequest) {
    this.reviewRefinementandEditingExchangeActionRequest = reviewRefinementandEditingExchangeActionRequest;
  }


}


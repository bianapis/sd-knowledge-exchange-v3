package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReviewRefinementandEditingUpdateOutputModel
 */
public class BQReviewRefinementandEditingUpdateOutputModel   {
  private String reviewRefinementandEditingPreconditions = null;

  private String reviewRefinementandEditingFunctionSchedule = null;

  private String contentReviewRefinementandEditing = null;

  private String contentReviewRefinementandEditingServiceType = null;

  private String contentReviewRefinementandEditingServiceDescription = null;

  private String contentReviewRefinementandEditingServiceInputsandOuputs = null;

  private String contentReviewRefinementandEditingServiceWorkProduct = null;

  private String contentReviewRefinementandEditingServiceName = null;

  private String reviewRefinementandEditingUpdateActionTaskReference = null;

  private Object reviewRefinementandEditingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return reviewRefinementandEditingUpdateActionTaskReference
  **/

  public String getReviewRefinementandEditingUpdateActionTaskReference() {
    return reviewRefinementandEditingUpdateActionTaskReference;
  }

  public void setReviewRefinementandEditingUpdateActionTaskReference(String reviewRefinementandEditingUpdateActionTaskReference) {
    this.reviewRefinementandEditingUpdateActionTaskReference = reviewRefinementandEditingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return reviewRefinementandEditingUpdateActionTaskRecord
  **/

  public Object getReviewRefinementandEditingUpdateActionTaskRecord() {
    return reviewRefinementandEditingUpdateActionTaskRecord;
  }

  public void setReviewRefinementandEditingUpdateActionTaskRecord(Object reviewRefinementandEditingUpdateActionTaskRecord) {
    this.reviewRefinementandEditingUpdateActionTaskRecord = reviewRefinementandEditingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaptureandClassificationInitiateOutputModel
 */
public class BQCaptureandClassificationInitiateOutputModel   {
  private String captureandClassificationInstanceReference = null;

  private String captureandClassificationInitiateActionReference = null;

  private Object captureandClassificationInitiateActionRecord = null;

  private String captureandClassificationInstanceStatus = null;

  private String captureandClassificationPreconditions = null;

  private String captureandClassificationFunctionSchedule = null;

  private String contentCaptureandClassification = null;

  private String contentCaptureandClassificationServiceType = null;

  private String contentCaptureandClassificationServiceDescription = null;

  private String contentCaptureandClassificationServiceInputsandOuputs = null;

  private String contentCaptureandClassificationServiceWorkProduct = null;

  private String contentCaptureandClassificationServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Capture and Classification instance 
   * @return captureandClassificationInstanceReference
  **/

  public String getCaptureandClassificationInstanceReference() {
    return captureandClassificationInstanceReference;
  }

  public void setCaptureandClassificationInstanceReference(String captureandClassificationInstanceReference) {
    this.captureandClassificationInstanceReference = captureandClassificationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return captureandClassificationInitiateActionReference
  **/

  public String getCaptureandClassificationInitiateActionReference() {
    return captureandClassificationInitiateActionReference;
  }

  public void setCaptureandClassificationInitiateActionReference(String captureandClassificationInitiateActionReference) {
    this.captureandClassificationInitiateActionReference = captureandClassificationInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return captureandClassificationInitiateActionRecord
  **/

  public Object getCaptureandClassificationInitiateActionRecord() {
    return captureandClassificationInitiateActionRecord;
  }

  public void setCaptureandClassificationInitiateActionRecord(Object captureandClassificationInitiateActionRecord) {
    this.captureandClassificationInitiateActionRecord = captureandClassificationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Capture and Classification instance (e.g. initialised, pending, active) 
   * @return captureandClassificationInstanceStatus
  **/

  public String getCaptureandClassificationInstanceStatus() {
    return captureandClassificationInstanceStatus;
  }

  public void setCaptureandClassificationInstanceStatus(String captureandClassificationInstanceStatus) {
    this.captureandClassificationInstanceStatus = captureandClassificationInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the invocation of the feature 
   * @return captureandClassificationPreconditions
  **/

  public String getCaptureandClassificationPreconditions() {
    return captureandClassificationPreconditions;
  }

  public void setCaptureandClassificationPreconditions(String captureandClassificationPreconditions) {
    this.captureandClassificationPreconditions = captureandClassificationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the function 
   * @return captureandClassificationFunctionSchedule
  **/

  public String getCaptureandClassificationFunctionSchedule() {
    return captureandClassificationFunctionSchedule;
  }

  public void setCaptureandClassificationFunctionSchedule(String captureandClassificationFunctionSchedule) {
    this.captureandClassificationFunctionSchedule = captureandClassificationFunctionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Intellectual Property Exchange Operating Session specific Business Service 
   * @return contentCaptureandClassification
  **/

  public String getContentCaptureandClassification() {
    return contentCaptureandClassification;
  }

  public void setContentCaptureandClassification(String contentCaptureandClassification) {
    this.contentCaptureandClassification = contentCaptureandClassification;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return contentCaptureandClassificationServiceType
  **/

  public String getContentCaptureandClassificationServiceType() {
    return contentCaptureandClassificationServiceType;
  }

  public void setContentCaptureandClassificationServiceType(String contentCaptureandClassificationServiceType) {
    this.contentCaptureandClassificationServiceType = contentCaptureandClassificationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return contentCaptureandClassificationServiceDescription
  **/

  public String getContentCaptureandClassificationServiceDescription() {
    return contentCaptureandClassificationServiceDescription;
  }

  public void setContentCaptureandClassificationServiceDescription(String contentCaptureandClassificationServiceDescription) {
    this.contentCaptureandClassificationServiceDescription = contentCaptureandClassificationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return contentCaptureandClassificationServiceInputsandOuputs
  **/

  public String getContentCaptureandClassificationServiceInputsandOuputs() {
    return contentCaptureandClassificationServiceInputsandOuputs;
  }

  public void setContentCaptureandClassificationServiceInputsandOuputs(String contentCaptureandClassificationServiceInputsandOuputs) {
    this.contentCaptureandClassificationServiceInputsandOuputs = contentCaptureandClassificationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return contentCaptureandClassificationServiceWorkProduct
  **/

  public String getContentCaptureandClassificationServiceWorkProduct() {
    return contentCaptureandClassificationServiceWorkProduct;
  }

  public void setContentCaptureandClassificationServiceWorkProduct(String contentCaptureandClassificationServiceWorkProduct) {
    this.contentCaptureandClassificationServiceWorkProduct = contentCaptureandClassificationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return contentCaptureandClassificationServiceName
  **/

  public String getContentCaptureandClassificationServiceName() {
    return contentCaptureandClassificationServiceName;
  }

  public void setContentCaptureandClassificationServiceName(String contentCaptureandClassificationServiceName) {
    this.contentCaptureandClassificationServiceName = contentCaptureandClassificationServiceName;
  }


}


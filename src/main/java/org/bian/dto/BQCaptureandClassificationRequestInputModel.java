package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIntellectualPropertyExchangeOperatingSessionRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQCaptureandClassificationRequestInputModel
 */
public class BQCaptureandClassificationRequestInputModel   {
  private String intellectualPropertyExchangeOperatingSessionInstanceReference = null;

  private String captureandClassificationInstanceReference = null;

  private String captureandClassificationPreconditions = null;

  private String captureandClassificationFunctionSchedule = null;

  private String contentCaptureandClassification = null;

  private String contentCaptureandClassificationServiceType = null;

  private String contentCaptureandClassificationServiceDescription = null;

  private String contentCaptureandClassificationServiceInputsandOuputs = null;

  private String contentCaptureandClassificationServiceWorkProduct = null;

  private String contentCaptureandClassificationServiceName = null;

  private Object captureandClassificationRequestActionTaskRecord = null;

  private CRIntellectualPropertyExchangeOperatingSessionRequestInputModelRequestRecordType requestRecordType = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return captureandClassificationRequestActionTaskRecord
  **/

  public Object getCaptureandClassificationRequestActionTaskRecord() {
    return captureandClassificationRequestActionTaskRecord;
  }

  public void setCaptureandClassificationRequestActionTaskRecord(Object captureandClassificationRequestActionTaskRecord) {
    this.captureandClassificationRequestActionTaskRecord = captureandClassificationRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRIntellectualPropertyExchangeOperatingSessionRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRIntellectualPropertyExchangeOperatingSessionRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}


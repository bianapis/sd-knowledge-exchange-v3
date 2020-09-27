package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaptureandClassificationRetrieveOutputModelCaptureandClassificationInstanceAnalysis;
import org.bian.dto.BQCaptureandClassificationRetrieveOutputModelCaptureandClassificationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCaptureandClassificationRetrieveOutputModel
 */
public class BQCaptureandClassificationRetrieveOutputModel   {
  private String captureandClassificationPreconditions = null;

  private String captureandClassificationFunctionSchedule = null;

  private String contentCaptureandClassification = null;

  private String contentCaptureandClassificationServiceType = null;

  private String contentCaptureandClassificationServiceDescription = null;

  private String contentCaptureandClassificationServiceInputsandOuputs = null;

  private String contentCaptureandClassificationServiceWorkProduct = null;

  private String contentCaptureandClassificationServiceName = null;

  private String captureandClassificationRetrieveActionTaskReference = null;

  private Object captureandClassificationRetrieveActionTaskRecord = null;

  private String captureandClassificationRetrieveActionResponse = null;

  private BQCaptureandClassificationRetrieveOutputModelCaptureandClassificationInstanceReport captureandClassificationInstanceReport = null;

  private BQCaptureandClassificationRetrieveOutputModelCaptureandClassificationInstanceAnalysis captureandClassificationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Capture and Classification instance retrieve service call 
   * @return captureandClassificationRetrieveActionTaskReference
  **/

  public String getCaptureandClassificationRetrieveActionTaskReference() {
    return captureandClassificationRetrieveActionTaskReference;
  }

  public void setCaptureandClassificationRetrieveActionTaskReference(String captureandClassificationRetrieveActionTaskReference) {
    this.captureandClassificationRetrieveActionTaskReference = captureandClassificationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return captureandClassificationRetrieveActionTaskRecord
  **/

  public Object getCaptureandClassificationRetrieveActionTaskRecord() {
    return captureandClassificationRetrieveActionTaskRecord;
  }

  public void setCaptureandClassificationRetrieveActionTaskRecord(Object captureandClassificationRetrieveActionTaskRecord) {
    this.captureandClassificationRetrieveActionTaskRecord = captureandClassificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return captureandClassificationRetrieveActionResponse
  **/

  public String getCaptureandClassificationRetrieveActionResponse() {
    return captureandClassificationRetrieveActionResponse;
  }

  public void setCaptureandClassificationRetrieveActionResponse(String captureandClassificationRetrieveActionResponse) {
    this.captureandClassificationRetrieveActionResponse = captureandClassificationRetrieveActionResponse;
  }


  /**
   * Get captureandClassificationInstanceReport
   * @return captureandClassificationInstanceReport
  **/

  public BQCaptureandClassificationRetrieveOutputModelCaptureandClassificationInstanceReport getCaptureandClassificationInstanceReport() {
    return captureandClassificationInstanceReport;
  }

  public void setCaptureandClassificationInstanceReport(BQCaptureandClassificationRetrieveOutputModelCaptureandClassificationInstanceReport captureandClassificationInstanceReport) {
    this.captureandClassificationInstanceReport = captureandClassificationInstanceReport;
  }


  /**
   * Get captureandClassificationInstanceAnalysis
   * @return captureandClassificationInstanceAnalysis
  **/

  public BQCaptureandClassificationRetrieveOutputModelCaptureandClassificationInstanceAnalysis getCaptureandClassificationInstanceAnalysis() {
    return captureandClassificationInstanceAnalysis;
  }

  public void setCaptureandClassificationInstanceAnalysis(BQCaptureandClassificationRetrieveOutputModelCaptureandClassificationInstanceAnalysis captureandClassificationInstanceAnalysis) {
    this.captureandClassificationInstanceAnalysis = captureandClassificationInstanceAnalysis;
  }


}


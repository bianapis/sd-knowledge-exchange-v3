package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQArchivingRetrieveOutputModelArchivingInstanceAnalysis;
import org.bian.dto.BQArchivingRetrieveOutputModelArchivingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQArchivingRetrieveOutputModel
 */
public class BQArchivingRetrieveOutputModel   {
  private String archivingPreconditions = null;

  private String archivingFunctionSchedule = null;

  private String contentArchiving = null;

  private String contentArchivingServiceType = null;

  private String contentArchivingServiceDescription = null;

  private String contentArchivingServiceInputsandOuputs = null;

  private String contentArchivingServiceWorkProduct = null;

  private String contentArchivingServiceName = null;

  private String archivingRetrieveActionTaskReference = null;

  private Object archivingRetrieveActionTaskRecord = null;

  private String archivingRetrieveActionResponse = null;

  private BQArchivingRetrieveOutputModelArchivingInstanceReport archivingInstanceReport = null;

  private BQArchivingRetrieveOutputModelArchivingInstanceAnalysis archivingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the invocation of the feature 
   * @return archivingPreconditions
  **/

  public String getArchivingPreconditions() {
    return archivingPreconditions;
  }

  public void setArchivingPreconditions(String archivingPreconditions) {
    this.archivingPreconditions = archivingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the function 
   * @return archivingFunctionSchedule
  **/

  public String getArchivingFunctionSchedule() {
    return archivingFunctionSchedule;
  }

  public void setArchivingFunctionSchedule(String archivingFunctionSchedule) {
    this.archivingFunctionSchedule = archivingFunctionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Intellectual Property Exchange Operating Session specific Business Service 
   * @return contentArchiving
  **/

  public String getContentArchiving() {
    return contentArchiving;
  }

  public void setContentArchiving(String contentArchiving) {
    this.contentArchiving = contentArchiving;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return contentArchivingServiceType
  **/

  public String getContentArchivingServiceType() {
    return contentArchivingServiceType;
  }

  public void setContentArchivingServiceType(String contentArchivingServiceType) {
    this.contentArchivingServiceType = contentArchivingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return contentArchivingServiceDescription
  **/

  public String getContentArchivingServiceDescription() {
    return contentArchivingServiceDescription;
  }

  public void setContentArchivingServiceDescription(String contentArchivingServiceDescription) {
    this.contentArchivingServiceDescription = contentArchivingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return contentArchivingServiceInputsandOuputs
  **/

  public String getContentArchivingServiceInputsandOuputs() {
    return contentArchivingServiceInputsandOuputs;
  }

  public void setContentArchivingServiceInputsandOuputs(String contentArchivingServiceInputsandOuputs) {
    this.contentArchivingServiceInputsandOuputs = contentArchivingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return contentArchivingServiceWorkProduct
  **/

  public String getContentArchivingServiceWorkProduct() {
    return contentArchivingServiceWorkProduct;
  }

  public void setContentArchivingServiceWorkProduct(String contentArchivingServiceWorkProduct) {
    this.contentArchivingServiceWorkProduct = contentArchivingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return contentArchivingServiceName
  **/

  public String getContentArchivingServiceName() {
    return contentArchivingServiceName;
  }

  public void setContentArchivingServiceName(String contentArchivingServiceName) {
    this.contentArchivingServiceName = contentArchivingServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Archiving instance retrieve service call 
   * @return archivingRetrieveActionTaskReference
  **/

  public String getArchivingRetrieveActionTaskReference() {
    return archivingRetrieveActionTaskReference;
  }

  public void setArchivingRetrieveActionTaskReference(String archivingRetrieveActionTaskReference) {
    this.archivingRetrieveActionTaskReference = archivingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return archivingRetrieveActionTaskRecord
  **/

  public Object getArchivingRetrieveActionTaskRecord() {
    return archivingRetrieveActionTaskRecord;
  }

  public void setArchivingRetrieveActionTaskRecord(Object archivingRetrieveActionTaskRecord) {
    this.archivingRetrieveActionTaskRecord = archivingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return archivingRetrieveActionResponse
  **/

  public String getArchivingRetrieveActionResponse() {
    return archivingRetrieveActionResponse;
  }

  public void setArchivingRetrieveActionResponse(String archivingRetrieveActionResponse) {
    this.archivingRetrieveActionResponse = archivingRetrieveActionResponse;
  }


  /**
   * Get archivingInstanceReport
   * @return archivingInstanceReport
  **/

  public BQArchivingRetrieveOutputModelArchivingInstanceReport getArchivingInstanceReport() {
    return archivingInstanceReport;
  }

  public void setArchivingInstanceReport(BQArchivingRetrieveOutputModelArchivingInstanceReport archivingInstanceReport) {
    this.archivingInstanceReport = archivingInstanceReport;
  }


  /**
   * Get archivingInstanceAnalysis
   * @return archivingInstanceAnalysis
  **/

  public BQArchivingRetrieveOutputModelArchivingInstanceAnalysis getArchivingInstanceAnalysis() {
    return archivingInstanceAnalysis;
  }

  public void setArchivingInstanceAnalysis(BQArchivingRetrieveOutputModelArchivingInstanceAnalysis archivingInstanceAnalysis) {
    this.archivingInstanceAnalysis = archivingInstanceAnalysis;
  }


}


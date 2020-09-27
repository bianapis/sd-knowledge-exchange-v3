package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceandAccessAdministrationRetrieveOutputModelMaintenanceandAccessAdministrationInstanceAnalysis;
import org.bian.dto.BQMaintenanceandAccessAdministrationRetrieveOutputModelMaintenanceandAccessAdministrationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMaintenanceandAccessAdministrationRetrieveOutputModel
 */
public class BQMaintenanceandAccessAdministrationRetrieveOutputModel   {
  private String maintenanceandAccessAdministrationPreconditions = null;

  private String maintenanceandAccessAdministrationFunctionSchedule = null;

  private String contentMaintenanceandAccessAdministration = null;

  private String contentMaintenanceandAccessAdministrationServiceType = null;

  private String contentMaintenanceandAccessAdministrationServiceDescription = null;

  private String contentMaintenanceandAccessAdministrationServiceInputsandOuputs = null;

  private String contentMaintenanceandAccessAdministrationServiceWorkProduct = null;

  private String maintenanceandAccessAdministrationRetrieveActionTaskReference = null;

  private Object maintenanceandAccessAdministrationRetrieveActionTaskRecord = null;

  private String maintenanceandAccessAdministrationRetrieveActionResponse = null;

  private BQMaintenanceandAccessAdministrationRetrieveOutputModelMaintenanceandAccessAdministrationInstanceReport maintenanceandAccessAdministrationInstanceReport = null;

  private BQMaintenanceandAccessAdministrationRetrieveOutputModelMaintenanceandAccessAdministrationInstanceAnalysis maintenanceandAccessAdministrationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the invocation of the feature 
   * @return maintenanceandAccessAdministrationPreconditions
  **/

  public String getMaintenanceandAccessAdministrationPreconditions() {
    return maintenanceandAccessAdministrationPreconditions;
  }

  public void setMaintenanceandAccessAdministrationPreconditions(String maintenanceandAccessAdministrationPreconditions) {
    this.maintenanceandAccessAdministrationPreconditions = maintenanceandAccessAdministrationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the function 
   * @return maintenanceandAccessAdministrationFunctionSchedule
  **/

  public String getMaintenanceandAccessAdministrationFunctionSchedule() {
    return maintenanceandAccessAdministrationFunctionSchedule;
  }

  public void setMaintenanceandAccessAdministrationFunctionSchedule(String maintenanceandAccessAdministrationFunctionSchedule) {
    this.maintenanceandAccessAdministrationFunctionSchedule = maintenanceandAccessAdministrationFunctionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Intellectual Property Exchange Operating Session specific Business Service 
   * @return contentMaintenanceandAccessAdministration
  **/

  public String getContentMaintenanceandAccessAdministration() {
    return contentMaintenanceandAccessAdministration;
  }

  public void setContentMaintenanceandAccessAdministration(String contentMaintenanceandAccessAdministration) {
    this.contentMaintenanceandAccessAdministration = contentMaintenanceandAccessAdministration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return contentMaintenanceandAccessAdministrationServiceType
  **/

  public String getContentMaintenanceandAccessAdministrationServiceType() {
    return contentMaintenanceandAccessAdministrationServiceType;
  }

  public void setContentMaintenanceandAccessAdministrationServiceType(String contentMaintenanceandAccessAdministrationServiceType) {
    this.contentMaintenanceandAccessAdministrationServiceType = contentMaintenanceandAccessAdministrationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return contentMaintenanceandAccessAdministrationServiceDescription
  **/

  public String getContentMaintenanceandAccessAdministrationServiceDescription() {
    return contentMaintenanceandAccessAdministrationServiceDescription;
  }

  public void setContentMaintenanceandAccessAdministrationServiceDescription(String contentMaintenanceandAccessAdministrationServiceDescription) {
    this.contentMaintenanceandAccessAdministrationServiceDescription = contentMaintenanceandAccessAdministrationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return contentMaintenanceandAccessAdministrationServiceInputsandOuputs
  **/

  public String getContentMaintenanceandAccessAdministrationServiceInputsandOuputs() {
    return contentMaintenanceandAccessAdministrationServiceInputsandOuputs;
  }

  public void setContentMaintenanceandAccessAdministrationServiceInputsandOuputs(String contentMaintenanceandAccessAdministrationServiceInputsandOuputs) {
    this.contentMaintenanceandAccessAdministrationServiceInputsandOuputs = contentMaintenanceandAccessAdministrationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return contentMaintenanceandAccessAdministrationServiceWorkProduct
  **/

  public String getContentMaintenanceandAccessAdministrationServiceWorkProduct() {
    return contentMaintenanceandAccessAdministrationServiceWorkProduct;
  }

  public void setContentMaintenanceandAccessAdministrationServiceWorkProduct(String contentMaintenanceandAccessAdministrationServiceWorkProduct) {
    this.contentMaintenanceandAccessAdministrationServiceWorkProduct = contentMaintenanceandAccessAdministrationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Maintenance and Access Administration instance retrieve service call 
   * @return maintenanceandAccessAdministrationRetrieveActionTaskReference
  **/

  public String getMaintenanceandAccessAdministrationRetrieveActionTaskReference() {
    return maintenanceandAccessAdministrationRetrieveActionTaskReference;
  }

  public void setMaintenanceandAccessAdministrationRetrieveActionTaskReference(String maintenanceandAccessAdministrationRetrieveActionTaskReference) {
    this.maintenanceandAccessAdministrationRetrieveActionTaskReference = maintenanceandAccessAdministrationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return maintenanceandAccessAdministrationRetrieveActionTaskRecord
  **/

  public Object getMaintenanceandAccessAdministrationRetrieveActionTaskRecord() {
    return maintenanceandAccessAdministrationRetrieveActionTaskRecord;
  }

  public void setMaintenanceandAccessAdministrationRetrieveActionTaskRecord(Object maintenanceandAccessAdministrationRetrieveActionTaskRecord) {
    this.maintenanceandAccessAdministrationRetrieveActionTaskRecord = maintenanceandAccessAdministrationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return maintenanceandAccessAdministrationRetrieveActionResponse
  **/

  public String getMaintenanceandAccessAdministrationRetrieveActionResponse() {
    return maintenanceandAccessAdministrationRetrieveActionResponse;
  }

  public void setMaintenanceandAccessAdministrationRetrieveActionResponse(String maintenanceandAccessAdministrationRetrieveActionResponse) {
    this.maintenanceandAccessAdministrationRetrieveActionResponse = maintenanceandAccessAdministrationRetrieveActionResponse;
  }


  /**
   * Get maintenanceandAccessAdministrationInstanceReport
   * @return maintenanceandAccessAdministrationInstanceReport
  **/

  public BQMaintenanceandAccessAdministrationRetrieveOutputModelMaintenanceandAccessAdministrationInstanceReport getMaintenanceandAccessAdministrationInstanceReport() {
    return maintenanceandAccessAdministrationInstanceReport;
  }

  public void setMaintenanceandAccessAdministrationInstanceReport(BQMaintenanceandAccessAdministrationRetrieveOutputModelMaintenanceandAccessAdministrationInstanceReport maintenanceandAccessAdministrationInstanceReport) {
    this.maintenanceandAccessAdministrationInstanceReport = maintenanceandAccessAdministrationInstanceReport;
  }


  /**
   * Get maintenanceandAccessAdministrationInstanceAnalysis
   * @return maintenanceandAccessAdministrationInstanceAnalysis
  **/

  public BQMaintenanceandAccessAdministrationRetrieveOutputModelMaintenanceandAccessAdministrationInstanceAnalysis getMaintenanceandAccessAdministrationInstanceAnalysis() {
    return maintenanceandAccessAdministrationInstanceAnalysis;
  }

  public void setMaintenanceandAccessAdministrationInstanceAnalysis(BQMaintenanceandAccessAdministrationRetrieveOutputModelMaintenanceandAccessAdministrationInstanceAnalysis maintenanceandAccessAdministrationInstanceAnalysis) {
    this.maintenanceandAccessAdministrationInstanceAnalysis = maintenanceandAccessAdministrationInstanceAnalysis;
  }


}


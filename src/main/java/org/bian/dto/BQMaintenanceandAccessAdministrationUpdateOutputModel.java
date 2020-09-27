package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceandAccessAdministrationUpdateOutputModel
 */
public class BQMaintenanceandAccessAdministrationUpdateOutputModel   {
  private String maintenanceandAccessAdministrationPreconditions = null;

  private String maintenanceandAccessAdministrationFunctionSchedule = null;

  private String contentMaintenanceandAccessAdministration = null;

  private String contentMaintenanceandAccessAdministrationServiceType = null;

  private String contentMaintenanceandAccessAdministrationServiceDescription = null;

  private String contentMaintenanceandAccessAdministrationServiceInputsandOuputs = null;

  private String contentMaintenanceandAccessAdministrationServiceWorkProduct = null;

  private String maintenanceandAccessAdministrationUpdateActionTaskReference = null;

  private Object maintenanceandAccessAdministrationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return maintenanceandAccessAdministrationUpdateActionTaskReference
  **/

  public String getMaintenanceandAccessAdministrationUpdateActionTaskReference() {
    return maintenanceandAccessAdministrationUpdateActionTaskReference;
  }

  public void setMaintenanceandAccessAdministrationUpdateActionTaskReference(String maintenanceandAccessAdministrationUpdateActionTaskReference) {
    this.maintenanceandAccessAdministrationUpdateActionTaskReference = maintenanceandAccessAdministrationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return maintenanceandAccessAdministrationUpdateActionTaskRecord
  **/

  public Object getMaintenanceandAccessAdministrationUpdateActionTaskRecord() {
    return maintenanceandAccessAdministrationUpdateActionTaskRecord;
  }

  public void setMaintenanceandAccessAdministrationUpdateActionTaskRecord(Object maintenanceandAccessAdministrationUpdateActionTaskRecord) {
    this.maintenanceandAccessAdministrationUpdateActionTaskRecord = maintenanceandAccessAdministrationUpdateActionTaskRecord;
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


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceandAccessAdministrationRetrieveOutputModelMaintenanceandAccessAdministrationInstanceReport
 */
public class BQMaintenanceandAccessAdministrationRetrieveOutputModelMaintenanceandAccessAdministrationInstanceReport   {
  private Object maintenanceandAccessAdministrationInstanceReportRecord = null;

  private String maintenanceandAccessAdministrationInstanceReportType = null;

  private String maintenanceandAccessAdministrationInstanceReportParameters = null;

  private Object maintenanceandAccessAdministrationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return maintenanceandAccessAdministrationInstanceReportRecord
  **/

  public Object getMaintenanceandAccessAdministrationInstanceReportRecord() {
    return maintenanceandAccessAdministrationInstanceReportRecord;
  }

  public void setMaintenanceandAccessAdministrationInstanceReportRecord(Object maintenanceandAccessAdministrationInstanceReportRecord) {
    this.maintenanceandAccessAdministrationInstanceReportRecord = maintenanceandAccessAdministrationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return maintenanceandAccessAdministrationInstanceReportType
  **/

  public String getMaintenanceandAccessAdministrationInstanceReportType() {
    return maintenanceandAccessAdministrationInstanceReportType;
  }

  public void setMaintenanceandAccessAdministrationInstanceReportType(String maintenanceandAccessAdministrationInstanceReportType) {
    this.maintenanceandAccessAdministrationInstanceReportType = maintenanceandAccessAdministrationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return maintenanceandAccessAdministrationInstanceReportParameters
  **/

  public String getMaintenanceandAccessAdministrationInstanceReportParameters() {
    return maintenanceandAccessAdministrationInstanceReportParameters;
  }

  public void setMaintenanceandAccessAdministrationInstanceReportParameters(String maintenanceandAccessAdministrationInstanceReportParameters) {
    this.maintenanceandAccessAdministrationInstanceReportParameters = maintenanceandAccessAdministrationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return maintenanceandAccessAdministrationInstanceReport
  **/

  public Object getMaintenanceandAccessAdministrationInstanceReport() {
    return maintenanceandAccessAdministrationInstanceReport;
  }

  public void setMaintenanceandAccessAdministrationInstanceReport(Object maintenanceandAccessAdministrationInstanceReport) {
    this.maintenanceandAccessAdministrationInstanceReport = maintenanceandAccessAdministrationInstanceReport;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceandAccessAdministrationRetrieveOutputModelMaintenanceandAccessAdministrationInstanceAnalysis
 */
public class BQMaintenanceandAccessAdministrationRetrieveOutputModelMaintenanceandAccessAdministrationInstanceAnalysis   {
  private Object maintenanceandAccessAdministrationInstanceAnalysisRecord = null;

  private String maintenanceandAccessAdministrationInstanceAnalysisReportType = null;

  private String maintenanceandAccessAdministrationInstanceAnalysisParameters = null;

  private Object maintenanceandAccessAdministrationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return maintenanceandAccessAdministrationInstanceAnalysisRecord
  **/

  public Object getMaintenanceandAccessAdministrationInstanceAnalysisRecord() {
    return maintenanceandAccessAdministrationInstanceAnalysisRecord;
  }

  public void setMaintenanceandAccessAdministrationInstanceAnalysisRecord(Object maintenanceandAccessAdministrationInstanceAnalysisRecord) {
    this.maintenanceandAccessAdministrationInstanceAnalysisRecord = maintenanceandAccessAdministrationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return maintenanceandAccessAdministrationInstanceAnalysisReportType
  **/

  public String getMaintenanceandAccessAdministrationInstanceAnalysisReportType() {
    return maintenanceandAccessAdministrationInstanceAnalysisReportType;
  }

  public void setMaintenanceandAccessAdministrationInstanceAnalysisReportType(String maintenanceandAccessAdministrationInstanceAnalysisReportType) {
    this.maintenanceandAccessAdministrationInstanceAnalysisReportType = maintenanceandAccessAdministrationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return maintenanceandAccessAdministrationInstanceAnalysisParameters
  **/

  public String getMaintenanceandAccessAdministrationInstanceAnalysisParameters() {
    return maintenanceandAccessAdministrationInstanceAnalysisParameters;
  }

  public void setMaintenanceandAccessAdministrationInstanceAnalysisParameters(String maintenanceandAccessAdministrationInstanceAnalysisParameters) {
    this.maintenanceandAccessAdministrationInstanceAnalysisParameters = maintenanceandAccessAdministrationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return maintenanceandAccessAdministrationInstanceAnalysisReport
  **/

  public Object getMaintenanceandAccessAdministrationInstanceAnalysisReport() {
    return maintenanceandAccessAdministrationInstanceAnalysisReport;
  }

  public void setMaintenanceandAccessAdministrationInstanceAnalysisReport(Object maintenanceandAccessAdministrationInstanceAnalysisReport) {
    this.maintenanceandAccessAdministrationInstanceAnalysisReport = maintenanceandAccessAdministrationInstanceAnalysisReport;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceandAccessAdministrationRetrieveInputModelMaintenanceandAccessAdministrationInstanceAnalysis;
import org.bian.dto.BQMaintenanceandAccessAdministrationRetrieveInputModelMaintenanceandAccessAdministrationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMaintenanceandAccessAdministrationRetrieveInputModel
 */
public class BQMaintenanceandAccessAdministrationRetrieveInputModel   {
  private Object maintenanceandAccessAdministrationRetrieveActionTaskRecord = null;

  private String maintenanceandAccessAdministrationRetrieveActionRequest = null;

  private BQMaintenanceandAccessAdministrationRetrieveInputModelMaintenanceandAccessAdministrationInstanceReport maintenanceandAccessAdministrationInstanceReport = null;

  private BQMaintenanceandAccessAdministrationRetrieveInputModelMaintenanceandAccessAdministrationInstanceAnalysis maintenanceandAccessAdministrationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return maintenanceandAccessAdministrationRetrieveActionRequest
  **/

  public String getMaintenanceandAccessAdministrationRetrieveActionRequest() {
    return maintenanceandAccessAdministrationRetrieveActionRequest;
  }

  public void setMaintenanceandAccessAdministrationRetrieveActionRequest(String maintenanceandAccessAdministrationRetrieveActionRequest) {
    this.maintenanceandAccessAdministrationRetrieveActionRequest = maintenanceandAccessAdministrationRetrieveActionRequest;
  }


  /**
   * Get maintenanceandAccessAdministrationInstanceReport
   * @return maintenanceandAccessAdministrationInstanceReport
  **/

  public BQMaintenanceandAccessAdministrationRetrieveInputModelMaintenanceandAccessAdministrationInstanceReport getMaintenanceandAccessAdministrationInstanceReport() {
    return maintenanceandAccessAdministrationInstanceReport;
  }

  public void setMaintenanceandAccessAdministrationInstanceReport(BQMaintenanceandAccessAdministrationRetrieveInputModelMaintenanceandAccessAdministrationInstanceReport maintenanceandAccessAdministrationInstanceReport) {
    this.maintenanceandAccessAdministrationInstanceReport = maintenanceandAccessAdministrationInstanceReport;
  }


  /**
   * Get maintenanceandAccessAdministrationInstanceAnalysis
   * @return maintenanceandAccessAdministrationInstanceAnalysis
  **/

  public BQMaintenanceandAccessAdministrationRetrieveInputModelMaintenanceandAccessAdministrationInstanceAnalysis getMaintenanceandAccessAdministrationInstanceAnalysis() {
    return maintenanceandAccessAdministrationInstanceAnalysis;
  }

  public void setMaintenanceandAccessAdministrationInstanceAnalysis(BQMaintenanceandAccessAdministrationRetrieveInputModelMaintenanceandAccessAdministrationInstanceAnalysis maintenanceandAccessAdministrationInstanceAnalysis) {
    this.maintenanceandAccessAdministrationInstanceAnalysis = maintenanceandAccessAdministrationInstanceAnalysis;
  }


}


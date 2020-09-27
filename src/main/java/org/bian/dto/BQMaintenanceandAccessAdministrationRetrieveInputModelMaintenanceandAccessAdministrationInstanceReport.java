package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceandAccessAdministrationRetrieveInputModelMaintenanceandAccessAdministrationInstanceReport
 */
public class BQMaintenanceandAccessAdministrationRetrieveInputModelMaintenanceandAccessAdministrationInstanceReport   {
  private String maintenanceandAccessAdministrationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return maintenanceandAccessAdministrationInstanceReportReference
  **/

  public String getMaintenanceandAccessAdministrationInstanceReportReference() {
    return maintenanceandAccessAdministrationInstanceReportReference;
  }

  public void setMaintenanceandAccessAdministrationInstanceReportReference(String maintenanceandAccessAdministrationInstanceReportReference) {
    this.maintenanceandAccessAdministrationInstanceReportReference = maintenanceandAccessAdministrationInstanceReportReference;
  }


}


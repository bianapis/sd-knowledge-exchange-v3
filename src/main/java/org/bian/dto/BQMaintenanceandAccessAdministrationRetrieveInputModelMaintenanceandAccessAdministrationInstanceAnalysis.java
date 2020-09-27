package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceandAccessAdministrationRetrieveInputModelMaintenanceandAccessAdministrationInstanceAnalysis
 */
public class BQMaintenanceandAccessAdministrationRetrieveInputModelMaintenanceandAccessAdministrationInstanceAnalysis   {
  private String maintenanceandAccessAdministrationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return maintenanceandAccessAdministrationInstanceAnalysisReference
  **/

  public String getMaintenanceandAccessAdministrationInstanceAnalysisReference() {
    return maintenanceandAccessAdministrationInstanceAnalysisReference;
  }

  public void setMaintenanceandAccessAdministrationInstanceAnalysisReference(String maintenanceandAccessAdministrationInstanceAnalysisReference) {
    this.maintenanceandAccessAdministrationInstanceAnalysisReference = maintenanceandAccessAdministrationInstanceAnalysisReference;
  }


}


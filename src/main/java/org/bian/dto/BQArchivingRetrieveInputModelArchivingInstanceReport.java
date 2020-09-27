package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQArchivingRetrieveInputModelArchivingInstanceReport
 */
public class BQArchivingRetrieveInputModelArchivingInstanceReport   {
  private String archivingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return archivingInstanceReportReference
  **/

  public String getArchivingInstanceReportReference() {
    return archivingInstanceReportReference;
  }

  public void setArchivingInstanceReportReference(String archivingInstanceReportReference) {
    this.archivingInstanceReportReference = archivingInstanceReportReference;
  }


}


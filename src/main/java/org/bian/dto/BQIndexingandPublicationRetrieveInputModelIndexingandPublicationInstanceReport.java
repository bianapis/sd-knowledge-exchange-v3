package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIndexingandPublicationRetrieveInputModelIndexingandPublicationInstanceReport
 */
public class BQIndexingandPublicationRetrieveInputModelIndexingandPublicationInstanceReport   {
  private String indexingandPublicationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return indexingandPublicationInstanceReportReference
  **/

  public String getIndexingandPublicationInstanceReportReference() {
    return indexingandPublicationInstanceReportReference;
  }

  public void setIndexingandPublicationInstanceReportReference(String indexingandPublicationInstanceReportReference) {
    this.indexingandPublicationInstanceReportReference = indexingandPublicationInstanceReportReference;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIndexingandPublicationRetrieveInputModelIndexingandPublicationInstanceAnalysis
 */
public class BQIndexingandPublicationRetrieveInputModelIndexingandPublicationInstanceAnalysis   {
  private String indexingandPublicationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return indexingandPublicationInstanceAnalysisReference
  **/

  public String getIndexingandPublicationInstanceAnalysisReference() {
    return indexingandPublicationInstanceAnalysisReference;
  }

  public void setIndexingandPublicationInstanceAnalysisReference(String indexingandPublicationInstanceAnalysisReference) {
    this.indexingandPublicationInstanceAnalysisReference = indexingandPublicationInstanceAnalysisReference;
  }


}


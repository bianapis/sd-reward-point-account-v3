package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExpirationRetrieveInputModelExpirationInstanceReport
 */
public class BQExpirationRetrieveInputModelExpirationInstanceReport   {
  private String expirationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return expirationInstanceReportReference
  **/

  public String getExpirationInstanceReportReference() {
    return expirationInstanceReportReference;
  }

  public void setExpirationInstanceReportReference(String expirationInstanceReportReference) {
    this.expirationInstanceReportReference = expirationInstanceReportReference;
  }


}


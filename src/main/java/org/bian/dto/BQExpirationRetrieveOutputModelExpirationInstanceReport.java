package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExpirationRetrieveOutputModelExpirationInstanceReport
 */
public class BQExpirationRetrieveOutputModelExpirationInstanceReport   {
  private Object expirationInstanceReportRecord = null;

  private String expirationInstanceReportType = null;

  private String expirationInstanceReportParameters = null;

  private Object expirationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return expirationInstanceReportRecord
  **/

  public Object getExpirationInstanceReportRecord() {
    return expirationInstanceReportRecord;
  }

  public void setExpirationInstanceReportRecord(Object expirationInstanceReportRecord) {
    this.expirationInstanceReportRecord = expirationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return expirationInstanceReportType
  **/

  public String getExpirationInstanceReportType() {
    return expirationInstanceReportType;
  }

  public void setExpirationInstanceReportType(String expirationInstanceReportType) {
    this.expirationInstanceReportType = expirationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return expirationInstanceReportParameters
  **/

  public String getExpirationInstanceReportParameters() {
    return expirationInstanceReportParameters;
  }

  public void setExpirationInstanceReportParameters(String expirationInstanceReportParameters) {
    this.expirationInstanceReportParameters = expirationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return expirationInstanceReport
  **/

  public Object getExpirationInstanceReport() {
    return expirationInstanceReport;
  }

  public void setExpirationInstanceReport(Object expirationInstanceReport) {
    this.expirationInstanceReport = expirationInstanceReport;
  }


}


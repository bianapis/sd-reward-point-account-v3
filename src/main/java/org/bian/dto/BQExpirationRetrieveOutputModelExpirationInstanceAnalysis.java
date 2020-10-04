package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExpirationRetrieveOutputModelExpirationInstanceAnalysis
 */
public class BQExpirationRetrieveOutputModelExpirationInstanceAnalysis   {
  private Object expirationInstanceAnalysisRecord = null;

  private String expirationInstanceAnalysisReportType = null;

  private String expirationInstanceAnalysisParameters = null;

  private Object expirationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return expirationInstanceAnalysisRecord
  **/

  public Object getExpirationInstanceAnalysisRecord() {
    return expirationInstanceAnalysisRecord;
  }

  public void setExpirationInstanceAnalysisRecord(Object expirationInstanceAnalysisRecord) {
    this.expirationInstanceAnalysisRecord = expirationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return expirationInstanceAnalysisReportType
  **/

  public String getExpirationInstanceAnalysisReportType() {
    return expirationInstanceAnalysisReportType;
  }

  public void setExpirationInstanceAnalysisReportType(String expirationInstanceAnalysisReportType) {
    this.expirationInstanceAnalysisReportType = expirationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return expirationInstanceAnalysisParameters
  **/

  public String getExpirationInstanceAnalysisParameters() {
    return expirationInstanceAnalysisParameters;
  }

  public void setExpirationInstanceAnalysisParameters(String expirationInstanceAnalysisParameters) {
    this.expirationInstanceAnalysisParameters = expirationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return expirationInstanceAnalysisReport
  **/

  public Object getExpirationInstanceAnalysisReport() {
    return expirationInstanceAnalysisReport;
  }

  public void setExpirationInstanceAnalysisReport(Object expirationInstanceAnalysisReport) {
    this.expirationInstanceAnalysisReport = expirationInstanceAnalysisReport;
  }


}


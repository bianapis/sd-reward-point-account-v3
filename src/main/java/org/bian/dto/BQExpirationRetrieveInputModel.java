package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExpirationRetrieveInputModelExpirationInstanceAnalysis;
import org.bian.dto.BQExpirationRetrieveInputModelExpirationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQExpirationRetrieveInputModel
 */
public class BQExpirationRetrieveInputModel   {
  private Object expirationRetrieveActionTaskRecord = null;

  private String expirationRetrieveActionRequest = null;

  private BQExpirationRetrieveInputModelExpirationInstanceReport expirationInstanceReport = null;

  private BQExpirationRetrieveInputModelExpirationInstanceAnalysis expirationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return expirationRetrieveActionTaskRecord
  **/

  public Object getExpirationRetrieveActionTaskRecord() {
    return expirationRetrieveActionTaskRecord;
  }

  public void setExpirationRetrieveActionTaskRecord(Object expirationRetrieveActionTaskRecord) {
    this.expirationRetrieveActionTaskRecord = expirationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return expirationRetrieveActionRequest
  **/

  public String getExpirationRetrieveActionRequest() {
    return expirationRetrieveActionRequest;
  }

  public void setExpirationRetrieveActionRequest(String expirationRetrieveActionRequest) {
    this.expirationRetrieveActionRequest = expirationRetrieveActionRequest;
  }


  /**
   * Get expirationInstanceReport
   * @return expirationInstanceReport
  **/

  public BQExpirationRetrieveInputModelExpirationInstanceReport getExpirationInstanceReport() {
    return expirationInstanceReport;
  }

  public void setExpirationInstanceReport(BQExpirationRetrieveInputModelExpirationInstanceReport expirationInstanceReport) {
    this.expirationInstanceReport = expirationInstanceReport;
  }


  /**
   * Get expirationInstanceAnalysis
   * @return expirationInstanceAnalysis
  **/

  public BQExpirationRetrieveInputModelExpirationInstanceAnalysis getExpirationInstanceAnalysis() {
    return expirationInstanceAnalysis;
  }

  public void setExpirationInstanceAnalysis(BQExpirationRetrieveInputModelExpirationInstanceAnalysis expirationInstanceAnalysis) {
    this.expirationInstanceAnalysis = expirationInstanceAnalysis;
  }


}


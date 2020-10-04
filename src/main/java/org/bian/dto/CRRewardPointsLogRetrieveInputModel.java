package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRewardPointsLogRetrieveInputModelRewardPointsLogInstanceAnalysis;
import org.bian.dto.CRRewardPointsLogRetrieveInputModelRewardPointsLogInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRRewardPointsLogRetrieveInputModel
 */
public class CRRewardPointsLogRetrieveInputModel   {
  private Object rewardPointsLogRetrieveActionTaskRecord = null;

  private String rewardPointsLogRetrieveActionRequest = null;

  private CRRewardPointsLogRetrieveInputModelRewardPointsLogInstanceReportRecord rewardPointsLogInstanceReportRecord = null;

  private CRRewardPointsLogRetrieveInputModelRewardPointsLogInstanceAnalysis rewardPointsLogInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return rewardPointsLogRetrieveActionTaskRecord
  **/

  public Object getRewardPointsLogRetrieveActionTaskRecord() {
    return rewardPointsLogRetrieveActionTaskRecord;
  }

  public void setRewardPointsLogRetrieveActionTaskRecord(Object rewardPointsLogRetrieveActionTaskRecord) {
    this.rewardPointsLogRetrieveActionTaskRecord = rewardPointsLogRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return rewardPointsLogRetrieveActionRequest
  **/

  public String getRewardPointsLogRetrieveActionRequest() {
    return rewardPointsLogRetrieveActionRequest;
  }

  public void setRewardPointsLogRetrieveActionRequest(String rewardPointsLogRetrieveActionRequest) {
    this.rewardPointsLogRetrieveActionRequest = rewardPointsLogRetrieveActionRequest;
  }


  /**
   * Get rewardPointsLogInstanceReportRecord
   * @return rewardPointsLogInstanceReportRecord
  **/

  public CRRewardPointsLogRetrieveInputModelRewardPointsLogInstanceReportRecord getRewardPointsLogInstanceReportRecord() {
    return rewardPointsLogInstanceReportRecord;
  }

  public void setRewardPointsLogInstanceReportRecord(CRRewardPointsLogRetrieveInputModelRewardPointsLogInstanceReportRecord rewardPointsLogInstanceReportRecord) {
    this.rewardPointsLogInstanceReportRecord = rewardPointsLogInstanceReportRecord;
  }


  /**
   * Get rewardPointsLogInstanceAnalysis
   * @return rewardPointsLogInstanceAnalysis
  **/

  public CRRewardPointsLogRetrieveInputModelRewardPointsLogInstanceAnalysis getRewardPointsLogInstanceAnalysis() {
    return rewardPointsLogInstanceAnalysis;
  }

  public void setRewardPointsLogInstanceAnalysis(CRRewardPointsLogRetrieveInputModelRewardPointsLogInstanceAnalysis rewardPointsLogInstanceAnalysis) {
    this.rewardPointsLogInstanceAnalysis = rewardPointsLogInstanceAnalysis;
  }


}


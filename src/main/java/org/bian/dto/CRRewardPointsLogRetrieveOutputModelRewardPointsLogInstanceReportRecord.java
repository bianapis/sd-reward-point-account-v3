package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRewardPointsLogRetrieveOutputModelRewardPointsLogInstanceReportRecord
 */
public class CRRewardPointsLogRetrieveOutputModelRewardPointsLogInstanceReportRecord   {
  private String rewardPointsLogInstanceReportData = null;

  private String rewardPointsLogInstanceReportType = null;

  private Object rewardPointsLogInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return rewardPointsLogInstanceReportData
  **/

  public String getRewardPointsLogInstanceReportData() {
    return rewardPointsLogInstanceReportData;
  }

  public void setRewardPointsLogInstanceReportData(String rewardPointsLogInstanceReportData) {
    this.rewardPointsLogInstanceReportData = rewardPointsLogInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return rewardPointsLogInstanceReportType
  **/

  public String getRewardPointsLogInstanceReportType() {
    return rewardPointsLogInstanceReportType;
  }

  public void setRewardPointsLogInstanceReportType(String rewardPointsLogInstanceReportType) {
    this.rewardPointsLogInstanceReportType = rewardPointsLogInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return rewardPointsLogInstanceReport
  **/

  public Object getRewardPointsLogInstanceReport() {
    return rewardPointsLogInstanceReport;
  }

  public void setRewardPointsLogInstanceReport(Object rewardPointsLogInstanceReport) {
    this.rewardPointsLogInstanceReport = rewardPointsLogInstanceReport;
  }


}


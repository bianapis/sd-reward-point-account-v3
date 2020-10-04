package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRewardPointsLogRetrieveOutputModelRewardPointsLogInstanceAnalysis
 */
public class CRRewardPointsLogRetrieveOutputModelRewardPointsLogInstanceAnalysis   {
  private String rewardPointsLogInstanceAnalysisData = null;

  private String rewardPointsLogInstanceAnalysisReportType = null;

  private Object rewardPointsLogInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return rewardPointsLogInstanceAnalysisData
  **/

  public String getRewardPointsLogInstanceAnalysisData() {
    return rewardPointsLogInstanceAnalysisData;
  }

  public void setRewardPointsLogInstanceAnalysisData(String rewardPointsLogInstanceAnalysisData) {
    this.rewardPointsLogInstanceAnalysisData = rewardPointsLogInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return rewardPointsLogInstanceAnalysisReportType
  **/

  public String getRewardPointsLogInstanceAnalysisReportType() {
    return rewardPointsLogInstanceAnalysisReportType;
  }

  public void setRewardPointsLogInstanceAnalysisReportType(String rewardPointsLogInstanceAnalysisReportType) {
    this.rewardPointsLogInstanceAnalysisReportType = rewardPointsLogInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return rewardPointsLogInstanceAnalysisReport
  **/

  public Object getRewardPointsLogInstanceAnalysisReport() {
    return rewardPointsLogInstanceAnalysisReport;
  }

  public void setRewardPointsLogInstanceAnalysisReport(Object rewardPointsLogInstanceAnalysisReport) {
    this.rewardPointsLogInstanceAnalysisReport = rewardPointsLogInstanceAnalysisReport;
  }


}


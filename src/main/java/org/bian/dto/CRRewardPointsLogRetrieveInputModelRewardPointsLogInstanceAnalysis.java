package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRewardPointsLogRetrieveInputModelRewardPointsLogInstanceAnalysis
 */
public class CRRewardPointsLogRetrieveInputModelRewardPointsLogInstanceAnalysis   {
  private String rewardPointsLogInstanceAnalysisReference = null;

  private String rewardPointsLogInstanceAnalysisReportType = null;

  private String rewardPointsLogInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return rewardPointsLogInstanceAnalysisReference
  **/

  public String getRewardPointsLogInstanceAnalysisReference() {
    return rewardPointsLogInstanceAnalysisReference;
  }

  public void setRewardPointsLogInstanceAnalysisReference(String rewardPointsLogInstanceAnalysisReference) {
    this.rewardPointsLogInstanceAnalysisReference = rewardPointsLogInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return rewardPointsLogInstanceAnalysisParameters
  **/

  public String getRewardPointsLogInstanceAnalysisParameters() {
    return rewardPointsLogInstanceAnalysisParameters;
  }

  public void setRewardPointsLogInstanceAnalysisParameters(String rewardPointsLogInstanceAnalysisParameters) {
    this.rewardPointsLogInstanceAnalysisParameters = rewardPointsLogInstanceAnalysisParameters;
  }


}


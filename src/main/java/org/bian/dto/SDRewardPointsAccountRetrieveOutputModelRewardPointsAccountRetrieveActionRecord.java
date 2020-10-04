package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecordRewardPointsAccountActivityAnalysis;
import org.bian.dto.SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecordRewardPointsAccountPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecord
 */
public class SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecord   {
  private SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecordRewardPointsAccountActivityAnalysis rewardPointsAccountActivityAnalysis = null;

  private SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecordRewardPointsAccountPerformanceAnalysis rewardPointsAccountPerformanceAnalysis = null;

  private SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get rewardPointsAccountActivityAnalysis
   * @return rewardPointsAccountActivityAnalysis
  **/

  public SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecordRewardPointsAccountActivityAnalysis getRewardPointsAccountActivityAnalysis() {
    return rewardPointsAccountActivityAnalysis;
  }

  public void setRewardPointsAccountActivityAnalysis(SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecordRewardPointsAccountActivityAnalysis rewardPointsAccountActivityAnalysis) {
    this.rewardPointsAccountActivityAnalysis = rewardPointsAccountActivityAnalysis;
  }


  /**
   * Get rewardPointsAccountPerformanceAnalysis
   * @return rewardPointsAccountPerformanceAnalysis
  **/

  public SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecordRewardPointsAccountPerformanceAnalysis getRewardPointsAccountPerformanceAnalysis() {
    return rewardPointsAccountPerformanceAnalysis;
  }

  public void setRewardPointsAccountPerformanceAnalysis(SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecordRewardPointsAccountPerformanceAnalysis rewardPointsAccountPerformanceAnalysis) {
    this.rewardPointsAccountPerformanceAnalysis = rewardPointsAccountPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}


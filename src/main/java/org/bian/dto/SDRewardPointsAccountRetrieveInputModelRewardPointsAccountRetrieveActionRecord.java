package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecordRewardPointsAccountActivityAnalysis;
import org.bian.dto.SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecordRewardPointsAccountPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecord
 */
public class SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecord   {
  private SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecordRewardPointsAccountActivityAnalysis rewardPointsAccountActivityAnalysis = null;

  private SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecordRewardPointsAccountPerformanceAnalysis rewardPointsAccountPerformanceAnalysis = null;

  private SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get rewardPointsAccountActivityAnalysis
   * @return rewardPointsAccountActivityAnalysis
  **/

  public SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecordRewardPointsAccountActivityAnalysis getRewardPointsAccountActivityAnalysis() {
    return rewardPointsAccountActivityAnalysis;
  }

  public void setRewardPointsAccountActivityAnalysis(SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecordRewardPointsAccountActivityAnalysis rewardPointsAccountActivityAnalysis) {
    this.rewardPointsAccountActivityAnalysis = rewardPointsAccountActivityAnalysis;
  }


  /**
   * Get rewardPointsAccountPerformanceAnalysis
   * @return rewardPointsAccountPerformanceAnalysis
  **/

  public SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecordRewardPointsAccountPerformanceAnalysis getRewardPointsAccountPerformanceAnalysis() {
    return rewardPointsAccountPerformanceAnalysis;
  }

  public void setRewardPointsAccountPerformanceAnalysis(SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecordRewardPointsAccountPerformanceAnalysis rewardPointsAccountPerformanceAnalysis) {
    this.rewardPointsAccountPerformanceAnalysis = rewardPointsAccountPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}


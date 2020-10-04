package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAccountFeedbackInputModelRewardPointsAccountFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountFeedbackInputModel
 */
public class SDRewardPointsAccountFeedbackInputModel   {
  private Object rewardPointsAccountFeedbackActionTaskRecord = null;

  private SDRewardPointsAccountFeedbackInputModelRewardPointsAccountFeedbackActionRecord rewardPointsAccountFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return rewardPointsAccountFeedbackActionTaskRecord
  **/

  public Object getRewardPointsAccountFeedbackActionTaskRecord() {
    return rewardPointsAccountFeedbackActionTaskRecord;
  }

  public void setRewardPointsAccountFeedbackActionTaskRecord(Object rewardPointsAccountFeedbackActionTaskRecord) {
    this.rewardPointsAccountFeedbackActionTaskRecord = rewardPointsAccountFeedbackActionTaskRecord;
  }


  /**
   * Get rewardPointsAccountFeedbackActionRecord
   * @return rewardPointsAccountFeedbackActionRecord
  **/

  public SDRewardPointsAccountFeedbackInputModelRewardPointsAccountFeedbackActionRecord getRewardPointsAccountFeedbackActionRecord() {
    return rewardPointsAccountFeedbackActionRecord;
  }

  public void setRewardPointsAccountFeedbackActionRecord(SDRewardPointsAccountFeedbackInputModelRewardPointsAccountFeedbackActionRecord rewardPointsAccountFeedbackActionRecord) {
    this.rewardPointsAccountFeedbackActionRecord = rewardPointsAccountFeedbackActionRecord;
  }


}


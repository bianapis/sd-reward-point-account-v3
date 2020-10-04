package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAccountFeedbackOutputModelRewardPointsAccountFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountFeedbackOutputModel
 */
public class SDRewardPointsAccountFeedbackOutputModel   {
  private String rewardPointsAccountFeedbackActionTaskReference = null;

  private Object rewardPointsAccountFeedbackActionTaskRecord = null;

  private SDRewardPointsAccountFeedbackOutputModelRewardPointsAccountFeedbackActionRecord rewardPointsAccountFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return rewardPointsAccountFeedbackActionTaskReference
  **/

  public String getRewardPointsAccountFeedbackActionTaskReference() {
    return rewardPointsAccountFeedbackActionTaskReference;
  }

  public void setRewardPointsAccountFeedbackActionTaskReference(String rewardPointsAccountFeedbackActionTaskReference) {
    this.rewardPointsAccountFeedbackActionTaskReference = rewardPointsAccountFeedbackActionTaskReference;
  }


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

  public SDRewardPointsAccountFeedbackOutputModelRewardPointsAccountFeedbackActionRecord getRewardPointsAccountFeedbackActionRecord() {
    return rewardPointsAccountFeedbackActionRecord;
  }

  public void setRewardPointsAccountFeedbackActionRecord(SDRewardPointsAccountFeedbackOutputModelRewardPointsAccountFeedbackActionRecord rewardPointsAccountFeedbackActionRecord) {
    this.rewardPointsAccountFeedbackActionRecord = rewardPointsAccountFeedbackActionRecord;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAccountRetrieveInputModelRewardPointsAccountOfferedServiceRewardPointsAccountServiceRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountRetrieveInputModelRewardPointsAccountOfferedService
 */
public class SDRewardPointsAccountRetrieveInputModelRewardPointsAccountOfferedService   {
  private String rewardPointsAccountServiceReference = null;

  private SDRewardPointsAccountRetrieveInputModelRewardPointsAccountOfferedServiceRewardPointsAccountServiceRecord rewardPointsAccountServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return rewardPointsAccountServiceReference
  **/

  public String getRewardPointsAccountServiceReference() {
    return rewardPointsAccountServiceReference;
  }

  public void setRewardPointsAccountServiceReference(String rewardPointsAccountServiceReference) {
    this.rewardPointsAccountServiceReference = rewardPointsAccountServiceReference;
  }


  /**
   * Get rewardPointsAccountServiceRecord
   * @return rewardPointsAccountServiceRecord
  **/

  public SDRewardPointsAccountRetrieveInputModelRewardPointsAccountOfferedServiceRewardPointsAccountServiceRecord getRewardPointsAccountServiceRecord() {
    return rewardPointsAccountServiceRecord;
  }

  public void setRewardPointsAccountServiceRecord(SDRewardPointsAccountRetrieveInputModelRewardPointsAccountOfferedServiceRewardPointsAccountServiceRecord rewardPointsAccountServiceRecord) {
    this.rewardPointsAccountServiceRecord = rewardPointsAccountServiceRecord;
  }


}


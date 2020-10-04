package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedServiceRewardPointsAccountServiceRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedService
 */
public class SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedService   {
  private String rewardPointsAccountServiceReference = null;

  private SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedServiceRewardPointsAccountServiceRecord rewardPointsAccountServiceRecord = null;


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

  public SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedServiceRewardPointsAccountServiceRecord getRewardPointsAccountServiceRecord() {
    return rewardPointsAccountServiceRecord;
  }

  public void setRewardPointsAccountServiceRecord(SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedServiceRewardPointsAccountServiceRecord rewardPointsAccountServiceRecord) {
    this.rewardPointsAccountServiceRecord = rewardPointsAccountServiceRecord;
  }


}


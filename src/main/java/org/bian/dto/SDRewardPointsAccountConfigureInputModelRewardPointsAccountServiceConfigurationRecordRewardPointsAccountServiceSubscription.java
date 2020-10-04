package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceSubscription
 */
public class SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceSubscription   {
  private String rewardPointsAccountServiceSubscriberReference = null;

  private String rewardPointsAccountServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return rewardPointsAccountServiceSubscriberReference
  **/

  public String getRewardPointsAccountServiceSubscriberReference() {
    return rewardPointsAccountServiceSubscriberReference;
  }

  public void setRewardPointsAccountServiceSubscriberReference(String rewardPointsAccountServiceSubscriberReference) {
    this.rewardPointsAccountServiceSubscriberReference = rewardPointsAccountServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return rewardPointsAccountServiceSubscriberAccessProfile
  **/

  public String getRewardPointsAccountServiceSubscriberAccessProfile() {
    return rewardPointsAccountServiceSubscriberAccessProfile;
  }

  public void setRewardPointsAccountServiceSubscriberAccessProfile(String rewardPointsAccountServiceSubscriberAccessProfile) {
    this.rewardPointsAccountServiceSubscriberAccessProfile = rewardPointsAccountServiceSubscriberAccessProfile;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedServiceRewardPointsAccountServiceRecordRewardPointsAccountServicePoliciesandGuidelines
 */
public class SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedServiceRewardPointsAccountServiceRecordRewardPointsAccountServicePoliciesandGuidelines   {
  private String rewardPointsAccountServiceEligibility = null;

  private String rewardPointsAccountServiceIntendedUses = null;

  private String rewardPointsAccountServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return rewardPointsAccountServiceEligibility
  **/

  public String getRewardPointsAccountServiceEligibility() {
    return rewardPointsAccountServiceEligibility;
  }

  public void setRewardPointsAccountServiceEligibility(String rewardPointsAccountServiceEligibility) {
    this.rewardPointsAccountServiceEligibility = rewardPointsAccountServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return rewardPointsAccountServiceIntendedUses
  **/

  public String getRewardPointsAccountServiceIntendedUses() {
    return rewardPointsAccountServiceIntendedUses;
  }

  public void setRewardPointsAccountServiceIntendedUses(String rewardPointsAccountServiceIntendedUses) {
    this.rewardPointsAccountServiceIntendedUses = rewardPointsAccountServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return rewardPointsAccountServicePricingandTerms
  **/

  public String getRewardPointsAccountServicePricingandTerms() {
    return rewardPointsAccountServicePricingandTerms;
  }

  public void setRewardPointsAccountServicePricingandTerms(String rewardPointsAccountServicePricingandTerms) {
    this.rewardPointsAccountServicePricingandTerms = rewardPointsAccountServicePricingandTerms;
  }


}


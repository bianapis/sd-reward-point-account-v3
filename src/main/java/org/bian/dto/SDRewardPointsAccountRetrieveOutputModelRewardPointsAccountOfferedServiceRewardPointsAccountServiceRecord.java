package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedServiceRewardPointsAccountServiceRecordRewardPointsAccountServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedServiceRewardPointsAccountServiceRecord
 */
public class SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedServiceRewardPointsAccountServiceRecord   {
  private String rewardPointsAccountServiceType = null;

  private String rewardPointsAccountServiceVersion = null;

  private String rewardPointsAccountServiceDescription = null;

  private SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedServiceRewardPointsAccountServiceRecordRewardPointsAccountServicePoliciesandGuidelines rewardPointsAccountServicePoliciesandGuidelines = null;

  private String rewardPointsAccountServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return rewardPointsAccountServiceType
  **/

  public String getRewardPointsAccountServiceType() {
    return rewardPointsAccountServiceType;
  }

  public void setRewardPointsAccountServiceType(String rewardPointsAccountServiceType) {
    this.rewardPointsAccountServiceType = rewardPointsAccountServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return rewardPointsAccountServiceVersion
  **/

  public String getRewardPointsAccountServiceVersion() {
    return rewardPointsAccountServiceVersion;
  }

  public void setRewardPointsAccountServiceVersion(String rewardPointsAccountServiceVersion) {
    this.rewardPointsAccountServiceVersion = rewardPointsAccountServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return rewardPointsAccountServiceDescription
  **/

  public String getRewardPointsAccountServiceDescription() {
    return rewardPointsAccountServiceDescription;
  }

  public void setRewardPointsAccountServiceDescription(String rewardPointsAccountServiceDescription) {
    this.rewardPointsAccountServiceDescription = rewardPointsAccountServiceDescription;
  }


  /**
   * Get rewardPointsAccountServicePoliciesandGuidelines
   * @return rewardPointsAccountServicePoliciesandGuidelines
  **/

  public SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedServiceRewardPointsAccountServiceRecordRewardPointsAccountServicePoliciesandGuidelines getRewardPointsAccountServicePoliciesandGuidelines() {
    return rewardPointsAccountServicePoliciesandGuidelines;
  }

  public void setRewardPointsAccountServicePoliciesandGuidelines(SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedServiceRewardPointsAccountServiceRecordRewardPointsAccountServicePoliciesandGuidelines rewardPointsAccountServicePoliciesandGuidelines) {
    this.rewardPointsAccountServicePoliciesandGuidelines = rewardPointsAccountServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return rewardPointsAccountServiceSchedule
  **/

  public String getRewardPointsAccountServiceSchedule() {
    return rewardPointsAccountServiceSchedule;
  }

  public void setRewardPointsAccountServiceSchedule(String rewardPointsAccountServiceSchedule) {
    this.rewardPointsAccountServiceSchedule = rewardPointsAccountServiceSchedule;
  }


}


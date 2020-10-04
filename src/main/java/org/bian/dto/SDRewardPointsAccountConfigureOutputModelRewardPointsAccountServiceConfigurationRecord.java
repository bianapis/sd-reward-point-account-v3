package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceAgreement;
import org.bian.dto.SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceConfigurationSetup;
import org.bian.dto.SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountConfigureOutputModelRewardPointsAccountServiceConfigurationRecord
 */
public class SDRewardPointsAccountConfigureOutputModelRewardPointsAccountServiceConfigurationRecord   {
  private String rewardPointsAccountServiceConfigurationSettingDescription = null;

  private SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceConfigurationSetup rewardPointsAccountServiceConfigurationSetup = null;

  private SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceSubscription rewardPointsAccountServiceSubscription = null;

  private SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceAgreement rewardPointsAccountServiceAgreement = null;

  private String rewardPointsAccountServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return rewardPointsAccountServiceConfigurationSettingDescription
  **/

  public String getRewardPointsAccountServiceConfigurationSettingDescription() {
    return rewardPointsAccountServiceConfigurationSettingDescription;
  }

  public void setRewardPointsAccountServiceConfigurationSettingDescription(String rewardPointsAccountServiceConfigurationSettingDescription) {
    this.rewardPointsAccountServiceConfigurationSettingDescription = rewardPointsAccountServiceConfigurationSettingDescription;
  }


  /**
   * Get rewardPointsAccountServiceConfigurationSetup
   * @return rewardPointsAccountServiceConfigurationSetup
  **/

  public SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceConfigurationSetup getRewardPointsAccountServiceConfigurationSetup() {
    return rewardPointsAccountServiceConfigurationSetup;
  }

  public void setRewardPointsAccountServiceConfigurationSetup(SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceConfigurationSetup rewardPointsAccountServiceConfigurationSetup) {
    this.rewardPointsAccountServiceConfigurationSetup = rewardPointsAccountServiceConfigurationSetup;
  }


  /**
   * Get rewardPointsAccountServiceSubscription
   * @return rewardPointsAccountServiceSubscription
  **/

  public SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceSubscription getRewardPointsAccountServiceSubscription() {
    return rewardPointsAccountServiceSubscription;
  }

  public void setRewardPointsAccountServiceSubscription(SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceSubscription rewardPointsAccountServiceSubscription) {
    this.rewardPointsAccountServiceSubscription = rewardPointsAccountServiceSubscription;
  }


  /**
   * Get rewardPointsAccountServiceAgreement
   * @return rewardPointsAccountServiceAgreement
  **/

  public SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceAgreement getRewardPointsAccountServiceAgreement() {
    return rewardPointsAccountServiceAgreement;
  }

  public void setRewardPointsAccountServiceAgreement(SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceAgreement rewardPointsAccountServiceAgreement) {
    this.rewardPointsAccountServiceAgreement = rewardPointsAccountServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return rewardPointsAccountServiceStatus
  **/

  public String getRewardPointsAccountServiceStatus() {
    return rewardPointsAccountServiceStatus;
  }

  public void setRewardPointsAccountServiceStatus(String rewardPointsAccountServiceStatus) {
    this.rewardPointsAccountServiceStatus = rewardPointsAccountServiceStatus;
  }


}


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
 * SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecord
 */
public class SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecord   {
  private String rewardPointsAccountServiceConfigurationSettingReference = null;

  private String rewardPointsAccountServiceConfigurationSettingType = null;

  private SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceConfigurationSetup rewardPointsAccountServiceConfigurationSetup = null;

  private SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceSubscription rewardPointsAccountServiceSubscription = null;

  private SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceAgreement rewardPointsAccountServiceAgreement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return rewardPointsAccountServiceConfigurationSettingReference
  **/

  public String getRewardPointsAccountServiceConfigurationSettingReference() {
    return rewardPointsAccountServiceConfigurationSettingReference;
  }

  public void setRewardPointsAccountServiceConfigurationSettingReference(String rewardPointsAccountServiceConfigurationSettingReference) {
    this.rewardPointsAccountServiceConfigurationSettingReference = rewardPointsAccountServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return rewardPointsAccountServiceConfigurationSettingType
  **/

  public String getRewardPointsAccountServiceConfigurationSettingType() {
    return rewardPointsAccountServiceConfigurationSettingType;
  }

  public void setRewardPointsAccountServiceConfigurationSettingType(String rewardPointsAccountServiceConfigurationSettingType) {
    this.rewardPointsAccountServiceConfigurationSettingType = rewardPointsAccountServiceConfigurationSettingType;
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


}


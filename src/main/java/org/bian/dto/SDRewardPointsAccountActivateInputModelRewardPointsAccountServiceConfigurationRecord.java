package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAccountActivateInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountActivateInputModelRewardPointsAccountServiceConfigurationRecord
 */
public class SDRewardPointsAccountActivateInputModelRewardPointsAccountServiceConfigurationRecord   {
  private String rewardPointsAccountServiceConfigurationSettingReference = null;

  private String rewardPointsAccountServiceConfigurationSettingType = null;

  private SDRewardPointsAccountActivateInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceConfigurationSetup rewardPointsAccountServiceConfigurationSetup = null;


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

  public SDRewardPointsAccountActivateInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceConfigurationSetup getRewardPointsAccountServiceConfigurationSetup() {
    return rewardPointsAccountServiceConfigurationSetup;
  }

  public void setRewardPointsAccountServiceConfigurationSetup(SDRewardPointsAccountActivateInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceConfigurationSetup rewardPointsAccountServiceConfigurationSetup) {
    this.rewardPointsAccountServiceConfigurationSetup = rewardPointsAccountServiceConfigurationSetup;
  }


}


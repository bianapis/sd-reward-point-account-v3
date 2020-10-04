package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAccountActivateInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceConfigurationSetup;
import org.bian.dto.SDRewardPointsAccountActivateOutputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceAgreement;
import org.bian.dto.SDRewardPointsAccountActivateOutputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountActivateOutputModelRewardPointsAccountServiceConfigurationRecord
 */
public class SDRewardPointsAccountActivateOutputModelRewardPointsAccountServiceConfigurationRecord   {
  private String rewardPointsAccountServiceConfigurationSettingReference = null;

  private String rewardPointsAccountServiceConfigurationSettingDescription = null;

  private SDRewardPointsAccountActivateInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceConfigurationSetup rewardPointsAccountServiceConfigurationSetup = null;

  private SDRewardPointsAccountActivateOutputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceSubscription rewardPointsAccountServiceSubscription = null;

  private SDRewardPointsAccountActivateOutputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceAgreement rewardPointsAccountServiceAgreement = null;

  private String rewardPointsAccountServiceStatus = null;


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

  public SDRewardPointsAccountActivateInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceConfigurationSetup getRewardPointsAccountServiceConfigurationSetup() {
    return rewardPointsAccountServiceConfigurationSetup;
  }

  public void setRewardPointsAccountServiceConfigurationSetup(SDRewardPointsAccountActivateInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceConfigurationSetup rewardPointsAccountServiceConfigurationSetup) {
    this.rewardPointsAccountServiceConfigurationSetup = rewardPointsAccountServiceConfigurationSetup;
  }


  /**
   * Get rewardPointsAccountServiceSubscription
   * @return rewardPointsAccountServiceSubscription
  **/

  public SDRewardPointsAccountActivateOutputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceSubscription getRewardPointsAccountServiceSubscription() {
    return rewardPointsAccountServiceSubscription;
  }

  public void setRewardPointsAccountServiceSubscription(SDRewardPointsAccountActivateOutputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceSubscription rewardPointsAccountServiceSubscription) {
    this.rewardPointsAccountServiceSubscription = rewardPointsAccountServiceSubscription;
  }


  /**
   * Get rewardPointsAccountServiceAgreement
   * @return rewardPointsAccountServiceAgreement
  **/

  public SDRewardPointsAccountActivateOutputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceAgreement getRewardPointsAccountServiceAgreement() {
    return rewardPointsAccountServiceAgreement;
  }

  public void setRewardPointsAccountServiceAgreement(SDRewardPointsAccountActivateOutputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceAgreement rewardPointsAccountServiceAgreement) {
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


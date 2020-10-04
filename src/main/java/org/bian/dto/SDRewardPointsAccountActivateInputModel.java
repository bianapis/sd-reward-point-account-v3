package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAccountActivateInputModelRewardPointsAccountServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountActivateInputModel
 */
public class SDRewardPointsAccountActivateInputModel   {
  private Object rewardPointsAccountActivationActionTaskRecord = null;

  private String rewardPointsAccountCenterReference = null;

  private String rewardPointsAccountServiceReference = null;

  private SDRewardPointsAccountActivateInputModelRewardPointsAccountServiceConfigurationRecord rewardPointsAccountServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return rewardPointsAccountActivationActionTaskRecord
  **/

  public Object getRewardPointsAccountActivationActionTaskRecord() {
    return rewardPointsAccountActivationActionTaskRecord;
  }

  public void setRewardPointsAccountActivationActionTaskRecord(Object rewardPointsAccountActivationActionTaskRecord) {
    this.rewardPointsAccountActivationActionTaskRecord = rewardPointsAccountActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return rewardPointsAccountCenterReference
  **/

  public String getRewardPointsAccountCenterReference() {
    return rewardPointsAccountCenterReference;
  }

  public void setRewardPointsAccountCenterReference(String rewardPointsAccountCenterReference) {
    this.rewardPointsAccountCenterReference = rewardPointsAccountCenterReference;
  }


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
   * Get rewardPointsAccountServiceConfigurationRecord
   * @return rewardPointsAccountServiceConfigurationRecord
  **/

  public SDRewardPointsAccountActivateInputModelRewardPointsAccountServiceConfigurationRecord getRewardPointsAccountServiceConfigurationRecord() {
    return rewardPointsAccountServiceConfigurationRecord;
  }

  public void setRewardPointsAccountServiceConfigurationRecord(SDRewardPointsAccountActivateInputModelRewardPointsAccountServiceConfigurationRecord rewardPointsAccountServiceConfigurationRecord) {
    this.rewardPointsAccountServiceConfigurationRecord = rewardPointsAccountServiceConfigurationRecord;
  }


}


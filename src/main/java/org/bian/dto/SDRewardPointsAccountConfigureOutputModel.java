package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAccountConfigureOutputModelRewardPointsAccountServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountConfigureOutputModel
 */
public class SDRewardPointsAccountConfigureOutputModel   {
  private String rewardPointsAccountConfigurationActionTaskReference = null;

  private Object rewardPointsAccountConfigurationActionTaskRecord = null;

  private SDRewardPointsAccountConfigureOutputModelRewardPointsAccountServiceConfigurationRecord rewardPointsAccountServiceConfigurationRecord = null;

  private String rewardPointsAccountServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return rewardPointsAccountConfigurationActionTaskReference
  **/

  public String getRewardPointsAccountConfigurationActionTaskReference() {
    return rewardPointsAccountConfigurationActionTaskReference;
  }

  public void setRewardPointsAccountConfigurationActionTaskReference(String rewardPointsAccountConfigurationActionTaskReference) {
    this.rewardPointsAccountConfigurationActionTaskReference = rewardPointsAccountConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return rewardPointsAccountConfigurationActionTaskRecord
  **/

  public Object getRewardPointsAccountConfigurationActionTaskRecord() {
    return rewardPointsAccountConfigurationActionTaskRecord;
  }

  public void setRewardPointsAccountConfigurationActionTaskRecord(Object rewardPointsAccountConfigurationActionTaskRecord) {
    this.rewardPointsAccountConfigurationActionTaskRecord = rewardPointsAccountConfigurationActionTaskRecord;
  }


  /**
   * Get rewardPointsAccountServiceConfigurationRecord
   * @return rewardPointsAccountServiceConfigurationRecord
  **/

  public SDRewardPointsAccountConfigureOutputModelRewardPointsAccountServiceConfigurationRecord getRewardPointsAccountServiceConfigurationRecord() {
    return rewardPointsAccountServiceConfigurationRecord;
  }

  public void setRewardPointsAccountServiceConfigurationRecord(SDRewardPointsAccountConfigureOutputModelRewardPointsAccountServiceConfigurationRecord rewardPointsAccountServiceConfigurationRecord) {
    this.rewardPointsAccountServiceConfigurationRecord = rewardPointsAccountServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return rewardPointsAccountServicingSessionStatus
  **/

  public String getRewardPointsAccountServicingSessionStatus() {
    return rewardPointsAccountServicingSessionStatus;
  }

  public void setRewardPointsAccountServicingSessionStatus(String rewardPointsAccountServicingSessionStatus) {
    this.rewardPointsAccountServicingSessionStatus = rewardPointsAccountServicingSessionStatus;
  }


}


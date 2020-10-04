package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAccountActivateOutputModelRewardPointsAccountServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountActivateOutputModel
 */
public class SDRewardPointsAccountActivateOutputModel   {
  private String rewardPointsAccountActivationActionTaskReference = null;

  private Object rewardPointsAccountActivationActionTaskRecord = null;

  private String rewardPointsAccountServicingSessionReference = null;

  private Object rewardPointsAccountServicingSessionRecord = null;

  private SDRewardPointsAccountActivateOutputModelRewardPointsAccountServiceConfigurationRecord rewardPointsAccountServiceConfigurationRecord = null;

  private String rewardPointsAccountServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return rewardPointsAccountActivationActionTaskReference
  **/

  public String getRewardPointsAccountActivationActionTaskReference() {
    return rewardPointsAccountActivationActionTaskReference;
  }

  public void setRewardPointsAccountActivationActionTaskReference(String rewardPointsAccountActivationActionTaskReference) {
    this.rewardPointsAccountActivationActionTaskReference = rewardPointsAccountActivationActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return rewardPointsAccountServicingSessionReference
  **/

  public String getRewardPointsAccountServicingSessionReference() {
    return rewardPointsAccountServicingSessionReference;
  }

  public void setRewardPointsAccountServicingSessionReference(String rewardPointsAccountServicingSessionReference) {
    this.rewardPointsAccountServicingSessionReference = rewardPointsAccountServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return rewardPointsAccountServicingSessionRecord
  **/

  public Object getRewardPointsAccountServicingSessionRecord() {
    return rewardPointsAccountServicingSessionRecord;
  }

  public void setRewardPointsAccountServicingSessionRecord(Object rewardPointsAccountServicingSessionRecord) {
    this.rewardPointsAccountServicingSessionRecord = rewardPointsAccountServicingSessionRecord;
  }


  /**
   * Get rewardPointsAccountServiceConfigurationRecord
   * @return rewardPointsAccountServiceConfigurationRecord
  **/

  public SDRewardPointsAccountActivateOutputModelRewardPointsAccountServiceConfigurationRecord getRewardPointsAccountServiceConfigurationRecord() {
    return rewardPointsAccountServiceConfigurationRecord;
  }

  public void setRewardPointsAccountServiceConfigurationRecord(SDRewardPointsAccountActivateOutputModelRewardPointsAccountServiceConfigurationRecord rewardPointsAccountServiceConfigurationRecord) {
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


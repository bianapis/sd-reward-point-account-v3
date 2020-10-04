package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountConfigureInputModel
 */
public class SDRewardPointsAccountConfigureInputModel   {
  private Object rewardPointsAccountConfigurationActionTaskRecord = null;

  private String rewardPointsAccountServicingSessionReference = null;

  private String rewardPointsAccountServiceReference = null;

  private SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecord rewardPointsAccountServiceConfigurationRecord = null;


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

  public SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecord getRewardPointsAccountServiceConfigurationRecord() {
    return rewardPointsAccountServiceConfigurationRecord;
  }

  public void setRewardPointsAccountServiceConfigurationRecord(SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecord rewardPointsAccountServiceConfigurationRecord) {
    this.rewardPointsAccountServiceConfigurationRecord = rewardPointsAccountServiceConfigurationRecord;
  }


}


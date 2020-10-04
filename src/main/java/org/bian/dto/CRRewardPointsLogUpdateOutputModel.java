package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRewardPointsLogUpdateOutputModel
 */
public class CRRewardPointsLogUpdateOutputModel   {
  private String rewardPointsLogSchedule = null;

  private String rewardPointsLogUsageLog = null;

  private String rewardPointsLogUpdateLog = null;

  private String rewardPointsLogServiceConfiguration = null;

  private String rewardPointsLogPosition = null;

  private String rewardPointsLogPositionType = null;

  private String rewardPointsLogPositionLimitTime = null;

  private String rewardPointsLogUpdateActionTaskReference = null;

  private Object rewardPointsLogUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to track RewardPoints 
   * @return rewardPointsLogSchedule
  **/

  public String getRewardPointsLogSchedule() {
    return rewardPointsLogSchedule;
  }

  public void setRewardPointsLogSchedule(String rewardPointsLogSchedule) {
    this.rewardPointsLogSchedule = rewardPointsLogSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (usage) ativities/events of Reward Points Log 
   * @return rewardPointsLogUsageLog
  **/

  public String getRewardPointsLogUsageLog() {
    return rewardPointsLogUsageLog;
  }

  public void setRewardPointsLogUsageLog(String rewardPointsLogUsageLog) {
    this.rewardPointsLogUsageLog = rewardPointsLogUsageLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (update) ativities/events of Reward Points Log 
   * @return rewardPointsLogUpdateLog
  **/

  public String getRewardPointsLogUpdateLog() {
    return rewardPointsLogUpdateLog;
  }

  public void setRewardPointsLogUpdateLog(String rewardPointsLogUpdateLog) {
    this.rewardPointsLogUpdateLog = rewardPointsLogUpdateLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The configuration of Reward Points Log 
   * @return rewardPointsLogServiceConfiguration
  **/

  public String getRewardPointsLogServiceConfiguration() {
    return rewardPointsLogServiceConfiguration;
  }

  public void setRewardPointsLogServiceConfiguration(String rewardPointsLogServiceConfiguration) {
    this.rewardPointsLogServiceConfiguration = rewardPointsLogServiceConfiguration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The position of Reward Points Log 
   * @return rewardPointsLogPosition
  **/

  public String getRewardPointsLogPosition() {
    return rewardPointsLogPosition;
  }

  public void setRewardPointsLogPosition(String rewardPointsLogPosition) {
    this.rewardPointsLogPosition = rewardPointsLogPosition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A classification value expressing the kind of position withing the Reward Points Log 
   * @return rewardPointsLogPositionType
  **/

  public String getRewardPointsLogPositionType() {
    return rewardPointsLogPositionType;
  }

  public void setRewardPointsLogPositionType(String rewardPointsLogPositionType) {
    this.rewardPointsLogPositionType = rewardPointsLogPositionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Reference to the time limitation related to the position of Reward Points Log 
   * @return rewardPointsLogPositionLimitTime
  **/

  public String getRewardPointsLogPositionLimitTime() {
    return rewardPointsLogPositionLimitTime;
  }

  public void setRewardPointsLogPositionLimitTime(String rewardPointsLogPositionLimitTime) {
    this.rewardPointsLogPositionLimitTime = rewardPointsLogPositionLimitTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return rewardPointsLogUpdateActionTaskReference
  **/

  public String getRewardPointsLogUpdateActionTaskReference() {
    return rewardPointsLogUpdateActionTaskReference;
  }

  public void setRewardPointsLogUpdateActionTaskReference(String rewardPointsLogUpdateActionTaskReference) {
    this.rewardPointsLogUpdateActionTaskReference = rewardPointsLogUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return rewardPointsLogUpdateActionTaskRecord
  **/

  public Object getRewardPointsLogUpdateActionTaskRecord() {
    return rewardPointsLogUpdateActionTaskRecord;
  }

  public void setRewardPointsLogUpdateActionTaskRecord(Object rewardPointsLogUpdateActionTaskRecord) {
    this.rewardPointsLogUpdateActionTaskRecord = rewardPointsLogUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}


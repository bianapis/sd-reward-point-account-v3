package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRewardPointsLogUpdateInputModel
 */
public class CRRewardPointsLogUpdateInputModel   {
  private String rewardPointsAccountServicingSessionReference = null;

  private String rewardPointsLogInstanceReference = null;

  private String rewardPointsLogParameterType = null;

  private String rewardPointsLogSelectedOption = null;

  private String rewardPointsLogType = null;

  private String rewardPointsLogSchedule = null;

  private String rewardPointsLogUsageLog = null;

  private String rewardPointsLogUpdateLog = null;

  private String rewardPointsLogReference = null;

  private String rewardPointsLogBusinessUnitReference = null;

  private String rewardPointsLogCustomerReference = null;

  private String rewardPointsLogServiceConfiguration = null;

  private String rewardPointsLogPosition = null;

  private String rewardPointsLogPositionType = null;

  private String rewardPointsLogPositionLimitTime = null;

  private Object rewardPointsLogUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reward Points Log instance 
   * @return rewardPointsLogInstanceReference
  **/

  public String getRewardPointsLogInstanceReference() {
    return rewardPointsLogInstanceReference;
  }

  public void setRewardPointsLogInstanceReference(String rewardPointsLogInstanceReference) {
    this.rewardPointsLogInstanceReference = rewardPointsLogInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between business service events logged within Reward Points Log 
   * @return rewardPointsLogParameterType
  **/

  public String getRewardPointsLogParameterType() {
    return rewardPointsLogParameterType;
  }

  public void setRewardPointsLogParameterType(String rewardPointsLogParameterType) {
    this.rewardPointsLogParameterType = rewardPointsLogParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Reward Points Log 
   * @return rewardPointsLogSelectedOption
  **/

  public String getRewardPointsLogSelectedOption() {
    return rewardPointsLogSelectedOption;
  }

  public void setRewardPointsLogSelectedOption(String rewardPointsLogSelectedOption) {
    this.rewardPointsLogSelectedOption = rewardPointsLogSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of Reward Points Log 
   * @return rewardPointsLogType
  **/

  public String getRewardPointsLogType() {
    return rewardPointsLogType;
  }

  public void setRewardPointsLogType(String rewardPointsLogType) {
    this.rewardPointsLogType = rewardPointsLogType;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who is involved in Reward Points Log 
   * @return rewardPointsLogReference
  **/

  public String getRewardPointsLogReference() {
    return rewardPointsLogReference;
  }

  public void setRewardPointsLogReference(String rewardPointsLogReference) {
    this.rewardPointsLogReference = rewardPointsLogReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business unit which is involved in Reward Points Log 
   * @return rewardPointsLogBusinessUnitReference
  **/

  public String getRewardPointsLogBusinessUnitReference() {
    return rewardPointsLogBusinessUnitReference;
  }

  public void setRewardPointsLogBusinessUnitReference(String rewardPointsLogBusinessUnitReference) {
    this.rewardPointsLogBusinessUnitReference = rewardPointsLogBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer who is involved in Reward Points Log 
   * @return rewardPointsLogCustomerReference
  **/

  public String getRewardPointsLogCustomerReference() {
    return rewardPointsLogCustomerReference;
  }

  public void setRewardPointsLogCustomerReference(String rewardPointsLogCustomerReference) {
    this.rewardPointsLogCustomerReference = rewardPointsLogCustomerReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}


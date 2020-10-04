package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAccountRetrieveInputModelRewardPointsAccountOfferedService;
import org.bian.dto.SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountRetrieveInputModel
 */
public class SDRewardPointsAccountRetrieveInputModel   {
  private Object rewardPointsAccountRetrieveActionTaskRecord = null;

  private String rewardPointsAccountRetrieveActionRequest = null;

  private SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecord rewardPointsAccountRetrieveActionRecord = null;

  private SDRewardPointsAccountRetrieveInputModelRewardPointsAccountOfferedService rewardPointsAccountOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return rewardPointsAccountRetrieveActionTaskRecord
  **/

  public Object getRewardPointsAccountRetrieveActionTaskRecord() {
    return rewardPointsAccountRetrieveActionTaskRecord;
  }

  public void setRewardPointsAccountRetrieveActionTaskRecord(Object rewardPointsAccountRetrieveActionTaskRecord) {
    this.rewardPointsAccountRetrieveActionTaskRecord = rewardPointsAccountRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return rewardPointsAccountRetrieveActionRequest
  **/

  public String getRewardPointsAccountRetrieveActionRequest() {
    return rewardPointsAccountRetrieveActionRequest;
  }

  public void setRewardPointsAccountRetrieveActionRequest(String rewardPointsAccountRetrieveActionRequest) {
    this.rewardPointsAccountRetrieveActionRequest = rewardPointsAccountRetrieveActionRequest;
  }


  /**
   * Get rewardPointsAccountRetrieveActionRecord
   * @return rewardPointsAccountRetrieveActionRecord
  **/

  public SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecord getRewardPointsAccountRetrieveActionRecord() {
    return rewardPointsAccountRetrieveActionRecord;
  }

  public void setRewardPointsAccountRetrieveActionRecord(SDRewardPointsAccountRetrieveInputModelRewardPointsAccountRetrieveActionRecord rewardPointsAccountRetrieveActionRecord) {
    this.rewardPointsAccountRetrieveActionRecord = rewardPointsAccountRetrieveActionRecord;
  }


  /**
   * Get rewardPointsAccountOfferedService
   * @return rewardPointsAccountOfferedService
  **/

  public SDRewardPointsAccountRetrieveInputModelRewardPointsAccountOfferedService getRewardPointsAccountOfferedService() {
    return rewardPointsAccountOfferedService;
  }

  public void setRewardPointsAccountOfferedService(SDRewardPointsAccountRetrieveInputModelRewardPointsAccountOfferedService rewardPointsAccountOfferedService) {
    this.rewardPointsAccountOfferedService = rewardPointsAccountOfferedService;
  }


}


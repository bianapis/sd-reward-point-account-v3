package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedService;
import org.bian.dto.SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountRetrieveOutputModel
 */
public class SDRewardPointsAccountRetrieveOutputModel   {
  private String rewardPointsAccountRetrieveActionTaskReference = null;

  private Object rewardPointsAccountRetrieveActionTaskRecord = null;

  private String rewardPointsAccountRetrieveActionResponse = null;

  private SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecord rewardPointsAccountRetrieveActionRecord = null;

  private SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedService rewardPointsAccountOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return rewardPointsAccountRetrieveActionTaskReference
  **/

  public String getRewardPointsAccountRetrieveActionTaskReference() {
    return rewardPointsAccountRetrieveActionTaskReference;
  }

  public void setRewardPointsAccountRetrieveActionTaskReference(String rewardPointsAccountRetrieveActionTaskReference) {
    this.rewardPointsAccountRetrieveActionTaskReference = rewardPointsAccountRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return rewardPointsAccountRetrieveActionResponse
  **/

  public String getRewardPointsAccountRetrieveActionResponse() {
    return rewardPointsAccountRetrieveActionResponse;
  }

  public void setRewardPointsAccountRetrieveActionResponse(String rewardPointsAccountRetrieveActionResponse) {
    this.rewardPointsAccountRetrieveActionResponse = rewardPointsAccountRetrieveActionResponse;
  }


  /**
   * Get rewardPointsAccountRetrieveActionRecord
   * @return rewardPointsAccountRetrieveActionRecord
  **/

  public SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecord getRewardPointsAccountRetrieveActionRecord() {
    return rewardPointsAccountRetrieveActionRecord;
  }

  public void setRewardPointsAccountRetrieveActionRecord(SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountRetrieveActionRecord rewardPointsAccountRetrieveActionRecord) {
    this.rewardPointsAccountRetrieveActionRecord = rewardPointsAccountRetrieveActionRecord;
  }


  /**
   * Get rewardPointsAccountOfferedService
   * @return rewardPointsAccountOfferedService
  **/

  public SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedService getRewardPointsAccountOfferedService() {
    return rewardPointsAccountOfferedService;
  }

  public void setRewardPointsAccountOfferedService(SDRewardPointsAccountRetrieveOutputModelRewardPointsAccountOfferedService rewardPointsAccountOfferedService) {
    this.rewardPointsAccountOfferedService = rewardPointsAccountOfferedService;
  }


}


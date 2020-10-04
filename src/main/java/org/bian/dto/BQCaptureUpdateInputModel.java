package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaptureUpdateInputModel
 */
public class BQCaptureUpdateInputModel   {
  private String rewardPointsLogInstanceReference = null;

  private String captureInstanceReference = null;

  private String capturePreconditions = null;

  private String captureEventSchedule = null;

  private String businessService = null;

  private String capturePostconditions = null;

  private String captureServiceType = null;

  private String captureServiceDescription = null;

  private String captureServiceInputsandOuputs = null;

  private String captureServiceWorkProduct = null;

  private Object captureUpdateActionTaskRecord = null;

  private String captureUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Reward Points Log instance 
   * @return rewardPointsLogInstanceReference
  **/

  public String getRewardPointsLogInstanceReference() {
    return rewardPointsLogInstanceReference;
  }

  public void setRewardPointsLogInstanceReference(String rewardPointsLogInstanceReference) {
    this.rewardPointsLogInstanceReference = rewardPointsLogInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Capture instance 
   * @return captureInstanceReference
  **/

  public String getCaptureInstanceReference() {
    return captureInstanceReference;
  }

  public void setCaptureInstanceReference(String captureInstanceReference) {
    this.captureInstanceReference = captureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the event is captured 
   * @return capturePreconditions
  **/

  public String getCapturePreconditions() {
    return capturePreconditions;
  }

  public void setCapturePreconditions(String capturePreconditions) {
    this.capturePreconditions = capturePreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in capturing the event 
   * @return captureEventSchedule
  **/

  public String getCaptureEventSchedule() {
    return captureEventSchedule;
  }

  public void setCaptureEventSchedule(String captureEventSchedule) {
    this.captureEventSchedule = captureEventSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Reward Points Log specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the event has been captured 
   * @return capturePostconditions
  **/

  public String getCapturePostconditions() {
    return capturePostconditions;
  }

  public void setCapturePostconditions(String capturePostconditions) {
    this.capturePostconditions = capturePostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return captureServiceType
  **/

  public String getCaptureServiceType() {
    return captureServiceType;
  }

  public void setCaptureServiceType(String captureServiceType) {
    this.captureServiceType = captureServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return captureServiceDescription
  **/

  public String getCaptureServiceDescription() {
    return captureServiceDescription;
  }

  public void setCaptureServiceDescription(String captureServiceDescription) {
    this.captureServiceDescription = captureServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return captureServiceInputsandOuputs
  **/

  public String getCaptureServiceInputsandOuputs() {
    return captureServiceInputsandOuputs;
  }

  public void setCaptureServiceInputsandOuputs(String captureServiceInputsandOuputs) {
    this.captureServiceInputsandOuputs = captureServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return captureServiceWorkProduct
  **/

  public String getCaptureServiceWorkProduct() {
    return captureServiceWorkProduct;
  }

  public void setCaptureServiceWorkProduct(String captureServiceWorkProduct) {
    this.captureServiceWorkProduct = captureServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return captureUpdateActionTaskRecord
  **/

  public Object getCaptureUpdateActionTaskRecord() {
    return captureUpdateActionTaskRecord;
  }

  public void setCaptureUpdateActionTaskRecord(Object captureUpdateActionTaskRecord) {
    this.captureUpdateActionTaskRecord = captureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return captureUpdateActionRequest
  **/

  public String getCaptureUpdateActionRequest() {
    return captureUpdateActionRequest;
  }

  public void setCaptureUpdateActionRequest(String captureUpdateActionRequest) {
    this.captureUpdateActionRequest = captureUpdateActionRequest;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExpirationUpdateOutputModel
 */
public class BQExpirationUpdateOutputModel   {
  private String expirationPreconditions = null;

  private String expirationEventSchedule = null;

  private String logEventExpiration = null;

  private String expirationPostconditions = null;

  private String expirationLogEventExpirationServiceType = null;

  private String expirationLogEventExpirationServiceDescription = null;

  private String expirationLogEventExpirationServiceInputsandOuputs = null;

  private String expirationLogEventExpirationServiceWorkProduct = null;

  private String expirationLogEventExpirationServiceName = null;

  private String expirationUpdateActionTaskReference = null;

  private Object expirationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the event is captured 
   * @return expirationPreconditions
  **/

  public String getExpirationPreconditions() {
    return expirationPreconditions;
  }

  public void setExpirationPreconditions(String expirationPreconditions) {
    this.expirationPreconditions = expirationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in capturing the event 
   * @return expirationEventSchedule
  **/

  public String getExpirationEventSchedule() {
    return expirationEventSchedule;
  }

  public void setExpirationEventSchedule(String expirationEventSchedule) {
    this.expirationEventSchedule = expirationEventSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Reward Points Log specific Business Service 
   * @return logEventExpiration
  **/

  public String getLogEventExpiration() {
    return logEventExpiration;
  }

  public void setLogEventExpiration(String logEventExpiration) {
    this.logEventExpiration = logEventExpiration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the event has been captured 
   * @return expirationPostconditions
  **/

  public String getExpirationPostconditions() {
    return expirationPostconditions;
  }

  public void setExpirationPostconditions(String expirationPostconditions) {
    this.expirationPostconditions = expirationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return expirationLogEventExpirationServiceType
  **/

  public String getExpirationLogEventExpirationServiceType() {
    return expirationLogEventExpirationServiceType;
  }

  public void setExpirationLogEventExpirationServiceType(String expirationLogEventExpirationServiceType) {
    this.expirationLogEventExpirationServiceType = expirationLogEventExpirationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return expirationLogEventExpirationServiceDescription
  **/

  public String getExpirationLogEventExpirationServiceDescription() {
    return expirationLogEventExpirationServiceDescription;
  }

  public void setExpirationLogEventExpirationServiceDescription(String expirationLogEventExpirationServiceDescription) {
    this.expirationLogEventExpirationServiceDescription = expirationLogEventExpirationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return expirationLogEventExpirationServiceInputsandOuputs
  **/

  public String getExpirationLogEventExpirationServiceInputsandOuputs() {
    return expirationLogEventExpirationServiceInputsandOuputs;
  }

  public void setExpirationLogEventExpirationServiceInputsandOuputs(String expirationLogEventExpirationServiceInputsandOuputs) {
    this.expirationLogEventExpirationServiceInputsandOuputs = expirationLogEventExpirationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return expirationLogEventExpirationServiceWorkProduct
  **/

  public String getExpirationLogEventExpirationServiceWorkProduct() {
    return expirationLogEventExpirationServiceWorkProduct;
  }

  public void setExpirationLogEventExpirationServiceWorkProduct(String expirationLogEventExpirationServiceWorkProduct) {
    this.expirationLogEventExpirationServiceWorkProduct = expirationLogEventExpirationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return expirationLogEventExpirationServiceName
  **/

  public String getExpirationLogEventExpirationServiceName() {
    return expirationLogEventExpirationServiceName;
  }

  public void setExpirationLogEventExpirationServiceName(String expirationLogEventExpirationServiceName) {
    this.expirationLogEventExpirationServiceName = expirationLogEventExpirationServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return expirationUpdateActionTaskReference
  **/

  public String getExpirationUpdateActionTaskReference() {
    return expirationUpdateActionTaskReference;
  }

  public void setExpirationUpdateActionTaskReference(String expirationUpdateActionTaskReference) {
    this.expirationUpdateActionTaskReference = expirationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return expirationUpdateActionTaskRecord
  **/

  public Object getExpirationUpdateActionTaskRecord() {
    return expirationUpdateActionTaskRecord;
  }

  public void setExpirationUpdateActionTaskRecord(Object expirationUpdateActionTaskRecord) {
    this.expirationUpdateActionTaskRecord = expirationUpdateActionTaskRecord;
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


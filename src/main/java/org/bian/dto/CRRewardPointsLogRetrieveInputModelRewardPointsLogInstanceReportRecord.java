package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRewardPointsLogRetrieveInputModelRewardPointsLogInstanceReportRecord
 */
public class CRRewardPointsLogRetrieveInputModelRewardPointsLogInstanceReportRecord   {
  private String rewardPointsLogInstanceReportReference = null;

  private String rewardPointsLogInstanceReportType = null;

  private String rewardPointsLogInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return rewardPointsLogInstanceReportReference
  **/

  public String getRewardPointsLogInstanceReportReference() {
    return rewardPointsLogInstanceReportReference;
  }

  public void setRewardPointsLogInstanceReportReference(String rewardPointsLogInstanceReportReference) {
    this.rewardPointsLogInstanceReportReference = rewardPointsLogInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return rewardPointsLogInstanceReportType
  **/

  public String getRewardPointsLogInstanceReportType() {
    return rewardPointsLogInstanceReportType;
  }

  public void setRewardPointsLogInstanceReportType(String rewardPointsLogInstanceReportType) {
    this.rewardPointsLogInstanceReportType = rewardPointsLogInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return rewardPointsLogInstanceReportParameters
  **/

  public String getRewardPointsLogInstanceReportParameters() {
    return rewardPointsLogInstanceReportParameters;
  }

  public void setRewardPointsLogInstanceReportParameters(String rewardPointsLogInstanceReportParameters) {
    this.rewardPointsLogInstanceReportParameters = rewardPointsLogInstanceReportParameters;
  }


}


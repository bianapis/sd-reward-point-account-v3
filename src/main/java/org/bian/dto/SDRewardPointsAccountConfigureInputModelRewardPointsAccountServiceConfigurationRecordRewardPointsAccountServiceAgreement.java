package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceAgreement
 */
public class SDRewardPointsAccountConfigureInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceAgreement   {
  private String rewardPointsAccountServiceAgreementReference = null;

  private String rewardPointsAccountServiceUserReference = null;

  private String rewardPointsAccountServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return rewardPointsAccountServiceAgreementReference
  **/

  public String getRewardPointsAccountServiceAgreementReference() {
    return rewardPointsAccountServiceAgreementReference;
  }

  public void setRewardPointsAccountServiceAgreementReference(String rewardPointsAccountServiceAgreementReference) {
    this.rewardPointsAccountServiceAgreementReference = rewardPointsAccountServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return rewardPointsAccountServiceUserReference
  **/

  public String getRewardPointsAccountServiceUserReference() {
    return rewardPointsAccountServiceUserReference;
  }

  public void setRewardPointsAccountServiceUserReference(String rewardPointsAccountServiceUserReference) {
    this.rewardPointsAccountServiceUserReference = rewardPointsAccountServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return rewardPointsAccountServiceAgreementTermsandConditions
  **/

  public String getRewardPointsAccountServiceAgreementTermsandConditions() {
    return rewardPointsAccountServiceAgreementTermsandConditions;
  }

  public void setRewardPointsAccountServiceAgreementTermsandConditions(String rewardPointsAccountServiceAgreementTermsandConditions) {
    this.rewardPointsAccountServiceAgreementTermsandConditions = rewardPointsAccountServiceAgreementTermsandConditions;
  }


}


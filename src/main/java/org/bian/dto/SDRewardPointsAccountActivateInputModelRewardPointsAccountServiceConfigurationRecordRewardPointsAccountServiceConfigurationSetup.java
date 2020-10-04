package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAccountActivateInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceConfigurationSetup
 */
public class SDRewardPointsAccountActivateInputModelRewardPointsAccountServiceConfigurationRecordRewardPointsAccountServiceConfigurationSetup   {
  private String rewardPointsAccountServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return rewardPointsAccountServiceConfigurationParameter
  **/

  public String getRewardPointsAccountServiceConfigurationParameter() {
    return rewardPointsAccountServiceConfigurationParameter;
  }

  public void setRewardPointsAccountServiceConfigurationParameter(String rewardPointsAccountServiceConfigurationParameter) {
    this.rewardPointsAccountServiceConfigurationParameter = rewardPointsAccountServiceConfigurationParameter;
  }


}


/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class RewardPointsAccountApiServiceImpl implements RewardPointsAccountApiService {

	public SDRewardPointsAccountActivateOutputModel activate(SDRewardPointsAccountActivateInputModel request){
		return JsonReader.read("activate-SDRewardPointsAccountActivateOutputModel.json",new TypeReference<SDRewardPointsAccountActivateOutputModel>(){});
	}
	
	public BQCaptureCaptureOutputModel captureCapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureCaptureInputModel request){
		return JsonReader.read("capture-BQCaptureCaptureOutputModel.json",new TypeReference<BQCaptureCaptureOutputModel>(){});
	}
	
	public BQExpirationCaptureOutputModel captureExpiration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExpirationCaptureInputModel request){
		return JsonReader.read("capture-BQExpirationCaptureOutputModel.json",new TypeReference<BQExpirationCaptureOutputModel>(){});
	}
	
	public CRRewardPointsLogCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRRewardPointsLogCaptureInputModel request){
		return JsonReader.read("capture-CRRewardPointsLogCaptureOutputModel.json",new TypeReference<CRRewardPointsLogCaptureOutputModel>(){});
	}
	
	public SDRewardPointsAccountConfigureOutputModel configure(String sdReferenceId, SDRewardPointsAccountConfigureInputModel request){
		return JsonReader.read("configure-SDRewardPointsAccountConfigureOutputModel.json",new TypeReference<SDRewardPointsAccountConfigureOutputModel>(){});
	}
	
	public CRRewardPointsLogControlOutputModel control(String sdReferenceId, String crReferenceId, CRRewardPointsLogControlInputModel request){
		return JsonReader.read("control-CRRewardPointsLogControlOutputModel.json",new TypeReference<CRRewardPointsLogControlOutputModel>(){});
	}
	
	public CRRewardPointsLogExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRRewardPointsLogExchangeInputModel request){
		return JsonReader.read("exchange-CRRewardPointsLogExchangeOutputModel.json",new TypeReference<CRRewardPointsLogExchangeOutputModel>(){});
	}
	
	public SDRewardPointsAccountFeedbackOutputModel feedback(String sdReferenceId, SDRewardPointsAccountFeedbackInputModel request){
		return JsonReader.read("feedback-SDRewardPointsAccountFeedbackOutputModel.json",new TypeReference<SDRewardPointsAccountFeedbackOutputModel>(){});
	}
	
	public CRRewardPointsLogGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRRewardPointsLogGrantInputModel request){
		return JsonReader.read("grant-CRRewardPointsLogGrantOutputModel.json",new TypeReference<CRRewardPointsLogGrantOutputModel>(){});
	}
	
	public CRRewardPointsLogInitiateOutputModel initiate(String sdReferenceId, CRRewardPointsLogInitiateInputModel request){
		return JsonReader.read("initiate-CRRewardPointsLogInitiateOutputModel.json",new TypeReference<CRRewardPointsLogInitiateOutputModel>(){});
	}
	
	public BQCaptureInitiateOutputModel initiateCapture(String sdReferenceId, String crReferenceId, BQCaptureInitiateInputModel request){
		return JsonReader.read("initiate-BQCaptureInitiateOutputModel.json",new TypeReference<BQCaptureInitiateOutputModel>(){});
	}
	
	public BQExpirationInitiateOutputModel initiateExpiration(String sdReferenceId, String crReferenceId, BQExpirationInitiateInputModel request){
		return JsonReader.read("initiate-BQExpirationInitiateOutputModel.json",new TypeReference<BQExpirationInitiateOutputModel>(){});
	}
	
	public CRRewardPointsLogRequestOutputModel request(String sdReferenceId, String crReferenceId, CRRewardPointsLogRequestInputModel request){
		return JsonReader.read("request-CRRewardPointsLogRequestOutputModel.json",new TypeReference<CRRewardPointsLogRequestOutputModel>(){});
	}
	
	public CRRewardPointsLogRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRRewardPointsLogRetrieveOutputModel.json",new TypeReference<CRRewardPointsLogRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQCaptureRetrieveOutputModel retrieveCapture(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCaptureRetrieveOutputModel.json",new TypeReference<BQCaptureRetrieveOutputModel>(){});
	}
	
	public BQExpirationRetrieveOutputModel retrieveExpiration(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQExpirationRetrieveOutputModel.json",new TypeReference<BQExpirationRetrieveOutputModel>(){});
	}
	
	public SDRewardPointsAccountRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDRewardPointsAccountRetrieveOutputModel.json",new TypeReference<SDRewardPointsAccountRetrieveOutputModel>(){});
	}
	
	public CRRewardPointsLogUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRRewardPointsLogUpdateInputModel request){
		return JsonReader.read("update-CRRewardPointsLogUpdateOutputModel.json",new TypeReference<CRRewardPointsLogUpdateOutputModel>(){});
	}
	
	public BQCaptureUpdateOutputModel updateCapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureUpdateInputModel request){
		return JsonReader.read("update-BQCaptureUpdateOutputModel.json",new TypeReference<BQCaptureUpdateOutputModel>(){});
	}
	
	public BQExpirationUpdateOutputModel updateExpiration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExpirationUpdateInputModel request){
		return JsonReader.read("update-BQExpirationUpdateOutputModel.json",new TypeReference<BQExpirationUpdateOutputModel>(){});
	}
	
}

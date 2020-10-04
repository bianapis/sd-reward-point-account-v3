/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface RewardPointsAccountApiService {

	SDRewardPointsAccountActivateOutputModel activate(SDRewardPointsAccountActivateInputModel request);
	
	BQCaptureCaptureOutputModel captureCapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureCaptureInputModel request);
	
	BQExpirationCaptureOutputModel captureExpiration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExpirationCaptureInputModel request);
	
	CRRewardPointsLogCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRRewardPointsLogCaptureInputModel request);
	
	SDRewardPointsAccountConfigureOutputModel configure(String sdReferenceId, SDRewardPointsAccountConfigureInputModel request);
	
	CRRewardPointsLogControlOutputModel control(String sdReferenceId, String crReferenceId, CRRewardPointsLogControlInputModel request);
	
	CRRewardPointsLogExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRRewardPointsLogExchangeInputModel request);
	
	SDRewardPointsAccountFeedbackOutputModel feedback(String sdReferenceId, SDRewardPointsAccountFeedbackInputModel request);
	
	CRRewardPointsLogGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRRewardPointsLogGrantInputModel request);
	
	CRRewardPointsLogInitiateOutputModel initiate(String sdReferenceId, CRRewardPointsLogInitiateInputModel request);
	
	BQCaptureInitiateOutputModel initiateCapture(String sdReferenceId, String crReferenceId, BQCaptureInitiateInputModel request);
	
	BQExpirationInitiateOutputModel initiateExpiration(String sdReferenceId, String crReferenceId, BQExpirationInitiateInputModel request);
	
	CRRewardPointsLogRequestOutputModel request(String sdReferenceId, String crReferenceId, CRRewardPointsLogRequestInputModel request);
	
	CRRewardPointsLogRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQCaptureRetrieveOutputModel retrieveCapture(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQExpirationRetrieveOutputModel retrieveExpiration(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDRewardPointsAccountRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRRewardPointsLogUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRRewardPointsLogUpdateInputModel request);
	
	BQCaptureUpdateOutputModel updateCapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureUpdateInputModel request);
	
	BQExpirationUpdateOutputModel updateExpiration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExpirationUpdateInputModel request);
	
}

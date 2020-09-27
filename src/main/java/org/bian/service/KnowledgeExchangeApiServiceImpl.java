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
public class KnowledgeExchangeApiServiceImpl implements KnowledgeExchangeApiService {

	public SDKnowledgeExchangeActivateOutputModel activate(SDKnowledgeExchangeActivateInputModel request){
		return JsonReader.read("activate-SDKnowledgeExchangeActivateOutputModel.json",new TypeReference<SDKnowledgeExchangeActivateOutputModel>(){});
	}
	
	public SDKnowledgeExchangeConfigureOutputModel configure(String sdReferenceId, SDKnowledgeExchangeConfigureInputModel request){
		return JsonReader.read("configure-SDKnowledgeExchangeConfigureOutputModel.json",new TypeReference<SDKnowledgeExchangeConfigureOutputModel>(){});
	}
	
	public CRIntellectualPropertyExchangeOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRIntellectualPropertyExchangeOperatingSessionControlInputModel request){
		return JsonReader.read("control-CRIntellectualPropertyExchangeOperatingSessionControlOutputModel.json",new TypeReference<CRIntellectualPropertyExchangeOperatingSessionControlOutputModel>(){});
	}
	
	public BQCaptureandClassificationExchangeOutputModel exchangeCaptureandclassification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureandClassificationExchangeInputModel request){
		return JsonReader.read("exchange-BQCaptureandClassificationExchangeOutputModel.json",new TypeReference<BQCaptureandClassificationExchangeOutputModel>(){});
	}
	
	public BQIndexingandPublicationExchangeOutputModel exchangeIndexingandpublication(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIndexingandPublicationExchangeInputModel request){
		return JsonReader.read("exchange-BQIndexingandPublicationExchangeOutputModel.json",new TypeReference<BQIndexingandPublicationExchangeOutputModel>(){});
	}
	
	public BQReviewRefinementandEditingExchangeOutputModel exchangeReviewrefinementandediting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReviewRefinementandEditingExchangeInputModel request){
		return JsonReader.read("exchange-BQReviewRefinementandEditingExchangeOutputModel.json",new TypeReference<BQReviewRefinementandEditingExchangeOutputModel>(){});
	}
	
	public CRIntellectualPropertyExchangeOperatingSessionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRIntellectualPropertyExchangeOperatingSessionExchangeInputModel request){
		return JsonReader.read("exchange-CRIntellectualPropertyExchangeOperatingSessionExchangeOutputModel.json",new TypeReference<CRIntellectualPropertyExchangeOperatingSessionExchangeOutputModel>(){});
	}
	
	public BQCaptureandClassificationExecuteOutputModel executeCaptureandclassification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureandClassificationExecuteInputModel request){
		return JsonReader.read("execute-BQCaptureandClassificationExecuteOutputModel.json",new TypeReference<BQCaptureandClassificationExecuteOutputModel>(){});
	}
	
	public CRIntellectualPropertyExchangeOperatingSessionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRIntellectualPropertyExchangeOperatingSessionExecuteInputModel request){
		return JsonReader.read("execute-CRIntellectualPropertyExchangeOperatingSessionExecuteOutputModel.json",new TypeReference<CRIntellectualPropertyExchangeOperatingSessionExecuteOutputModel>(){});
	}
	
	public SDKnowledgeExchangeFeedbackOutputModel feedback(String sdReferenceId, SDKnowledgeExchangeFeedbackInputModel request){
		return JsonReader.read("feedback-SDKnowledgeExchangeFeedbackOutputModel.json",new TypeReference<SDKnowledgeExchangeFeedbackOutputModel>(){});
	}
	
	public CRIntellectualPropertyExchangeOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRIntellectualPropertyExchangeOperatingSessionInitiateInputModel request){
		return JsonReader.read("initiate-CRIntellectualPropertyExchangeOperatingSessionInitiateOutputModel.json",new TypeReference<CRIntellectualPropertyExchangeOperatingSessionInitiateOutputModel>(){});
	}
	
	public BQCaptureandClassificationInitiateOutputModel initiateCaptureandclassification(String sdReferenceId, String crReferenceId, BQCaptureandClassificationInitiateInputModel request){
		return JsonReader.read("initiate-BQCaptureandClassificationInitiateOutputModel.json",new TypeReference<BQCaptureandClassificationInitiateOutputModel>(){});
	}
	
	public BQCaptureandClassificationRequestOutputModel requestCaptureandclassification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureandClassificationRequestInputModel request){
		return JsonReader.read("request-BQCaptureandClassificationRequestOutputModel.json",new TypeReference<BQCaptureandClassificationRequestOutputModel>(){});
	}
	
	public BQMaintenanceandAccessAdministrationRequestOutputModel requestMaintenanceandaccessadministration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceandAccessAdministrationRequestInputModel request){
		return JsonReader.read("request-BQMaintenanceandAccessAdministrationRequestOutputModel.json",new TypeReference<BQMaintenanceandAccessAdministrationRequestOutputModel>(){});
	}
	
	public CRIntellectualPropertyExchangeOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRIntellectualPropertyExchangeOperatingSessionRequestInputModel request){
		return JsonReader.read("request-CRIntellectualPropertyExchangeOperatingSessionRequestOutputModel.json",new TypeReference<CRIntellectualPropertyExchangeOperatingSessionRequestOutputModel>(){});
	}
	
	public BQArchivingRetrieveOutputModel retrieveArchiving(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQArchivingRetrieveOutputModel.json",new TypeReference<BQArchivingRetrieveOutputModel>(){});
	}
	
	public BQCaptureandClassificationRetrieveOutputModel retrieveCaptureandclassification(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCaptureandClassificationRetrieveOutputModel.json",new TypeReference<BQCaptureandClassificationRetrieveOutputModel>(){});
	}
	
	public BQIndexingandPublicationRetrieveOutputModel retrieveIndexingandpublication(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQIndexingandPublicationRetrieveOutputModel.json",new TypeReference<BQIndexingandPublicationRetrieveOutputModel>(){});
	}
	
	public BQMaintenanceandAccessAdministrationRetrieveOutputModel retrieveMaintenanceandaccessadministration(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMaintenanceandAccessAdministrationRetrieveOutputModel.json",new TypeReference<BQMaintenanceandAccessAdministrationRetrieveOutputModel>(){});
	}
	
	public BQReviewRefinementandEditingRetrieveOutputModel retrieveReviewrefinementandediting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQReviewRefinementandEditingRetrieveOutputModel.json",new TypeReference<BQReviewRefinementandEditingRetrieveOutputModel>(){});
	}
	
	public CRIntellectualPropertyExchangeOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRIntellectualPropertyExchangeOperatingSessionRetrieveOutputModel.json",new TypeReference<CRIntellectualPropertyExchangeOperatingSessionRetrieveOutputModel>(){});
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
	
	public SDKnowledgeExchangeRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDKnowledgeExchangeRetrieveOutputModel.json",new TypeReference<SDKnowledgeExchangeRetrieveOutputModel>(){});
	}
	
	public CRIntellectualPropertyExchangeOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRIntellectualPropertyExchangeOperatingSessionUpdateInputModel request){
		return JsonReader.read("update-CRIntellectualPropertyExchangeOperatingSessionUpdateOutputModel.json",new TypeReference<CRIntellectualPropertyExchangeOperatingSessionUpdateOutputModel>(){});
	}
	
	public BQCaptureandClassificationUpdateOutputModel updateCaptureandclassification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureandClassificationUpdateInputModel request){
		return JsonReader.read("update-BQCaptureandClassificationUpdateOutputModel.json",new TypeReference<BQCaptureandClassificationUpdateOutputModel>(){});
	}
	
	public BQIndexingandPublicationUpdateOutputModel updateIndexingandpublication(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIndexingandPublicationUpdateInputModel request){
		return JsonReader.read("update-BQIndexingandPublicationUpdateOutputModel.json",new TypeReference<BQIndexingandPublicationUpdateOutputModel>(){});
	}
	
	public BQMaintenanceandAccessAdministrationUpdateOutputModel updateMaintenanceandaccessadministration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceandAccessAdministrationUpdateInputModel request){
		return JsonReader.read("update-BQMaintenanceandAccessAdministrationUpdateOutputModel.json",new TypeReference<BQMaintenanceandAccessAdministrationUpdateOutputModel>(){});
	}
	
	public BQReviewRefinementandEditingUpdateOutputModel updateReviewrefinementandediting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReviewRefinementandEditingUpdateInputModel request){
		return JsonReader.read("update-BQReviewRefinementandEditingUpdateOutputModel.json",new TypeReference<BQReviewRefinementandEditingUpdateOutputModel>(){});
	}
	
}

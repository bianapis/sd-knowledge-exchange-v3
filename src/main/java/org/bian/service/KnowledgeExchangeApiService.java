/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface KnowledgeExchangeApiService {

	SDKnowledgeExchangeActivateOutputModel activate(SDKnowledgeExchangeActivateInputModel request);
	
	SDKnowledgeExchangeConfigureOutputModel configure(String sdReferenceId, SDKnowledgeExchangeConfigureInputModel request);
	
	CRIntellectualPropertyExchangeOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRIntellectualPropertyExchangeOperatingSessionControlInputModel request);
	
	BQCaptureandClassificationExchangeOutputModel exchangeCaptureandclassification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureandClassificationExchangeInputModel request);
	
	BQIndexingandPublicationExchangeOutputModel exchangeIndexingandpublication(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIndexingandPublicationExchangeInputModel request);
	
	BQReviewRefinementandEditingExchangeOutputModel exchangeReviewrefinementandediting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReviewRefinementandEditingExchangeInputModel request);
	
	CRIntellectualPropertyExchangeOperatingSessionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRIntellectualPropertyExchangeOperatingSessionExchangeInputModel request);
	
	BQCaptureandClassificationExecuteOutputModel executeCaptureandclassification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureandClassificationExecuteInputModel request);
	
	CRIntellectualPropertyExchangeOperatingSessionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRIntellectualPropertyExchangeOperatingSessionExecuteInputModel request);
	
	SDKnowledgeExchangeFeedbackOutputModel feedback(String sdReferenceId, SDKnowledgeExchangeFeedbackInputModel request);
	
	CRIntellectualPropertyExchangeOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRIntellectualPropertyExchangeOperatingSessionInitiateInputModel request);
	
	BQCaptureandClassificationInitiateOutputModel initiateCaptureandclassification(String sdReferenceId, String crReferenceId, BQCaptureandClassificationInitiateInputModel request);
	
	BQCaptureandClassificationRequestOutputModel requestCaptureandclassification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureandClassificationRequestInputModel request);
	
	BQMaintenanceandAccessAdministrationRequestOutputModel requestMaintenanceandaccessadministration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceandAccessAdministrationRequestInputModel request);
	
	CRIntellectualPropertyExchangeOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRIntellectualPropertyExchangeOperatingSessionRequestInputModel request);
	
	BQArchivingRetrieveOutputModel retrieveArchiving(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCaptureandClassificationRetrieveOutputModel retrieveCaptureandclassification(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQIndexingandPublicationRetrieveOutputModel retrieveIndexingandpublication(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMaintenanceandAccessAdministrationRetrieveOutputModel retrieveMaintenanceandaccessadministration(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQReviewRefinementandEditingRetrieveOutputModel retrieveReviewrefinementandediting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRIntellectualPropertyExchangeOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDKnowledgeExchangeRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRIntellectualPropertyExchangeOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRIntellectualPropertyExchangeOperatingSessionUpdateInputModel request);
	
	BQCaptureandClassificationUpdateOutputModel updateCaptureandclassification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaptureandClassificationUpdateInputModel request);
	
	BQIndexingandPublicationUpdateOutputModel updateIndexingandpublication(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIndexingandPublicationUpdateInputModel request);
	
	BQMaintenanceandAccessAdministrationUpdateOutputModel updateMaintenanceandaccessadministration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceandAccessAdministrationUpdateInputModel request);
	
	BQReviewRefinementandEditingUpdateOutputModel updateReviewrefinementandediting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReviewRefinementandEditingUpdateInputModel request);
	
}

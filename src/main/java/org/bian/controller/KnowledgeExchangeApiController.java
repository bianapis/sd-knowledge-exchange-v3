/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class KnowledgeExchangeApiController {

	@Autowired
	KnowledgeExchangeApiService service;
	
	@Operate.Activate
	public BianResponse<SDKnowledgeExchangeActivateOutputModel> activate(@RequestBody BianRequest<SDKnowledgeExchangeActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Operate.Configure
	public BianResponse<SDKnowledgeExchangeConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDKnowledgeExchangeConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Control
	public BianResponse<CRIntellectualPropertyExchangeOperatingSessionControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRIntellectualPropertyExchangeOperatingSessionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("captureandclassification")
	@Operate.Exchange
	public BianResponse<BQCaptureandClassificationExchangeOutputModel> exchangeCaptureandclassification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCaptureandClassificationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeCaptureandclassification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("indexingandpublication")
	@Operate.Exchange
	public BianResponse<BQIndexingandPublicationExchangeOutputModel> exchangeIndexingandpublication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQIndexingandPublicationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeIndexingandpublication(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("reviewrefinementandediting")
	@Operate.Exchange
	public BianResponse<BQReviewRefinementandEditingExchangeOutputModel> exchangeReviewrefinementandediting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReviewRefinementandEditingExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeReviewrefinementandediting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Exchange
	public BianResponse<CRIntellectualPropertyExchangeOperatingSessionExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRIntellectualPropertyExchangeOperatingSessionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("captureandclassification")
	@Operate.Execute
	public BianResponse<BQCaptureandClassificationExecuteOutputModel> executeCaptureandclassification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCaptureandClassificationExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeCaptureandclassification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Execute
	public BianResponse<CRIntellectualPropertyExchangeOperatingSessionExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRIntellectualPropertyExchangeOperatingSessionExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Feedback
	public BianResponse<SDKnowledgeExchangeFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDKnowledgeExchangeFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Initiate
	public BianResponse<CRIntellectualPropertyExchangeOperatingSessionInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRIntellectualPropertyExchangeOperatingSessionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("captureandclassification")
	@Operate.Initiate
	public BianResponse<BQCaptureandClassificationInitiateOutputModel> initiateCaptureandclassification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCaptureandClassificationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateCaptureandclassification(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("captureandclassification")
	@Operate.Request
	public BianResponse<BQCaptureandClassificationRequestOutputModel> requestCaptureandclassification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCaptureandClassificationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestCaptureandclassification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintenanceandaccessadministration")
	@Operate.Request
	public BianResponse<BQMaintenanceandAccessAdministrationRequestOutputModel> requestMaintenanceandaccessadministration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMaintenanceandAccessAdministrationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestMaintenanceandaccessadministration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Request
	public BianResponse<CRIntellectualPropertyExchangeOperatingSessionRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRIntellectualPropertyExchangeOperatingSessionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("archiving")
	@Operate.Retrieve
	public BianResponse<BQArchivingRetrieveOutputModel> retrieveArchiving(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveArchiving(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("captureandclassification")
	@Operate.Retrieve
	public BianResponse<BQCaptureandClassificationRetrieveOutputModel> retrieveCaptureandclassification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCaptureandclassification(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("indexingandpublication")
	@Operate.Retrieve
	public BianResponse<BQIndexingandPublicationRetrieveOutputModel> retrieveIndexingandpublication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveIndexingandpublication(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("maintenanceandaccessadministration")
	@Operate.Retrieve
	public BianResponse<BQMaintenanceandAccessAdministrationRetrieveOutputModel> retrieveMaintenanceandaccessadministration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMaintenanceandaccessadministration(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("reviewrefinementandediting")
	@Operate.Retrieve
	public BianResponse<BQReviewRefinementandEditingRetrieveOutputModel> retrieveReviewrefinementandediting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReviewrefinementandediting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Operate.Retrieve
	public BianResponse<CRIntellectualPropertyExchangeOperatingSessionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Operate.RetrieveSD
	public BianResponse<SDKnowledgeExchangeRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Operate.Update
	public BianResponse<CRIntellectualPropertyExchangeOperatingSessionUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRIntellectualPropertyExchangeOperatingSessionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("captureandclassification")
	@Operate.Update
	public BianResponse<BQCaptureandClassificationUpdateOutputModel> updateCaptureandclassification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCaptureandClassificationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCaptureandclassification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("indexingandpublication")
	@Operate.Update
	public BianResponse<BQIndexingandPublicationUpdateOutputModel> updateIndexingandpublication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQIndexingandPublicationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateIndexingandpublication(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintenanceandaccessadministration")
	@Operate.Update
	public BianResponse<BQMaintenanceandAccessAdministrationUpdateOutputModel> updateMaintenanceandaccessadministration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMaintenanceandAccessAdministrationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateMaintenanceandaccessadministration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("reviewrefinementandediting")
	@Operate.Update
	public BianResponse<BQReviewRefinementandEditingUpdateOutputModel> updateReviewrefinementandediting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReviewRefinementandEditingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateReviewrefinementandediting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}

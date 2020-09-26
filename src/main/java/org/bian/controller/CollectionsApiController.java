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
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class CollectionsApiController {

	@Autowired
	CollectionsApiService service;
	
	@Process.Activate
	public BianResponse<SDCollectionsActivateOutputModel> activate(@RequestBody BianRequest<SDCollectionsActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Process.Configure
	public BianResponse<SDCollectionsConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCollectionsConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Control
	public BianResponse<CRCollateralAssetLiquidationProcedureControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCollateralAssetLiquidationProcedureControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("collateralliquidation")
	@Process.Exchange
	public BianResponse<BQCollateralLiquidationExchangeOutputModel> exchangeCollateralliquidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCollateralLiquidationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeCollateralliquidation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("collateralvaluation")
	@Process.Exchange
	public BianResponse<BQCollateralValuationExchangeOutputModel> exchangeCollateralvaluation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCollateralValuationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeCollateralvaluation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("debtfactoring")
	@Process.Exchange
	public BianResponse<BQDebtFactoringExchangeOutputModel> exchangeDebtfactoring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDebtFactoringExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeDebtfactoring(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Exchange
	public BianResponse<CRCollateralAssetLiquidationProcedureExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCollateralAssetLiquidationProcedureExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Execute
	public BianResponse<CRCollateralAssetLiquidationProcedureExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCollateralAssetLiquidationProcedureExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Feedback
	public BianResponse<SDCollectionsFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCollectionsFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Initiate
	public BianResponse<CRCollateralAssetLiquidationProcedureInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCollateralAssetLiquidationProcedureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("collateralliquidation")
	@Process.Initiate
	public BianResponse<BQCollateralLiquidationInitiateOutputModel> initiateCollateralliquidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCollateralLiquidationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateCollateralliquidation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("collateralvaluation")
	@Process.Initiate
	public BianResponse<BQCollateralValuationInitiateOutputModel> initiateCollateralvaluation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCollateralValuationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateCollateralvaluation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("collectionsassessment")
	@Process.Initiate
	public BianResponse<BQCollectionsAssessmentInitiateOutputModel> initiateCollectionsassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCollectionsAssessmentInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateCollectionsassessment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("debtfactoring")
	@Process.Initiate
	public BianResponse<BQDebtFactoringInitiateOutputModel> initiateDebtfactoring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQDebtFactoringInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateDebtfactoring(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Request
	public BianResponse<CRCollateralAssetLiquidationProcedureRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCollateralAssetLiquidationProcedureRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("collateralliquidation")
	@Process.Retrieve
	public BianResponse<BQCollateralLiquidationRetrieveOutputModel> retrieveCollateralliquidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCollateralliquidation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("collateralvaluation")
	@Process.Retrieve
	public BianResponse<BQCollateralValuationRetrieveOutputModel> retrieveCollateralvaluation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCollateralvaluation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("collectionsaccountupdate")
	@Process.Retrieve
	public BianResponse<BQCollectionsAccountUpdateRetrieveOutputModel> retrieveCollectionsaccountupdate(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCollectionsaccountupdate(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("collectionsassessment")
	@Process.Retrieve
	public BianResponse<BQCollectionsAssessmentRetrieveOutputModel> retrieveCollectionsassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCollectionsassessment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("debtfactoring")
	@Process.Retrieve
	public BianResponse<BQDebtFactoringRetrieveOutputModel> retrieveDebtfactoring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDebtfactoring(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Process.Retrieve
	public BianResponse<CRCollateralAssetLiquidationProcedureRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Process.RetrieveSD
	public BianResponse<SDCollectionsRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Process.Update
	public BianResponse<CRCollateralAssetLiquidationProcedureUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCollateralAssetLiquidationProcedureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("collateralliquidation")
	@Process.Update
	public BianResponse<BQCollateralLiquidationUpdateOutputModel> updateCollateralliquidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCollateralLiquidationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCollateralliquidation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("collateralvaluation")
	@Process.Update
	public BianResponse<BQCollateralValuationUpdateOutputModel> updateCollateralvaluation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCollateralValuationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCollateralvaluation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("collectionsaccountupdate")
	@Process.Update
	public BianResponse<BQCollectionsAccountUpdateUpdateOutputModel> updateCollectionsaccountupdate(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCollectionsAccountUpdateUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCollectionsaccountupdate(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("collectionsassessment")
	@Process.Update
	public BianResponse<BQCollectionsAssessmentUpdateOutputModel> updateCollectionsassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCollectionsAssessmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCollectionsassessment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("debtfactoring")
	@Process.Update
	public BianResponse<BQDebtFactoringUpdateOutputModel> updateDebtfactoring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDebtFactoringUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDebtfactoring(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}

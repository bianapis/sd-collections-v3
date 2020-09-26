/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CollectionsApiService {

	SDCollectionsActivateOutputModel activate(SDCollectionsActivateInputModel request);
	
	SDCollectionsConfigureOutputModel configure(String sdReferenceId, SDCollectionsConfigureInputModel request);
	
	CRCollateralAssetLiquidationProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCollateralAssetLiquidationProcedureControlInputModel request);
	
	BQCollateralLiquidationExchangeOutputModel exchangeCollateralliquidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralLiquidationExchangeInputModel request);
	
	BQCollateralValuationExchangeOutputModel exchangeCollateralvaluation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralValuationExchangeInputModel request);
	
	BQDebtFactoringExchangeOutputModel exchangeDebtfactoring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDebtFactoringExchangeInputModel request);
	
	CRCollateralAssetLiquidationProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCollateralAssetLiquidationProcedureExchangeInputModel request);
	
	CRCollateralAssetLiquidationProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCollateralAssetLiquidationProcedureExecuteInputModel request);
	
	SDCollectionsFeedbackOutputModel feedback(String sdReferenceId, SDCollectionsFeedbackInputModel request);
	
	CRCollateralAssetLiquidationProcedureInitiateOutputModel initiate(String sdReferenceId, CRCollateralAssetLiquidationProcedureInitiateInputModel request);
	
	BQCollateralLiquidationInitiateOutputModel initiateCollateralliquidation(String sdReferenceId, String crReferenceId, BQCollateralLiquidationInitiateInputModel request);
	
	BQCollateralValuationInitiateOutputModel initiateCollateralvaluation(String sdReferenceId, String crReferenceId, BQCollateralValuationInitiateInputModel request);
	
	BQCollectionsAssessmentInitiateOutputModel initiateCollectionsassessment(String sdReferenceId, String crReferenceId, BQCollectionsAssessmentInitiateInputModel request);
	
	BQDebtFactoringInitiateOutputModel initiateDebtfactoring(String sdReferenceId, String crReferenceId, BQDebtFactoringInitiateInputModel request);
	
	CRCollateralAssetLiquidationProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCollateralAssetLiquidationProcedureRequestInputModel request);
	
	BQCollateralLiquidationRetrieveOutputModel retrieveCollateralliquidation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCollateralValuationRetrieveOutputModel retrieveCollateralvaluation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCollectionsAccountUpdateRetrieveOutputModel retrieveCollectionsaccountupdate(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCollectionsAssessmentRetrieveOutputModel retrieveCollectionsassessment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDebtFactoringRetrieveOutputModel retrieveDebtfactoring(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRCollateralAssetLiquidationProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCollectionsRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCollateralAssetLiquidationProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCollateralAssetLiquidationProcedureUpdateInputModel request);
	
	BQCollateralLiquidationUpdateOutputModel updateCollateralliquidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralLiquidationUpdateInputModel request);
	
	BQCollateralValuationUpdateOutputModel updateCollateralvaluation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralValuationUpdateInputModel request);
	
	BQCollectionsAccountUpdateUpdateOutputModel updateCollectionsaccountupdate(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollectionsAccountUpdateUpdateInputModel request);
	
	BQCollectionsAssessmentUpdateOutputModel updateCollectionsassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollectionsAssessmentUpdateInputModel request);
	
	BQDebtFactoringUpdateOutputModel updateDebtfactoring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDebtFactoringUpdateInputModel request);
	
}

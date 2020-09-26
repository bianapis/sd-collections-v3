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
public class CollectionsApiServiceImpl implements CollectionsApiService {

	public SDCollectionsActivateOutputModel activate(SDCollectionsActivateInputModel request){
		return JsonReader.read("activate-SDCollectionsActivateOutputModel.json",new TypeReference<SDCollectionsActivateOutputModel>(){});
	}
	
	public SDCollectionsConfigureOutputModel configure(String sdReferenceId, SDCollectionsConfigureInputModel request){
		return JsonReader.read("configure-SDCollectionsConfigureOutputModel.json",new TypeReference<SDCollectionsConfigureOutputModel>(){});
	}
	
	public CRCollateralAssetLiquidationProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCollateralAssetLiquidationProcedureControlInputModel request){
		return JsonReader.read("control-CRCollateralAssetLiquidationProcedureControlOutputModel.json",new TypeReference<CRCollateralAssetLiquidationProcedureControlOutputModel>(){});
	}
	
	public BQCollateralLiquidationExchangeOutputModel exchangeCollateralliquidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralLiquidationExchangeInputModel request){
		return JsonReader.read("exchange-BQCollateralLiquidationExchangeOutputModel.json",new TypeReference<BQCollateralLiquidationExchangeOutputModel>(){});
	}
	
	public BQCollateralValuationExchangeOutputModel exchangeCollateralvaluation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralValuationExchangeInputModel request){
		return JsonReader.read("exchange-BQCollateralValuationExchangeOutputModel.json",new TypeReference<BQCollateralValuationExchangeOutputModel>(){});
	}
	
	public BQDebtFactoringExchangeOutputModel exchangeDebtfactoring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDebtFactoringExchangeInputModel request){
		return JsonReader.read("exchange-BQDebtFactoringExchangeOutputModel.json",new TypeReference<BQDebtFactoringExchangeOutputModel>(){});
	}
	
	public CRCollateralAssetLiquidationProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCollateralAssetLiquidationProcedureExchangeInputModel request){
		return JsonReader.read("exchange-CRCollateralAssetLiquidationProcedureExchangeOutputModel.json",new TypeReference<CRCollateralAssetLiquidationProcedureExchangeOutputModel>(){});
	}
	
	public CRCollateralAssetLiquidationProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCollateralAssetLiquidationProcedureExecuteInputModel request){
		return JsonReader.read("execute-CRCollateralAssetLiquidationProcedureExecuteOutputModel.json",new TypeReference<CRCollateralAssetLiquidationProcedureExecuteOutputModel>(){});
	}
	
	public SDCollectionsFeedbackOutputModel feedback(String sdReferenceId, SDCollectionsFeedbackInputModel request){
		return JsonReader.read("feedback-SDCollectionsFeedbackOutputModel.json",new TypeReference<SDCollectionsFeedbackOutputModel>(){});
	}
	
	public CRCollateralAssetLiquidationProcedureInitiateOutputModel initiate(String sdReferenceId, CRCollateralAssetLiquidationProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRCollateralAssetLiquidationProcedureInitiateOutputModel.json",new TypeReference<CRCollateralAssetLiquidationProcedureInitiateOutputModel>(){});
	}
	
	public BQCollateralLiquidationInitiateOutputModel initiateCollateralliquidation(String sdReferenceId, String crReferenceId, BQCollateralLiquidationInitiateInputModel request){
		return JsonReader.read("initiate-BQCollateralLiquidationInitiateOutputModel.json",new TypeReference<BQCollateralLiquidationInitiateOutputModel>(){});
	}
	
	public BQCollateralValuationInitiateOutputModel initiateCollateralvaluation(String sdReferenceId, String crReferenceId, BQCollateralValuationInitiateInputModel request){
		return JsonReader.read("initiate-BQCollateralValuationInitiateOutputModel.json",new TypeReference<BQCollateralValuationInitiateOutputModel>(){});
	}
	
	public BQCollectionsAssessmentInitiateOutputModel initiateCollectionsassessment(String sdReferenceId, String crReferenceId, BQCollectionsAssessmentInitiateInputModel request){
		return JsonReader.read("initiate-BQCollectionsAssessmentInitiateOutputModel.json",new TypeReference<BQCollectionsAssessmentInitiateOutputModel>(){});
	}
	
	public BQDebtFactoringInitiateOutputModel initiateDebtfactoring(String sdReferenceId, String crReferenceId, BQDebtFactoringInitiateInputModel request){
		return JsonReader.read("initiate-BQDebtFactoringInitiateOutputModel.json",new TypeReference<BQDebtFactoringInitiateOutputModel>(){});
	}
	
	public CRCollateralAssetLiquidationProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCollateralAssetLiquidationProcedureRequestInputModel request){
		return JsonReader.read("request-CRCollateralAssetLiquidationProcedureRequestOutputModel.json",new TypeReference<CRCollateralAssetLiquidationProcedureRequestOutputModel>(){});
	}
	
	public BQCollateralLiquidationRetrieveOutputModel retrieveCollateralliquidation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCollateralLiquidationRetrieveOutputModel.json",new TypeReference<BQCollateralLiquidationRetrieveOutputModel>(){});
	}
	
	public BQCollateralValuationRetrieveOutputModel retrieveCollateralvaluation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCollateralValuationRetrieveOutputModel.json",new TypeReference<BQCollateralValuationRetrieveOutputModel>(){});
	}
	
	public BQCollectionsAccountUpdateRetrieveOutputModel retrieveCollectionsaccountupdate(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCollectionsAccountUpdateRetrieveOutputModel.json",new TypeReference<BQCollectionsAccountUpdateRetrieveOutputModel>(){});
	}
	
	public BQCollectionsAssessmentRetrieveOutputModel retrieveCollectionsassessment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCollectionsAssessmentRetrieveOutputModel.json",new TypeReference<BQCollectionsAssessmentRetrieveOutputModel>(){});
	}
	
	public BQDebtFactoringRetrieveOutputModel retrieveDebtfactoring(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDebtFactoringRetrieveOutputModel.json",new TypeReference<BQDebtFactoringRetrieveOutputModel>(){});
	}
	
	public CRCollateralAssetLiquidationProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCollateralAssetLiquidationProcedureRetrieveOutputModel.json",new TypeReference<CRCollateralAssetLiquidationProcedureRetrieveOutputModel>(){});
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
	
	public SDCollectionsRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCollectionsRetrieveOutputModel.json",new TypeReference<SDCollectionsRetrieveOutputModel>(){});
	}
	
	public CRCollateralAssetLiquidationProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCollateralAssetLiquidationProcedureUpdateInputModel request){
		return JsonReader.read("update-CRCollateralAssetLiquidationProcedureUpdateOutputModel.json",new TypeReference<CRCollateralAssetLiquidationProcedureUpdateOutputModel>(){});
	}
	
	public BQCollateralLiquidationUpdateOutputModel updateCollateralliquidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralLiquidationUpdateInputModel request){
		return JsonReader.read("update-BQCollateralLiquidationUpdateOutputModel.json",new TypeReference<BQCollateralLiquidationUpdateOutputModel>(){});
	}
	
	public BQCollateralValuationUpdateOutputModel updateCollateralvaluation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralValuationUpdateInputModel request){
		return JsonReader.read("update-BQCollateralValuationUpdateOutputModel.json",new TypeReference<BQCollateralValuationUpdateOutputModel>(){});
	}
	
	public BQCollectionsAccountUpdateUpdateOutputModel updateCollectionsaccountupdate(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollectionsAccountUpdateUpdateInputModel request){
		return JsonReader.read("update-BQCollectionsAccountUpdateUpdateOutputModel.json",new TypeReference<BQCollectionsAccountUpdateUpdateOutputModel>(){});
	}
	
	public BQCollectionsAssessmentUpdateOutputModel updateCollectionsassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollectionsAssessmentUpdateInputModel request){
		return JsonReader.read("update-BQCollectionsAssessmentUpdateOutputModel.json",new TypeReference<BQCollectionsAssessmentUpdateOutputModel>(){});
	}
	
	public BQDebtFactoringUpdateOutputModel updateDebtfactoring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDebtFactoringUpdateInputModel request){
		return JsonReader.read("update-BQDebtFactoringUpdateOutputModel.json",new TypeReference<BQDebtFactoringUpdateOutputModel>(){});
	}
	
}

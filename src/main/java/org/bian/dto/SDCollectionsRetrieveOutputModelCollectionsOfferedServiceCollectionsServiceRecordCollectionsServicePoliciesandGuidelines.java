package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCollectionsRetrieveOutputModelCollectionsOfferedServiceCollectionsServiceRecordCollectionsServicePoliciesandGuidelines
 */
public class SDCollectionsRetrieveOutputModelCollectionsOfferedServiceCollectionsServiceRecordCollectionsServicePoliciesandGuidelines   {
  private String collectionsServiceEligibility = null;

  private String collectionsServiceIntendedUses = null;

  private String collectionsServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return collectionsServiceEligibility
  **/

  public String getCollectionsServiceEligibility() {
    return collectionsServiceEligibility;
  }

  public void setCollectionsServiceEligibility(String collectionsServiceEligibility) {
    this.collectionsServiceEligibility = collectionsServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return collectionsServiceIntendedUses
  **/

  public String getCollectionsServiceIntendedUses() {
    return collectionsServiceIntendedUses;
  }

  public void setCollectionsServiceIntendedUses(String collectionsServiceIntendedUses) {
    this.collectionsServiceIntendedUses = collectionsServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return collectionsServicePricingandTerms
  **/

  public String getCollectionsServicePricingandTerms() {
    return collectionsServicePricingandTerms;
  }

  public void setCollectionsServicePricingandTerms(String collectionsServicePricingandTerms) {
    this.collectionsServicePricingandTerms = collectionsServicePricingandTerms;
  }


}


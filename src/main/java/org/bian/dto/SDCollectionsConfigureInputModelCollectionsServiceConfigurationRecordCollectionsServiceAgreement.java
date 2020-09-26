package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceAgreement
 */
public class SDCollectionsConfigureInputModelCollectionsServiceConfigurationRecordCollectionsServiceAgreement   {
  private String collectionsServiceAgreementReference = null;

  private String collectionsServiceUserReference = null;

  private String collectionsServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return collectionsServiceAgreementReference
  **/

  public String getCollectionsServiceAgreementReference() {
    return collectionsServiceAgreementReference;
  }

  public void setCollectionsServiceAgreementReference(String collectionsServiceAgreementReference) {
    this.collectionsServiceAgreementReference = collectionsServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return collectionsServiceUserReference
  **/

  public String getCollectionsServiceUserReference() {
    return collectionsServiceUserReference;
  }

  public void setCollectionsServiceUserReference(String collectionsServiceUserReference) {
    this.collectionsServiceUserReference = collectionsServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return collectionsServiceAgreementTermsandConditions
  **/

  public String getCollectionsServiceAgreementTermsandConditions() {
    return collectionsServiceAgreementTermsandConditions;
  }

  public void setCollectionsServiceAgreementTermsandConditions(String collectionsServiceAgreementTermsandConditions) {
    this.collectionsServiceAgreementTermsandConditions = collectionsServiceAgreementTermsandConditions;
  }


}


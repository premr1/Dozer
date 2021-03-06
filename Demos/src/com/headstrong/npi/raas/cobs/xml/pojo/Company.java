//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.16 at 11:38:43 AM IST 
//


package com.headstrong.npi.raas.cobs.xml.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Company complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Company">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.markit.com}Entity">
 *       &lt;sequence>
 *         &lt;element name="entityType" type="{http://www.markit.com}AttributeEntityType" minOccurs="0"/>
 *         &lt;element name="structure" type="{http://www.markit.com}AttributeEntityStructure" minOccurs="0"/>
 *         &lt;element name="legalForm" type="{http://www.markit.com}AttributeString" minOccurs="0"/>
 *         &lt;element name="legalName" type="{http://www.markit.com}AttributeString" minOccurs="0"/>
 *         &lt;element name="shortName" type="{http://www.markit.com}AttributeString" minOccurs="0"/>
 *         &lt;element name="tradingAs" type="{http://www.markit.com}AttributeString" minOccurs="0"/>
 *         &lt;element name="immediateParent" type="{http://www.markit.com}AttributeCompany" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ultimateParent" type="{http://www.markit.com}AttributeCompany" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedParty" type="{http://www.markit.com}AttributeCompanyRelatedParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="beneficialOwner" type="{http://www.markit.com}AttributeCompanyBeneficialOwner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.markit.com}AttributeCompanyContact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="controllerDirector" type="{http://www.markit.com}AttributeCompanyControllerDirector" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="formation" type="{http://www.markit.com}AttributeCompanyFormation" minOccurs="0"/>
 *         &lt;element name="governmentIDInfo" type="{http://www.markit.com}AttributeCompanyGovernmentIDInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="licenseInfo" type="{http://www.markit.com}AttributeCompanyLicenseInfo" minOccurs="0"/>
 *         &lt;element name="industryIdentifier" type="{http://www.markit.com}AttributeCompanyIndustryIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="financialInfo" type="{http://www.markit.com}AttributeCompanyFinancialInfo" minOccurs="0"/>
 *         &lt;element name="countryOfBusiness" type="{http://www.markit.com}AttributeCompanyCountryOfBusiness" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessActivity" type="{http://www.markit.com}AttributeCompanyBusinessActivity" minOccurs="0"/>
 *         &lt;element name="regulatedInfo" type="{http://www.markit.com}AttributeCompanyRegulatedInfo" minOccurs="0"/>
 *         &lt;element name="governmentOwnership" type="{http://www.markit.com}AttributeCompanyGovernmentOwnership" minOccurs="0"/>
 *         &lt;element name="listedInfo" type="{http://www.markit.com}AttributeCompanyListedInfo" minOccurs="0"/>
 *         &lt;element name="bearerShare" type="{http://www.markit.com}AttributeCompanyBearerShare" minOccurs="0"/>
 *         &lt;element name="entityName" type="{http://www.markit.com}AttributeCompanyEntityName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessActivityIndustryCode" type="{http://www.markit.com}AttributeCompanyBusinessActivityIndustryCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aml" type="{http://www.markit.com}AttributeCompanyAML" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Company", propOrder = {
    "entityType",
    "structure",
    "legalForm",
    "legalName",
    "shortName",
    "tradingAs",
    "immediateParent",
    "ultimateParent",
    "relatedParty",
    "beneficialOwner",
    "contact",
    "controllerDirector",
    "formation",
    "governmentIDInfo",
    "licenseInfo",
    "industryIdentifier",
    "financialInfo",
    "countryOfBusiness",
    "businessActivity",
    "regulatedInfo",
    "governmentOwnership",
    "listedInfo",
    "bearerShare",
    "entityName",
    "businessActivityIndustryCode",
    "aml"
})
public class Company
    extends Entity
{

    protected AttributeEntityType entityType;
    protected AttributeEntityStructure structure;
    protected AttributeString legalForm;
    protected AttributeString legalName;
    protected AttributeString shortName;
    protected AttributeString tradingAs;
    protected List<AttributeCompany> immediateParent;
    protected List<AttributeCompany> ultimateParent;
    protected List<AttributeCompanyRelatedParty> relatedParty;
    protected List<AttributeCompanyBeneficialOwner> beneficialOwner;
    protected List<AttributeCompanyContact> contact;
    protected List<AttributeCompanyControllerDirector> controllerDirector;
    protected AttributeCompanyFormation formation;
    protected List<AttributeCompanyGovernmentIDInfo> governmentIDInfo;
    protected AttributeCompanyLicenseInfo licenseInfo;
    protected List<AttributeCompanyIndustryIdentifier> industryIdentifier;
    protected AttributeCompanyFinancialInfo financialInfo;
    protected List<AttributeCompanyCountryOfBusiness> countryOfBusiness;
    protected AttributeCompanyBusinessActivity businessActivity;
    protected AttributeCompanyRegulatedInfo regulatedInfo;
    protected AttributeCompanyGovernmentOwnership governmentOwnership;
    protected AttributeCompanyListedInfo listedInfo;
    protected AttributeCompanyBearerShare bearerShare;
    protected List<AttributeCompanyEntityName> entityName;
    protected List<AttributeCompanyBusinessActivityIndustryCode> businessActivityIndustryCode;
    protected AttributeCompanyAML aml;

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeEntityType }
     *     
     */
    public AttributeEntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeEntityType }
     *     
     */
    public void setEntityType(AttributeEntityType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the structure property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeEntityStructure }
     *     
     */
    public AttributeEntityStructure getStructure() {
        return structure;
    }

    /**
     * Sets the value of the structure property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeEntityStructure }
     *     
     */
    public void setStructure(AttributeEntityStructure value) {
        this.structure = value;
    }

    /**
     * Gets the value of the legalForm property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeString }
     *     
     */
    public AttributeString getLegalForm() {
        return legalForm;
    }

    /**
     * Sets the value of the legalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeString }
     *     
     */
    public void setLegalForm(AttributeString value) {
        this.legalForm = value;
    }

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeString }
     *     
     */
    public AttributeString getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeString }
     *     
     */
    public void setLegalName(AttributeString value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeString }
     *     
     */
    public AttributeString getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeString }
     *     
     */
    public void setShortName(AttributeString value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the tradingAs property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeString }
     *     
     */
    public AttributeString getTradingAs() {
        return tradingAs;
    }

    /**
     * Sets the value of the tradingAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeString }
     *     
     */
    public void setTradingAs(AttributeString value) {
        this.tradingAs = value;
    }

    /**
     * Gets the value of the immediateParent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the immediateParent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImmediateParent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeCompany }
     * 
     * 
     */
    public List<AttributeCompany> getImmediateParent() {
        if (immediateParent == null) {
            immediateParent = new ArrayList<AttributeCompany>();
        }
        return this.immediateParent;
    }

    /**
     * Gets the value of the ultimateParent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ultimateParent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUltimateParent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeCompany }
     * 
     * 
     */
    public List<AttributeCompany> getUltimateParent() {
        if (ultimateParent == null) {
            ultimateParent = new ArrayList<AttributeCompany>();
        }
        return this.ultimateParent;
    }

    /**
     * Gets the value of the relatedParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeCompanyRelatedParty }
     * 
     * 
     */
    public List<AttributeCompanyRelatedParty> getRelatedParty() {
        if (relatedParty == null) {
            relatedParty = new ArrayList<AttributeCompanyRelatedParty>();
        }
        return this.relatedParty;
    }

    /**
     * Gets the value of the beneficialOwner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficialOwner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficialOwner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeCompanyBeneficialOwner }
     * 
     * 
     */
    public List<AttributeCompanyBeneficialOwner> getBeneficialOwner() {
        if (beneficialOwner == null) {
            beneficialOwner = new ArrayList<AttributeCompanyBeneficialOwner>();
        }
        return this.beneficialOwner;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeCompanyContact }
     * 
     * 
     */
    public List<AttributeCompanyContact> getContact() {
        if (contact == null) {
            contact = new ArrayList<AttributeCompanyContact>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the controllerDirector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controllerDirector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControllerDirector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeCompanyControllerDirector }
     * 
     * 
     */
    public List<AttributeCompanyControllerDirector> getControllerDirector() {
        if (controllerDirector == null) {
            controllerDirector = new ArrayList<AttributeCompanyControllerDirector>();
        }
        return this.controllerDirector;
    }

    /**
     * Gets the value of the formation property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeCompanyFormation }
     *     
     */
    public AttributeCompanyFormation getFormation() {
        return formation;
    }

    /**
     * Sets the value of the formation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeCompanyFormation }
     *     
     */
    public void setFormation(AttributeCompanyFormation value) {
        this.formation = value;
    }

    /**
     * Gets the value of the governmentIDInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the governmentIDInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovernmentIDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeCompanyGovernmentIDInfo }
     * 
     * 
     */
    public List<AttributeCompanyGovernmentIDInfo> getGovernmentIDInfo() {
        if (governmentIDInfo == null) {
            governmentIDInfo = new ArrayList<AttributeCompanyGovernmentIDInfo>();
        }
        return this.governmentIDInfo;
    }

    /**
     * Gets the value of the licenseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeCompanyLicenseInfo }
     *     
     */
    public AttributeCompanyLicenseInfo getLicenseInfo() {
        return licenseInfo;
    }

    /**
     * Sets the value of the licenseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeCompanyLicenseInfo }
     *     
     */
    public void setLicenseInfo(AttributeCompanyLicenseInfo value) {
        this.licenseInfo = value;
    }

    /**
     * Gets the value of the industryIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustryIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeCompanyIndustryIdentifier }
     * 
     * 
     */
    public List<AttributeCompanyIndustryIdentifier> getIndustryIdentifier() {
        if (industryIdentifier == null) {
            industryIdentifier = new ArrayList<AttributeCompanyIndustryIdentifier>();
        }
        return this.industryIdentifier;
    }

    /**
     * Gets the value of the financialInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeCompanyFinancialInfo }
     *     
     */
    public AttributeCompanyFinancialInfo getFinancialInfo() {
        return financialInfo;
    }

    /**
     * Sets the value of the financialInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeCompanyFinancialInfo }
     *     
     */
    public void setFinancialInfo(AttributeCompanyFinancialInfo value) {
        this.financialInfo = value;
    }

    /**
     * Gets the value of the countryOfBusiness property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryOfBusiness property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryOfBusiness().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeCompanyCountryOfBusiness }
     * 
     * 
     */
    public List<AttributeCompanyCountryOfBusiness> getCountryOfBusiness() {
        if (countryOfBusiness == null) {
            countryOfBusiness = new ArrayList<AttributeCompanyCountryOfBusiness>();
        }
        return this.countryOfBusiness;
    }

    /**
     * Gets the value of the businessActivity property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeCompanyBusinessActivity }
     *     
     */
    public AttributeCompanyBusinessActivity getBusinessActivity() {
        return businessActivity;
    }

    /**
     * Sets the value of the businessActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeCompanyBusinessActivity }
     *     
     */
    public void setBusinessActivity(AttributeCompanyBusinessActivity value) {
        this.businessActivity = value;
    }

    /**
     * Gets the value of the regulatedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeCompanyRegulatedInfo }
     *     
     */
    public AttributeCompanyRegulatedInfo getRegulatedInfo() {
        return regulatedInfo;
    }

    /**
     * Sets the value of the regulatedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeCompanyRegulatedInfo }
     *     
     */
    public void setRegulatedInfo(AttributeCompanyRegulatedInfo value) {
        this.regulatedInfo = value;
    }

    /**
     * Gets the value of the governmentOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeCompanyGovernmentOwnership }
     *     
     */
    public AttributeCompanyGovernmentOwnership getGovernmentOwnership() {
        return governmentOwnership;
    }

    /**
     * Sets the value of the governmentOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeCompanyGovernmentOwnership }
     *     
     */
    public void setGovernmentOwnership(AttributeCompanyGovernmentOwnership value) {
        this.governmentOwnership = value;
    }

    /**
     * Gets the value of the listedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeCompanyListedInfo }
     *     
     */
    public AttributeCompanyListedInfo getListedInfo() {
        return listedInfo;
    }

    /**
     * Sets the value of the listedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeCompanyListedInfo }
     *     
     */
    public void setListedInfo(AttributeCompanyListedInfo value) {
        this.listedInfo = value;
    }

    /**
     * Gets the value of the bearerShare property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeCompanyBearerShare }
     *     
     */
    public AttributeCompanyBearerShare getBearerShare() {
        return bearerShare;
    }

    /**
     * Sets the value of the bearerShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeCompanyBearerShare }
     *     
     */
    public void setBearerShare(AttributeCompanyBearerShare value) {
        this.bearerShare = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeCompanyEntityName }
     * 
     * 
     */
    public List<AttributeCompanyEntityName> getEntityName() {
        if (entityName == null) {
            entityName = new ArrayList<AttributeCompanyEntityName>();
        }
        return this.entityName;
    }

    /**
     * Gets the value of the businessActivityIndustryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessActivityIndustryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessActivityIndustryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeCompanyBusinessActivityIndustryCode }
     * 
     * 
     */
    public List<AttributeCompanyBusinessActivityIndustryCode> getBusinessActivityIndustryCode() {
        if (businessActivityIndustryCode == null) {
            businessActivityIndustryCode = new ArrayList<AttributeCompanyBusinessActivityIndustryCode>();
        }
        return this.businessActivityIndustryCode;
    }

    /**
     * Gets the value of the aml property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeCompanyAML }
     *     
     */
    public AttributeCompanyAML getAml() {
        return aml;
    }

    /**
     * Sets the value of the aml property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeCompanyAML }
     *     
     */
    public void setAml(AttributeCompanyAML value) {
        this.aml = value;
    }

    public void setImmediateParent(List<AttributeCompany> value) {
        this.immediateParent = value;
    }

    public void setUltimateParent(List<AttributeCompany> value) {
        this.ultimateParent = value;
    }

    public void setRelatedParty(List<AttributeCompanyRelatedParty> value) {
        this.relatedParty = value;
    }

    public void setBeneficialOwner(List<AttributeCompanyBeneficialOwner> value) {
        this.beneficialOwner = value;
    }

    public void setContact(List<AttributeCompanyContact> value) {
        this.contact = value;
    }

    public void setControllerDirector(List<AttributeCompanyControllerDirector> value) {
        this.controllerDirector = value;
    }

    public void setGovernmentIDInfo(List<AttributeCompanyGovernmentIDInfo> value) {
        this.governmentIDInfo = value;
    }

    public void setIndustryIdentifier(List<AttributeCompanyIndustryIdentifier> value) {
        this.industryIdentifier = value;
    }

    public void setCountryOfBusiness(List<AttributeCompanyCountryOfBusiness> value) {
        this.countryOfBusiness = value;
    }

    public void setEntityName(List<AttributeCompanyEntityName> value) {
        this.entityName = value;
    }

    public void setBusinessActivityIndustryCode(List<AttributeCompanyBusinessActivityIndustryCode> value) {
        this.businessActivityIndustryCode = value;
    }

}

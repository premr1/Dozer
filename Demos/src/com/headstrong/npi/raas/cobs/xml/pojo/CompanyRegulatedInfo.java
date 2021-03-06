//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.16 at 11:38:43 AM IST 
//


package com.headstrong.npi.raas.cobs.xml.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyRegulatedInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyRegulatedInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isRegulated" type="{http://www.markit.com}AttributeBoolean" minOccurs="0"/>
 *         &lt;element name="regulationStatus" type="{http://www.markit.com}AttributeString" minOccurs="0"/>
 *         &lt;element name="regulatoryAuthority" type="{http://www.markit.com}AttributeDictionaryRegulator" minOccurs="0"/>
 *         &lt;element name="regulatoryIdentifier" type="{http://www.markit.com}AttributeString" minOccurs="0"/>
 *         &lt;element name="isApprovedRegulator" type="{http://www.markit.com}AttributeBoolean" minOccurs="0"/>
 *         &lt;element name="regulatoryExpirationDate" type="{http://www.markit.com}AttributeDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyRegulatedInfo", propOrder = {
    "isRegulated",
    "regulationStatus",
    "regulatoryAuthority",
    "regulatoryIdentifier",
    "isApprovedRegulator",
    "regulatoryExpirationDate"
})
public class CompanyRegulatedInfo {

    protected AttributeBoolean isRegulated;
    protected AttributeString regulationStatus;
    protected AttributeDictionaryRegulator regulatoryAuthority;
    protected AttributeString regulatoryIdentifier;
    protected AttributeBoolean isApprovedRegulator;
    protected AttributeDate regulatoryExpirationDate;

    /**
     * Gets the value of the isRegulated property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeBoolean }
     *     
     */
    public AttributeBoolean getIsRegulated() {
        return isRegulated;
    }

    /**
     * Sets the value of the isRegulated property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeBoolean }
     *     
     */
    public void setIsRegulated(AttributeBoolean value) {
        this.isRegulated = value;
    }

    /**
     * Gets the value of the regulationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeString }
     *     
     */
    public AttributeString getRegulationStatus() {
        return regulationStatus;
    }

    /**
     * Sets the value of the regulationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeString }
     *     
     */
    public void setRegulationStatus(AttributeString value) {
        this.regulationStatus = value;
    }

    /**
     * Gets the value of the regulatoryAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeDictionaryRegulator }
     *     
     */
    public AttributeDictionaryRegulator getRegulatoryAuthority() {
        return regulatoryAuthority;
    }

    /**
     * Sets the value of the regulatoryAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeDictionaryRegulator }
     *     
     */
    public void setRegulatoryAuthority(AttributeDictionaryRegulator value) {
        this.regulatoryAuthority = value;
    }

    /**
     * Gets the value of the regulatoryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeString }
     *     
     */
    public AttributeString getRegulatoryIdentifier() {
        return regulatoryIdentifier;
    }

    /**
     * Sets the value of the regulatoryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeString }
     *     
     */
    public void setRegulatoryIdentifier(AttributeString value) {
        this.regulatoryIdentifier = value;
    }

    /**
     * Gets the value of the isApprovedRegulator property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeBoolean }
     *     
     */
    public AttributeBoolean getIsApprovedRegulator() {
        return isApprovedRegulator;
    }

    /**
     * Sets the value of the isApprovedRegulator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeBoolean }
     *     
     */
    public void setIsApprovedRegulator(AttributeBoolean value) {
        this.isApprovedRegulator = value;
    }

    /**
     * Gets the value of the regulatoryExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeDate }
     *     
     */
    public AttributeDate getRegulatoryExpirationDate() {
        return regulatoryExpirationDate;
    }

    /**
     * Sets the value of the regulatoryExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeDate }
     *     
     */
    public void setRegulatoryExpirationDate(AttributeDate value) {
        this.regulatoryExpirationDate = value;
    }

}

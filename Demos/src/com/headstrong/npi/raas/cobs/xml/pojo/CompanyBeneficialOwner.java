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
 * <p>Java class for CompanyBeneficialOwner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyBeneficialOwner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wealthSource" type="{http://www.markit.com}AttributeString" minOccurs="0"/>
 *         &lt;element name="level" type="{http://www.markit.com}AttributeString" minOccurs="0"/>
 *         &lt;element name="percentageOwnership" type="{http://www.markit.com}AttributeDouble" minOccurs="0"/>
 *         &lt;element name="entity" type="{http://www.markit.com}Entity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyBeneficialOwner", propOrder = {
    "wealthSource",
    "level",
    "percentageOwnership",
    "entity"
})
public class CompanyBeneficialOwner {

    protected AttributeString wealthSource;
    protected AttributeString level;
    protected AttributeDouble percentageOwnership;
    protected Entity entity;

    /**
     * Gets the value of the wealthSource property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeString }
     *     
     */
    public AttributeString getWealthSource() {
        return wealthSource;
    }

    /**
     * Sets the value of the wealthSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeString }
     *     
     */
    public void setWealthSource(AttributeString value) {
        this.wealthSource = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeString }
     *     
     */
    public AttributeString getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeString }
     *     
     */
    public void setLevel(AttributeString value) {
        this.level = value;
    }

    /**
     * Gets the value of the percentageOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeDouble }
     *     
     */
    public AttributeDouble getPercentageOwnership() {
        return percentageOwnership;
    }

    /**
     * Sets the value of the percentageOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeDouble }
     *     
     */
    public void setPercentageOwnership(AttributeDouble value) {
        this.percentageOwnership = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link Entity }
     *     
     */
    public Entity getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entity }
     *     
     */
    public void setEntity(Entity value) {
        this.entity = value;
    }

}

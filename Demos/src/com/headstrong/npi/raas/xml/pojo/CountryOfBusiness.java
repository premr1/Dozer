//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.22 at 12:19:25 PM IST 
//


package com.headstrong.npi.raas.xml.pojo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryOfBusiness complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryOfBusiness">
 *   &lt;complexContent>
 *     &lt;extension base="{www.headstrong.com/common}CmAttribute">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{www.headstrong.com/common}CmAttributeCountry" minOccurs="0"/>
 *         &lt;element name="PercenetageOfBusniess" type="{www.headstrong.com/common}CmAttributeString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryOfBusiness", propOrder = {
    "id",
    "country",
    "percenetageOfBusniess"
})
public class CountryOfBusiness
    extends CmAttribute
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String id;
    @XmlElement(name = "Country")
    protected CmAttributeCountry country;
    @XmlElement(name = "PercenetageOfBusniess")
    protected CmAttributeString percenetageOfBusniess;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CmAttributeCountry }
     *     
     */
    public CmAttributeCountry getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmAttributeCountry }
     *     
     */
    public void setCountry(CmAttributeCountry value) {
        this.country = value;
    }

    /**
     * Gets the value of the percenetageOfBusniess property.
     * 
     * @return
     *     possible object is
     *     {@link CmAttributeString }
     *     
     */
    public CmAttributeString getPercenetageOfBusniess() {
        return percenetageOfBusniess;
    }

    /**
     * Sets the value of the percenetageOfBusniess property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmAttributeString }
     *     
     */
    public void setPercenetageOfBusniess(CmAttributeString value) {
        this.percenetageOfBusniess = value;
    }

}

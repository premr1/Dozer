//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.03 at 11:00:21 AM EDT 
//


package com.headstrong.npi.raas.xml.pojo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CmAttributeJurisdiction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmAttributeJurisdiction">
 *   &lt;complexContent>
 *     &lt;extension base="{www.headstrong.com/common}CmAttribute">
 *       &lt;sequence>
 *         &lt;element name="value" type="{www.headstrong.com/common}Jurisdiction"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmAttributeJurisdiction", propOrder = {
    "value"
})
public class CmAttributeJurisdiction
    extends CmAttribute
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Jurisdiction value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Jurisdiction }
     *     
     */
    public Jurisdiction getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jurisdiction }
     *     
     */
    public void setValue(Jurisdiction value) {
        this.value = value;
    }

}

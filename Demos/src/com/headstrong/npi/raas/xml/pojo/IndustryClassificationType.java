//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.22 at 12:19:25 PM IST 
//


package com.headstrong.npi.raas.xml.pojo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndustryClassificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndustryClassificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Select One"/>
 *     &lt;enumeration value="SIC"/>
 *     &lt;enumeration value="NAICS"/>
 *     &lt;enumeration value="NACE"/>
 *     &lt;enumeration value="ISIC"/>
 *     &lt;enumeration value="UKSIC"/>
 *     &lt;enumeration value="ANZSIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndustryClassificationType")
@XmlEnum
public enum IndustryClassificationType {

    @XmlEnumValue("Select One")
    SELECT_ONE("Select One"),
    SIC("SIC"),
    NAICS("NAICS"),
    NACE("NACE"),
    ISIC("ISIC"),
    UKSIC("UKSIC"),
    ANZSIC("ANZSIC");
    private final String value;

    IndustryClassificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndustryClassificationType fromValue(String v) {
        for (IndustryClassificationType c: IndustryClassificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
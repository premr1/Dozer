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
 * <p>Java class for WebsiteAddressType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WebsiteAddressType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Select One"/>
 *     &lt;enumeration value="Official"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WebsiteAddressType")
@XmlEnum
public enum WebsiteAddressType {

    @XmlEnumValue("Select One")
    SELECT_ONE("Select One"),
    @XmlEnumValue("Official")
    OFFICIAL("Official"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    WebsiteAddressType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebsiteAddressType fromValue(String v) {
        for (WebsiteAddressType c: WebsiteAddressType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
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
 * <p>Java class for CustomerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Select One"/>
 *     &lt;enumeration value="Investment Manager"/>
 *     &lt;enumeration value="Investment Advisers"/>
 *     &lt;enumeration value="Money Managers"/>
 *     &lt;enumeration value="Portfolio Managers"/>
 *     &lt;enumeration value="Not for Profit"/>
 *     &lt;enumeration value="Foreign Financial Institution"/>
 *     &lt;enumeration value="Personal Holding Companies"/>
 *     &lt;enumeration value="Fiduciary Vehicles"/>
 *     &lt;enumeration value="Special Purpose Vehicles"/>
 *     &lt;enumeration value="Non Operating Companies"/>
 *     &lt;enumeration value="Foreign and Domestic Personal Trusts"/>
 *     &lt;enumeration value="Individuals"/>
 *     &lt;enumeration value="Retirement Plan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerType")
@XmlEnum
public enum CustomerType {

    @XmlEnumValue("Select One")
    SELECT_ONE("Select One"),
    @XmlEnumValue("Investment Manager")
    INVESTMENT_MANAGER("Investment Manager"),
    @XmlEnumValue("Investment Advisers")
    INVESTMENT_ADVISERS("Investment Advisers"),
    @XmlEnumValue("Money Managers")
    MONEY_MANAGERS("Money Managers"),
    @XmlEnumValue("Portfolio Managers")
    PORTFOLIO_MANAGERS("Portfolio Managers"),
    @XmlEnumValue("Not for Profit")
    NOT_FOR_PROFIT("Not for Profit"),
    @XmlEnumValue("Foreign Financial Institution")
    FOREIGN_FINANCIAL_INSTITUTION("Foreign Financial Institution"),
    @XmlEnumValue("Personal Holding Companies")
    PERSONAL_HOLDING_COMPANIES("Personal Holding Companies"),
    @XmlEnumValue("Fiduciary Vehicles")
    FIDUCIARY_VEHICLES("Fiduciary Vehicles"),
    @XmlEnumValue("Special Purpose Vehicles")
    SPECIAL_PURPOSE_VEHICLES("Special Purpose Vehicles"),
    @XmlEnumValue("Non Operating Companies")
    NON_OPERATING_COMPANIES("Non Operating Companies"),
    @XmlEnumValue("Foreign and Domestic Personal Trusts")
    FOREIGN_AND_DOMESTIC_PERSONAL_TRUSTS("Foreign and Domestic Personal Trusts"),
    @XmlEnumValue("Individuals")
    INDIVIDUALS("Individuals"),
    @XmlEnumValue("Retirement Plan")
    RETIREMENT_PLAN("Retirement Plan");
    private final String value;

    CustomerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerType fromValue(String v) {
        for (CustomerType c: CustomerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
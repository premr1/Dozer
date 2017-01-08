//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.22 at 12:19:25 PM IST 
//


package com.headstrong.npi.raas.xml.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CmAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceDocuments" type="{www.headstrong.com/common}ReferenceDocuments"/>
 *         &lt;element name="ChallengeComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{www.headstrong.com/common}Comments" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" type="{www.headstrong.com/common}AttributeStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmAttribute", propOrder = {
    "referenceDocuments",
    "challengeComment",
    "comments"
})
@XmlSeeAlso({
    com.headstrong.npi.raas.xml.pojo.Entity.Ownership.OwnershipCorporate.class,
    com.headstrong.npi.raas.xml.pojo.Entity.Ownership.OwnershipIndividual.class,
    com.headstrong.npi.raas.xml.pojo.Entity.ControllerAndDirector.ControllersAndDirectors.class,
    CmAttributeInt.class,
    CmAttributeDateMonthDay.class,
    CmAttributeWebsiteAddressType.class,
    CmAttributeDate.class,
    CmAttributeLong.class,
    CountryOfBusiness.class,
    CmAttributeTime.class,
    CmAttributeCountry.class,
    Identifier.class,
    CmAttributeEntityType.class,
    CmAttributeInteger.class,
    CmAttributeOption.class,
    CmAttributePartyType.class,
    ContactInfo.class,
    GovtIDInfo.class,
    CmAttributeMiFIDClassifications.class,
    IndustryClassification.class,
    CmAttributeCurrency.class,
    CmAttributeDouble.class,
    CmAttributeString.class,
    CmAttributeOwnershipType.class,
    CmAttributeGender.class,
    CmAttributeLegalForm.class,
    CmAttributeBoolean.class,
    Address.class,
    CmAttributeDateTime.class
})
public abstract class CmAttribute
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ReferenceDocuments", required = true)
    protected ReferenceDocuments referenceDocuments;
    @XmlElement(name = "ChallengeComment")
    protected String challengeComment;
    @XmlElement(name = "Comments")
    protected List<Comments> comments;
    @XmlAttribute
    protected AttributeStatus status;

    /**
     * Gets the value of the referenceDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDocuments }
     *     
     */
    public ReferenceDocuments getReferenceDocuments() {
        return referenceDocuments;
    }

    /**
     * Sets the value of the referenceDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDocuments }
     *     
     */
    public void setReferenceDocuments(ReferenceDocuments value) {
        this.referenceDocuments = value;
    }

    /**
     * Gets the value of the challengeComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeComment() {
        return challengeComment;
    }

    /**
     * Sets the value of the challengeComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeComment(String value) {
        this.challengeComment = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comments }
     * 
     * 
     */
    public List<Comments> getComments() {
        if (comments == null) {
            comments = new ArrayList<Comments>();
        }
        return this.comments;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeStatus }
     *     
     */
    public AttributeStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeStatus }
     *     
     */
    public void setStatus(AttributeStatus value) {
        this.status = value;
    }

    public void setComments(List<Comments> value) {
        this.comments = value;
    }

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.02 at 10:44:13 AM EDT 
//


package com.qualys.audit.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}USER_ASSET_GROUPS" minOccurs="0"/>
 *         &lt;element ref="{}USER_IP_LIST" minOccurs="0"/>
 *         &lt;element ref="{}COMBINED_IP_LIST" minOccurs="0"/>
 *         &lt;element ref="{}ASSET_TAG_LIST" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userassetgroups",
    "useriplist",
    "combinediplist",
    "assettaglist"
})
@XmlRootElement(name = "TARGET")
public class TARGET {

    @XmlElement(name = "USER_ASSET_GROUPS")
    protected USERASSETGROUPS userassetgroups;
    @XmlElement(name = "USER_IP_LIST")
    protected USERIPLIST useriplist;
    @XmlElement(name = "COMBINED_IP_LIST")
    protected COMBINEDIPLIST combinediplist;
    @XmlElement(name = "ASSET_TAG_LIST")
    protected ASSETTAGLIST assettaglist;

    /**
     * Gets the value of the userassetgroups property.
     * 
     * @return
     *     possible object is
     *     {@link USERASSETGROUPS }
     *     
     */
    public USERASSETGROUPS getUSERASSETGROUPS() {
        return userassetgroups;
    }

    /**
     * Sets the value of the userassetgroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link USERASSETGROUPS }
     *     
     */
    public void setUSERASSETGROUPS(USERASSETGROUPS value) {
        this.userassetgroups = value;
    }

    /**
     * Gets the value of the useriplist property.
     * 
     * @return
     *     possible object is
     *     {@link USERIPLIST }
     *     
     */
    public USERIPLIST getUSERIPLIST() {
        return useriplist;
    }

    /**
     * Sets the value of the useriplist property.
     * 
     * @param value
     *     allowed object is
     *     {@link USERIPLIST }
     *     
     */
    public void setUSERIPLIST(USERIPLIST value) {
        this.useriplist = value;
    }

    /**
     * Gets the value of the combinediplist property.
     * 
     * @return
     *     possible object is
     *     {@link COMBINEDIPLIST }
     *     
     */
    public COMBINEDIPLIST getCOMBINEDIPLIST() {
        return combinediplist;
    }

    /**
     * Sets the value of the combinediplist property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMBINEDIPLIST }
     *     
     */
    public void setCOMBINEDIPLIST(COMBINEDIPLIST value) {
        this.combinediplist = value;
    }

    /**
     * Gets the value of the assettaglist property.
     * 
     * @return
     *     possible object is
     *     {@link ASSETTAGLIST }
     *     
     */
    public ASSETTAGLIST getASSETTAGLIST() {
        return assettaglist;
    }

    /**
     * Sets the value of the assettaglist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASSETTAGLIST }
     *     
     */
    public void setASSETTAGLIST(ASSETTAGLIST value) {
        this.assettaglist = value;
    }

}
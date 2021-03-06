//© Copyright 2018 Hewlett Packard Enterprise Development LP
//Licensed under Apache License version 2.0: http://www.apache.org/licenses/LICENSE-2.0


// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.16 at 10:23:18 AM CET 
//


package com.hpe.simulap.sip.headers;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for headerList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <p>
 * <pre>
 * &lt;complexType name="headerList"$gt;
 *   &lt;complexContent$gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"$gt;
 *       &lt;sequence$gt;
 *         &lt;element name="headerelem" type="{http://www.hp.com/simulap/sip}header" maxOccurs="unbounded"/$gt;
 *       &lt;/sequence$gt;
 *     &lt;/restriction$gt;
 *   &lt;/complexContent$gt;
 * &lt;/complexType$gt;
 * </pre>
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "headerList", propOrder = {
    "headerelem"
})
public class HeaderList {

    @XmlElement(required = true)
    protected List<Header> headerelem;

    /**
     * Gets the value of the headerelem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <code>set</code> method for the headerelem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaderelem().add(newItem);
     * </pre>
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Header }
     * 
     * @return List of Header
     */
    public List<Header> getHeaderelem() {
        if (headerelem == null) {
            headerelem = new ArrayList<Header>();
        }
        return this.headerelem;
    }

}

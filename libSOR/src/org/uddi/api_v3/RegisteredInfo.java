
package org.uddi.api_v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registeredInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registeredInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessInfos" type="{urn:uddi-org:api_v3}businessInfos" minOccurs="0"/>
 *         &lt;element name="tModelInfos" type="{urn:uddi-org:api_v3}tModelInfos" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="truncated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registeredInfo", propOrder = {
    "businessInfos",
    "tModelInfos"
})
public class RegisteredInfo {

    protected BusinessInfos businessInfos;
    protected TModelInfos tModelInfos;
    @XmlAttribute(name = "truncated")
    protected Boolean truncated;

    /**
     * Obtiene el valor de la propiedad businessInfos.
     * 
     * @return
     *     possible object is
     *     {@link BusinessInfos }
     *     
     */
    public BusinessInfos getBusinessInfos() {
        return businessInfos;
    }

    /**
     * Define el valor de la propiedad businessInfos.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessInfos }
     *     
     */
    public void setBusinessInfos(BusinessInfos value) {
        this.businessInfos = value;
    }

    /**
     * Obtiene el valor de la propiedad tModelInfos.
     * 
     * @return
     *     possible object is
     *     {@link TModelInfos }
     *     
     */
    public TModelInfos getTModelInfos() {
        return tModelInfos;
    }

    /**
     * Define el valor de la propiedad tModelInfos.
     * 
     * @param value
     *     allowed object is
     *     {@link TModelInfos }
     *     
     */
    public void setTModelInfos(TModelInfos value) {
        this.tModelInfos = value;
    }

    /**
     * Obtiene el valor de la propiedad truncated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTruncated() {
        return truncated;
    }

    /**
     * Define el valor de la propiedad truncated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTruncated(Boolean value) {
        this.truncated = value;
    }

}


package gestor_taller.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * Mon Apr 14 10:17:58 CEST 2014
 * Generated source version: 3.0.0-milestone1
 */

@XmlRootElement(name = "alta", namespace = "http://gestor_taller/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alta", namespace = "http://gestor_taller/", propOrder = {"name", "email", "address", "city", "postalCode", "telephone"})

public class Alta {

    @XmlElement(name = "name")
    private java.lang.String name;
    @XmlElement(name = "email")
    private java.lang.String email;
    @XmlElement(name = "address")
    private java.lang.String address;
    @XmlElement(name = "city")
    private java.lang.String city;
    @XmlElement(name = "postalCode")
    private java.lang.String postalCode;
    @XmlElement(name = "telephone")
    private java.lang.String telephone;

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String newName)  {
        this.name = newName;
    }

    public java.lang.String getEmail() {
        return this.email;
    }

    public void setEmail(java.lang.String newEmail)  {
        this.email = newEmail;
    }

    public java.lang.String getAddress() {
        return this.address;
    }

    public void setAddress(java.lang.String newAddress)  {
        this.address = newAddress;
    }

    public java.lang.String getCity() {
        return this.city;
    }

    public void setCity(java.lang.String newCity)  {
        this.city = newCity;
    }

    public java.lang.String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(java.lang.String newPostalCode)  {
        this.postalCode = newPostalCode;
    }

    public java.lang.String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(java.lang.String newTelephone)  {
        this.telephone = newTelephone;
    }

}


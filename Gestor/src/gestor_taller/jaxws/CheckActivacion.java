
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

@XmlRootElement(name = "checkActivacion", namespace = "http://gestor_taller/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkActivacion", namespace = "http://gestor_taller/", propOrder = {"email", "mail"})

public class CheckActivacion {

    @XmlElement(name = "email")
    private java.lang.String email;
    @XmlElement(name = "mail")
    private java.lang.String mail;

    public java.lang.String getEmail() {
        return this.email;
    }

    public void setEmail(java.lang.String newEmail)  {
        this.email = newEmail;
    }

    public java.lang.String getMail() {
        return this.mail;
    }

    public void setMail(java.lang.String newMail)  {
        this.mail = newMail;
    }

}


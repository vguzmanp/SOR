
package gestor_taller.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * Sun Feb 09 20:09:19 CET 2014
 * Generated source version: 3.0.0-milestone1
 */

@XmlRootElement(name = "checkActivacion", namespace = "http://gestor_taller/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkActivacion", namespace = "http://gestor_taller/")

public class CheckActivacion {

    @XmlElement(name = "mail")
    private java.lang.String mail;

    public java.lang.String getMail() {
        return this.mail;
    }

    public void setMail(java.lang.String newMail)  {
        this.mail = newMail;
    }

}


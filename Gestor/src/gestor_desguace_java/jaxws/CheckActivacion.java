
package gestor_desguace_java.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * Sat May 10 18:22:00 CEST 2014
 * Generated source version: 3.0.0-milestone1
 */

@XmlRootElement(name = "checkActivacion", namespace = "http://gestor_desguace_java/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkActivacion", namespace = "http://gestor_desguace_java/", propOrder = {"email", "contrasenya"})

public class CheckActivacion {

    @XmlElement(name = "email")
    private java.lang.String email;
    @XmlElement(name = "contrasenya")
    private java.lang.String contrasenya;

    public java.lang.String getEmail() {
        return this.email;
    }

    public void setEmail(java.lang.String newEmail)  {
        this.email = newEmail;
    }

    public java.lang.String getContrasenya() {
        return this.contrasenya;
    }

    public void setContrasenya(java.lang.String newContrasenya)  {
        this.contrasenya = newContrasenya;
    }

}



package gestor_desguace_java.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * Sat Apr 12 11:04:49 CEST 2014
 * Generated source version: 3.0.0-milestone1
 */

@XmlRootElement(name = "cambiarEstadoPedidoOtravez", namespace = "http://gestor_desguace_java/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambiarEstadoPedidoOtravez", namespace = "http://gestor_desguace_java/", propOrder = {"id", "estado", "idDesguace", "password"})

public class CambiarEstadoPedidoOtravez {

    @XmlElement(name = "id")
    private java.lang.String id;
    @XmlElement(name = "estado")
    private java.lang.String estado;
    @XmlElement(name = "idDesguace")
    private java.lang.String idDesguace;
    @XmlElement(name = "password")
    private java.lang.String password;

    public java.lang.String getId() {
        return this.id;
    }

    public void setId(java.lang.String newId)  {
        this.id = newId;
    }

    public java.lang.String getEstado() {
        return this.estado;
    }

    public void setEstado(java.lang.String newEstado)  {
        this.estado = newEstado;
    }

    public java.lang.String getIdDesguace() {
        return this.idDesguace;
    }

    public void setIdDesguace(java.lang.String newIdDesguace)  {
        this.idDesguace = newIdDesguace;
    }

    public java.lang.String getPassword() {
        return this.password;
    }

    public void setPassword(java.lang.String newPassword)  {
        this.password = newPassword;
    }

}


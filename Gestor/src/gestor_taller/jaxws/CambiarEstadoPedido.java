
package gestor_taller.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * Fri Feb 07 20:05:15 CET 2014
 * Generated source version: 3.0.0-milestone1
 */

@XmlRootElement(name = "cambiarEstadoPedido", namespace = "http://gestor_taller/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambiarEstadoPedido", namespace = "http://gestor_taller/", propOrder = {"estado", "id"})

public class CambiarEstadoPedido {

    @XmlElement(name = "estado")
    private int estado;
    @XmlElement(name = "id")
    private java.lang.String id;

    public int getEstado() {
        return this.estado;
    }

    public void setEstado(int newEstado)  {
        this.estado = newEstado;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public void setId(java.lang.String newId)  {
        this.id = newId;
    }

}


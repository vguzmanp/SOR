
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

@XmlRootElement(name = "cancelarPedido", namespace = "http://gestor_taller/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelarPedido", namespace = "http://gestor_taller/")

public class CancelarPedido {

    @XmlElement(name = "idPedido")
    private java.lang.String idPedido;

    public java.lang.String getIdPedido() {
        return this.idPedido;
    }

    public void setIdPedido(java.lang.String newIdPedido)  {
        this.idPedido = newIdPedido;
    }

}


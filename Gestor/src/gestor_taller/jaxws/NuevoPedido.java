
package gestor_taller.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * Sat Apr 05 16:32:33 CEST 2014
 * Generated source version: 3.0.0-milestone1
 */

@XmlRootElement(name = "nuevoPedido", namespace = "http://gestor_taller/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nuevoPedido", namespace = "http://gestor_taller/")

public class NuevoPedido {

    @XmlElement(name = "pedido")
    private java.lang.String pedido;

    public java.lang.String getPedido() {
        return this.pedido;
    }

    public void setPedido(java.lang.String newPedido)  {
        this.pedido = newPedido;
    }

}



package gestor_admin.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * Mon Feb 24 14:14:03 CET 2014
 * Generated source version: 3.0.0-milestone1
 */

@XmlRootElement(name = "getOfertasporPedido", namespace = "http://gestor_admin/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOfertasporPedido", namespace = "http://gestor_admin/")

public class GetOfertasporPedido {

    @XmlElement(name = "idPedido")
    private java.lang.String idPedido;

    public java.lang.String getIdPedido() {
        return this.idPedido;
    }

    public void setIdPedido(java.lang.String newIdPedido)  {
        this.idPedido = newIdPedido;
    }

}


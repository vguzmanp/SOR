
package gestor_desguace_java.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * Sun Feb 16 18:48:30 CET 2014
 * Generated source version: 3.0.0-milestone1
 */

@XmlRootElement(name = "cambiarEstadoPedidoOtravezResponse", namespace = "http://gestor_desguace_java/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambiarEstadoPedidoOtravezResponse", namespace = "http://gestor_desguace_java/")

public class CambiarEstadoPedidoOtravezResponse {

    @XmlElement(name = "return")
    private java.lang.Boolean _return;

    public java.lang.Boolean getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.Boolean new_return)  {
        this._return = new_return;
    }

}


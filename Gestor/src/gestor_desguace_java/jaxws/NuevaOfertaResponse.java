
package gestor_desguace_java.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * Fri Feb 07 20:07:33 CET 2014
 * Generated source version: 3.0.0-milestone1
 */

@XmlRootElement(name = "nuevaOfertaResponse", namespace = "http://gestor_desguace_java/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nuevaOfertaResponse", namespace = "http://gestor_desguace_java/")

public class NuevaOfertaResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.String new_return)  {
        this._return = new_return;
    }

}


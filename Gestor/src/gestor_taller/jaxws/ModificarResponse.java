
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

@XmlRootElement(name = "modificarResponse", namespace = "http://gestor_taller/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificarResponse", namespace = "http://gestor_taller/")

public class ModificarResponse {

    @XmlElement(name = "return")
    private boolean _return;

    public boolean getReturn() {
        return this._return;
    }

    public void setReturn(boolean new_return)  {
        this._return = new_return;
    }

}



package gestor_admin.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * Fri Apr 11 11:19:38 CEST 2014
 * Generated source version: 3.0.0-milestone1
 */

@XmlRootElement(name = "setCifradoAsimetrico", namespace = "http://gestor_admin/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setCifradoAsimetrico", namespace = "http://gestor_admin/")

public class SetCifradoAsimetrico {

    @XmlElement(name = "on")
    private boolean on;

    public boolean getOn() {
        return this.on;
    }

    public void setOn(boolean newOn)  {
        this.on = newOn;
    }

}


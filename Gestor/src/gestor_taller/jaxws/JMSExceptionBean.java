
package gestor_taller.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * Tue Apr 08 17:48:53 CEST 2014
 * Generated source version: 3.0.0-milestone1
 */

@XmlRootElement(name = "JMSException", namespace = "http://jms.javax/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JMSException", namespace = "http://jms.javax/", propOrder = {"errorCode", "linkedException", "message"})

public class JMSExceptionBean {

    private java.lang.String errorCode;
    private java.lang.Exception linkedException;
    private java.lang.String message;

    public java.lang.String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(java.lang.String newErrorCode)  {
        this.errorCode = newErrorCode;
    }

    public java.lang.Exception getLinkedException() {
        return this.linkedException;
    }

    public void setLinkedException(java.lang.Exception newLinkedException)  {
        this.linkedException = newLinkedException;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String newMessage)  {
        this.message = newMessage;
    }

}



/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package gestor_taller;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * 2014-04-05T11:58:33.095+02:00
 * Generated source version: 3.0.0-milestone1
 * 
 */

@javax.jws.WebService(
                      serviceName = "TallerWS",
                      portName = "TallerWSPort",
                      targetNamespace = "http://gestor_taller/",
                      wsdlLocation = "http://localhost:8080/Gestor/services/TallerWSPort?wsdl",
                      endpointInterface = "gestor_taller.TallerWS")
                      
public class TallerWSImpl implements TallerWS {

    private static final Logger LOG = Logger.getLogger(TallerWSImpl.class.getName());

    /* (non-Javadoc)
     * @see gestor_taller.TallerWS#alta(java.lang.String  name ,)java.lang.String  email ,)java.lang.String  address ,)java.lang.String  city ,)java.lang.String  postalCode ,)java.lang.String  telephone )*
     */
    public boolean alta(java.lang.String name,java.lang.String email,java.lang.String address,java.lang.String city,java.lang.String postalCode,java.lang.String telephone) { 
        LOG.info("Executing operation alta");
        System.out.println(name);
        System.out.println(email);
        System.out.println(address);
        System.out.println(city);
        System.out.println(postalCode);
        System.out.println(telephone);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_taller.TallerWS#cancelarPedido(java.lang.String  idPedido ,)java.lang.String  idTaller )*
     */
    public java.lang.Boolean cancelarPedido(java.lang.String idPedido,java.lang.String idTaller) { 
        LOG.info("Executing operation cancelarPedido");
        System.out.println(idPedido);
        System.out.println(idTaller);
        try {
            java.lang.Boolean _return = Boolean.valueOf(true);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_taller.TallerWS#generarClaveReto(java.lang.String  idTaller )*
     */
    public java.lang.String generarClaveReto(java.lang.String idTaller) { 
        LOG.info("Executing operation generarClaveReto");
        System.out.println(idTaller);
        try {
            java.lang.String _return = "_return-1844855769";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_taller.TallerWS#cambiarEstadoPedido(int  estado ,)java.lang.String  id ,)java.lang.String  idTaller )*
     */
    public java.lang.Boolean cambiarEstadoPedido(int estado,java.lang.String id,java.lang.String idTaller) { 
        LOG.info("Executing operation cambiarEstadoPedido");
        System.out.println(estado);
        System.out.println(id);
        System.out.println(idTaller);
        try {
            java.lang.Boolean _return = Boolean.valueOf(true);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_taller.TallerWS#getPedidos(java.lang.String  id )*
     */
    public java.lang.String getPedidos(java.lang.String id) { 
        LOG.info("Executing operation getPedidos");
        System.out.println(id);
        try {
            java.lang.String _return = "_return-1503112509";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_taller.TallerWS#baja(java.lang.String  tallerID )*
     */
    public java.lang.Boolean baja(java.lang.String tallerID) { 
        LOG.info("Executing operation baja");
        System.out.println(tallerID);
        try {
            java.lang.Boolean _return = Boolean.valueOf(true);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_taller.TallerWS#hello(*
     */
    public java.lang.String hello() { 
        LOG.info("Executing operation hello");
        try {
            java.lang.String _return = "_return612758090";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_taller.TallerWS#modificar(java.lang.String  id ,)java.lang.String  name ,)java.lang.String  email ,)java.lang.String  address ,)java.lang.String  city ,)java.lang.String  postalCode ,)java.lang.String  telephone )*
     */
    public boolean modificar(java.lang.String id,java.lang.String name,java.lang.String email,java.lang.String address,java.lang.String city,java.lang.String postalCode,java.lang.String telephone) { 
        LOG.info("Executing operation modificar");
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(address);
        System.out.println(city);
        System.out.println(postalCode);
        System.out.println(telephone);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_taller.TallerWS#checkActivacion(java.lang.String  mail )*
     */
    public java.lang.String checkActivacion(java.lang.String mail) { 
        LOG.info("Executing operation checkActivacion");
        System.out.println(mail);
        try {
            java.lang.String _return = "_return321254717";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_taller.TallerWS#getOfertas(java.lang.String  listaPedidos ,)java.lang.String  idTaller )*
     */
    public java.lang.String getOfertas(java.lang.String listaPedidos,java.lang.String idTaller) { 
        LOG.info("Executing operation getOfertas");
        System.out.println(listaPedidos);
        System.out.println(idTaller);
        try {
            java.lang.String _return = "_return2117431762";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_taller.TallerWS#aceptarOferta(java.lang.String  id ,)java.lang.String  idTaller )*
     */
    public java.lang.Boolean aceptarOferta(java.lang.String id,java.lang.String idTaller) { 
        LOG.info("Executing operation aceptarOferta");
        System.out.println(id);
        System.out.println(idTaller);
        try {
            java.lang.Boolean _return = Boolean.valueOf(false);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_taller.TallerWS#nuevoPedido(java.lang.String  pedido ,)java.lang.String  idTaller )*
     */
    public java.lang.String nuevoPedido(java.lang.String pedido,java.lang.String idTaller) throws JMSException_Exception    { 
        LOG.info("Executing operation nuevoPedido");
        System.out.println(pedido);
        System.out.println(idTaller);
        try {
            java.lang.String _return = "_return528708080";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new JMSException_Exception("JMSException...");
    }

    /* (non-Javadoc)
     * @see gestor_taller.TallerWS#rechazarOferta(java.lang.String  id ,)java.lang.String  idTaller )*
     */
    public java.lang.Boolean rechazarOferta(java.lang.String id,java.lang.String idTaller) { 
        LOG.info("Executing operation rechazarOferta");
        System.out.println(id);
        System.out.println(idTaller);
        try {
            java.lang.Boolean _return = Boolean.valueOf(false);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}

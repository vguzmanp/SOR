
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package gestor_desguace_java;

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
 * 2014-04-12T11:07:54.305+02:00
 * Generated source version: 3.0.0-milestone1
 * 
 */

@javax.jws.WebService(
                      serviceName = "DesguaceJavaWS",
                      portName = "DesguaceJavaWSPort",
                      targetNamespace = "http://gestor_desguace_java/",
                      wsdlLocation = "http://localhost:8080/Gestor/services/DesguaceJavaWSPort?wsdl",
                      endpointInterface = "gestor_desguace_java.DesguaceJavaWS")
                      
public class DesguaceJavaWSImpl implements DesguaceJavaWS {

    private static final Logger LOG = Logger.getLogger(DesguaceJavaWSImpl.class.getName());

    /* (non-Javadoc)
     * @see gestor_desguace_java.DesguaceJavaWS#checkActivacion(java.lang.String  email ,)java.lang.String  contrasenya )*
     */
    public java.lang.String checkActivacion(java.lang.String email,java.lang.String contrasenya) { 
        LOG.info("Executing operation checkActivacion");
        System.out.println(email);
        System.out.println(contrasenya);
        try {
            java.lang.String _return = "_return-1335564286";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_desguace_java.DesguaceJavaWS#generarClaveReto(java.lang.String  idDesguace ,)java.lang.String  password )*
     */
    public java.lang.String generarClaveReto(java.lang.String idDesguace,java.lang.String password) { 
        LOG.info("Executing operation generarClaveReto");
        System.out.println(idDesguace);
        System.out.println(password);
        try {
            java.lang.String _return = "_return1922492530";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_desguace_java.DesguaceJavaWS#getPedidoporID(java.lang.String  string ,)java.lang.String  password )*
     */
    public java.lang.String getPedidoporID(java.lang.String string,java.lang.String password) { 
        LOG.info("Executing operation getPedidoporID");
        System.out.println(string);
        System.out.println(password);
        try {
            java.lang.String _return = "_return1342733470";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_desguace_java.DesguaceJavaWS#getPedidosporID(java.lang.String  string ,)java.lang.String  password )*
     */
    public java.lang.String getPedidosporID(java.lang.String string,java.lang.String password) { 
        LOG.info("Executing operation getPedidosporID");
        System.out.println(string);
        System.out.println(password);
        try {
            java.lang.String _return = "_return1623468421";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_desguace_java.DesguaceJavaWS#modificar(java.lang.String  id ,)java.lang.String  name ,)java.lang.String  email ,)java.lang.String  address ,)java.lang.String  city ,)java.lang.String  postalCode ,)java.lang.String  telephone ,)java.lang.String  password )*
     */
    public boolean modificar(java.lang.String id,java.lang.String name,java.lang.String email,java.lang.String address,java.lang.String city,java.lang.String postalCode,java.lang.String telephone,java.lang.String password) { 
        LOG.info("Executing operation modificar");
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(address);
        System.out.println(city);
        System.out.println(postalCode);
        System.out.println(telephone);
        System.out.println(password);
        try {
            boolean _return = true;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_desguace_java.DesguaceJavaWS#cambiarEstadoPedido(java.lang.String  id ,)java.lang.String  estado ,)java.lang.String  idDesguace ,)java.lang.String  password )*
     */
    public java.lang.Boolean cambiarEstadoPedido(java.lang.String id,java.lang.String estado,java.lang.String idDesguace,java.lang.String password) { 
        LOG.info("Executing operation cambiarEstadoPedido");
        System.out.println(id);
        System.out.println(estado);
        System.out.println(idDesguace);
        System.out.println(password);
        try {
            java.lang.Boolean _return = Boolean.valueOf(true);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_desguace_java.DesguaceJavaWS#alta(java.lang.String  name ,)java.lang.String  email ,)java.lang.String  address ,)java.lang.String  city ,)java.lang.String  postalCode ,)java.lang.String  telephone )*
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
     * @see gestor_desguace_java.DesguaceJavaWS#aceptarOfertaFin(java.lang.String  id ,)java.lang.String  idDesguace ,)java.lang.String  password )*
     */
    public java.lang.Boolean aceptarOfertaFin(java.lang.String id,java.lang.String idDesguace,java.lang.String password) { 
        LOG.info("Executing operation aceptarOfertaFin");
        System.out.println(id);
        System.out.println(idDesguace);
        System.out.println(password);
        try {
            java.lang.Boolean _return = Boolean.valueOf(true);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_desguace_java.DesguaceJavaWS#getOfertas(java.lang.String  string ,)java.lang.String  password )*
     */
    public java.lang.String getOfertas(java.lang.String string,java.lang.String password) { 
        LOG.info("Executing operation getOfertas");
        System.out.println(string);
        System.out.println(password);
        try {
            java.lang.String _return = "_return110454262";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_desguace_java.DesguaceJavaWS#baja(java.lang.String  id ,)java.lang.String  password )*
     */
    public java.lang.Boolean baja(java.lang.String id,java.lang.String password) { 
        LOG.info("Executing operation baja");
        System.out.println(id);
        System.out.println(password);
        try {
            java.lang.Boolean _return = Boolean.valueOf(false);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_desguace_java.DesguaceJavaWS#nuevaOferta(java.lang.String  oferta ,)java.lang.String  idDesguace ,)java.lang.String  password )*
     */
    public java.lang.String nuevaOferta(java.lang.String oferta,java.lang.String idDesguace,java.lang.String password) { 
        LOG.info("Executing operation nuevaOferta");
        System.out.println(oferta);
        System.out.println(idDesguace);
        System.out.println(password);
        try {
            java.lang.String _return = "_return510828848";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_desguace_java.DesguaceJavaWS#cambiarEstadoPedidoOtravez(java.lang.String  id ,)java.lang.String  estado ,)java.lang.String  idDesguace ,)java.lang.String  password )*
     */
    public java.lang.Boolean cambiarEstadoPedidoOtravez(java.lang.String id,java.lang.String estado,java.lang.String idDesguace,java.lang.String password) { 
        LOG.info("Executing operation cambiarEstadoPedidoOtravez");
        System.out.println(id);
        System.out.println(estado);
        System.out.println(idDesguace);
        System.out.println(password);
        try {
            java.lang.Boolean _return = Boolean.valueOf(true);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gestor_desguace_java.DesguaceJavaWS#cancelarOferta(java.lang.String  id ,)java.lang.String  idDesguace ,)java.lang.String  password )*
     */
    public java.lang.Boolean cancelarOferta(java.lang.String id,java.lang.String idDesguace,java.lang.String password) { 
        LOG.info("Executing operation cancelarOferta");
        System.out.println(id);
        System.out.println(idDesguace);
        System.out.println(password);
        try {
            java.lang.Boolean _return = Boolean.valueOf(false);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}

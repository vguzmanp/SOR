
package gestor_desguace_java;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * 2014-02-09T21:42:47.766+01:00
 * Generated source version: 3.0.0-milestone1
 * 
 */
public final class DesguaceJavaWS_DesguaceJavaWSPort_Client {

    private static final QName SERVICE_NAME = new QName("http://gestor_desguace_java/", "DesguaceJavaWS");

    private DesguaceJavaWS_DesguaceJavaWSPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = DesguaceJavaWS_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        DesguaceJavaWS_Service ss = new DesguaceJavaWS_Service(wsdlURL, SERVICE_NAME);
        DesguaceJavaWS port = ss.getDesguaceJavaWSPort();  
        
        {
        System.out.println("Invoking alta...");
        java.lang.String _alta_name = "_alta_name1100608816";
        java.lang.String _alta_email = "_alta_email667426855";
        java.lang.String _alta_address = "_alta_address213849610";
        java.lang.String _alta_city = "_alta_city-1468616948";
        java.lang.String _alta_postalCode = "_alta_postalCode-716352769";
        java.lang.String _alta_telephone = "_alta_telephone-627356952";
        boolean _alta__return = port.alta(_alta_name, _alta_email, _alta_address, _alta_city, _alta_postalCode, _alta_telephone);
        System.out.println("alta.result=" + _alta__return);


        }
        {
        System.out.println("Invoking checkActivacion...");
        java.lang.String _checkActivacion_mail = "_checkActivacion_mail-1641353787";
        java.lang.String _checkActivacion__return = port.checkActivacion(_checkActivacion_mail);
        System.out.println("checkActivacion.result=" + _checkActivacion__return);


        }
        {
        System.out.println("Invoking getPedidosporID...");
        java.lang.String _getPedidosporID_string = "_getPedidosporID_string-440560970";
        java.lang.String _getPedidosporID__return = port.getPedidosporID(_getPedidosporID_string);
        System.out.println("getPedidosporID.result=" + _getPedidosporID__return);


        }
        {
        System.out.println("Invoking aceptarOfertaFin...");
        java.lang.String _aceptarOfertaFin_id = "_aceptarOfertaFin_id1793177373";
        java.lang.Boolean _aceptarOfertaFin__return = port.aceptarOfertaFin(_aceptarOfertaFin_id);
        System.out.println("aceptarOfertaFin.result=" + _aceptarOfertaFin__return);


        }
        {
        System.out.println("Invoking cambiarEstadoPedido...");
        java.lang.String _cambiarEstadoPedido_id = "_cambiarEstadoPedido_id-224820159";
        int _cambiarEstadoPedido_estado = -1985546172;
        java.lang.Boolean _cambiarEstadoPedido__return = port.cambiarEstadoPedido(_cambiarEstadoPedido_id, _cambiarEstadoPedido_estado);
        System.out.println("cambiarEstadoPedido.result=" + _cambiarEstadoPedido__return);


        }
        {
        System.out.println("Invoking getOfertas...");
        java.lang.String _getOfertas__return = port.getOfertas();
        System.out.println("getOfertas.result=" + _getOfertas__return);


        }
        {
        System.out.println("Invoking baja...");
        java.lang.String _baja_id = "_baja_id350454826";
        java.lang.Boolean _baja__return = port.baja(_baja_id);
        System.out.println("baja.result=" + _baja__return);


        }
        {
        System.out.println("Invoking nuevaOferta...");
        java.lang.String _nuevaOferta_oferta = "_nuevaOferta_oferta-628829783";
        java.lang.String _nuevaOferta__return = port.nuevaOferta(_nuevaOferta_oferta);
        System.out.println("nuevaOferta.result=" + _nuevaOferta__return);


        }
        {
        System.out.println("Invoking cancelarOferta...");
        java.lang.String _cancelarOferta_id = "_cancelarOferta_id98311921";
        java.lang.Boolean _cancelarOferta__return = port.cancelarOferta(_cancelarOferta_id);
        System.out.println("cancelarOferta.result=" + _cancelarOferta__return);


        }

        System.exit(0);
    }

}
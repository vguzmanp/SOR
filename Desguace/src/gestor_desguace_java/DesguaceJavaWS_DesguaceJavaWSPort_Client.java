
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
 * 2014-04-14T10:20:31.343+02:00
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
        System.out.println("Invoking checkActivacion...");
        java.lang.String _checkActivacion_email = "_checkActivacion_email-886498074";
        java.lang.String _checkActivacion_contrasenya = "_checkActivacion_contrasenya810326788";
        java.lang.String _checkActivacion__return = port.checkActivacion(_checkActivacion_email, _checkActivacion_contrasenya);
        System.out.println("checkActivacion.result=" + _checkActivacion__return);


        }
        {
        System.out.println("Invoking generarClaveReto...");
        java.lang.String _generarClaveReto_idDesguace = "_generarClaveReto_idDesguace-79566963";
        java.lang.String _generarClaveReto_password = "_generarClaveReto_password-1989603404";
        java.lang.String _generarClaveReto__return = port.generarClaveReto(_generarClaveReto_idDesguace, _generarClaveReto_password);
        System.out.println("generarClaveReto.result=" + _generarClaveReto__return);


        }
        {
        System.out.println("Invoking getPedidoporID...");
        java.lang.String _getPedidoporID_string = "_getPedidoporID_string843706435";
        java.lang.String _getPedidoporID_idDesguace = "_getPedidoporID_idDesguace1103332318";
        java.lang.String _getPedidoporID_password = "_getPedidoporID_password1545458524";
        java.lang.String _getPedidoporID__return = port.getPedidoporID(_getPedidoporID_string, _getPedidoporID_idDesguace, _getPedidoporID_password);
        System.out.println("getPedidoporID.result=" + _getPedidoporID__return);


        }
        {
        System.out.println("Invoking getPedidosporID...");
        java.lang.String _getPedidosporID_string = "_getPedidosporID_string-2141703455";
        java.lang.String _getPedidosporID_password = "_getPedidosporID_password1910806158";
        java.lang.String _getPedidosporID__return = port.getPedidosporID(_getPedidosporID_string, _getPedidosporID_password);
        System.out.println("getPedidosporID.result=" + _getPedidosporID__return);


        }
        {
        System.out.println("Invoking modificar...");
        java.lang.String _modificar_id = "_modificar_id-1959058192";
        java.lang.String _modificar_name = "_modificar_name1739060382";
        java.lang.String _modificar_email = "_modificar_email843916685";
        java.lang.String _modificar_address = "_modificar_address-1081351745";
        java.lang.String _modificar_city = "_modificar_city-937859";
        java.lang.String _modificar_postalCode = "_modificar_postalCode1852553084";
        java.lang.String _modificar_telephone = "_modificar_telephone724217951";
        java.lang.String _modificar_password = "_modificar_password1905543211";
        boolean _modificar__return = port.modificar(_modificar_id, _modificar_name, _modificar_email, _modificar_address, _modificar_city, _modificar_postalCode, _modificar_telephone, _modificar_password);
        System.out.println("modificar.result=" + _modificar__return);


        }
        {
        System.out.println("Invoking cambiarEstadoPedido...");
        java.lang.String _cambiarEstadoPedido_id = "_cambiarEstadoPedido_id-1492680118";
        java.lang.String _cambiarEstadoPedido_estado = "_cambiarEstadoPedido_estado591686970";
        java.lang.String _cambiarEstadoPedido_idDesguace = "_cambiarEstadoPedido_idDesguace-1320311781";
        java.lang.String _cambiarEstadoPedido_password = "_cambiarEstadoPedido_password1665288404";
        java.lang.Boolean _cambiarEstadoPedido__return = port.cambiarEstadoPedido(_cambiarEstadoPedido_id, _cambiarEstadoPedido_estado, _cambiarEstadoPedido_idDesguace, _cambiarEstadoPedido_password);
        System.out.println("cambiarEstadoPedido.result=" + _cambiarEstadoPedido__return);


        }
        {
        System.out.println("Invoking alta...");
        java.lang.String _alta_name = "_alta_name1188253536";
        java.lang.String _alta_email = "_alta_email835697325";
        java.lang.String _alta_address = "_alta_address242358529";
        java.lang.String _alta_city = "_alta_city495599868";
        java.lang.String _alta_postalCode = "_alta_postalCode1424166416";
        java.lang.String _alta_telephone = "_alta_telephone-1695286806";
        boolean _alta__return = port.alta(_alta_name, _alta_email, _alta_address, _alta_city, _alta_postalCode, _alta_telephone);
        System.out.println("alta.result=" + _alta__return);


        }
        {
        System.out.println("Invoking aceptarOfertaFin...");
        java.lang.String _aceptarOfertaFin_id = "_aceptarOfertaFin_id-626868110";
        java.lang.String _aceptarOfertaFin_idDesguace = "_aceptarOfertaFin_idDesguace1031767803";
        java.lang.String _aceptarOfertaFin_password = "_aceptarOfertaFin_password-120268233";
        java.lang.Boolean _aceptarOfertaFin__return = port.aceptarOfertaFin(_aceptarOfertaFin_id, _aceptarOfertaFin_idDesguace, _aceptarOfertaFin_password);
        System.out.println("aceptarOfertaFin.result=" + _aceptarOfertaFin__return);


        }
        {
        System.out.println("Invoking getOfertas...");
        java.lang.String _getOfertas_string = "_getOfertas_string788431679";
        java.lang.String _getOfertas_password = "_getOfertas_password161033433";
        java.lang.String _getOfertas__return = port.getOfertas(_getOfertas_string, _getOfertas_password);
        System.out.println("getOfertas.result=" + _getOfertas__return);


        }
        {
        System.out.println("Invoking baja...");
        java.lang.String _baja_id = "_baja_id-1525031342";
        java.lang.String _baja_password = "_baja_password-1859954237";
        java.lang.Boolean _baja__return = port.baja(_baja_id, _baja_password);
        System.out.println("baja.result=" + _baja__return);


        }
        {
        System.out.println("Invoking nuevaOferta...");
        java.lang.String _nuevaOferta_oferta = "_nuevaOferta_oferta-592899737";
        java.lang.String _nuevaOferta_idDesguace = "_nuevaOferta_idDesguace-536857656";
        java.lang.String _nuevaOferta_password = "_nuevaOferta_password1037408511";
        java.lang.String _nuevaOferta__return = port.nuevaOferta(_nuevaOferta_oferta, _nuevaOferta_idDesguace, _nuevaOferta_password);
        System.out.println("nuevaOferta.result=" + _nuevaOferta__return);


        }
        {
        System.out.println("Invoking cambiarEstadoPedidoOtravez...");
        java.lang.String _cambiarEstadoPedidoOtravez_id = "_cambiarEstadoPedidoOtravez_id11887989";
        java.lang.String _cambiarEstadoPedidoOtravez_estado = "_cambiarEstadoPedidoOtravez_estado1435809016";
        java.lang.String _cambiarEstadoPedidoOtravez_idDesguace = "_cambiarEstadoPedidoOtravez_idDesguace2037894753";
        java.lang.String _cambiarEstadoPedidoOtravez_password = "_cambiarEstadoPedidoOtravez_password405010962";
        java.lang.Boolean _cambiarEstadoPedidoOtravez__return = port.cambiarEstadoPedidoOtravez(_cambiarEstadoPedidoOtravez_id, _cambiarEstadoPedidoOtravez_estado, _cambiarEstadoPedidoOtravez_idDesguace, _cambiarEstadoPedidoOtravez_password);
        System.out.println("cambiarEstadoPedidoOtravez.result=" + _cambiarEstadoPedidoOtravez__return);


        }
        {
        System.out.println("Invoking cancelarOferta...");
        java.lang.String _cancelarOferta_id = "_cancelarOferta_id1119418856";
        java.lang.String _cancelarOferta_idDesguace = "_cancelarOferta_idDesguace1589381920";
        java.lang.String _cancelarOferta_password = "_cancelarOferta_password743185399";
        java.lang.Boolean _cancelarOferta__return = port.cancelarOferta(_cancelarOferta_id, _cancelarOferta_idDesguace, _cancelarOferta_password);
        System.out.println("cancelarOferta.result=" + _cancelarOferta__return);


        }

        System.exit(0);
    }

}

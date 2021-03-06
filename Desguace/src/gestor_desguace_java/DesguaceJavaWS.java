package gestor_desguace_java;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * 2014-04-14T10:20:31.401+02:00
 * Generated source version: 3.0.0-milestone1
 * 
 */
@WebService(targetNamespace = "http://gestor_desguace_java/", name = "DesguaceJavaWS")
@XmlSeeAlso({ObjectFactory.class})
public interface DesguaceJavaWS {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "checkActivacion", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.CheckActivacion")
    @WebMethod
    @ResponseWrapper(localName = "checkActivacionResponse", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.CheckActivacionResponse")
    public java.lang.String checkActivacion(
        @WebParam(name = "email", targetNamespace = "")
        java.lang.String email,
        @WebParam(name = "contrasenya", targetNamespace = "")
        java.lang.String contrasenya
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "generarClaveReto", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.GenerarClaveReto")
    @WebMethod
    @ResponseWrapper(localName = "generarClaveRetoResponse", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.GenerarClaveRetoResponse")
    public java.lang.String generarClaveReto(
        @WebParam(name = "idDesguace", targetNamespace = "")
        java.lang.String idDesguace,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getPedidoporID", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.GetPedidoporID")
    @WebMethod
    @ResponseWrapper(localName = "getPedidoporIDResponse", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.GetPedidoporIDResponse")
    public java.lang.String getPedidoporID(
        @WebParam(name = "string", targetNamespace = "")
        java.lang.String string,
        @WebParam(name = "idDesguace", targetNamespace = "")
        java.lang.String idDesguace,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getPedidosporID", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.GetPedidosporID")
    @WebMethod
    @ResponseWrapper(localName = "getPedidosporIDResponse", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.GetPedidosporIDResponse")
    public java.lang.String getPedidosporID(
        @WebParam(name = "string", targetNamespace = "")
        java.lang.String string,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "modificar", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.Modificar")
    @WebMethod
    @ResponseWrapper(localName = "modificarResponse", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.ModificarResponse")
    public boolean modificar(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id,
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(name = "email", targetNamespace = "")
        java.lang.String email,
        @WebParam(name = "address", targetNamespace = "")
        java.lang.String address,
        @WebParam(name = "city", targetNamespace = "")
        java.lang.String city,
        @WebParam(name = "postalCode", targetNamespace = "")
        java.lang.String postalCode,
        @WebParam(name = "telephone", targetNamespace = "")
        java.lang.String telephone,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "cambiarEstadoPedido", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.CambiarEstadoPedido")
    @WebMethod
    @ResponseWrapper(localName = "cambiarEstadoPedidoResponse", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.CambiarEstadoPedidoResponse")
    public java.lang.Boolean cambiarEstadoPedido(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id,
        @WebParam(name = "estado", targetNamespace = "")
        java.lang.String estado,
        @WebParam(name = "idDesguace", targetNamespace = "")
        java.lang.String idDesguace,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "alta", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.Alta")
    @WebMethod
    @ResponseWrapper(localName = "altaResponse", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.AltaResponse")
    public boolean alta(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(name = "email", targetNamespace = "")
        java.lang.String email,
        @WebParam(name = "address", targetNamespace = "")
        java.lang.String address,
        @WebParam(name = "city", targetNamespace = "")
        java.lang.String city,
        @WebParam(name = "postalCode", targetNamespace = "")
        java.lang.String postalCode,
        @WebParam(name = "telephone", targetNamespace = "")
        java.lang.String telephone
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "aceptarOfertaFin", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.AceptarOfertaFin")
    @WebMethod
    @ResponseWrapper(localName = "aceptarOfertaFinResponse", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.AceptarOfertaFinResponse")
    public java.lang.Boolean aceptarOfertaFin(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id,
        @WebParam(name = "idDesguace", targetNamespace = "")
        java.lang.String idDesguace,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getOfertas", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.GetOfertas")
    @WebMethod
    @ResponseWrapper(localName = "getOfertasResponse", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.GetOfertasResponse")
    public java.lang.String getOfertas(
        @WebParam(name = "string", targetNamespace = "")
        java.lang.String string,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "baja", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.Baja")
    @WebMethod
    @ResponseWrapper(localName = "bajaResponse", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.BajaResponse")
    public java.lang.Boolean baja(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "nuevaOferta", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.NuevaOferta")
    @WebMethod
    @ResponseWrapper(localName = "nuevaOfertaResponse", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.NuevaOfertaResponse")
    public java.lang.String nuevaOferta(
        @WebParam(name = "oferta", targetNamespace = "")
        java.lang.String oferta,
        @WebParam(name = "idDesguace", targetNamespace = "")
        java.lang.String idDesguace,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "cambiarEstadoPedidoOtravez", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.CambiarEstadoPedidoOtravez")
    @WebMethod
    @ResponseWrapper(localName = "cambiarEstadoPedidoOtravezResponse", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.CambiarEstadoPedidoOtravezResponse")
    public java.lang.Boolean cambiarEstadoPedidoOtravez(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id,
        @WebParam(name = "estado", targetNamespace = "")
        java.lang.String estado,
        @WebParam(name = "idDesguace", targetNamespace = "")
        java.lang.String idDesguace,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "cancelarOferta", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.CancelarOferta")
    @WebMethod
    @ResponseWrapper(localName = "cancelarOfertaResponse", targetNamespace = "http://gestor_desguace_java/", className = "gestor_desguace_java.CancelarOfertaResponse")
    public java.lang.Boolean cancelarOferta(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id,
        @WebParam(name = "idDesguace", targetNamespace = "")
        java.lang.String idDesguace,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );
}

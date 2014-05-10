package gestor_taller;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * 2014-05-10T18:08:40.476+02:00
 * Generated source version: 3.0.0-milestone1
 * 
 */
@WebServiceClient(name = "TallerWS", 
                  wsdlLocation = "http://localhost:8080/Gestor/services/TallerWSPort?wsdl",
                  targetNamespace = "http://gestor_taller/") 
public class TallerWS_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gestor_taller/", "TallerWS");
    public final static QName TallerWSPort = new QName("http://gestor_taller/", "TallerWSPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/Gestor/services/TallerWSPort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TallerWS_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/Gestor/services/TallerWSPort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TallerWS_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TallerWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TallerWS_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TallerWS_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TallerWS_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TallerWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns TallerWS
     */
    @WebEndpoint(name = "TallerWSPort")
    public TallerWS getTallerWSPort() {
        return super.getPort(TallerWSPort, TallerWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TallerWS
     */
    @WebEndpoint(name = "TallerWSPort")
    public TallerWS getTallerWSPort(WebServiceFeature... features) {
        return super.getPort(TallerWSPort, TallerWS.class, features);
    }

}

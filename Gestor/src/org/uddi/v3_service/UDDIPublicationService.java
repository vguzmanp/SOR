package org.uddi.v3_service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * 2014-04-05T12:42:47.450+02:00
 * Generated source version: 3.0.0-milestone1
 * 
 */
@WebServiceClient(name = "UDDIPublicationService", 
                  wsdlLocation = "http://localhost:8081/juddiv3/services/publish?wsdl",
                  targetNamespace = "urn:uddi-org:v3_service") 
public class UDDIPublicationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:uddi-org:v3_service", "UDDIPublicationService");
    public final static QName UDDIPublicationImplPort = new QName("urn:uddi-org:v3_service", "UDDIPublicationImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8081/juddiv3/services/publish?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UDDIPublicationService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8081/juddiv3/services/publish?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UDDIPublicationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UDDIPublicationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UDDIPublicationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UDDIPublicationService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UDDIPublicationService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UDDIPublicationService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns UDDIPublicationPortType
     */
    @WebEndpoint(name = "UDDIPublicationImplPort")
    public UDDIPublicationPortType getUDDIPublicationImplPort() {
        return super.getPort(UDDIPublicationImplPort, UDDIPublicationPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UDDIPublicationPortType
     */
    @WebEndpoint(name = "UDDIPublicationImplPort")
    public UDDIPublicationPortType getUDDIPublicationImplPort(WebServiceFeature... features) {
        return super.getPort(UDDIPublicationImplPort, UDDIPublicationPortType.class, features);
    }

}

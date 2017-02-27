
package addressing.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WsAddressingService", targetNamespace = "http://service.addressing/", wsdlLocation = "http://127.0.0.1:7890/addressing?wsdl")
public class WsAddressingService
    extends Service
{

    private final static URL WSADDRESSINGSERVICE_WSDL_LOCATION;
    private final static WebServiceException WSADDRESSINGSERVICE_EXCEPTION;
    private final static QName WSADDRESSINGSERVICE_QNAME = new QName("http://service.addressing/", "WsAddressingService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:7890/addressing?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSADDRESSINGSERVICE_WSDL_LOCATION = url;
        WSADDRESSINGSERVICE_EXCEPTION = e;
    }

    public WsAddressingService() {
        super(__getWsdlLocation(), WSADDRESSINGSERVICE_QNAME);
    }

    public WsAddressingService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSADDRESSINGSERVICE_QNAME, features);
    }

    public WsAddressingService(URL wsdlLocation) {
        super(wsdlLocation, WSADDRESSINGSERVICE_QNAME);
    }

    public WsAddressingService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSADDRESSINGSERVICE_QNAME, features);
    }

    public WsAddressingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsAddressingService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsAddressing
     */
    @WebEndpoint(name = "WsAddressingPort")
    public WsAddressing getWsAddressingPort() {
        return super.getPort(new QName("http://service.addressing/", "WsAddressingPort"), WsAddressing.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsAddressing
     */
    @WebEndpoint(name = "WsAddressingPort")
    public WsAddressing getWsAddressingPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.addressing/", "WsAddressingPort"), WsAddressing.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSADDRESSINGSERVICE_EXCEPTION!= null) {
            throw WSADDRESSINGSERVICE_EXCEPTION;
        }
        return WSADDRESSINGSERVICE_WSDL_LOCATION;
    }

}
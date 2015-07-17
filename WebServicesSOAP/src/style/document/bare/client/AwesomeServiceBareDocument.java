
package style.document.bare.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AwesomeServiceBareDocument", targetNamespace = "http://service.bare.document.style/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AwesomeServiceBareDocument {


    /**
     * 
     * @param operation2
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "operation2Response", targetNamespace = "http://service.bare.document.style/", partName = "operation2Response")
    @Action(input = "http://service.bare.document.style/AwesomeServiceBareDocument/operation2Request", output = "http://service.bare.document.style/AwesomeServiceBareDocument/operation2Response")
    public String operation2(
        @WebParam(name = "operation2", targetNamespace = "http://service.bare.document.style/", partName = "operation2")
        AwesomeServiceBareDocumentBean operation2);

}

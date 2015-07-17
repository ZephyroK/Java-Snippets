
package addressing.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "SomeOperationException", targetNamespace = "http://service.addressing/")
public class SomeOperationException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SomeOperationException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public SomeOperationException_Exception(String message, SomeOperationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public SomeOperationException_Exception(String message, SomeOperationException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: addressing.client.SomeOperationException
     */
    public SomeOperationException getFaultInfo() {
        return faultInfo;
    }

}

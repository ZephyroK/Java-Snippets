
package async.error.client;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ExpectedError", targetNamespace = "http://checked.exception/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExpectedError {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<async.error.client.DivisionResponse>
     */
    @WebMethod(operationName = "division")
    @RequestWrapper(localName = "division", targetNamespace = "http://checked.exception/", className = "async.error.client.Division")
    @ResponseWrapper(localName = "divisionResponse", targetNamespace = "http://checked.exception/", className = "async.error.client.DivisionResponse")
    public Response<DivisionResponse> divisionAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "division")
    @RequestWrapper(localName = "division", targetNamespace = "http://checked.exception/", className = "async.error.client.Division")
    @ResponseWrapper(localName = "divisionResponse", targetNamespace = "http://checked.exception/", className = "async.error.client.DivisionResponse")
    public Future<?> divisionAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<DivisionResponse> asyncHandler);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     * @throws ZeroParameterException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "division", targetNamespace = "http://checked.exception/", className = "async.error.client.Division")
    @ResponseWrapper(localName = "divisionResponse", targetNamespace = "http://checked.exception/", className = "async.error.client.DivisionResponse")
    @Action(input = "http://checked.exception/ExpectedError/divisionRequest", output = "http://checked.exception/ExpectedError/divisionResponse", fault = {
        @FaultAction(className = ZeroParameterException_Exception.class, value = "http://checked.exception/ExpectedError/division/Fault/ZeroParameterException")
    })
    public double division(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1)
        throws ZeroParameterException_Exception
    ;

}

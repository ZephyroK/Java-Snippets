
package fibonacci.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fibonacci.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FibException_QNAME = new QName("http://service.fibonacci/", "FibException");
    private final static QName _CalculateFibonacci_QNAME = new QName("http://service.fibonacci/", "calculateFibonacci");
    private final static QName _CalculateFibonacciResponse_QNAME = new QName("http://service.fibonacci/", "calculateFibonacciResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fibonacci.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateFibonacci }
     * 
     */
    public CalculateFibonacci createCalculateFibonacci() {
        return new CalculateFibonacci();
    }

    /**
     * Create an instance of {@link FibException }
     * 
     */
    public FibException createFibException() {
        return new FibException();
    }

    /**
     * Create an instance of {@link CalculateFibonacciResponse }
     * 
     */
    public CalculateFibonacciResponse createCalculateFibonacciResponse() {
        return new CalculateFibonacciResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FibException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.fibonacci/", name = "FibException")
    public JAXBElement<FibException> createFibException(FibException value) {
        return new JAXBElement<FibException>(_FibException_QNAME, FibException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateFibonacci }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.fibonacci/", name = "calculateFibonacci")
    public JAXBElement<CalculateFibonacci> createCalculateFibonacci(CalculateFibonacci value) {
        return new JAXBElement<CalculateFibonacci>(_CalculateFibonacci_QNAME, CalculateFibonacci.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateFibonacciResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.fibonacci/", name = "calculateFibonacciResponse")
    public JAXBElement<CalculateFibonacciResponse> createCalculateFibonacciResponse(CalculateFibonacciResponse value) {
        return new JAXBElement<CalculateFibonacciResponse>(_CalculateFibonacciResponse_QNAME, CalculateFibonacciResponse.class, null, value);
    }

}

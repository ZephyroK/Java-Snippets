
package addressing.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the addressing.client package. 
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

    private final static QName _SomeOperation_QNAME = new QName("http://service.addressing/", "someOperation");
    private final static QName _SomeOperationException_QNAME = new QName("http://service.addressing/", "SomeOperationException");
    private final static QName _AnotherOperationResponse_QNAME = new QName("http://service.addressing/", "anotherOperationResponse");
    private final static QName _AnotherOperation_QNAME = new QName("http://service.addressing/", "anotherOperation");
    private final static QName _SomeOperationResponse_QNAME = new QName("http://service.addressing/", "someOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: addressing.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SomeOperationResponse }
     * 
     */
    public SomeOperationResponse createSomeOperationResponse() {
        return new SomeOperationResponse();
    }

    /**
     * Create an instance of {@link AnotherOperation }
     * 
     */
    public AnotherOperation createAnotherOperation() {
        return new AnotherOperation();
    }

    /**
     * Create an instance of {@link SomeOperationException }
     * 
     */
    public SomeOperationException createSomeOperationException() {
        return new SomeOperationException();
    }

    /**
     * Create an instance of {@link SomeOperation }
     * 
     */
    public SomeOperation createSomeOperation() {
        return new SomeOperation();
    }

    /**
     * Create an instance of {@link AnotherOperationResponse }
     * 
     */
    public AnotherOperationResponse createAnotherOperationResponse() {
        return new AnotherOperationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomeOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.addressing/", name = "someOperation")
    public JAXBElement<SomeOperation> createSomeOperation(SomeOperation value) {
        return new JAXBElement<SomeOperation>(_SomeOperation_QNAME, SomeOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomeOperationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.addressing/", name = "SomeOperationException")
    public JAXBElement<SomeOperationException> createSomeOperationException(SomeOperationException value) {
        return new JAXBElement<SomeOperationException>(_SomeOperationException_QNAME, SomeOperationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnotherOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.addressing/", name = "anotherOperationResponse")
    public JAXBElement<AnotherOperationResponse> createAnotherOperationResponse(AnotherOperationResponse value) {
        return new JAXBElement<AnotherOperationResponse>(_AnotherOperationResponse_QNAME, AnotherOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnotherOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.addressing/", name = "anotherOperation")
    public JAXBElement<AnotherOperation> createAnotherOperation(AnotherOperation value) {
        return new JAXBElement<AnotherOperation>(_AnotherOperation_QNAME, AnotherOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomeOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.addressing/", name = "someOperationResponse")
    public JAXBElement<SomeOperationResponse> createSomeOperationResponse(SomeOperationResponse value) {
        return new JAXBElement<SomeOperationResponse>(_SomeOperationResponse_QNAME, SomeOperationResponse.class, null, value);
    }

}


package secure.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the secure.client package. 
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

    private final static QName _HelloWorldRestricted_QNAME = new QName("http://service.secure/", "helloWorldRestricted");
    private final static QName _HelloWorldResponse_QNAME = new QName("http://service.secure/", "helloWorldResponse");
    private final static QName _HelloWorldRestrictedResponse_QNAME = new QName("http://service.secure/", "helloWorldRestrictedResponse");
    private final static QName _HelloWorld_QNAME = new QName("http://service.secure/", "helloWorld");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: secure.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloWorldRestrictedResponse }
     * 
     */
    public HelloWorldRestrictedResponse createHelloWorldRestrictedResponse() {
        return new HelloWorldRestrictedResponse();
    }

    /**
     * Create an instance of {@link HelloWorldResponse }
     * 
     */
    public HelloWorldResponse createHelloWorldResponse() {
        return new HelloWorldResponse();
    }

    /**
     * Create an instance of {@link HelloWorldRestricted }
     * 
     */
    public HelloWorldRestricted createHelloWorldRestricted() {
        return new HelloWorldRestricted();
    }

    /**
     * Create an instance of {@link HelloWorld }
     * 
     */
    public HelloWorld createHelloWorld() {
        return new HelloWorld();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorldRestricted }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.secure/", name = "helloWorldRestricted")
    public JAXBElement<HelloWorldRestricted> createHelloWorldRestricted(HelloWorldRestricted value) {
        return new JAXBElement<HelloWorldRestricted>(_HelloWorldRestricted_QNAME, HelloWorldRestricted.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.secure/", name = "helloWorldResponse")
    public JAXBElement<HelloWorldResponse> createHelloWorldResponse(HelloWorldResponse value) {
        return new JAXBElement<HelloWorldResponse>(_HelloWorldResponse_QNAME, HelloWorldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorldRestrictedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.secure/", name = "helloWorldRestrictedResponse")
    public JAXBElement<HelloWorldRestrictedResponse> createHelloWorldRestrictedResponse(HelloWorldRestrictedResponse value) {
        return new JAXBElement<HelloWorldRestrictedResponse>(_HelloWorldRestrictedResponse_QNAME, HelloWorldRestrictedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.secure/", name = "helloWorld")
    public JAXBElement<HelloWorld> createHelloWorld(HelloWorld value) {
        return new JAXBElement<HelloWorld>(_HelloWorld_QNAME, HelloWorld.class, null, value);
    }

}

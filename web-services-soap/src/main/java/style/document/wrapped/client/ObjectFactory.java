
package style.document.wrapped.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the style.document.wrapped.client package. 
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

    private final static QName _Operation1_QNAME = new QName("http://service.wrapped.document.style/", "operation1");
    private final static QName _Operation1Response_QNAME = new QName("http://service.wrapped.document.style/", "operation1Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: style.document.wrapped.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Operation1Response }
     * 
     */
    public Operation1Response createOperation1Response() {
        return new Operation1Response();
    }

    /**
     * Create an instance of {@link Operation1 }
     * 
     */
    public Operation1 createOperation1() {
        return new Operation1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wrapped.document.style/", name = "operation1")
    public JAXBElement<Operation1> createOperation1(Operation1 value) {
        return new JAXBElement<Operation1>(_Operation1_QNAME, Operation1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wrapped.document.style/", name = "operation1Response")
    public JAXBElement<Operation1Response> createOperation1Response(Operation1Response value) {
        return new JAXBElement<Operation1Response>(_Operation1Response_QNAME, Operation1Response.class, null, value);
    }

}

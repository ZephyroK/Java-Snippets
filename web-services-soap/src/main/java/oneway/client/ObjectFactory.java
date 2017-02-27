
package oneway.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oneway.client package. 
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

    private final static QName _NoReturnOperation_QNAME = new QName("http://service.oneway/", "noReturnOperation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oneway.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NoReturnOperation }
     * 
     */
    public NoReturnOperation createNoReturnOperation() {
        return new NoReturnOperation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoReturnOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.oneway/", name = "noReturnOperation")
    public JAXBElement<NoReturnOperation> createNoReturnOperation(NoReturnOperation value) {
        return new JAXBElement<NoReturnOperation>(_NoReturnOperation_QNAME, NoReturnOperation.class, null, value);
    }

}

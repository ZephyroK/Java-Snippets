
package style.document.bare.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the style.document.bare.client package. 
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

    private final static QName _Operation2Response_QNAME = new QName("http://service.bare.document.style/", "operation2Response");
    private final static QName _Operation2_QNAME = new QName("http://service.bare.document.style/", "operation2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: style.document.bare.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AwesomeServiceBareDocumentBean }
     * 
     */
    public AwesomeServiceBareDocumentBean createAwesomeServiceBareDocumentBean() {
        return new AwesomeServiceBareDocumentBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bare.document.style/", name = "operation2Response")
    public JAXBElement<String> createOperation2Response(String value) {
        return new JAXBElement<String>(_Operation2Response_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AwesomeServiceBareDocumentBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bare.document.style/", name = "operation2")
    public JAXBElement<AwesomeServiceBareDocumentBean> createOperation2(AwesomeServiceBareDocumentBean value) {
        return new JAXBElement<AwesomeServiceBareDocumentBean>(_Operation2_QNAME, AwesomeServiceBareDocumentBean.class, null, value);
    }

}

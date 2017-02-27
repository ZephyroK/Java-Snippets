
package overloaded.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the overloaded.client package. 
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

    private final static QName _RemoveEmployeeById_QNAME = new QName("http://service.overloaded/", "removeEmployeeById");
    private final static QName _RemoveEmployeeByName_QNAME = new QName("http://service.overloaded/", "removeEmployeeByName");
    private final static QName _RemoveEmployeeByIdResponse_QNAME = new QName("http://service.overloaded/", "removeEmployeeByIdResponse");
    private final static QName _RemoveEmployeeByNameResponse_QNAME = new QName("http://service.overloaded/", "removeEmployeeByNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: overloaded.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveEmployeeByNameResponse }
     * 
     */
    public RemoveEmployeeByNameResponse createRemoveEmployeeByNameResponse() {
        return new RemoveEmployeeByNameResponse();
    }

    /**
     * Create an instance of {@link RemoveEmployeeByIdResponse }
     * 
     */
    public RemoveEmployeeByIdResponse createRemoveEmployeeByIdResponse() {
        return new RemoveEmployeeByIdResponse();
    }

    /**
     * Create an instance of {@link RemoveEmployeeByName }
     * 
     */
    public RemoveEmployeeByName createRemoveEmployeeByName() {
        return new RemoveEmployeeByName();
    }

    /**
     * Create an instance of {@link RemoveEmployeeById }
     * 
     */
    public RemoveEmployeeById createRemoveEmployeeById() {
        return new RemoveEmployeeById();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEmployeeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.overloaded/", name = "removeEmployeeById")
    public JAXBElement<RemoveEmployeeById> createRemoveEmployeeById(RemoveEmployeeById value) {
        return new JAXBElement<RemoveEmployeeById>(_RemoveEmployeeById_QNAME, RemoveEmployeeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEmployeeByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.overloaded/", name = "removeEmployeeByName")
    public JAXBElement<RemoveEmployeeByName> createRemoveEmployeeByName(RemoveEmployeeByName value) {
        return new JAXBElement<RemoveEmployeeByName>(_RemoveEmployeeByName_QNAME, RemoveEmployeeByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEmployeeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.overloaded/", name = "removeEmployeeByIdResponse")
    public JAXBElement<RemoveEmployeeByIdResponse> createRemoveEmployeeByIdResponse(RemoveEmployeeByIdResponse value) {
        return new JAXBElement<RemoveEmployeeByIdResponse>(_RemoveEmployeeByIdResponse_QNAME, RemoveEmployeeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEmployeeByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.overloaded/", name = "removeEmployeeByNameResponse")
    public JAXBElement<RemoveEmployeeByNameResponse> createRemoveEmployeeByNameResponse(RemoveEmployeeByNameResponse value) {
        return new JAXBElement<RemoveEmployeeByNameResponse>(_RemoveEmployeeByNameResponse_QNAME, RemoveEmployeeByNameResponse.class, null, value);
    }

}

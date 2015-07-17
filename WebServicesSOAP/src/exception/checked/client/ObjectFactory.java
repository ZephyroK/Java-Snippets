
package exception.checked.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the exception.checked.client package. 
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

    private final static QName _DivisionResponse_QNAME = new QName("http://checked.exception/", "divisionResponse");
    private final static QName _Division_QNAME = new QName("http://checked.exception/", "division");
    private final static QName _ZeroParameterException_QNAME = new QName("http://checked.exception/", "ZeroParameterException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: exception.checked.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Division }
     * 
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link ZeroParameterException }
     * 
     */
    public ZeroParameterException createZeroParameterException() {
        return new ZeroParameterException();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://checked.exception/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<DivisionResponse>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://checked.exception/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<Division>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZeroParameterException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://checked.exception/", name = "ZeroParameterException")
    public JAXBElement<ZeroParameterException> createZeroParameterException(ZeroParameterException value) {
        return new JAXBElement<ZeroParameterException>(_ZeroParameterException_QNAME, ZeroParameterException.class, null, value);
    }

}

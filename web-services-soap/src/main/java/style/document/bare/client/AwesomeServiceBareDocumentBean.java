
package style.document.bare.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for awesomeServiceBareDocumentBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="awesomeServiceBareDocumentBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="param3" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "awesomeServiceBareDocumentBean", propOrder = {
    "param1",
    "param2",
    "param3"
})
public class AwesomeServiceBareDocumentBean {

    protected String param1;
    protected int param2;
    protected long param3;

    /**
     * Gets the value of the param1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam1() {
        return param1;
    }

    /**
     * Sets the value of the param1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam1(String value) {
        this.param1 = value;
    }

    /**
     * Gets the value of the param2 property.
     * 
     */
    public int getParam2() {
        return param2;
    }

    /**
     * Sets the value of the param2 property.
     * 
     */
    public void setParam2(int value) {
        this.param2 = value;
    }

    /**
     * Gets the value of the param3 property.
     * 
     */
    public long getParam3() {
        return param3;
    }

    /**
     * Sets the value of the param3 property.
     * 
     */
    public void setParam3(long value) {
        this.param3 = value;
    }

}

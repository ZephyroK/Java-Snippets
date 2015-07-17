/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package provider.payload.source.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "message")
public class MyJaxbMessage {

    @XmlElement
    private String argument;
    @XmlElement
    private String result;

    public MyJaxbMessage() {
    }

    public MyJaxbMessage(String argument) {
        this.argument = argument;
    }
    //getter + setter

    /**
     * @return the argument
     */
    public String getArgument() {
        return argument;
    }

    /**
     * @param argument the argument to set
     */
    public void setArgument(String argument) {
        this.argument = argument;
    }

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }
}
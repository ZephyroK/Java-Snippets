/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package provider.payload.source.service;

import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.transform.Source;
import javax.xml.ws.BindingType;
import javax.xml.ws.Provider;
import javax.xml.ws.Service.Mode;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceProvider;
import javax.xml.ws.http.HTTPBinding;

@ServiceMode(Mode.PAYLOAD)
@BindingType(HTTPBinding.HTTP_BINDING)
@WebServiceProvider(
        portName = "Hello",
        serviceName = "Examples",
        targetNamespace = "urn:examples")
public class MessagingServer implements Provider<Source> {

    private JAXBContext jaxbContext;

    public MessagingServer() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(MyJaxbMessage.class);
    }

    @Override
    public Source invoke(Source payload) {
        try {
            Unmarshaller u = jaxbContext.createUnmarshaller();
            MyJaxbMessage message = (MyJaxbMessage) u.unmarshal(payload);
            Thread.sleep(3000);
            message.setResult("Hello, " + message.getArgument()
                    + " from server: " + new Date());

            return new JAXBSource(jaxbContext, message);
        }
        catch (JAXBException | InterruptedException ex) {
            throw new WebServiceException(ex);
        } 
    }
}
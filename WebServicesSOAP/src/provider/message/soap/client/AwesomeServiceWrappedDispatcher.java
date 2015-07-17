package provider.message.soap.client;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import style.document.wrapped.client.AwesomeServiceWrappedDocumentService;
import style.document.wrapped.client.Operation1;
import style.document.wrapped.client.ObjectFactory;

public class AwesomeServiceWrappedDispatcher {
	public static void main(String ...args) throws SOAPException, JAXBException {
		AwesomeServiceWrappedDocumentService service = new AwesomeServiceWrappedDocumentService();
		
		QName portName = new QName("http://service.wrapped.document.style/", "AwesomeServiceWrappedDocumentPort");
		Dispatch<SOAPMessage> dispatch = service.createDispatch(portName, SOAPMessage.class, Service.Mode.MESSAGE);
		
		//BindingProvider bindingProvider = (BindingProvider) dispatch;
		//MessageFactory factory = ((SOAPBinding) bindingProvider.getBinding()).getMessageFactory();
		MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage message = factory.createMessage();
        
        SOAPBody body = message.getSOAPBody();
        Operation1 operation1 = new Operation1();
        operation1.setArg0("value");
        operation1.setArg1(10);
        operation1.setArg2(1);
        
        ObjectFactory objectFactory = new ObjectFactory();
        JAXBElement<Operation1> jaxbOperation1 = objectFactory.createOperation1(operation1);
        
        JAXBContext jaxbContext = JAXBContext.newInstance(Operation1.class);
        jaxbContext.createMarshaller().marshal(jaxbOperation1, body);
        
        message.saveChanges();
        
        SOAPMessage response = dispatch.invoke(message);
        System.out.println("response: " + response);
	}
}

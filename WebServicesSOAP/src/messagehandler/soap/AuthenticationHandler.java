package messagehandler.soap;

import java.util.Iterator;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class AuthenticationHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		
		System.out.println("outboundProperty: " + outboundProperty);
		SOAPMessage msg = context.getMessage();

		if (outboundProperty) {
			try { 
				embedAuthenticationData(msg);
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		} 
		else {
			try { 
				validateAuthenticationData(msg); 
			}
			catch(Exception ex ){
				ex.printStackTrace();
			}
		}
		return true;
	}

	
	@Override
	public void close(MessageContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean handleFault(SOAPMessageContext arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void embedAuthenticationData(SOAPMessage message) throws SOAPException {
		System.out.println("inside embedAuthenticationData");
		SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();

		QName authName = new QName("http://service.fibonacci/", "auth");
		Name userName = envelope.createName("user");
		Name passwordName = envelope.createName("password");
		
		SOAPHeader header = envelope.getHeader();
		
		if(header == null) {
			header = envelope.addHeader();
		}
		System.out.println("header: " + header);
		SOAPHeaderElement newHeader = header.addHeaderElement(authName);
		newHeader.addAttribute(userName, "tracy");
		newHeader.addAttribute(passwordName, "123");
	}
	
	private void validateAuthenticationData(SOAPMessage msg) throws SOAPException {
		System.out.println("inside validateAuthenticationData");
		SOAPEnvelope envelope = msg.getSOAPPart().getEnvelope();
		QName authName = new QName("http://service.fibonacci/", "auth");
		Name userName = envelope.createName("user");
		Name passwordName = envelope.createName("password");
		
		SOAPHeader header = msg.getSOAPHeader();
		
		Iterator iterator = header.getChildElements(authName);
		while(iterator.hasNext()) {
			SOAPHeaderElement authHeader = (SOAPHeaderElement) iterator.next();
			String user = authHeader.getAttributeValue(userName);
			String password = authHeader.getAttributeValue(passwordName);
			validate(user, password);
		}
	}

	private void validate(String user, String password) {
		System.out.println("validate user: " + user + ", password: " + password);
	}
}

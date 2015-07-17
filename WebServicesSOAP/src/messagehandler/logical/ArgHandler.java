package messagehandler.logical;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.ws.LogicalMessage;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;
import fibonacci.client.CalculateFibonacci;

public class ArgHandler implements LogicalHandler<LogicalMessageContext> {

	@Override
	public void close(MessageContext messageContext) { }

	@Override
	public boolean handleFault(LogicalMessageContext logicalMessageContext) {
		return true;
	}

	@Override
	public boolean handleMessage(LogicalMessageContext logicalMessageContext) {
		System.out.println("ArgHandler.handleMessage");
		Boolean isOutbound = (Boolean) logicalMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		System.out.println("isOutbound: " + isOutbound);
		if(isOutbound) {
			LogicalMessage message = logicalMessageContext.getMessage();
			
			try {
				JAXBContext jaxbContext = JAXBContext.newInstance("fibonacci.client");
				Object payload = message.getPayload(jaxbContext);
				if(payload instanceof JAXBElement) {
					Object obj = ((JAXBElement) payload).getValue();
					CalculateFibonacci calculateFibonacci = (CalculateFibonacci) obj;
					
					int currentValue = calculateFibonacci.getArg0();
					if(currentValue < 0) {
						System.out.println("ArgHandler.handleMessage updating value");
						calculateFibonacci.setArg0(Math.abs(currentValue));
						
						((JAXBElement) payload).setValue(calculateFibonacci);
						message.setPayload(payload, jaxbContext);
					}
				}
			} 
			catch (JAXBException e) {
				e.printStackTrace();
			}
		}
		return true;
	}
}

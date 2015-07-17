package messagehandler.logical;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.LogicalMessage;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

import fibonacci.client.CalculateFibonacci;
import fibonacci.client.CalculateFibonacciResponse;

public class FibonacciCacheHandler implements LogicalHandler<LogicalMessageContext> {
	//stores previously computed values
	public static Map<Integer, Integer> cache = 
			Collections.synchronizedMap(new HashMap<Integer, Integer>());
	
	@Override
	public boolean handleMessage(LogicalMessageContext logicalMessageContext) {
		System.out.println("FibonacciCache.handleMessage");
		Boolean isOutbound = (Boolean) logicalMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		System.out.println("isOutbound: " + isOutbound);
		if(!isOutbound) {
			LogicalMessage message = logicalMessageContext.getMessage();
			
			try {
				JAXBContext jaxbContext = JAXBContext.newInstance("fibonacci.client");
				Object payload = message.getPayload(jaxbContext);
				if(payload instanceof JAXBElement) {
					Object obj = ((JAXBElement) payload).getValue();
					CalculateFibonacci calculateFibonacci = (CalculateFibonacci) obj;
					
					int inputValue = calculateFibonacci.getArg0();
					
					Integer cachedValue = cache.get(inputValue);
					System.out.println("inputValue: " + inputValue);
					System.out.println("cachedValue: " + cachedValue);
					if(cachedValue != null) {
						//Create response message
						CalculateFibonacciResponse calculateFibonacciResponse = new CalculateFibonacciResponse();
						calculateFibonacciResponse.setReturn(cachedValue);
						
						JAXBElement<CalculateFibonacciResponse> responsePayload =
								new JAXBElement<CalculateFibonacciResponse>(new QName("http://service.fibonacci/", "calculateFibonacciResponse"),
										CalculateFibonacciResponse.class, calculateFibonacciResponse);
						message.setPayload(responsePayload, jaxbContext);
						
						return false;
					}
				}
			}
			catch (JAXBException e) {
				e.printStackTrace();
			}
		}
		
		return true;
	}
	
	@Override
	public void close(MessageContext arg0) {
		
	}
	
	@Override
	public boolean handleFault(LogicalMessageContext arg0) {
		return false;
	}
}
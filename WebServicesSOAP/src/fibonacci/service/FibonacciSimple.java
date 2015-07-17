package fibonacci.service;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import messagehandler.logical.FibonacciCacheHandler;


@WebService(serviceName="FibonacciService", portName="FibonacciPort", name="Fibonacci", targetNamespace="http://service.fibonacci/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,
			 use = SOAPBinding.Use.LITERAL,
			 parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
@HandlerChain(file="handlerChain.xml")
public class FibonacciSimple {
	
	@WebMethod
	public int calculateFibonacci(int n) throws FibException {
		System.out.println("inside calculateFibonacci: "+ n);
		//Throw a fault if n is negative
		if(n < 0) throw new FibException("Negative argument not allowed.", n + " < 0");
		
		//Easy case
		if(n < 2) return n;
		
		//Otherwise compute from scratch, cache and return
		int fib = 1;
		int previous = 0;
		for(int i = 2; i <= n; i++) {
			int temp = fib;
			fib += previous;
			previous = temp;
		}
		
		FibonacciCacheHandler.cache.put(n, fib);
		return fib;
	}
}

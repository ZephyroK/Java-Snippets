package fibonacci.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,
			 use = SOAPBinding.Use.LITERAL,
			 parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
//@HandlerChain(file="handlerChain.xml")
public class Fibonacci {
	//stores previously computed values
	public static Map<Integer, Integer> cache = 
			Collections.synchronizedMap(new HashMap<Integer, Integer>());
	
	@WebMethod
	public int calculateFibonacci(int n) throws FibException {
		System.out.println("inside calculateFibonacci: "+ n);
		//Throw a fault if n is negative
		if(n < 0) throw new FibException("Negative argument not allowed.", n + " < 0");
		
		//Easy case
		if(n < 2) return n;
		
		//Return cached value if present
		if(cache.containsKey(n)) return cache.get(n);
		if(cache.containsKey(n -1) && cache.containsKey(n - 2)) {
			cache.put(n, cache.get(n - 1) + cache.get(n - 2));
			return cache.get(n);
		}
		
		//Otherwise compute from scratch, cache and return
		int fib = 1;
		int previous = 0;
		for(int i = 2; i <= n; i++) {
			int temp = fib;
			fib += previous;
			previous = temp;
		}
		cache.put(n, fib);
		return fib;
	}
}

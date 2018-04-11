package lambda;

import lambda.interfaces.SimpleInterface;

public class UseSimpleInterface {

	public static void main(String[] args) {

		SimpleInterface obj = () -> System.out.println("Say something");
		obj.doSomething();
		
	}
}

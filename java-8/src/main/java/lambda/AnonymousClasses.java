package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClasses {
	
	public static void main(String args[]){
		 
		List<String> strings = new ArrayList<String>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("EEE");
 
		//Simple case-sensitive sort operation
		Collections.sort(strings);
		System.out.println("Simple sort");
		for(String str: strings){
			System.out.println(str);
		}
		
		//Case-insensitive sort with an anonymous class
		Comparator<String> comp = (str1, str2) -> {
			return str1.compareToIgnoreCase(str2);
		};
		Collections.sort(strings, comp);
		System.out.println("Sort with comparator");
		for(String str: strings){
			System.out.println(str);
		}
		
		Runnable r1 = () -> { 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Running Thread 1");
		};
		Runnable r2 = () -> System.out.println("Running Thread 2");
		
		new Thread(r1).start();
		new Thread(r2).start();
		
	}
	
}

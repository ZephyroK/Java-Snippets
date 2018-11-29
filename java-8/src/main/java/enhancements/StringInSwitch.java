package enhancements;

public class StringInSwitch {
	public static void main(String[] args) {
		
		// Use compile-time constant, literal or initialized final variable in case sentences
		final int a = 1;
		final int b;
		b = 2;
		int x = 0;
		switch (x) {
			case a: // ok
			// case b: // compiler error
		}


		String value = "while";
		final String whileStatement = "while";
		
		switch(value) {
			case "if": System.out.println("value is if"); break;
			case "for": System.out.println("value is for"); break;
			case whileStatement: System.out.println("value is while"); break;
			default: System.out.println("not sure what value is");
		}
		
		byte aByte = 64;
		
		switch(aByte) {
			case 8: System.out.println("it is 8"); break;
			case 16: System.out.println("it is 16"); break;
			case 64: System.out.println("it is 64"); break;
			case 127: System.out.println("it is 127"); break;
			//case 128: System.out.println("it is 128"); break; It will not compile because of possible loss conversion error
			default: System.out.println("not sure what aByte is");
		}
	}
}

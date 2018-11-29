package enhancements;

import java.io.*;

public class TryWithResources {
	public static void main(String[] args) {
		// This is legal code, finally is implicity added
		try (CloseableResource resource = new CloseableResource()) {

		}

		try (Reader reader = new BufferedReader(new FileReader("file.txt"))) {
			
		}
		catch(IOException e) {
			
		}
		
		try(CloseableResource resource = new CloseableResource()) {
			
		}
		finally {
			System.out.println("Finally from try");
		}
	}
}

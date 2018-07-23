package enhancements;

//import java.io.*;

public class CloseableResource implements AutoCloseable {
	public void close() /*throws IOException*/ {
		System.out.println("closing CloseableResource");
	}
}
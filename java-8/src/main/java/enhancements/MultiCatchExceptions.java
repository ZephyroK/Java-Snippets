package enhancements;

import java.io.*;
import java.sql.SQLException;

public class MultiCatchExceptions {
	public static void main(String[] args) {
	    try {
			FileReader reader = new FileReader("file.txt");
	    }
	    catch(Exception e) {
		//catch(IOException | NullPointerException e) {
		e.printStackTrace();
		//e = new IOException(); // won't compile, error: multi-catch parameter e may not be assigned
	    }
	    /* 
	     * Won't compile
	     * catch(IOException e | NullPointerException e)
	     * catch(IOException e1 | NullPointerException e2)
	     */
	}
	
	public void couldThrowAnException() throws IOException, SQLException {}
	
	public void rethrow() throws SQLException, IOException {
		try {
			couldThrowAnException();
		}
		//catch(IOException | SQLException e) {
		catch(Exception e) { // Java 6 will fail with error: unreported exception, any exception that the called methods happen to throw
			throw e;
		}
	}
	
	//See also page 185 in book
}

package files;

import java.nio.file.*;
import java.io.IOException;

public class DirectoryStreamUse {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/zephyrok");
	try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
	    for (Path path : stream)
	        System.out.println(path.getFileName());
	}
	catch(IOException e) {
	    e.printStackTrace();
	}

	System.out.println("****** Filtered files beginning with A or D ******");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "[AD]*")) {
	    for (Path path : stream)
	        System.out.println(path.getFileName());
	}
	catch(IOException e) {
	    e.printStackTrace();
	}
    }
}

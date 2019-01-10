package files;

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class RemoveClassFiles extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().toString().endsWith(".class"))
	    Files.delete(file);
	return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws Exception {
        RemoveClassFiles dirs = new RemoveClassFiles();
	Files.walkFileTree(Paths.get("/home/zephyrok/development/Java-Snippets/java-8/src/main/java"), dirs);
    }
}

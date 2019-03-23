package files;

import java.nio.file.*;

public class PathMatcherUse {
    public static void main(String[] args) {
        Path path1 = Paths.get("/home/One.txt");
	Path path2 = Paths.get("One.txt");
	PathMatcher matcher = FileSystems.getDefault()
		.getPathMatcher("glob:*.txt");
	System.out.println(matcher.matches(path1));
	System.out.println(matcher.matches(path2));

	Path path = Paths.get("/com/java/One.java");
	matches(path, "glob:*.java");
	matches(path, "glob:**/*.java");
	matches(path, "glob:*");
	matches(path, "glob:**");
	matches(Paths.get("One.java"), "glob:*.????");
	matches(Paths.get("One.java"), "glob:*.???");
	matches(Paths.get("One.ja^a"), "glob:*.????");
	matches(Paths.get("One.ja^a"), "glob:*.???");
	matches(Paths.get("Bert-book"), "glob:{Bert*,Kathy*}");
	matches(Paths.get("Kathy-horse"), "glob:{Bert,Kathy}*");
	matches(Paths.get("Bert-book"), "glob:{Bert,Kathy}");

	String glob = "glob:[0-9]\\*{A*,b}/**/1";
	matches(Paths.get("0*b/test/1"), glob);
	matches(Paths.get("9\\*b/test/1"), glob);
	matches(Paths.get("01b/1"), glob);
	matches(Paths.get("0*b/1"), glob);
    }

    public static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
	System.out.println("path:" + path + ", " + glob + ", matches:" + matcher.matches(path));
    }
}

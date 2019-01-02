package streams;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class StreamFromFile {
    
    public static void main(String[] args) {
        List<DVDInfo> dvds = loadDVDsEnhanced("./dvdinfo");
	dvds.forEach(System.out::println);
    }

    public static List<DVDInfo> loadDVDs(String filename) {
        List<DVDInfo> dvds = new ArrayList<DVDInfo>();

	try (Stream<String> stream = Files.lines(Paths.get(filename))) {
	    stream.forEach(line -> {
	        String[] dvdItems = line.split("/");
		DVDInfo dvd = new DVDInfo(dvdItems[0], dvdItems[1], dvdItems[2]);
		dvds.add(dvd);
	    });
	}
	catch (IOException e) {
	    e.printStackTrace();
	}

	return dvds;
    }

    public static List<DVDInfo> loadDVDsEnhanced(String filename) {
        try (Stream<String> stream = Files.lines(Paths.get(filename))) {
	    List<DVDInfo> dvds = stream
		    .map(s -> {
	                String[] dvdItems = s.split("/");
			DVDInfo dvd = new DVDInfo(dvdItems[0], dvdItems[1], dvdItems[2]);
			return dvd;
	            })
	            .collect(Collectors.toList());
	    return dvds;
	}
	catch(IOException e) {
	    e.printStackTrace();
	    return null;
	}
    }
}

class DVDInfo {
    String title;
    String genre;
    String leadActor;

    DVDInfo(String title, String genre, String leadActor) {
        this.title = title;
	this.genre = genre;
	this.leadActor = leadActor;
    }

    public String toString() {
        return "Title: " + title + ", Genre: " + genre + ", Lead Actor:" + leadActor;
    }
}


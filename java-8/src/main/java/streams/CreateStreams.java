package streams;

import java.util.stream.Stream;
import java.util.Arrays;

public class CreateStreams {
    public static void main(String[] args) {
        // Stream.of
	Stream<Integer> intStream = Stream.of(1, 2, 3);

	// Arrays.stream
	String[] dogs = { "Boi", "Zooey", "Charis" };
	Stream<String> dogStream = Arrays.stream(dogs);

	// Files.lines
    }
}

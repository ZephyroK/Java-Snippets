package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import streams.model.Person;

public class ParallelFilterStreams {
    public static void main(String args[]){

        List<Person> people = new ArrayList<>();

	people.add(new Person("Joe", 48));
	people.add(new Person("Mary", 30));
	people.add(new Person("Mike", 73));

	Predicate<Person> pred = (p) -> p.getAge() > 65;

	displayPeople(people, pred);

	double[] ppms = { 405.91, 405.98, 406.14, 406.48, 406.20, 406.03, 405.91, 406.91, 407.37};
	DoubleStream s = Arrays.stream(ppms);
	long result = s.parallel()
		.filter(d -> d > 406.5)
		.peek(d -> System.out.print(d + " ")).count();
	System.out.println("result: " + result);

	List<String> goodDogs =
		Arrays.asList("Boi", "Charis", "Clover", "Buffy", "Rex", "Fido");
	goodDogs.stream()
		.unordered()
		.parallel()
		.filter(d -> d.startsWith("B") || d.startsWith("C"))
		.forEach(System.out::println);
	//	.forEachOrdered(System.out::println);

    }

    private static void displayPeople(List<Person> people, Predicate<Person> pred) {
        System.out.println("Selected:");
		
	people.stream()
	    .parallel()
	    .filter(pred)
	    .forEach(p -> System.out.println(p.getName()));
    }
}

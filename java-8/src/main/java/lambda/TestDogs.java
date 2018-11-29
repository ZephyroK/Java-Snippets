package lambda;

import lambda.model.Dog;
import lambda.interfaces.DogQuerier;

public class TestDogs {
    public static void main(String[] args) {
        Dog boi = new Dog("boi", 30, 6);
	Dog clover = new Dog("clover", 30, 12);

	DogQuerier dp = (d) -> d.getAge() > 9;
	// DogQuerier dp = d - d.getAge() > 9;
	// DogQuerier dp = (Dog d) -> d.getAge() > 9;
	// DogQuerier dp = d -> { return d.getAge() > 9; };

	System.out.println("Is Boi older than 9? " + dp.test(boi));
	System.out.println("Is Clover older than 9? " + dp.test(clover));
    }
}

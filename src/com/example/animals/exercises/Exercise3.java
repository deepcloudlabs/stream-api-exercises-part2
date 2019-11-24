package com.example.animals.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.example.animals.domain.Animal;
import com.example.animals.domain.Cat;
import com.example.animals.domain.Fish;
import com.example.animals.domain.Spider;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise3 {
	private static final Consumer<Animal> printAnimal = animal -> System.out
			.println(animal.getClass().getSimpleName() + " with " + animal.getLegs() + " legs.");

	public static void main(String[] args) {
		// Find the animal with the highest number of legs
		List<Animal> animals = Arrays.asList(new Cat(), new Spider(), new Cat("Tekir"), new Fish("Free Willy"),
				new Spider(), new Fish("Jaws"));
		animals.stream().max(Comparator.comparing(Animal::getLegs)).ifPresent(printAnimal);
	}

}

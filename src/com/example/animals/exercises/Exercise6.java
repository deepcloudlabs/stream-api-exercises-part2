package com.example.animals.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import com.example.animals.domain.Animal;
import com.example.animals.domain.Cat;
import com.example.animals.domain.Fish;
import com.example.animals.domain.Spider;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise6 {
	private static final BiConsumer<Integer, List<Animal>> printGroup = (count, list) -> System.out
			.println(count + ": " + list);

	public static void main(String[] args) {
		// Group the animals by their number of legs
		List<Animal> animals = Arrays.asList(new Cat(), new Spider(), new Cat("Tekir"), new Fish("Free Willy"),
				new Spider(), new Fish("Jaws"));
		Map<Integer, List<Animal>> groupedAnimals = animals.stream().collect(Collectors.groupingBy(Animal::getLegs));
		groupedAnimals.forEach(printGroup);
	}
}

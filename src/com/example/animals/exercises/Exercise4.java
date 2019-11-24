package com.example.animals.exercises;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.example.animals.domain.Animal;
import com.example.animals.domain.Cat;
import com.example.animals.domain.Fish;
import com.example.animals.domain.Spider;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise4 {
	private static final Random random = new SecureRandom();
	private static final Supplier<Animal> spiderCreator = Spider::new;
	private static final Supplier<Animal> catCreator = Cat::new;
	private static final Supplier<Animal> fishCreator = () -> new Fish("Çakıl");
	private static final List<Supplier<Animal>> suppliers = Arrays.asList(spiderCreator, catCreator, fishCreator);

	public static void main(String[] args) {
		// Take a list of 100 random animals
		final List<Animal> randomAnimals = IntStream.generate(() -> random.nextInt(suppliers.size())).mapToObj(suppliers::get)
				.map(Supplier::get).limit(100).collect(Collectors.toList());
		randomAnimals.forEach(System.out::println);
	}
}

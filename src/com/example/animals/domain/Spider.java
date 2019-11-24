package com.example.animals.domain;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class Spider extends Animal {

	public Spider() {
		super(8);
	}

	@Override
	public void eat() {
		System.out.println("Spider is eating now...");
	}

}

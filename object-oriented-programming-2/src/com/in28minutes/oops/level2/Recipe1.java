package com.in28minutes.oops.level2;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw matreials");
		System.out.println("Get the utensils");

	}

	@Override
	void doTheDish() {
		System.out.println("do the dish");

	}

	@Override
	void cleanup() {
		System.out.println("cleanup utensil");

	}

}

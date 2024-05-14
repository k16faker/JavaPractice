package com.in28minutes.oops.level2;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw matreials");
		System.out.println("Switch on the microwave");

	}

	@Override
	void doTheDish() {
		System.out.println("get stuff ready");
		System.out.println("Put it in the Microwave");

	}

	@Override
	void cleanup() {
		System.out.println("cleanup utensil");
		System.out.println("Switch off the microwave");

	}

}

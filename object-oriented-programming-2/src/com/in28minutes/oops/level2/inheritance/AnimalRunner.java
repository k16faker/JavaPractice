package com.in28minutes.oops.level2.inheritance;

abstract class Animal {
	abstract void bark();
}

class Dog extends Animal {
	@Override
	public void bark() {
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal {
	@Override
	public void bark() {
		System.out.println("Meow Meow");
	}
}

class Bat extends Animal {
	@Override
	public void bark() {
		System.out.println("Ziiiiing");
	}
}

public class AnimalRunner {


	public static void main(String[] args) {
		Animal[] animals = { new Cat(), new Dog(), new Bat() };

		for (Animal animal : animals) {
			animal.bark();
		}

	}

}

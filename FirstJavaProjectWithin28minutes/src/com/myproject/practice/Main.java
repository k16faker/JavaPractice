package com.myproject.practice;

public class Main {

	public static void main(String[] args) {

		Monsters blueDragon = new Monsters("Blue Dragon", 99, 50000, 800, 400, true);

		Hero SwordMaster = new Hero("SwordMan", 3000, 400, 660, 300);

		blueDragon.info();

		SwordMaster.info();

		blueDragon.attacked(SwordMaster.attack());

		blueDragon.info();


	}

}

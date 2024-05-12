package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike(200);

		MotorBike honda = new MotorBike(100);


		System.out.println(ducati.getSpeed());

		System.out.println(honda.getSpeed());

		ducati.start();
		honda.start();



		ducati.increaseSpeed(100);

		honda.increaseSpeed(100);

		ducati.decreaseSpeed(250);

		honda.decreaseSpeed(250);


		System.out.println(ducati.getSpeed());

		System.out.println(honda.getSpeed());


	}

}

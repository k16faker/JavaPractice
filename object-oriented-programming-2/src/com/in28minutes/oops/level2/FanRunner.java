package com.in28minutes.oops.level2;

public class FanRunner {

	public static void main(String[] args) {

		Fan fan = new Fan("Manufacture 1", 0.34567, "Green");

		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte) 3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);

	}

}

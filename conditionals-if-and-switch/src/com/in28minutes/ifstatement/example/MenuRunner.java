package com.in28minutes.ifstatement.example;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Number 1 : ");
		int number1 = scanner.nextInt();
		System.out.println("The number you entered is - " + number1);

		System.out.println("Enter Number 2 : ");
		int number2 = scanner.nextInt();
		System.out.println("The number you entered is - " + number2);

		System.out.println("Choices Available are ");
		System.out.println("1 - Add\n2 - Subtract\n3 - Divide\n4 - Multiply\n");
		int chosen = scanner.nextInt();
		System.out.println("Choose Operation : " + chosen);

		switch (chosen) {
		case 1:
			System.out.printf("Result is - %d", number1 + number2);
			break;
		case 2:
			System.out.printf("Result is - %d", number1 - number2);
			break;
		case 3:
			System.out.printf("Result is - %d", number1 / number2);
			break;
		case 4:
			System.out.printf("Result is - %d", number1 * number2);
			break;
		default:
			System.out.println("nope");
			break;
		}

//		if (chosen == 1) {
//			System.out.printf("Result is - %d", number1 + number2);
//		} else if (chosen == 2) {
//			System.out.printf("Result is - %d", number1 - number2);
//		} else if (chosen == 3) {
//			System.out.printf("Result is - %d", number1 / number2);
//		} else if (chosen == 4) {
//			System.out.printf("Result is - %d", number1 * number2);
//		}

	}

}

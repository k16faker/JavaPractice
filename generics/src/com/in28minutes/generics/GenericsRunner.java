package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	static double sumOfNumber(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println(sumOfNumber(List.of(1, 2, 3, 4, 5)));

		String value1 = doubleValue(new String());
		Integer number = doubleValue(Integer.valueOf(5));
		
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
		duplicate(numbers);
		

		MyCustomList<String> list = new MyCustomList<>();

		list.addElement("Element 1");
		list.addElement("Element 2");
		String value = list.get(0);

		System.out.println(value);

		MyCustomList<Integer> list2 = new MyCustomList<>();

		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		Integer number1 = list2.get(0);

		System.out.println(number1);

	}

}

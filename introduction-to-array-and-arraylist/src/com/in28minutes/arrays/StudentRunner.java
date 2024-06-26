package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {


		Student student = new Student("Ranga", 97, 98, 100);
		Student student2 = new Student("Adam", 97, 98 );
		Student student3 = new Student("Eve", 97, 98, 90, 100 );
		
		
		int number = student.getNumberOfMarks();
		System.out.println("number of marks : " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("sum of marks : " + sum);

		int maximumMark = student.getMaximumMarks();
		System.out.println("maximum of marks : " + maximumMark);

		int minimumMark = student.getMinimumMarks();
		System.out.println("minimum of marks : " + minimumMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("average of marks : " + average);

		System.out.println(student);

		student.addNewMark(35);

		System.out.println(student);

		student.removeMarkAtIndex(0);

		System.out.println(student);
	}

}

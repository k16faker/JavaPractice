package com.im28minutes.primitive.datatypes;

public class MyChar {

	private char ch;

	MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a') {
			return true;
		}
		if (ch == 'e') {
			return true;
		}
		if (ch == 'i') {
			return true;
		}
		if (ch == 'o') {
			return true;
		}
		if (ch == 'u') {
			return true;
		}
		if (ch == 'A') {
			return true;
		}
		if (ch == 'E') {
			return true;
		}
		if (ch == 'I') {
			return true;
		}
		if (ch == 'O') {
			return true;
		}
		if (ch == 'U') {
			return true;
		}

		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isVowel()) {
			return true;
		}
		return false;
	}

	public boolean isDigit() {
		if (ch >= 48 && ch <= 57) { // between '0' and '9'
			return true;
		}

		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 97 && ch <= 122) { // between 'a' and 'z'
			return true;
		}
		if (ch >= 65 && ch <= 90) { // between 'a' and 'z'
			return true;
		}

		return false;
	}

	public static void printLowerCaseAlphabet() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}

	}

	public static void printUpperCaseAlphabet() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}

}

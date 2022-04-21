package com.qa.helloworld;

public class Arrays {

	public static int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

	public static void main(String[] args) {
		// showArray();

		// showAnotherArray();

		// moreArrays();

		for (int num : array) {
			if (oddsOrEvens(num))
			{
				System.out.println(num + " - " + oddsOrEvens(num) + ": " + (num * num * num));
			}
			else
			{
				System.out.println(num + " - " + oddsOrEvens(num) + ": " + (num * num));				
			}
		}
	}

	private static boolean oddsOrEvens(int num) {
		// TODO Auto-generated method stub

		boolean result = false;

		if (num % 2 == 0) {
			result = true;
		}

		return result;
	}

	private static void moreArrays() {
		// TODO Auto-generated method stub

	}

	private static void showArray() {
		// TODO Auto-generated method stub

		int[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < integers.length; i++) {
			System.out.println("integers[" + i + "]: " + integers[i]);
		}

		for (int number : integers) {
			System.out.println(number);
		}

	}

	private static void showAnotherArray() {
		// TODO Auto-generated method stub

		int[] ageArray = new int[10];

		for (int i = 0; i < 10; i++) {
			ageArray[i] = i + 1;
			System.out.println("AgeArray[" + i + "] " + ageArray[i]);
		}

		for (int i = 0; i < 10; i++) {
			ageArray[i] = (i + 1) * 10;
			System.out.println("AgeArray[" + i + "] " + ageArray[i]);
		}

	}
}

package com.qa.helloworld;

public class HelloWorld {

	public static void main(String[] args)
	{
		int num11 = 3;
		int num12 = 4;
		System.out.println("Exercise One - return the sum of " + num11 + " and " + num12 + ": " + ExerciseOne(num11,num12));

		int num21 = 30;
		int num22 = 2;
		System.out.println("Exercise Two Mult - return the product of " + num21 + " and " + num22 + ": " + ExerciseTwoMult(num21,num22));
		System.out.println("Exercise Two Sub - return the subtraction of " + num21 + " and " + num22 + ": " + ExerciseTwoSub(num21,num22));
		System.out.println("Exercise Two div - return the division of " + num21 + " and " + num22 + ": " + ExerciseTwoDiv(num21,num22));

		int num31 = 40;
		int num32 = 7;
		System.out.println("Exercise Three div - return the division of " + num31 + " and " + num32 + ": " + ExerciseThreeDiv(num31,num32));
		
		int num41 = 20;
		int num42 = 53;
		System.out.println(ExerciseFourDiv(num41,num42));
		
		num41 = 20;
		num42 = 3;
		System.out.println(ExerciseFourDiv(num41,num42));

	}
	
	private static int ExerciseOne(int one, int two) {
		return one + two;
	}
		
	private static int ExerciseTwoMult(int one, int two) {
		return one * two;
	}
	
	private static int ExerciseTwoSub(int one, int two) {
		return one - two;
	}
	private static int ExerciseTwoDiv(int one, int two) {
		return one / two;
	}

	private static double ExerciseThreeDiv(double one, double two) {
		return one / two;
	}
	
	private static String ExerciseFourDiv(double one, double two) {
		
		String message = "";
		
		if (one < two)
		{
				message = "Exercise Four - the division of " + one + " and " + two + " is " + one / two;
		}
		else
		{
				message = "Exercise Four - Parameter 1 is " + one + " and parameter 2 is " + two + " The division cannot be performed";
		}
		return message;
	}
}


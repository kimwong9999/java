package com.qa.helloworld;

public class FizzBuzz {
	
	public static void main(String[] args)
	{
		System.out.println(zzz(16));
	}

		private static String zzz(int num)
		{
			String message = "";
			
			if (num % 3 == 0 && num % 5 == 0)
			{
				message = "FizzBuzz";
			}
			else if (num % 3 == 0)
			{
				message = "Fizz";
			}
			else if (num % 5 == 0)
			{
				message = "Buzz";
			}
			else message = "Number is " + num;
			
			return message;
		}
}

package com.qa.calculator;

import java.util.Scanner;

public class Menu 
{
	public void start()
	{
		Scanner scan = new Scanner(System.in);
		Boolean running = true;
		String number = "0123456789";
		System.out.println("Calculator");
		System.out.println("=".repeat(10));
			
		
		while(running)
		{
			System.out.println("Enter 'a' to add");
			System.out.println("Enter 's' to subtract");
			System.out.println("Enter 'm' to multiply");
			System.out.println("Enter 'd' to divide");
			System.out.println("Enter 'x' to exit");
			String input = scan.nextLine();
			switch (input)
			{
				case "a" :  System.out.println("Add");
							System.out.println("Please Enter your first number "); 
							int a1 = Integer.parseInt(scan.nextLine());
							System.out.println("Please Enter your second number "); 
							int a2 = Integer.parseInt(scan.nextLine());
							System.out.println("Your addition result is :  " +  Calculate.add(a1, a2));
							break;
				case "s" :  System.out.println("Subtract"); 
							System.out.println("Please Enter your first number "); 
							int s1 = Integer.parseInt(scan.nextLine());
							System.out.println("Please Enter your second number "); 
							int s2 = Integer.parseInt(scan.nextLine());
							System.out.println("Your subraction result is :  " +  Calculate.subtract(s1, s2));
							break;
				case "m" :  System.out.println("Multiply"); 
							System.out.println("Please Enter your first number "); 
							int m1 = Integer.parseInt(scan.nextLine());
							System.out.println("Please Enter your second number "); 
							int m2 = Integer.parseInt(scan.nextLine());
							System.out.println("Your multiplication result is :  " +  Calculate.multiply(m1, m2));
							break;
				case "d" :  System.out.println("divide - under construction"); 
							System.out.println("Please Enter your first number "); 
							int d1 = Integer.parseInt(scan.nextLine());
							System.out.println("Please Enter your second number "); 
							int d2 = Integer.parseInt(scan.nextLine());
							System.out.println("Your division result is :  " +  Calculate.divide(d1, d2));
							break;
				case "x" : 	running = false;
							System.out.println("Thank you for using the calcualtor, come again");
							break;
				default : System.out.println("You Knucklehead you've enterd an invalid value");
			}
		}
	}
}

package com.qa.helloworld;

public class Flowcharts {
	
	public static void main(String[] args)
	{
		flow(4001);
	}


	public static int method1(int one, int two, boolean bool)
	{
		int result = 0;
		
		if (bool)
		{
			result = one + two;
		}
		else
		{
			result = one * two;
		}
		
		return result;
	}
	
	public static void flow(int A)
	{
	
		if (A > 2000)
		{
			System.out.println("A");

			if (A > 6000)
			{
				System.out.println("C");
			}
			else
			{
				System.out.println("B");
				
				if (A > 4000)
				{
					System.out.println("D");
				}
				else
				{
					System.out.println("E");	
				}
			}
		}
		else
		{
			System.out.println("1");
			
			if (A > 100)
			{
				System.out.println("3");
				if (A > 600)
				{
					System.out.println("5");
				}
				else
				{
					System.out.println("4");
					
					if (A > 500)
					{
						System.out.println("6");
					}
					else
					{
						System.out.println("7");
					}
				}
			}
			else
			{
				System.out.println("2");
				

			}
		}
	}
}

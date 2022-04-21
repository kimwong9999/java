package com.qa.helloworld;

public class UniqueSum {
	
	public static void main(String[] args)
	{
		System.out.println(sum(4, 2, 2));
	}

	private static int sum(int one, int two, int three)
	{
		int n = 0;
		
		if (one == two && one == three)
		{
			n = 0;
		}
		else if (one == two)
		{
			n = one * three;
		}
		else if (one == three)
		{
			n = one * two;
		}
		else if (two == three)
		{
			n = one * two;
		}
		else n = one * two * three;
		
		return n;
	}
}


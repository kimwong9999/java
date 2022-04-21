package com.qa.helloworld;

public class BlackJack {
	
	public static void main(String[] args)
	{
		System.out.println(play(10, 21));
	}

	public static int play(int one, int two)
	{
		int n = 0;
		
		if (one > 21 && two > 21)
		{
			n = 0;
		}
		else if (one == 21 || two == 21)
		{
			n = 21;
		}
		else if (one > 21)
		{
			n = two;
		}
		else if (two > 21)
		{
			n = one;
		}
		else if (one > two)
		{
			n = one;
		}
		else n = two;
		
		return n;
	}
}

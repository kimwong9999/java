package com.qa.helloworld;

public class Results {
	

	public static void main(String[] args)
	{
		int physics = 130;
		int perp = (physics / 150) * 100;
		int chemistry = 110;
		double perc = (110.0 / 150) * 100;;
		int biology = 70;
		int perb = (biology / 150) * 100;
		int total = physics + chemistry + biology;
		int percentage = ((physics + chemistry + biology) * 100) / 450;
		int pass = 60;
		
		System.out.println("Percentage Chemisty: " + perc);
		
		exams(physics, chemistry, biology, perp, perc, perb, total);
		
		passorfail(percentage, physics, chemistry, biology, pass);
	}
	
	public static void exams(int p, int c, int b, int pp, double pc, int pb, int t)
	{
		System.out.println("Tom's Exam Results");
		System.out.println("  Physics   : " + p + " (" + pp + "%)");
		System.out.println("  Chemistry : " + c + " (" + pc + "%)");
		System.out.println("  Biology   : " + b + " (" + pb + "%)");
		System.out.println("  Total     : " + t);
	}
	
	public static void passorfail(int per, int p, int c, int b, int pass)
	{
		System.out.println("Tom's overall percentage is " + per);
		
		if (p < 60 || c < 60 || b < 60)
		{
			System.out.println("You idiot you failed");
		}
		else
		{
			System.out.println("Congratulations Tom you have passed");
		}

	}
}

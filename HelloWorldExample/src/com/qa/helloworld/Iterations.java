package com.qa.helloworld;

public class Iterations {
	
	public static void main(String[] args)
	{
//		Utilities.getInput("What is the value of your items: ");
		
//		double val = Double.parseDouble(Utilities.getInput("What is the value of your items: "));
//		double total = Double.parseDouble(Utilities.getInput("How much cash are you paying with: "));


		coins(6.37, 57.00);
	}

	private static void flowchart1() {
		// TODO Auto-generated method stub
		System.out.println("Flowchart 1");
		
		for (int A = 100; A <= 200; A++)
		{
			System.out.println(A+"A");
		}
		
	}
	
	private static void flowchart2() {
		// TODO Auto-generated method stub
		System.out.println("Flowchart 2");
		
		for (int A = 100; A <= 200; A++)
		{
			if (A%2 == 0)
			{
				System.out.println("-");
			}
			else
			{
				System.out.println("*");				
			}
		}
	}

	private static void flowchart3() {
		// TODO Auto-generated method stub
		System.out.println("Flowchart 3");
		
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= 10; j++)
			{
				System.out.print(j + ": " + i + ", ");
			}
			
			System.out.print("\n");
		}
	}
	
	private static void flowchart4(int end) {
		// TODO Auto-generated method stub
		System.out.println("Flowchart 4");
		
		for (int i = 1; i <= end; i++)
		{
			
			System.out.print(end + ", ");
		}
	}
	
	private static void coins(double cost, double amount) {
		// TODO Auto-generated method stub
		System.out.println("Flowchart 4");
		
		double change = amount - cost;
		int twenty = 20;
		int ten = 10;
		int five = 5;
		int two = 2;
		int one = 1;
		double fiftyp = 0.50;
		double twentyp = 0.20;
		double fivep = 0.05;
		double tenp = 0.10;
		double twop = 0.02;
		double penny = 0.01;
		
		int tw = (int)change / twenty;
		int cc = (int)change - (tw * 20);
		int te = cc / ten;
		int cd = cc - (te * 10);
		int tf = cd / 5;
		int ce = cd - (tf * 5);
		int tt = ce / 2;
		int cf = ce - (tt);
		int to = cf;
		double ss = change - ((tw * 20) + (te * 10) + (tf * 5) + (tt * 2) + to);
		int vv = (int)Math.round(ss * 100);
		int sf = vv / 50;
		int va = vv - (sf * 50);
		int st = va / 20;
		int vn = va - (st * 20);
		int sn = vn / 10;
		int vm = vn - (sn * 10);
		int sm = vm / 5;
		int vb = vm - (sm * 5);
		int so = vb / 2;
		int vo = vb - (so * 2);
		int sh = vo;

		System.out.println("Change " + change);
		System.out.println("Twenty Pound notes " + tw);
		System.out.println("Ten Pound notes " + te);
		System.out.println("Five Pound notes " + tf);
		System.out.println("Two Pound coins " + tt);
		System.out.println("One Pound coins " + to);
		System.out.println("Fifty pence coins " + sf);
		System.out.println("Twenty pence coins " + st);
		System.out.println("Ten pence coins " + sn);
		System.out.println("Five pence coins " + sm);
		System.out.println("Two pence coins " + so);
		System.out.println("one pence coins " + sh);
	}
}

package com.qa.encapsulation;

import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args) 
	{
		ArrayList<Encapsulation> enc = new ArrayList();
		
		enc.add(new Encapsulation("Algeria", 44700000, 532565, 2381741, 11829));
		enc.add(new Encapsulation("Vietnam", 96208984, 1.047, 331699, 10755));
		enc.add(new Encapsulation("Paraguay", 7359000, 101.075, 406796, 15030));
		
		
		for (Encapsulation en:enc)
		{
			System.out.println("Country Name: " + en.getCountry());
			System.out.println("\tPopulation: " + en.getPopulation());
			System.out.println("\tGDP: " + en.getGdpTotal() + " trillion");
			System.out.println("\tArea: " + en.getArea() + " km(squared)");
			System.out.println("\tGDP Per Capita: $" + en.getGdpPerCapita() + " billion");
			System.out.println(en);
		}
	}
}

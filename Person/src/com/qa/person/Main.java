package com.qa.person;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();

		people.add(new Person("Jones", "Tom", 100, 10, "Head Hunter", 40, "m"));
		people.add(new Person("Black", "Cilla", 90, 8, "Foot Hunter", 35, "f"));
		
		
		for (Person person : people) 
		{
			if (person.Gender() == "m") 
			{
				System.out.println("His name is " + person.Name() + " and his job title is " + person.JobTitle());
			} 
			else 
			{
				System.out.println("Her name is " + person.Name() + " and her job title is " + person.JobTitle());

			}

		}
		
		Person person = people.get(0);
		
		person.PrintAge();
		
		person = people.get(1);
		
		person.PrintShoeSize();

		people.add(new Person("Clooney", "George", 690));
		people.add(new Person("Roberts", "Julia", 600));
		
		person = people.get(2);
		
		person.PrintHeight();
				
		person = people.get(3);
		
		person.PrintHeight();
		

		
		System.out.println("\nA List of the Person Database");
		
		ArrayList<String> persons = new ArrayList<>();
		
		for (Person p : people)
		{
			persons.add(p.Sname() + "*" + p.Name());
		}
		
		persons.sort(null);
		
		for (String n : persons)
		{
			String name = n.substring(n.indexOf("*") + 1, n.length());
			System.out.println(name);
		}
		
	}
}

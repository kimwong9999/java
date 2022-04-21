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
		
		int PersonId = 0;
		
		System.out.println("The age of " + people.get(PersonId).Name() + " is " + people.get(PersonId).Age());

		PersonId = 1;
		
		System.out.println("The name is " + people.get(PersonId).Name() + " and the shoe size is " + people.get(PersonId).ShoeSize());

		people.add(new Person("Clooney", "George", 690));
		people.add(new Person("Roberts", "Julia", 600));
		
		PersonId = 2;
		
		System.out.println("The Height of " + people.get(PersonId).Name() + " is " + people.get(PersonId).Height() + "cm");

		PersonId = 3;
		
		System.out.println("The Height of " + people.get(PersonId).Name() + " is " + people.get(PersonId).Height() + "cm");

		
		System.out.println("\nA List of the Person Database");
		
		ArrayList<String> persons = new ArrayList<>();
		
		for (Person person : people)
		{
			persons.add(person.Sname() + "*" + person.Name());
		}
		
		persons.sort(null);
		
		for (String n : persons)
		{
			String name = n.substring(n.indexOf("*") + 1, n.length());
			System.out.println(name);
		}
		
	}
}

package com.qa.person;

public class Person {
	
	private String sname;
	private String fname;
	private int height;
	private int shoe_size;
	private String job_title;
	private int age;
	private String gender;
	private String dname;
	
	public Person(String sname, String fname, int height, int shoe_size, String job_title, int age, String gender)
	{
		this.sname		= sname;
		this.fname		= fname;
		this.height		= height;
		this.shoe_size	= shoe_size;
		this.job_title	= job_title;
		this.age		= age;
		this.gender		= gender;
		this.dname		= fname + " " + sname;
	}
	
	public Person(String sname, String fname, int height)
	{
		this.sname		= sname;
		this.fname		= fname;
		this.height		= height;
	}
	
	public String Name()
	{
		return fname + " " + sname;
	}
	
	public String NameL()
	{
		return sname + ", " + fname;
	}
	
	public String Sname()
	{
		return sname;
	}
	
	public String JobTitle()
	{
		return job_title;
	}
	
	public String Gender()
	{
		return gender;
	}
	
	public int Age()
	{
		return age;
	}
	
	public int ShoeSize()
	{
		return shoe_size;
	}
	
	public void PrintHeight()
	{
		System.out.println("The Height of " + dname + " is " + height + "cm");

	}
	
	public void PrintAge()
	{
		System.out.println("The age of " + dname + " is " + age);

	}
	
	public void PrintShoeSize()
	{
		System.out.println("The name is " + dname + " and the shoe size is " + shoe_size);
	}
}

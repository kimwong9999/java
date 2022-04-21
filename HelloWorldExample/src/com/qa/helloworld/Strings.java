package com.qa.helloworld;

public class Strings {
	
	public static String str = "The Quick Brown Fox Jumped Over The Lazy Dog";

	
	public static void main(String[] args) {
		
		//method1();
		
		//method21();
		//method22();
		//method23();
		
		method24("She Sells Sea Shells On The Sea Shore", "Sea");
		method24("She Sells Sea Shells Anywhere", "sea");
		method24("She Sells Nothing", "Sea");
		method24("She Sells Nothing", "Sea");
		method24("I Scream You Scream We All Scream For Ice Cream", "scream");
	}

	private static void method1() {
		// TODO Auto-generated method stub
		
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		String str3 = str1 + ", " + str2;
		String str4 = str3.toUpperCase();
		
		System.out.println(str4);
		
		System.out.println(str4.substring(26, 38) + str4.substring(17, 24));
		
	}

	private static void method21() {
		//This method counts the number of words
		//in a sentence and prints out that word count
		//it assumes no punctuation
		
		System.out.println("The string is: " + str);

		int words = 0;
		
		if (str.length() != 0)
		{
			words = 1;
			
			for (int i = 0; i < str.length();i++)
			{
			
				if (str.substring(i,i+1).equals(" "))
				{
					words++;
				}
			}
		}
		
		
		System.out.println("The number of words is " + words);
		
	}
	
	private static void method22() {
		//This method prints each word of a sentence
		//on a separate line, it assumes no punctuation

		System.out.println("The string is: " + str);

		int words = 0;
		int s = 0;
		
		if (str.length() != 0)
		{
			words = 1;
			
			for (int i = 0; i < str.length();i++)
			{
			
				if (str.substring(i,i+1).equals(" "))
				{
					words++;
					System.out.println(str.substring(s,i+1));
					s = i + 1;
				}
			}
			
			System.out.println(str.substring(s,str.length()));
		}
		
	}
	
	private static void method23() {
		//This method prints each word of a sentence
		//on a separate line in reverse order,
		//it assumes no punctuation
		
		System.out.println("The string is: " + str);

		int words = 0;
		int s = str.length();
		
		if (str.length() != 0)
		{
			words = 1;
			
			for (int i = str.length(); i > 0;i--)
			{
			
				if (str.substring(i-1,i).equals(" "))
				{
					words++;
					System.out.println(str.substring(i,s));
					s = i - 1;
				}
			}
			
			System.out.println(str.substring(0,s));
		}
		
	}
	
	private static void method24(String str2, String message) {
		//Prints out weather a word (message) appears one, twice, more
		//more than twice or none in a string (str2)
		//Assumes no punctuation and message is not case sensitive
		
		System.out.println("The string is: " + str2);
		System.out.println("The message is: " + message);

		int count = 0;
		String word = "";
		int s = str2.length();
		
		if (str.length() != 0)
		{	
			for (int i = str2.length(); i > 0;i--)
			{
			
				if (str2.substring(i-1,i).equals(" "))
				{
					word = str2.substring(i, s);
					s = i - 1;
					if (word.toUpperCase().equals(message.toUpperCase()))
					{
						count++;
					}
				}
			}
			
			switch (count)
			{
				case 0:System.out.println("There were no words with the value '" + message + "' found in the string\n");break;
				case 1:System.out.println("There was only 1 word with the value '" + message + "' found in the string\n");break;
				case 2:System.out.println("The word '" + message + "' was found twice in the string\n");break;
				default:System.out.println("The word '" + message + "' was found more than twice in the string\n");break;	
			}
		}
		
		
	}



}

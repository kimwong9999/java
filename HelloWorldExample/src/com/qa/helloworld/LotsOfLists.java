package com.qa.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LotsOfLists {
	
	public static void main(String[] args) {
		
		List<String> first = new ArrayList<>();
		
		first.add("zero");
		first.add("one");
		first.add("two");
		first.add("three");
		first.add("four");
		first.add("gobbly gook");
		
		System.out.println(first);
		System.out.println(first.get(3));
		
		first.set(5, "five");
		System.out.println(first);
		
		first.remove(5);
		System.out.println(first);
		
		System.out.println("Size of Array first: " + first.size());
		
		Collections.reverse(first);
		System.out.println(first);
		
		Collections.swap(first, 1, 2);
		System.out.println(first);
		
		first.sort(null);
		System.out.println(first);
		
		first.clear();
		System.out.println(first);		
		

	}

}

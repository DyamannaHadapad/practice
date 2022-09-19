  package com.xworkz.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionRunner {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Dyamanna");
		list.add("Ram");
		list.add("Nagesh");
		list.add("Sachin");
		list.add("Basu");

		System.out.println(list);
		list.remove(3);

		boolean yes = list.contains("Dyamanna");
		System.out.println(yes);

		boolean no = list.remove("Ram");
		System.out.println(no);
		
		System.out.println(list.get(2));
		System.out.println(list);

		list.clear();

		boolean yess = list.isEmpty();
		System.out.println(yess);

		
	}

}

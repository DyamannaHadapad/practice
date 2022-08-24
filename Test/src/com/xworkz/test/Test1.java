package com.xworkz.test;

public class Test1 {
	public static void main(String[] args) {
		String name = "Sudeep";
		String revName = "";

		int i = name.length();
		for (i = (i - 1); i >= 0; i--) {
			revName = revName + name.charAt(i);

		}

		System.out.println("name after reversing is  :"+revName);	}

}

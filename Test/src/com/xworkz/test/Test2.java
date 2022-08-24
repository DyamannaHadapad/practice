package com.xworkz.test;

public class Test2 {

	public String name;

	public Test2(String name) {
		System.out.println("Defult constr");
	}

	public static void main(String[] args) {

//		creation of obj by litrals
		
		String str1 = "Dyamanna H";
		System.out.println(str1.length());

//		creation of obj by constr
		
		String str = new String("Dyamanna Hadapad");
		System.out.println(str.length());
	}

}

package com.xworkz.inheritance.bike;

public class Bike {
	static String name;
	static String cc;
	static String company;
	static double price;
	static String mialage;

	public static void setDisplay(String name, String cc, String company, double price, String mialage) {
		System.out.println("Running static SetDisplay method");
		System.out.println(name);
		System.out.println(cc);
		System.out.println(company);
		System.out.println(price);
		System.out.println(mialage);
	}

}

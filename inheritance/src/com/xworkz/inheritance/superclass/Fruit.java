package com.xworkz.inheritance.superclass;

public class Fruit {

	public String name;
	public double price;
	public boolean sweet;

	public Fruit() {
		System.out.println("parent class");
	}

	public Fruit(String name, double price, boolean sweet) {
		//System.out.println("parameterised constructor");
		this.name = name;
		this.price = price;
		this.sweet = sweet;

	}

//	public void torisu() {
//		System.out.println(this.name);
//		System.out.println(this.price);
//		System.out.println(this.sweet);
//	}
}

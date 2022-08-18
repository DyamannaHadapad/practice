package com.xworkz.inheritance.superclass;

public class Plastic {

	public String Strength;
	public String type;
	public double price;

	public Plastic() {
		System.out.println("Defult constr");
	}

	public Plastic(String strength, String type, double price) {
		this.Strength = strength;
		this.price = price;
		this.type = type;
	}

}

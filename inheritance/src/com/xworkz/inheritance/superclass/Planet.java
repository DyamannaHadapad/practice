package com.xworkz.inheritance.superclass;

public class Planet {

	public String name;
	public double radius;
	public String color;

	public Planet() {
		System.out.println("defult constr");
	}

	public Planet(String name, double radius, String color) {
		this.name = name;
		this.radius = radius;
		this.color = color;
	}
}

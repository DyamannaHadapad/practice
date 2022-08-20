package com.xworkz.inheritance.superclass;

public class City {
	public String name;
	public String founder;
	public double area;

	public City() {
		System.out.println("Defult constr");
	}

	public City(String name, String founder, double area) {
		this.area = area;
		this.founder = founder;
		this.name = name;
	}
}

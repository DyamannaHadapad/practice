package com.xworkz.inheritance.superclass;

public class Market {
	public String name;
	public String type;
	public int shops;

	public Market() {
		System.out.println("defult constr of market");

	}

	public Market(String name, String type, int shops) {
		System.out.println("String ,String, int constr");
		this.name = name;
		this.shops = shops;
		this.type = type;
	}

	
}

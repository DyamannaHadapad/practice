package com.xworkz.inheritance.sub;

import com.xworkz.inheritance.superclass.Plastic;

public class Pipe extends Plastic {
	public String name;
	public String brand;
	public boolean liteWeight;

	public Pipe() {
		super();
	}

	public Pipe(String name, String brand, boolean liteweight) {
		this.brand = brand;
		this.liteWeight = liteweight;
		this.name = name;
		super.Strength=Strength;
		super.type = type;
		super.price = price;
	}

	public void torisu() {
		System.out.println(super.Strength);
		System.out.println(super.type);
		System.out.println(super.price);
		System.out.println(this.name);
		System.out.println(this.brand);
		System.out.println(this.liteWeight);

	}
}
package com.xworkz.inheritance.sub;

import com.xworkz.inheritance.superclass.Planet;

public class EarthPlanet extends Planet {
	public String shape;
	public boolean lives;
	public double population;

	public EarthPlanet() {
		super();
	}

	public EarthPlanet(String shape, boolean lives, double population) {
		this.shape = shape;
		this.lives = lives;
		this.population = population;
		super.name = name;
		super.radius = radius;
		super.color = color;
	}

	public void torisu() {
		System.out.println(super.name);
		System.out.println(super.radius);
		System.out.println(super.color);
		System.out.println(this.shape);
		System.out.println(this.lives);
		System.out.println(this.population);
	}
}

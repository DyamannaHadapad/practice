package com.xworkz.inheritance.sub;

import com.xworkz.inheritance.superclass.City;

public class Bengaluru extends City {
	public String capital;
	public double population;
	public boolean capitalOfKA;

	public Bengaluru() {
		System.out.println("bengaluru defult constr");
	}

	public Bengaluru(String capital, double population, boolean capitalOfKA,String name, String founder, double area) {
	super( name,  founder,  area);
		this.population = population;
		this.capital = capital;
		this.capitalOfKA = capitalOfKA;
	}

	public void torisu() {
		System.out.println(this.capital);
		System.out.println(this.population);
		System.out.println(this.capitalOfKA);
		System.out.println(super.area);
		System.out.println(super.founder);
		System.out.println(super.name);
	}

}

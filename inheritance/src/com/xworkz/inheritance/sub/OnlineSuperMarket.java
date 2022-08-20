package com.xworkz.inheritance.sub;

import com.xworkz.inheritance.superclass.Market;

public class OnlineSuperMarket extends Market {
	public String name1;
	public String type1;
	public double openTime;

	public OnlineSuperMarket() {
		System.out.println("defult constr of online supermarket");
	}

	public OnlineSuperMarket(String name1, String type1, double openTime, String name, String type, int shops) {
		super(name, type, shops);
		this.name1 = name1;
		this.openTime = openTime;
		this.type1 = type1;
		System.out.println("defult constr of online supermarket");
	}

	public void torisu() {
		System.out.println(super.name);
		System.out.println(super.type);
		System.out.println(super.shops);
		System.out.println(this.openTime);
		System.out.println(this.name1);
		System.out.println(this.type1);
	}

}

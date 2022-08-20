package com.xworkz.inheritance.sub;

import com.xworkz.inheritance.superclass.Market;

public class SuperMarket extends Market {
	public String name1;
	public int id;
	public String type1;

	public SuperMarket() {
		super();
		System.out.println("defult constr of SperMarket");
	}

	public SuperMarket(String name1, int id, String type1, String name, String type, int shops) {
		super(name, type, shops);
		this.name1 = name1;
		this.id = id;
		this.type1 = type1;
		System.out.println("defult constr of SperMarket");
	}

	public void torisu() {
		System.out.println(super.name);
		System.out.println(super.type);
		System.out.println(super.shops);
		System.out.println(this.id);
		System.out.println(this.name1);
		System.out.println(this.type1);
	}
}

package com.xworkz.inheritance.sub;

public class OnlineSuperMarket extends SuperMarket {
	public String name2;
	public String type3;
	public double openTime;

	public OnlineSuperMarket() {
		System.out.println("defult constr of online supermarket");
	}

	public OnlineSuperMarket(String name2, String type3, double openTime, String name1, int id, String type1,
			String name, String type, int shops) {
		super(name1, id, type1, name, type, shops);
		this.name2 = name2;
		this.openTime = openTime;
		this.type3 = type3;
		System.out.println("defult constr of online supermarket");
	}

	public void torisu() {
		System.out.println();
		System.out.println(super.name);
		System.out.println(super.type);
		System.out.println(super.shops);
		System.out.println(super.id);
		System.out.println(super.name1);
		System.out.println(super.type1);
		System.out.println(this.name);
		System.out.println(this.openTime);
		System.out.println(this.type);
	}

}

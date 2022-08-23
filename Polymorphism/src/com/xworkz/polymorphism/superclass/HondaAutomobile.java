package com.xworkz.polymorphism.superclass;

public class HondaAutomobile extends Automobile {

	public double openTime;
	public double closeTime;

	public HondaAutomobile(double openTime, double closeTime) {
		System.out.println("HondaAutomobile Defult constr");
		this.openTime = openTime;
		this.closeTime = closeTime;
	
	}

	@Override
	public void torisu() {
		// TODO Auto-generated method stub
		super.torisu();
		System.out.println(this.openTime);
		System.out.println(this.closeTime);
	}

}

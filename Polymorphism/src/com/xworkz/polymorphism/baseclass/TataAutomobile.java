package com.xworkz.polymorphism.baseclass;

import com.xworkz.polymorphism.superclass.Automobile;

public class TataAutomobile extends Automobile {
	public TataAutomobile() {
		super();
		System.out.println("TataAutombile defult constr");
	}

	@Override
	public void torisu() {
		//super.torisu();
		System.out.println(this.type);
		System.out.println(this.brand);
	}

}

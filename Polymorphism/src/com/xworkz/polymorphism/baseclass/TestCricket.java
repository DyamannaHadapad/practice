package com.xworkz.polymorphism.baseclass;

import com.xworkz.polymorphism.superclass.Cricket;

public class TestCricket extends Cricket{
	public String  groundType;
	
	public String presentation(String  groundType) {
		System.out.println("Presentation method");
		this.groundType=groundType;
		return groundType;
	}
	
	@Override
	public String setCountry(String country) {
		// TODO Auto-generated method stub
		return super.setCountry(country);
	}
	
	public void torisu() {
		System.out.println(this.groundType);
		System.out.println(super.captain);
		System.out.println(super.country);
		System.out.println(super.gender);
	}

}

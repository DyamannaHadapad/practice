package com.xworkz.polymorphism.runnerclass;

import com.xworkz.polymorphism.baseclass.TataAutomobile;
import com.xworkz.polymorphism.superclass.Automobile;
import com.xworkz.polymorphism.superclass.HondaAutomobile;

public class AutomobileRunner {

	public static void main(String[] args) {
		
		Automobile auto = new Automobile();
		double tre=auto.sellAccesscories("wheel");
		System.out.println(tre);
		auto.setType("CAR");
		System.out.println(auto.type);
		auto.setBrand("HONDA");
		System.out.println(auto.brand);
		
		
		HondaAutomobile honda = new HondaAutomobile(9.30d, 6.00d);
		honda.setType("City");
		honda.setBrand("Four wheel");
		honda.torisu();
		

		TataAutomobile tata = new TataAutomobile();
		tata.setBrand("HONDA CITY");
		tata.setType("SUPER CAR");
		tata.torisu();

	}

}

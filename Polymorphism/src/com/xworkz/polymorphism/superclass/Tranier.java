package com.xworkz.polymorphism.superclass;

public class Tranier {

	protected String name;
	protected double exp;
	protected String specalization;
	
	public Tranier() {
		System.out.println("defult constr of Trainer");
		
	}
	public Tranier(String name,double exp,String specalization) {
		this.exp=exp;
		this.name=name;
		this.specalization=specalization;
		System.out.println("defult constr of Trainer");
		
	}

//	training(),conductInterview(),coding()
//    two const one no-arg and parameter 

	protected String setTraining() {

		return name;
	}

	protected double setConductInterview() {

		return exp;
	}

	protected boolean setCoding() {

		return true;
	}

	

	
	
	

}

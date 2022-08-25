package com.xworkz.polymorphism.superclass;

public class Omkar extends Tranier {

	public Omkar() {
		super();
		System.out.println("defult constr of omkar");
	}

	public Omkar(String name, double exp, String specalization) {

		super(name, exp, specalization);
		System.out.println("Parameterised constr");
	}

	@Override
	public double setConductInterview() {
		// TODO Auto-generated method stub
		return super.setConductInterview();
	}

	@Override
	public boolean setCoding() {
		// TODO Auto-generated method stub
		return super.setCoding();
	}

	@Override
	public String setTraining() {
		// TODO Auto-generated method stub
		return super.setTraining();
	}

	public String getName() {
		return name;
	}

	public double getExp() {
		return exp;
	}

	public String getSpecalization() {
		return specalization;
	}

}

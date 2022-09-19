package com.xworkz.abstraction.superclass;

public abstract class SimCard {

	private String name;

	public SimCard() {
		System.out.println("Defult constr of SimCard");
	}

	public abstract void call();

	public abstract void message();

	public abstract void videoCall();

	public abstract void internet();

}

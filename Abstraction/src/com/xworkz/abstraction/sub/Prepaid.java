package com.xworkz.abstraction.sub;

import com.xworkz.abstraction.superclass.SimCard;

public  class Prepaid extends SimCard {

	public Prepaid() {
		super();
		System.out.println("Defult constr of prepaid");
	}

	@Override
	public void call() {
		System.out.println("Running call method");
	}

	@Override
	public void message() {
		System.out.println("Running message method");

	}

	@Override
	public void videoCall() {
		System.out.println("Running videoCall method");
	}

	@Override
	public void internet() {
		System.out.println("Running internet method");
	}

}

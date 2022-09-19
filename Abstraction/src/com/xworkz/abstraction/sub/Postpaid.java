package com.xworkz.abstraction.sub;

import com.xworkz.abstraction.superclass.SimCard;

public class Postpaid extends SimCard {

	public Postpaid() {
		System.out.println("Defult constr of postpaid");
	}

	@Override
	public void call() {
		System.out.println("Running internet method");

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

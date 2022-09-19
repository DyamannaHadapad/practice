package com.xworkz.tourist.checkedexception;

public class InvalidPlaceException extends Exception {

	public InvalidPlaceException(String msg) {
		super(msg);
		System.out.println("Defult constr of InvalidPlaceException");
	}

}

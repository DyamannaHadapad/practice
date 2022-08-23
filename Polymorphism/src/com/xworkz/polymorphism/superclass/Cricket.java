package com.xworkz.polymorphism.superclass;

public class Cricket {

	public String  country;
	public String  captain;
	public char gender;
	
	public String setCountry(String country) {
		this.country = country;
		return country;
	}
	
	public String setCaptain(String captain) {
		this.captain = captain;
		return captain;
	}
	
	public char setGender(char gender) {
		this.gender = gender;
		return gender;
	}
	public boolean entertainment(String matchType) {
		System.out.println("entertainment method of parent class.");
		if(matchType == "test match") {
			return true;
		}
		if(matchType == "one day") {
			return true;
		}
		if (matchType == "T20") {
			return true;
		}
		return false;
	}
	public double presentation(String matchType) {
		System.out.println("presentation method of parent class.");
		if(matchType == "test match") {
			return 2.5;
		}
		if(matchType == "one day") {
			return 2.3;
		}
		if (matchType == "T20") {
			return 1.5;
		}
		return 0.0;
	}
}

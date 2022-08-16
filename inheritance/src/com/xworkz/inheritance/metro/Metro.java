package com.xworkz.inheritance.metro;

public class Metro {

	String name;
	int noOfStations;
	String startPoint;
	String endPoint;
	double price;

	public Metro() {
		System.out.println("Defult Metro constructor");
	}

	public Metro(String name, int noOfStations, String startPoint, String endPoint, double price) {

		this.name = name;
		this.noOfStations = noOfStations;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.price = price;
	}

	public void printData() {
		System.out.println(this.name);
		System.out.println(this.noOfStations);
		System.out.println(this.startPoint);
		System.out.println(this.endPoint);
		System.out.println(this.price);
	}

}

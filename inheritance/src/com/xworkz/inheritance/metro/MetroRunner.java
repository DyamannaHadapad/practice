package com.xworkz.inheritance.metro;

public class MetroRunner {

	public static void main(String[] args) {
		Train train = new Train();
		Metro metro = new Metro("Namma Metro", 20, "Banashankari", "Jayanagar", 50d);
		metro.printData();
	}
}


package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.sub.Touchpad;
import com.xworkz.inheritance.superclass.Keyboard;

public class TouchpadRunner {

	public static void main(String[] args) {

		Touchpad touch = new Touchpad();
		touch.name = "laptop";
		touch.brand = "acer";
		touch.color = "Black";
		touch.ratings = 4.5;
		touch.performence = "Good";
		touch.price = 55000d;
		touch.torisu();

		// up-casting
		Keyboard keyboard = new Touchpad();
		// down-casing
		Touchpad convert = (Touchpad) keyboard;
		convert.name = "laptop";
		convert.brand = "acer";
		convert.color = "Black";
		convert.ratings = 4.5;
		convert.performence = "Good";
		convert.price = 55000d;
		convert.torisu();
	}
}

package com.xworkz.inheritance.sub;

import com.xworkz.inheritance.superclass.Keyboard;

public class Touchpad extends Keyboard{
	
	public double price;
	public String color;
	public String performence;
	
	public Touchpad() {
		super();
	}	

	public Touchpad(double price,String color,String performence) {
		this.color=color;
		this.price=price;
		this.performence=performence;
		super.brand=brand;
		super.name=name;
		super.ratings=ratings;
	}
	
    public void torisu() {
    	System.out.println(super.name);
    	System.out.println(super.brand);
    	System.out.println(super.ratings);
    	System.out.println(this.price);
    	System.out.println(this.color);
    	System.out.println(this.performence);
    }
}

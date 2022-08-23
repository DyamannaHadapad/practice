package com.xworkz.polymorphism.superclass;

public class Automobile {

	public String type;
	public String brand;

	public Automobile() {
		System.out.println("Automobile defult constr");
	}
	public void setType(String type) {
		this.type = type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double sellAccesscories(String name) {
		System.out.println("executing accesscories : "+"  "+ name);
		if (name == "wheel") {
			System.out.println("The price of the  wheel part is:  " + name);
			return 1500.0d;
		}
		if (name == "mirror") {
			System.out.println("The price of the mirror part is:   " + name);
			return 100.0d;
		}
		if (name == "chainPocket") {
			System.out.println("The price of the chainPocket part is:  " + name);
			return 500.00d;
		}
		else {
			System.out.println("Accsescories not matching");
		}
		return 0;
	}

	protected void torisu() {
		System.out.println(this.type);
		System.out.println(this.brand);
	}
}

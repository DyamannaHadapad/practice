package com.xworkz.object.superclass;

public class Bottel {
	private String name;
	private String type;

	public Bottel() {
		System.out.println("Defult constr of Bottel ");
	}

	public Bottel(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		System.out.println("toString method");
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("obj is not equals to null,can cheak");
			if (obj instanceof Bottel) {
				System.out.println("instence is Bottel ,can compare");

				Bottel convert = (Bottel) obj;
				String convertedName = convert.name;
				String convertedType = convert.type;

				if (this.name.equals(convertedName) && this.type.equals(convertedType)) {
					System.out.println("bottel is equals");
					return true;
				} else {
					System.err.println("bottel is not equals");
				}
			} 
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

}

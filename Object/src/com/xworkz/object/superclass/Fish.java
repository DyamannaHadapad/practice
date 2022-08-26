package com.xworkz.object.superclass;

public class Fish {

	private String type;
	private String breed;

	public Fish() {
		System.out.println("Defult constrr of Fish");
	}

	public Fish(String type, String breed) {
		super();
		this.type = type;
		this.breed = breed;
		System.out.println("parameterised constr of Fish");
	}

	@Override
	public String toString() {
		System.out.println("Running toString method");
		return "breed is : " + breed + "     type is  : " + type;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("obj is not null,can cheak ");
			if (obj instanceof Fish) {
				System.out.println("instence is fish,can compare");
				Fish converted = (Fish) obj;
				String convertedBreed = converted.breed;
				String convertedType = converted.type;
				if (this.type.equals(convertedType) && this.breed.equals(convertedBreed)) {
					System.out.println("Fish is equals");
					return true;

				} 
				else {
					System.err.println("Fish is not equal");
				}

			} else {
				System.out.println("obj is null");

			}
		}

		return super.equals(obj);
	}

	protected String getType() {
		return type;
	}

	protected String getBreed() {
		return breed;
	}

}

package com.xworkz.object.Runner;

import com.xworkz.object.superclass.Fish;

public class FishRunner {

	public static void main(String[] args) {

		Fish fish = new Fish("tiger bomb", "Fresh water");
		System.out.println(fish);
		System.out.println("=============================================");
		Fish fish2 = new Fish("tiger bomb", "Fresh water");
		boolean a = fish.equals(fish2);
//		Fish fish3;
		System.out.println(a);

	}

}

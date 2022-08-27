package com.xworkz.object.Runner;

import com.xworkz.object.superclass.Bottel;

public class BottelRunner {

	public static void main(String[] args) {

		Bottel bottel = new Bottel("Kinley", "plastic");
		System.out.println(bottel);

		System.out.println("==============================================================");

		Bottel bottel1 = new Bottel("Kinley", "plastic");

		boolean a = bottel.equals(bottel1);
		System.out.println(a);

	}

}

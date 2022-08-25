package com.xworkz.polymorphism.runnerclass;

import com.xworkz.polymorphism.superclass.Omkar;

public class TrainerRunner {

	public static void main(String[] args) {
		
		
		Omkar om=new Omkar("Omkar",15d,"JEE");
		System.out.println("exp is    "+om.getExp());
		System.out.println("name is    "+om.getName());
		System.out.println("Specalization in   "+om.getSpecalization());
		
		System.out.println("=====================================");
		
		Omkar om1=new Omkar("Lokesh",5d,"Web tech");
		System.out.println("exp is  "+om1.getExp());
		System.out.println("name is    "+om1.getName());
		System.out.println("good at   "+om1.getSpecalization());
		
		
		System.out.println("=============================================");
		

	}

}

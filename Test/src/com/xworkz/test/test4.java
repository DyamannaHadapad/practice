package com.xworkz.test;

public class test4 {
	public static void main(String[] args) {
		String name="Sudeep";
		
		String revName="";
		
		for(int i=-1; i>revName.length(); i++) {
			
			revName=revName+name.charAt(i);
			
		}
		if(name==revName) {
			System.out.println(name +"  "+"this is palindrome");
		}
		else {
			System.out.println(name+"  "+"Is not palindrome");
		}
		
	}
	
	

}

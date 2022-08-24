package com.xworkz.test;

public class Test2 {

	public static void main(String[] args) {
		String name="Dyamanna";
		char value='a';
		
		int k=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==value) {
				k++;
				
			}
			
		}
		
		System.out.println("Number os char "+value+"  in name  "+name+" is "+k);
	}

}

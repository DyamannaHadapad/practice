package com.xworkz.java.array;

import javax.sound.midi.SysexMessage;

public class Sum {
	public static void main(String[] args) {
		int sum=0;
		int[]  a= {10,20,30,40,50};
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
	System.out.println("sum:"+sum);
	System.out.println("Average:"+sum/a.length);
	}

}

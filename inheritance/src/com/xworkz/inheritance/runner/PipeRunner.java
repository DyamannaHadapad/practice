package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.sub.Pipe;
import com.xworkz.inheritance.superclass.Plastic;

public class PipeRunner {

	public static void main(String[] args) {
		Pipe pipe = new Pipe();
		pipe.brand = "Finolex";
		pipe.name = "pipe";
		pipe.liteWeight = true;
		pipe.Strength = "good";
		pipe.type = "plastic";
		pipe.price = 200d;
		pipe.torisu();
		
		Plastic plastic =new Pipe();
		Pipe convert=(Pipe) plastic;
		convert.brand = "Finolex";
		convert.name = "pipe";
		convert.liteWeight = true;
		convert.Strength = "good";
		convert.type = "plastic";
		convert.price = 200d;
		convert.torisu();
	}
    
	
}

package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.sub.MangoFruit;
import com.xworkz.inheritance.superclass.Fruit;

public class FruitRunner {

	public static void main(String[] args) {
		MangoFruit mangoFruit = new MangoFruit();
		mangoFruit.fruit = "MANGO";
		mangoFruit.weight = 30.99d;
		mangoFruit.hot = false;
		mangoFruit.name = "mangofruit";
		mangoFruit.price = 20d;
		mangoFruit.sweet = true;
		mangoFruit.torisu();

		Fruit fruit = new MangoFruit();

		MangoFruit convert = (MangoFruit) fruit;
		convert.fruit="apple";
		convert.hot=false;
		convert.weight=40.99d;
		convert.price=50d;
		convert.sweet=true;
		convert.name="APPLE";
		convert.torisu();

//		Fruit fruit1=new Fruit("MANGo",100d,true);
//		convo.torisu();
	}

}

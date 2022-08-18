package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.sub.Bengaluru;
import com.xworkz.inheritance.superclass.City;

public class BeanagluruRunner {

	public static void main(String[] args) {
		Bengaluru bengaluru=new Bengaluru();
		bengaluru.area= 700d;
		bengaluru.name = "Bengaluru";
		bengaluru.capital = "BENGALURU";
		bengaluru.population = 14d;
		bengaluru.capitalOfKA = true;
		bengaluru.founder = "Kempe Gowda";
		bengaluru.torisu();

		City city = new Bengaluru();// up-casting
		Bengaluru convert = (Bengaluru) city;// down-casting
		convert.area = 700d;
		convert.name = "Bengaluru";
		convert.capital = "BENGALURU";
		convert.population = 14d;
		convert.capitalOfKA = true;
		convert.founder = "Kempe Gowda";
		convert.torisu();

	}

}

package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.sub.EarthPlanet;
import com.xworkz.inheritance.superclass.Planet;

public class EarthPlanetRunner {

	public static void main(String[] args) {
		EarthPlanet earthPlanet = new EarthPlanet();
		earthPlanet.color = "Blue";
		earthPlanet.lives = true;
		earthPlanet.name = "Earth";
		earthPlanet.population = 131d;
		earthPlanet.radius = 6731;
		earthPlanet.shape = "oval";
		earthPlanet.torisu();
//   type casting
//		up-casting: giving parent ref to the child obj
		Planet planet = new EarthPlanet();
//		down-casting: convertion of parent ref to the child ref
		EarthPlanet convert = (EarthPlanet) planet;
		convert.color = "Blue";
		convert.lives = true;
		convert.name = "Earth";
		convert.population = 131d;
		convert.radius = 6731;
		convert.shape = "oval";
		convert.torisu();

	}

}

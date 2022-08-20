package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.sub.OnlineSuperMarket;
import com.xworkz.inheritance.sub.SuperMarket;
import com.xworkz.inheritance.superclass.Market;

public class MarketRunner {

	public static void main(String[] args) {

		SuperMarket superMarket = new SuperMarket("SuperBazar", 23456, "offline", "haha", "mannual", 115);
		superMarket.torisu();

		Market market = new SuperMarket();
		SuperMarket superMarket1 = (SuperMarket) market;
		superMarket.torisu();

		OnlineSuperMarket online = new OnlineSuperMarket("D-mart", "onlinetype", 9 - 30d, "haha", "mannual", 115);
		online.torisu();

		Market market1 = new OnlineSuperMarket();
		OnlineSuperMarket online1 = (OnlineSuperMarket) market1;
		online1.torisu();

	}

}

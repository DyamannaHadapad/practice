package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.sub.OnlineSuperMarket;
import com.xworkz.inheritance.sub.SuperMarket;
import com.xworkz.inheritance.superclass.Market;

public class MarketRunner {

	public static void main(String[] args) {

		SuperMarket supers = new SuperMarket("MARKET", 34567, "Mannual", "Bazar", "offline", 115);
		supers.torisu();

		Market market = new SuperMarket("non", 34567, "Mannual", "gun", "offline", 200);
		SuperMarket ref = (SuperMarket) market;
		ref.torisu();

		OnlineSuperMarket online = new OnlineSuperMarket("D-mart", "ONLINE", 9.30, "MARKET", 34567, "Mannual", "Bazar",
				"offline", 115);
		online.torisu();

		SuperMarket supers1 = new OnlineSuperMarket("Decetlon", "ONLINE", 10.30, "MARKET", 34567, "Mannual", "Bazar",
				"OFFLINE", 500);
		OnlineSuperMarket online1 = (OnlineSuperMarket) supers1;
		online1.torisu();

	}
}

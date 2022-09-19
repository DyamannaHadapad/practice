package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.sub.Postpaid;
import com.xworkz.abstraction.sub.Prepaid;
import com.xworkz.abstraction.superclass.SimCard;

public class SimCardRunner {

	public static void main(String[] args) {

		SimCard card = new Prepaid();
		card.call();
		card.message();
		card.videoCall();
		card.internet();
		
		System.out.println("===============================================================");
		
		SimCard card1 = new Postpaid();
		card.call();
		card.message();
		card.videoCall();
		card.internet();
		
		System.out.println("===============================================================");
		
	}

}

package com.xworkz.tourist.runner;

import com.xworkz.tourist.checkedexception.InvalidPlaceException;
import com.xworkz.tourist.dao.TouristDAO;
import com.xworkz.tourist.dao.impl.TouristDAOImpl;
import com.xworkz.tourist.service.TouristService;
import com.xworkz.tourist.service.impl.TouristServiceImpl;

public class TouristRunner {

	public static void main(String[] args) {

		TouristDAO touristDAO = new TouristDAOImpl();
//		touristDAO.save("Badami Caves");
//		touristDAO.checkPlace("Hampi");

		TouristService touristService = new TouristServiceImpl(touristDAO);
		try {
			System.out.println(touristService.validateAndSave("Badami Caves"));
			System.out.println(touristService.validateAndSave("Badami"));
			System.out.println(touristService.validateAndSave("Beluru"));
			System.out.println(touristService.validateAndSave("Halebidu"));
			System.out.println(touristService.validateAndSave("Horanadu"));
			System.out.println(touristService.validateAndSave("Tirupati"));
			System.out.println(touristService.validateAndSave("Darmastala"));
			System.out.println(touristService.validateAndSave("Kedarnath"));
			System.out.println(touristService.validateAndSave("Kukke"));
			System.out.println(touristService.validateAndSave("Bengalore"));
			System.out.println(touristService.validateAndSave("Bagalkot"));
			System.out.println(touristService.validateAndSave("Badami"));
			
			
			//touristService.validateAndSave("Badami Caves");
		} catch (InvalidPlaceException haha) {
			System.out.println(haha.getClass());
			System.out.println(haha.getMessage());
		}

	}

}

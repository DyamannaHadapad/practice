package com.xworkz.runner;

import com.xworkz.exception.dao.ApartmentDAO;
import com.xworkz.exception.dao.impl.ApartmentDAOImpl;
import com.xworkz.exception.dto.ApartmentDTO;

public class ApartmentRunner {

	public static void main(String[] args) {

		ApartmentDTO dto = new ApartmentDTO();
		dto.setName("X-Workz Elite");
		dto.setId(3);
		dto.setInvestment(160d);
		dto.setLocated("Btm");
		dto.setOwnerName("Nagesh");
		dto.setNoOfSecurites(20);
		dto.setNoOfRooms(150);
		dto.setNoOfPeopes(1000);
		dto.setNoOfFloors(35);
		dto.setNoOfEmployes(200);
		String[] too = { "Nagesh", "Dada", "DKS", "Chandru", "Sachin" };
		dto.setPartners(too);

		ApartmentDAO dao = new ApartmentDAOImpl();
		dao.create(dto);

	}

}

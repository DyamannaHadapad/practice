package com.xworkz.casino.runner;

import com.xworkz.casino.service.CasinoService;
import com.xworkz.casino.service.impl.CasinoServiceImpl;
import com.xworkz.casinoDAO.CasinoDAO;
import com.xworkz.casinoDAO.impl.CasinoDAOImpl;

public class CasinoRunner {

	public static void main(String[] args) {

		CasinoDAO casinoDAO = new CasinoDAOImpl();
		boolean no=casinoDAO.save("Dyamanna");
		System.out.println(no);

		CasinoService casinoService = new CasinoServiceImpl(casinoDAO);

		boolean yes = casinoService.validateandsave("Dyamanna");
		System.out.println(yes);

	}

}

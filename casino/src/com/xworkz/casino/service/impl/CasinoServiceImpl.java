package com.xworkz.casino.service.impl;

import com.xworkz.casino.service.CasinoService;
import com.xworkz.casinoDAO.CasinoDAO;

public class CasinoServiceImpl implements CasinoService {

	private CasinoDAO casinoDAO;

	public CasinoServiceImpl(CasinoDAO casinoDAO) {
		this.casinoDAO = casinoDAO;
		System.out.println("Service is created using constr,dao is a abstraction");
	}

	@Override
	public boolean validateandsave(String name) {
		System.out.println("started validatendsave");
		if (name != null && name.length() > 2 && name.length() < 50) {
			boolean present = this.casinoDAO.cheakName(name);
			if (!present) {
				System.out.println("name is not null,looks valid");
				this.casinoDAO.save(name);
				return true;

			}
		}
		System.out.println("data looks invalid,cannot call dao and save");

		return false;
	}

}

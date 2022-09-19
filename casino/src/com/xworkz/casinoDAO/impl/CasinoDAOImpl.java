package com.xworkz.casinoDAO.impl;

import com.xworkz.casinoDAO.CasinoDAO;

public class CasinoDAOImpl implements CasinoDAO {

	private String[] dataStore = new String[5];
	private int index = 0;

	@Override
	public boolean save(String name) {
		System.out.println("Save started");
		this.dataStore[this.index] = name;
		this.index++;
		return true;
	}
	@Override
	public boolean cheakName(String name) {
	  
		for(String ref:this.dataStore) {
			if(ref.equals(name))
				return true;
		}
		return false;
	}

}

package com.xworkz.tourist.dao.impl;

import com.xworkz.tourist.dao.TouristDAO;
//import com.xworkz.tourist.uncheckedexception.InvalidPlaceRuntimeException;

public class TouristDAOImpl implements TouristDAO {

	private String[] datastore = new String[9];
	public int position = 0;

	@Override
	public boolean save(String place) {
		// System.out.println("Save started");
		if(this.position<this.datastore.length) {
		
		
		this.datastore[this.position] = place;
		this.position++;
		return true;
	}
		else {
			System.out.println("position is not valid");
			
		}
		return false;
	}

	@Override
	public boolean checkPlace(String place) {
		for (String ref : this.datastore) {
			if (ref != null && ref.equals(place))
				return true;
		}

		return false;
	}

}

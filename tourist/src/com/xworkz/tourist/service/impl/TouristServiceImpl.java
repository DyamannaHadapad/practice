package com.xworkz.tourist.service.impl;

import com.xworkz.tourist.checkedexception.InvalidPlaceException;
import com.xworkz.tourist.dao.TouristDAO;
import com.xworkz.tourist.service.TouristService;

public class TouristServiceImpl implements TouristService {
	private TouristDAO touristDAO;

	public TouristServiceImpl(TouristDAO touristDAO) {
		this.touristDAO = touristDAO;
		// System.out.println("TouristServiceImpl constr");

	}

	@Override
	public boolean validateAndSave(String place) throws InvalidPlaceException {
		if (place != null && place.length() > 2 && place.length() < 50) {
			System.out.println("place is valid ," + place);
			if (touristDAO.checkPlace(place)) {
				System.err.println("place is already exists   ::" + "    " + place);
				throw new InvalidPlaceException("valid");
			} else {
				System.out.println("place doesnot exits,");
				boolean yes = this.touristDAO.save(place);
				return yes;
			}
		}
		System.err.println("place looks invalid,cannot call  dao and save");
		throw new InvalidPlaceException("not valid");
		// return false;

	}

}

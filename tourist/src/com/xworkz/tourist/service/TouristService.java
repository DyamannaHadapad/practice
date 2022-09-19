package com.xworkz.tourist.service;

import com.xworkz.tourist.checkedexception.InvalidPlaceException;

public interface TouristService {

	boolean validateAndSave(String place) throws InvalidPlaceException;

}

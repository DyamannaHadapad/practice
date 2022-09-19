package com.xworkz.tourist.service;

import com.xworkz.tourist.checkedexception.InvalidNameCheckedException;

public interface MinisterService {

	boolean validateAndSave(String name) throws InvalidNameCheckedException;

}

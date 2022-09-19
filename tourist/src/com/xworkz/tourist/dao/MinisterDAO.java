package com.xworkz.tourist.dao;

import com.xworkz.tourist.uncheckedexception.InvalidUncheckedException;

public interface MinisterDAO  {

	boolean save(String name) throws  InvalidUncheckedException;

	boolean checkDuplicate(String name);

}

package com.xworkz.tourist.dao.impl;

import com.xworkz.tourist.dao.MinisterDAO;
import com.xworkz.tourist.uncheckedexception.InvalidUncheckedException;

public class MinisterDAOImpl implements MinisterDAO {

	private String[] datastore = new String[5];
	private int position;

	@Override
	public boolean save(String name) throws InvalidUncheckedException {
		
		if(this.position< this.datastore.length) {
			this.datastore[this.position] = name;
		
			System.out.println("name is saved  "+name +"   "+"position is"+"   "+this.position);
			this.position++;
			return true;
		}
		else {
			System.out.println("index is not valid");
			throw new InvalidUncheckedException("index is not valid");
		}
		//return false;
	}

	@Override
	public boolean checkDuplicate(String name) {
		for (String ref : this.datastore) {
			if (ref != null && ref.equals(name)) {
				return true;
			}
		}
		return false;
	}

}

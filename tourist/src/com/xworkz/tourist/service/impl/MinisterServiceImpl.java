package com.xworkz.tourist.service.impl;

import com.xworkz.tourist.checkedexception.InvalidNameCheckedException;
import com.xworkz.tourist.dao.MinisterDAO;
import com.xworkz.tourist.service.MinisterService;

public class MinisterServiceImpl implements MinisterService {

	private MinisterDAO ministerDAO;

	public MinisterServiceImpl(MinisterDAO ministerDAO) {
		this.ministerDAO = ministerDAO;

	}

	@Override
	public boolean validateAndSave(String name) throws InvalidNameCheckedException{

		if (name != null && name.length() > 4 && name.length() < 40) {
			System.out.println("name looks valid ,---->  " + name);
			if (!ministerDAO.checkDuplicate(name)) {
				System.out.println("name is already exits,--->  " + name);
				return ministerDAO.save(name);
				} else {
				System.err.println("name is does not exits ");
				throw new InvalidNameCheckedException("name is  duplicated");
				
			//	return yes;
			}
		}
		System.err.println("name looks invalid ,cannot call dao and save");
		throw new InvalidNameCheckedException("name inot valid");
		//return false;
	}

}

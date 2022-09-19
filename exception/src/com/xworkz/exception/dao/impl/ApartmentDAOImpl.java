package com.xworkz.exception.dao.impl;

import com.xworkz.exception.dao.ApartmentDAO;
import com.xworkz.exception.dto.ApartmentDTO;

public class ApartmentDAOImpl implements ApartmentDAO {

	private ApartmentDTO[] apart = new ApartmentDTO[5];
	private int index = 1;

	@Override
	public boolean create(ApartmentDTO dto) {
		this.apart[index] = dto;
		System.out.println("Apartment is saved ," + dto + "into index " + this.index);
		this.index++;
		return true;
	}

}

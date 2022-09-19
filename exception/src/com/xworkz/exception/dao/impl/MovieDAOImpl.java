package com.xworkz.exception.dao.impl;

import com.xworkz.exception.dao.MovieDAO;
import com.xworkz.exception.dto.MovieDTO;

public class MovieDAOImpl implements MovieDAO {
	private MovieDTO[] movies = new MovieDTO[5];
	private int index = 1;

	@Override
	public boolean create(MovieDTO dto) {
		this.movies[index] = dto;
		System.out.println("Movie is saved ," + dto + "into index " + this.index);
		this.index++;
		return true;
	}

}

package com.xworkz.runner;

import com.xworkz.exception.dao.MovieDAO;
import com.xworkz.exception.dao.impl.MovieDAOImpl;
import com.xworkz.exception.dto.MovieDTO;

public class MovieRunner {
	
	public static void main(String[] args) {
    
		
		MovieDTO dto=new MovieDTO();
		dto.setId(2);
		dto.setName("");
		dto.setBudget(50d);
		dto.setMovieName("Sita Ramam");
		String [] movies= {"VR","Vikram","Kgf","Kranti","Bul Bul"};
		dto.setMovieNames(movies);
		String [] names= {"Vijay K"};
		dto.setPrice(150d);
		
		dto.setHero("Dq salman");
		dto.setHeroine("Thakur");
		dto.setNoOfActors(50);
		dto.setMovieType("2d");
		
		
		
		MovieDAO dao=new MovieDAOImpl();
		dao.create(dto);
	}

}

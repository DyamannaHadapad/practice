package com.xworkz.tourist.runner;

import com.xworkz.tourist.checkedexception.InvalidNameCheckedException;
import com.xworkz.tourist.dao.MinisterDAO;
import com.xworkz.tourist.dao.impl.MinisterDAOImpl;
import com.xworkz.tourist.service.MinisterService;
import com.xworkz.tourist.service.impl.MinisterServiceImpl;

public class MinisterRunner {

	public static void main(String[] args) {

		MinisterDAO ministerDAO = new MinisterDAOImpl();

		MinisterService ministerService = new MinisterServiceImpl(ministerDAO);
		try {
			System.out.println(ministerService.validateAndSave("Narendra Modi"));
			System.out.println(ministerService.validateAndSave("Atal Bihari vajpayee"));
			System.out.println(ministerService.validateAndSave("H D Dvegowda"));
			System.out.println(ministerService.validateAndSave("M M Singh"));
			System.out.println(ministerService.validateAndSave("Rajeev Ghandhi"));
			System.out.println(ministerService.validateAndSave("Indira Ghandhi"));
			
			//System.out.println(ministerService.validateAndSave("Narendra "));
			//System.out.println(ministerService.validateAndSave(" Modi"));
		} catch (InvalidNameCheckedException dada) {
			System.out.println(dada.getClass());
			System.out.println(dada.getMessage());
		}
//catch (InvalidNameCheckedException dada1){
//	  System.out.println(dada1.getMessage());
//	  
//  }

	}

}

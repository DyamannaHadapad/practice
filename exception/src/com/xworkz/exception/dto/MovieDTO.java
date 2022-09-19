package com.xworkz.exception.dto;

import java.io.Serializable;
import java.util.Arrays;

public class MovieDTO implements Serializable {
	private int id ;
	private String name;
	private double budget;
	private String movieName;
	private double price ;
	private String [] movieNames;
	private String [] producerNames;
	private String hero;
	private String heroine;
	private int noOfActors;
	private String movieType;
	
	
	public MovieDTO() {
		System.out.println("defult constr");
	}


	@Override
	public String toString() {
		return "MovieDTO [id=" + id + ", name=" + name + ", budget=" + budget + ", movieName=" + movieName + ", price="
				+ price + ", movieNames=" + Arrays.toString(movieNames) + ", producerNames="
				+ Arrays.toString(producerNames) + ", hero=" + hero + ", heroine=" + heroine + ", noOfActors="
				+ noOfActors + ", movieType=" + movieType + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBudget() {
		return budget;
	}


	public void setBudget(double budget) {
		this.budget = budget;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String[] getMovieNames() {
		return movieNames;
	}


	public void setMovieNames(String[] movieNames) {
		this.movieNames = movieNames;
	}


	public String[] getProducerNames() {
		return producerNames;
	}


	public void setProducerNames(String[] producerNames) {
		this.producerNames = producerNames;
	}


	public String getHero() {
		return hero;
	}


	public void setHero(String hero) {
		this.hero = hero;
	}


	public String getHeroine() {
		return heroine;
	}


	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}


	public int getNoOfActors() {
		return noOfActors;
	}


	public void setNoOfActors(int noOfActors) {
		this.noOfActors = noOfActors;
	}


	public String getMovieType() {
		return movieType;
	}


	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}
	
	

}

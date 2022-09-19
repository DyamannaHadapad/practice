package com.xworkz.exception.dto;

import java.io.Serializable;
import java.util.Arrays;

public class ApartmentDTO implements Serializable {

	private String name;
	private int id;
	private int noOfEmployes;
	private int noOfSecurites;
	private int noOfFloors;
	private double investment;
	private String ownerName;
	private String[] partners;
	private String located;
	private int noOfRooms;
	private int noOfPeopes;

	public ApartmentDTO() {
		System.out.println("defult constr");
	}

	@Override
	public String toString() {
		return "ApartmentDTO [name=" + name + ", id=" + id + ", noOfEmployes=" + noOfEmployes + ", noOfSecurites="
				+ noOfSecurites + ", noOfFloors=" + noOfFloors + ", investment=" + investment + ", ownerName="
				+ ownerName + ", partners=" + Arrays.toString(partners) + ", located=" + located + ", noOfRooms="
				+ noOfRooms + ", noOfPeopes=" + noOfPeopes + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfEmployes() {
		return noOfEmployes;
	}

	public void setNoOfEmployes(int noOfEmployes) {
		this.noOfEmployes = noOfEmployes;
	}

	public int getNoOfSecurites() {
		return noOfSecurites;
	}

	public void setNoOfSecurites(int noOfSecurites) {
		this.noOfSecurites = noOfSecurites;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public double getInvestment() {
		return investment;
	}

	public void setInvestment(double investment) {
		this.investment = investment;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String[] getPartners() {
		return partners;
	}

	public void setPartners(String[] partners) {
		this.partners = partners;
	}

	public String getLocated() {
		return located;
	}

	public void setLocated(String located) {
		this.located = located;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public int getNoOfPeopes() {
		return noOfPeopes;
	}

	public void setNoOfPeopes(int noOfPeopes) {
		this.noOfPeopes = noOfPeopes;
	}

}

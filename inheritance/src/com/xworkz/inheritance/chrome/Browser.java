package com.xworkz.inheritance.chrome;

public class Browser {
	String website;
	String ceo;
	String language;
	boolean offline;
	String company;

	public void setDisply(String website, String ceo, String language, boolean offline, String company) {
		System.out.println("Running Instence method");
		this.website = website;
		this.ceo = ceo;
		this.language = language;
		this.offline = offline;
		this.company = company;
	}

	public void printData() {
		System.out.println(this.website);
		System.out.println(this.ceo);
		System.out.println(this.language);
		System.out.println(this.offline);
		System.out.println(this.company);
	}

}

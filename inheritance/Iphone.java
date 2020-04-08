package com.jse.inheritance;

public class Iphone extends Celphone {
	private String search;

	public Iphone(String phoneNumber, String name, String company, boolean portable, String search) {
		super(phoneNumber, name, company, portable);

	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

}

package com.jse.inheritance;

public class PhoneService {
	private Phone[] phones;
	private Celphone[] celphones;
	private Iphone[] iphons;
	private GalaxyNote[] galaxyNotes;
	private int count;
	
	
	public PhoneService() {
		phones = new Phone[3];
		celphones = new Celphone[3];
		iphons = new Iphone[3];
		galaxyNotes = new GalaxyNote[3];
		count = 0;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public Phone[] getPhones() {
		return phones;
	}

	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}
	

	public Celphone[] getCelphones() {
		return celphones;
	}

	public void setCelphones(Celphone[] celphones) {
		this.celphones = celphones;
	}
	
	public void add(Celphone celphone) {
		celphones[count] = celphone;
		count++;
		
	}
	public void add(Phone Phone) {
		phones[count] = Phone;
		count++;
		
	}
	public void add(Iphone iphone) {
		iphons[count] = iphone;
		count++;
		
	}

	public Iphone[] getIphons() {
		return iphons;
	}

	public void setIphons(Iphone[] iphons) {
		this.iphons = iphons;
	}
	public void add(GalaxyNote galaxyNote) {
		galaxyNotes[count] = galaxyNote;
		count++;
		
	}

	public GalaxyNote[] getGalaxyNotes() {
		return galaxyNotes;
	}

	public void setGalaxyNotes(GalaxyNote[] galaxyNotes) {
		this.galaxyNotes = galaxyNotes;
	}
	

	
	
	
	
}


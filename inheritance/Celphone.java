package com.jse.inheritance;

public class Celphone extends Phone {
	private boolean portable;
	private String move;
	public Celphone(String phoneNumber, String name, String company,boolean portable) {
		super(phoneNumber, name, company);
		this.portable = portable;
		setPortable(this.portable);
		
	}
	public boolean isPortable() {
		return portable;
	}
	public void setPortable(boolean portable) {
		if(portable) {
			this.move = "휴대가능";
		}else {
			this.move = "휴대불가능";
		}
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}



}

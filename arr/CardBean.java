package com.jse.arr;
//public class CardBean instence 변수 집합 class 변수 차원을 하나올린다,?
//private String kind;   instence 변수 

public class CardBean {
	private String kind;
	private int number;
	
	public CardBean(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}// 초기화 가 
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getnumber() {
		return number;
	}
	
	
	

}

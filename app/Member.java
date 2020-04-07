package com.jse.app;

public class Member {
	private String id ;//인스턴스 변수
	public Member() {

	}
	public void setId(String param) { //로컬
		System.out.println("지역변수 들어옴"+id);//로컬변수
		this.id = param;//this 은 인스턴스를 가르킴 없음 로컬을지칭
		System.out.println("인스턴스변수에 저장됨:" +this.id);
	}
	public String getId() { 
		return this.id;//
		
	}
}

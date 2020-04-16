package com.jse.member;

public interface MemberService {

	public void add(Member member);

	public Member[] list();//all 전부
	
	public Member[] searchByname(String name);//some
	
	public Member[] searchBygender(String name);

	public Member detail(String userid);// one 
	
	
	//all some one int =  search 과정 

	public int count();
	
	public int count(String name);

	public Member login(Member member);
	

	public void update(Member member);

	public void delete(Member member);

}

//find some
package com.jse.grade;



public interface GradeService {

	public void add(Grade grade); //

	public Grade[] list();
	
	public Grade detail(Grade grade);

	public int Count();//리드
	

	public int total(Grade grade);//리드

	public int average(Grade grade);

	public String record(Grade grade);
	
	public String ranking();
	
	
	public void update(Grade grade);
	
	public void delate(Grade grade);

}
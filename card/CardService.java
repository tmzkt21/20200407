package com.jse.card;



public interface CardService {

	public void add(Card card);
	public  Card[] list();
	public Card detail(Card card);
	public int count();//c
	
	
	public void update(Card card);
	public void delete(Card card);

	



}
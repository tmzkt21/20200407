package com.jse.card;

public class CardServiceImpl implements CardService{
	private Card[] cards;
	private int count;
	
	public CardServiceImpl() {
		cards = new Card[3];
		
	}
	
	
	@Override
	public void add(Card card) {
		cards[count] = card;
		count++;
		
	}

	@Override
	public Card[] list() {
		
		return null;
	}

	@Override
	public Card detail(Card card) {
	
		return null;
	}

	@Override
	public int count() {
	
		return 0;
	}

	@Override
	public void update(Card card) {
	
		
	}

	@Override
	public void delete(Card card) {
	
		
	}

}

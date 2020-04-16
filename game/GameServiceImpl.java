package com.jse.game;

import com.jse.grade.Grade;
import com.jse.grade.GradeService;

public class GameServiceImpl implements GameService{
	
	private Game[] games;
	private int count;
	
	
	
	public  GameServiceImpl(){
		//games[count] = new Game[2];
	}
	
	@Override
	public void add(Game game) {
		games[count] = game;
		count++;
		
	}
	@Override
	public Game[] list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Game detail(Game game) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}

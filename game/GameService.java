package com.jse.game;
import com.jse.grade.Grade;

public interface GameService {
	
	public void  add(Game game);
	public Game[] list();
	public Game detail(Game game);
	public int count();
	public void update(Game game);
	public void delete(Game game);
	

}

//서버의 최소한의 구성 조건 

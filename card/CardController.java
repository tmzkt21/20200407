package com.jse.card;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.jse.grade.Grade;
import com.jse.util.Constants;

public class CardController {

	public static void main(String[] args) {

		

		CardService service = new CardService() {
			
			@Override
			public void update(Card card) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Card[] list() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Card detail(Card card) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void delete(Card card) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public int count() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void add(Card card) {
				// TODO Auto-generated method stub
				
			}
		};
		Card card = null;

		while(true) {

			System.out.println("0.Exit 1.카드 3장 받기 2.출력");

			switch(JOptionPane.showInputDialog(Constants.CARD_MENU)) {

			case "0": return;

			case "1": System.out.println("카드 3장 받기 모양, 숫자"); 

			for(int i=0;i < 3;i++) {
				String[] values = JOptionPane.showInputDialog("카드 3장 받기 모양, 숫자").split(",");
				card = new Card();
				
				card.setKind(values[0]);
				card.setNumber(Integer.parseInt(values[1]));
				service.add(card);
			}
			
			/*for(int i=0; i< 3;i++) {
				String[] values = JOptionPane.showInputDialog("이름,국어,영어,수학  입력").split(",");
					grade = new Grade();*/

			break;

			case "2": 

				Card[] cards = service.list();

				for(int i=0;i<3;i++) {
					
					JOptionPane.showMessageDialog(null,".");
					System.out.println(String.format("카드모양 %s 카드넘버 %d ", 

							cards[i].getKind(), cards[i].getNumber()));

				}

				break;

			}

			

		}

	}

}
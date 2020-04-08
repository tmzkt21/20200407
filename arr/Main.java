package com.jse.arr;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CardService cardService = new CardService();

		while (true) {
			System.out.println("0.EXIT 1.카드 3장 받기 2.출력");
			switch (scanner.nextInt()) {
			case 0:
				return;
			case 1:
				System.out.println("카드 3장 받기");
				// 카드 받아오기 3장

				for (int i = 0; i < 3; i++) {
					System.out.println("카드모양:" + " 숫자:");
					cardService.add(new CardBean(scanner.next(),scanner.nextInt())); //카드서비스 .add에 데이터 넣고 연산하기
				}
				
				break;
			case 2:
				
				// 카드 출력하기
				CardBean[] card = cardService.getCards();
				for (int i = 0; i < 3; i++) {

					System.out.println("카드모양:" + card[i].getKind() + " 숫자:" + card[i].getnumber());
				}
				break;

			}

		}

	}

}

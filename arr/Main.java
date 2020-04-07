package com.jse.arr;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CardService service = new CardService();
		while (true) {
			System.out.println("0.EXIT 1.카드 3장 받기 2.출력");
			switch (scanner.nextInt()) {
			case 0:
				return;
			case 1:
				System.out.println("카드 3장 받기 모양, 숫자 2.출력");

				for (int i = 0; i < 3; i++) {

				}

				break;

//				for (int i = 0; i < 3; i++) {
//					
//					service.add(new CardBean(scanner.next(),scanner.nextInt()));
//				}

			case 2:
				CardBean[] cards = service.getCards();
				for (int i = 0; i < 3; i++) {
					System.out.println(String.format("카드모양%s 카드넘버 $d", cards[i].getKind(), cards[i].getNumber()));

				}

				break;
			}
		}
	}

}

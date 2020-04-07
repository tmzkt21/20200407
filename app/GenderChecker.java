package com.jse.app;

import java.util.Scanner;

public class GenderChecker {
	public static void main(String[] args) {
		find();
	}

	static void find() {
		System.out.println("주민번호를 입력하세요");//out.println 클래스 메서드
		Scanner scanner = new Scanner(System.in);//(System.in)클래스변수
		String ssn = scanner.next();
		char ch = ssn.charAt(7);
		//String a = "";
		//char c = '';
		//case '1'
		String result ="잘못입력한 값";
		switch(ch) {// 왜 ch인가
		case '1':case '3': result ="남성";break;
		case '2':case '4': result ="여성";break;
		case '5':case '6': result ="외국인";break;
		default: result ="외국인";break; // 남은 0789 defaul 로 처리 
		
		}
		System.out.println(result);
		/*System.out.println("남성"); //1 , 3
		System.out.println("여성"); //2 , 4
		System.out.println("외국인");//5 , 6
		System.out.println("잘못입력한 값");// 0, 7, 8, 9*/
	}
}

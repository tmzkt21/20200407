package com.jse.app;
import java.util.Scanner;
import java.util.Random;
 
class HelloJava {
	
	 public static void main(String[]args) {//클래스 변수
		 
		
		 
		
		 
		 
		 
		 
		 
		  int x, dice;
		 String result = null;
		 Scanner scanner = new Scanner(System.in);
		 Random random = new Random();
		 System.out.println("1~6 숫자를 적어라!");
		 x = scanner.nextInt();
		 dice = random.nextInt(6)+1;
		 if (x >= 7) {// if (컨디션) 
		 result = "1~6게임이라고 "+x+" 적지마";
		 }else if (x%2 == 1) {
		 result = "홀수다";
		 }else if (x%2 == 0) {
		 result = "짝수다";
		 }
		 System.out.println(result); 
		
		
				
		 
		 
		
		 
		
	}

}

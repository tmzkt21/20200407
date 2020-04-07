package com.jse.app;
/*
 * 개발자님 키와 몸무게를 이용하여
 * 카우푸지수를 구하고
 * 그 결과 정상 , 저체중, 비만 등으로 몸의 상태만
 * 알려주는 프로그램을 만들어주세요
 */

public class Kaup {
	
	private double height;
	private double weight;
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height ;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	//카우프지수=체중(g)/신장2(cm)
	/*22이상은 지나친 비만, 
	22~19가 우량, 
	19~15가 정상, 
	15~13이 마른것, 13~10이 영양실조, 10이하가 저체중
	10~20
	10 < a && a< <20*/
		
	public String doublekaup() {
		String result = "";
		double kaupIndex = weight/(height*height);
		double kaup = (int)height/weight;	
		if(kaupIndex < 18.5){
			result ="우량";
			
		}
		else if(kaupIndex < 23.0) {
			result = "정상";
			
		}else if (kaupIndex  <25.0 ) {
			result = "저체중";
			
		}else if (kaupIndex  <25.0) {
			result = "저체중";
			
		}else if (kaupIndex  <30.0) {
			result = "저체중";
			
		}else if (kaupIndex <40.0) {
			result = "저체중";
			
		}else  (kaupIndex <15) {
			result = "저체중";
			
		}
		
		
		return result1;
		
		
	}
	

}

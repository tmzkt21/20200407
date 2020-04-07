package com.jse.app;

public class Sum1to5 {
	public static void main(String[] args) {
		sum();
	}

	static void sum() {
		int sum =0;
		for(int a = 1; a <= 100; a++) {
			
			System.out.println(a);
			
			sum += a;
		}
		System.out.println(String.format("%d", sum));
		
}
}
package com.jse.app;

import java.util.Scanner;
import java.util.Random;

public class Dice {
	private String expect;
	private int diceNumber;

	public void setExpect(String expect) {
		this.expect = expect;
	}

	public String getExpect() {
		return expect;
	}

	public void setdiceNumber(int diceNumber) {
		this.diceNumber = diceNumber;
	}

	public int getdiceNumber() {
		return diceNumber;
	}

	public String switchdice() {
		String result = "";
		switch (diceNumber) {
		case 1:
		case 3:
		case 5:
			result = "홀";
			break;
		case 2:
		case 4:
		case 6:
			result = "짝";
			break;

			if (expect.equals(result)) {
				System.out.println("맞음");
			} else {
				System.out.println("틀림");

			}
			return result;

		}

	}

}

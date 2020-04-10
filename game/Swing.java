package com.jse.game;
import javax.swing.*;
public class Swing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("가위바위보 게임");
		frame.setSize(600, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

/* JFrame frame = new JFrame("");
 * frame.setSize(500,500);
 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * frame.setVisible(true);
 * */

package com.jse.inheritance;

import java.awt.JobAttributes;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Engine {
public static void main(String[] args) {
	
	PhoneService phoneService = new PhoneService();
	while(true) {

		switch(JOptionPane.showInputDialog("0.종료\t 1.집전화입력\t 2.집전화출력"
				+ "3.휴대번호입력\t 4.휴대전화출력 5.아이폰번호입력 6.아이폰번호출력 7.갤럭시노트번호입력8.갤럭시노트번호출력")) {
		
		case "0":return;
		case "1":
			for (int i = 0; i < 3; i++) {
			String[] values = JOptionPane.showInputDialog("입력: phoneNumber,name,company").split(",");
			phoneService.add(new Phone(values[0],values[1],values[2])); 
				
				
				
			}
			break;
		case "2": 
			Phone[] phones = phoneService.getPhones();
			String message = "";
			for (int i = 0; i < 3; i++) {
				message += String.format("출력: %s,%s,%s \n",
						phones[i].getPhoneNumber(),phones[i].getName(),phones[i].getCompany());	
			}
			JOptionPane.showMessageDialog(null, message);
			break;
			
			
		case"3": 
		for (int i = 0; i < 3; i++) {
			String[] values = JOptionPane.showInputDialog("입력: phoneNumber,name,company,휴대가능여부").split(",");
			phoneService.add(new Celphone(values[0],values[1],values[2], true)); 
		}
		break;
		
		case"4":
		Celphone[] celphones = phoneService.getCelphones();
		message = "";
		for (int i = 0; i < 3; i++) {
			message += String.format("출력: %s,%s,%s,%s \n",
					celphones[i].getPhoneNumber(),celphones[i].getName(),celphones[i].getCompany(),
					celphones[i].getMove());
			
		}
		JOptionPane.showMessageDialog(null, message);
		 break;
		case "5":
			for (int i = 0; i < 3; i++) {
				String[] values = JOptionPane.showInputDialog("입력: phoneNumber,name,company,휴대가능여부,검색가능").split(",");
				phoneService.add(new Iphone(values[0],values[1],values[2], true,values[3])); 
			}
			/*
			 * for(int i=0; i < 3; i++){
			 * String[] values = JOptionPane.showInputdialog("입력: phoneNumber,name,company ").split(",");
			 * phoneSerbice.addIphone(new Iphone(values[0],values[1],values[2],true,values[3]));
			 * 
			 * }
			 */
			
			break;
		
		case "6":
			Iphone[] iphons = phoneService.getIphons();
			message = "";
			for (int i = 0; i < 3; i++) {
				message += String.format("출력: %s,%s,%s,%s \n",
iphons[i].getPhoneNumber(),iphons[i].getName(),iphons[i].getCompany(),iphons[i].getMove(),iphons[i].getSearch());
				 
				 /*	Iphone[] iphone = phoneService.getIphone();
				  * message = "";
				  * for(int i=0; i < 3; i++){
				  * string.format("출력: %s,%s,%s,%s \n",
				  * iphone[i].getPhoneNumber(),iphone[i].getName(),iphone[i].getCompany());
				  * }
				  * 
				  * */
				  
				 
			}
			JOptionPane.showMessageDialog(null, message);
			 break;
		case "7":
			for(int i=0; i<3; i++) {
				String[] values =JOptionPane.showInputDialog("입력: phonenumber,name,company휴대가능여부,검색가능.큰사이즈").split(",");
				phoneService.add(new GalaxyNote(
						values[0],values[1],values[2],true,values[4],values[5]));
						
			}
			
			break;
			
		case "8":
			GalaxyNote[] galaxyNote = phoneService.getGalaxyNotes();
			message = "";
			for (int i = 0; i < 3; i++) {
				message +=String.format("출력: %s,%s,%s,%s \n",
						galaxyNote[i].getPhoneNumber(),galaxyNote[i].getName(),galaxyNote[i].getCompany(),
						galaxyNote[i].getMove(),galaxyNote[i].getSearch(),galaxyNote[i].getBihSize());
				
				
			}
			JOptionPane.showMessageDialog(null, message);
			
			
			
			break;
		}
	}
}

	private static Object getPhoneNumber() {
		// TODO Auto-generated method stub
		return null;
	}
}

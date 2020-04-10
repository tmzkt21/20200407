package com.jse.member;



import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.JTextField;

import jdk.nashorn.internal.scripts.JO;



public class JoinView extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	JButton saveButton, cancelButton;

	JLabel[] labels;

	JTextField[] textFields;

	JPanel panel;
	
	MemberService memberService;
public JoinView() {
	memberService = new MemberServiceImpe() {
	};
}
	public void open() {

		this.setSize(500, 500);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		
		

		this.add(panel);

		this.setVisible(true);

		labels = new JLabel[5];

		textFields = new JTextField[5];
		
		

		String[] names = {"이름","아이디","패스워드","SSN","추가사항"};

		for(int i=0;i < names.length;i++) {

			labels[i] = new JLabel(names[i]);
			

			panel.add(labels[i]);

			textFields[i] = new JTextField();

			panel.add(textFields[i]);

		}	
		

		saveButton = new JButton("저장");

		cancelButton = new JButton("취소");

		saveButton.addActionListener(this);

		cancelButton.addActionListener(this);

		panel.add(saveButton); 

		panel.add(cancelButton);

		labels[0].setBounds(40,10,40,40);

		labels[1].setBounds(40,50,40,40);

		labels[2].setBounds(40,90,60,40);

		labels[3].setBounds(40,130,40,40);

		labels[4].setBounds(40,170,60,40);

		textFields[0].setBounds(120,10,200,30);

		textFields[1].setBounds(120,50,200,30);

		textFields[2].setBounds(120,90,200,30);

		textFields[3].setBounds(120,130,280,30);

		textFields[4].setBounds(120,180,280,120);

		saveButton.setBounds(125,330,80,30);

		cancelButton.setBounds(240,330,80,30);

		

		this.setLocationRelativeTo(null);

	}

	@Override

	public void actionPerformed(ActionEvent e) {

		
		if(e.getSource() == saveButton) {

			textFields[0].setText("홀길동,유관순,이순신,신사임당,이도");
			textFields[1].setText("hong,you,lee,shin,leedo");
			textFields[2].setText("1,1,1,1,1");
			textFields[3].setText("900101-1,960101-1,981010-1,011010-4,020606-3");
			String data = String.format("%s / %s / %s / %s", 
					textFields[0].getText(),
					textFields[1].getText(),
					textFields[2].getText(),
					textFields[3].getText());
			JOptionPane.showMessageDialog(this, data);
			String[] arr = data.split("/");
			
			String[] names = arr[0].split(",");	
			// 각 스플릿을 통해 담는다
			
			JOptionPane.showMessageDialog(this, 
			String.format("%s / %s / %s / %s", 
			textFields[0].getText(),
			textFields[1].getText(),
			textFields[2].getText(),
			textFields[3].getText()));
			
		
			
			
			
		
			
			Member[] membes = memberService.getMembers();
			for (int i = 0; i < membes.length; i++) {
				System.out.println(membes[i].toString());
			}
			
		}else if(e.getSource() == cancelButton) {

			

		}

		

	}



}
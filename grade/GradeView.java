package com.jse.grade;



import java.awt.Container;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import javax.swing.JTextField;

import com.jse.member.MemberService;

import javafx.beans.binding.ListBinding;
import jdk.nashorn.internal.scripts.JO;
import lombok.Data;



public class GradeView extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

    private Container container; 

    private JLabel title,nameLabel,koreanLabel,passwordLabel,

    				ssnLabel,javaLabel; 

    private JTextField nameText, koreanText, englishText, mathText,

    					javaText; 

    private JTextArea resultText; 

    private JButton saveButton, listButton; 

    public GradeService gradeService;

    public void open(){ 

    	gradeService = new GradeServiceImpl();

    	setTitle("Swing Exercise"); 

        setBounds(300, 90, 900, 600); 

        setDefaultCloseOperation(EXIT_ON_CLOSE); 

        setResizable(false); 

  

        container = getContentPane(); 

        container.setLayout(null); 

  

        title = new JLabel("Swing Form"); 

        title.setFont(new Font("Arial", Font.PLAIN, 30)); 

        title.setSize(300, 30); 

        title.setLocation(300, 30); 

        container.add(title); 

  

        nameLabel = new JLabel("Name"); 

        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 

        nameLabel.setSize(100, 20); 

        nameLabel.setLocation(100, 100); 

        container.add(nameLabel); 

  

        nameText = new JTextField(); 

        nameText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 

        nameText.setSize(190, 20); 

        nameText.setLocation(200, 100); 

        container.add(nameText); 

  

        koreanLabel = new JLabel("Userid"); 

        koreanLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 

        koreanLabel.setSize(100, 20); 

        koreanLabel.setLocation(100, 150); 

        container.add(koreanLabel); 

  

        koreanText = new JTextField(); 

        koreanText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 

        koreanText.setSize(150, 20); 

        koreanText.setLocation(200, 150); 

        container.add(koreanText); 

  

        passwordLabel = new JLabel("Password"); 

        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 

        passwordLabel.setSize(100, 20); 

        passwordLabel.setLocation(100, 200); 

        container.add(passwordLabel); 

        

        englishText = new JTextField(); 

        englishText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 

        englishText.setSize(150, 20); 

        englishText.setLocation(200, 200); 

        container.add(englishText);

  

        ssnLabel = new JLabel("SSN"); 

        ssnLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 

        ssnLabel.setSize(100, 20); 

        ssnLabel.setLocation(100, 250); 

        container.add(ssnLabel); 

        

        mathText = new JTextField(); 

        mathText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 

        mathText.setSize(150, 20); 

        mathText.setLocation(200, 250); 

        container.add(mathText);

  

        javaLabel = new JLabel("Address"); 

        javaLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 

        javaLabel.setSize(100, 20); 

        javaLabel.setLocation(100, 300); 

        container.add(javaLabel); 

        

        javaText = new JTextField(); 

        javaText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 

        javaText.setSize(150, 20); 

        javaText.setLocation(200, 300); 

        container.add(javaText);

        

  

        saveButton = new JButton("Submit"); 

        saveButton.setFont(new Font("Arial", Font.PLAIN, 15)); 

        saveButton.setSize(100, 20); 

        saveButton.setLocation(150, 450); 
        
        saveButton.addActionListener(this);
       
        container.add(saveButton); 

  

        listButton = new JButton("List"); 

        listButton.setFont(new Font("Arial", Font.PLAIN, 15)); 

        listButton.setSize(100, 20); 

        listButton.setLocation(270, 450); 
        
        listButton.addActionListener(this);

        container.add(listButton); 

  

        resultText = new JTextArea(); 

        resultText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 

        resultText.setSize(300, 400); 

        resultText.setLocation(500, 100); 

        resultText.setLineWrap(true); 

        resultText.setEditable(false); 

        container.add(resultText); 

 

        setVisible(true); 

    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == saveButton) {
			JOptionPane.showMessageDialog(this, "전송클릭");
			nameText.setText("홍길동,유관순,이순신,신사임당,이도");
			koreanText.setText("100,50,70,90,80");
			englishText.setText("50,80,70,90,100");
			mathText.setText("80,70,90,50,70");
			javaText.setText("100,100,100,80,90");
			
			String[] names = nameText.getText().split(",");
			String[] koreans = koreanText.getText().split(",");
			String[] englishs = englishText.getText().split(",");
			String[] maths = mathText.getText().split(",");
			String[] javas = javaText.getText().split(",");
			
			Grade[] grades = new Grade[5];//5개의 집합체를 담는다  배열값은 포박자  grades 6반 반만 학생이없음 
			
			for (int i = 0; i < grades.length; i++) {
			grades[i] = new  Grade();  //grades[i] 엘리먼트에 실체값을 주어야한다
			grades[i].setName(names[i]);
			grades[i].setKorean(Integer.parseInt(koreans[i]));
			gradeService.add(grades[i]);
			}
			
		}else if(e.getSource() == listButton) {
			JOptionPane.showMessageDialog(this, "목록클릭");
			Grade[] grades = gradeService.list();
			String result = "";
			for (int i = 0; i < grades.length; i++) {
				result += grades[i]+"\n";
			}
			
			//resultText.setText(grades[0]+"\n"+grades[1]+"\n"+grades[2]+"\n");
			nameText.setText("");
			koreanText.setText("");
			englishText.setText("");
			mathText.setText("");
			javaText.setText("");// 안에 값들 없애기 
			resultText.setText(result);
		}
		
	} 
   

}
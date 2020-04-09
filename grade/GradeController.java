package com.jse.grade;





import javax.swing.JOptionPane;

import com.jse.member.Member;

import com.jse.util.Constants;

public class GradeController {



	// "[%s : 총점 %d 점, 평균 %d 점,학점 : %s]"

	

	public static void main(String[] args) {

		

		GradeService gradeService = new GradeServiceImpl();

		

		Member[] members = new Member[3];

		Grade grade = null;

		while(true) {

			

			switch(JOptionPane.showInputDialog(Constants.GRADE_MENU)) {

			case "0": System.out.println("종료");return;

			case "1": System.out.println("성적표");

			for(int i=0; i< 3;i++) {
			String[] values = JOptionPane.showInputDialog("이름,국어,영어,수학  입력").split(",");
				grade = new Grade();
				
				grade.setName(values[0]);
				grade.setKorean(Integer.parseInt(values[1]));
				grade.setEnglish(Integer.parseInt(values[2]));
				grade.setMath(Integer.parseInt(values[3]));
				gradeService.add(grade);

				

			}

			

			break;

			case "2":
				JOptionPane.showInputDialog(null,gradeService.printGrades());
				break;

			case "3":

				System.out.println("총점별로 1, 2, 3등 이름 나열하기");

			}

		}	

	}

	/*public static Grade input(Scanner scanner) {

		System.out.println("이름,국어,영어,수학  입력");

		return new Grade(scanner.next(),

				scanner.nextInt(),scanner.nextInt(),scanner.nextInt());

	}

	public static Member join(Scanner scanner) {

		int a = 1;

		a = 0;

		Member member = new Member();

		System.out.println("이름 입력");

		member.setName(scanner.next());

		System.out.println("ID 입력");

		member.setUserid(scanner.next());

		System.out.println("비번 입력");

		member.setPasswd(scanner.next());

		System.out.println("나이 입력");

		member.setAge(scanner.nextInt());

		return member;

	}*/



	

}
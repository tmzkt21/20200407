package com.jse.swing;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		GradeBean gradeService = new GradeBean();

		

		GradeBean[] grades = new GradeBean[2];
		
		MemberBean[] members = new MemberBean[3];

		while (true) {

			System.out.println("0. 종료 1.성적표입력 2. 성적표출력 3.등수 확인 4.회원가입5.회원목록출력");

			switch (scanner.nextInt()) {

			case 0:
				System.out.println("종료");
				return;

			case 1:
				System.out.println("성적표");
				GradeService[] grades = gradeService.getGrades;

				for (int i = 0; i < 2; i++) {

					grades[i] = input(scanner);

				}
				gradeService.setGrades(grades);

				break;

			case 2:

				for (int i = 0; i < 2; i++) {

					GradeBean grade = grades[i];

					System.out.println(String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]",

							grade.getName(), grade.total(), grade.average(), grade.grade()));

				}

				break;
			case 4:
				System.out.println("회원가입");
				for (int i=0; i< 3; i++) {
					
					members[i] = join(scanner);
					
				}
				break;
			case 5:
				for (int i =0; i < 3; i++) {
					
					MemberBean member = members[i];
					
					System.out.println(String.format("[회원목록 이름%s,아이디%s,비밀번호%s,나이%d]",
							member.getUserid(),member.getPasswd(),member.getName(),member.getAge() ));
					
				}
		
				

				break;
			}

		}

	}

	public static GradeBean input(Scanner scanner) {
		System.out.println("이름,국어,영어,수학 입력");
		return new GradeBean(scanner.next(),
				scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
				

		

	}
	public static MemberBean join(Scanner scanner) {
		MemberBean member = new MemberBean();
		System.out.println("이름 입력");
		member.setName(scanner.next());
		System.out.println("아이디 입력");
		member.setUserid(scanner.next());
		System.out.println("비밀번호 입력");
		member.setPasswd(scanner.next());
		System.out.println("나이 입력");
		member.setAge(scanner.nextInt());
		return member;
		
	}

}
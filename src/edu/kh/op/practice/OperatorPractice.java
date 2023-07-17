package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다.
		// 인원 수와 사탕 개수를 키보드로 입력 받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int i1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int i2 = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수  : %d\n" , i2 / i1);
		System.out.printf("남는 사탕 개수  : %d" , i2 % i1);
		
		String str1 = "1인당 사탕 개수 : ";
		String str2 = "남는 사탕 개수 : ";
		
		System.out.println();
		
		int iNum1  = i2 / i1;
		int iNum2  = i2 % i1;
		
		System.out.println(str1 + iNum1);
		System.out.println(str2 + iNum2);
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("이름 : ");
		String str1 = sc.nextLine();
		
		System.out.print("학년(정수만) : ");
		String str2 = sc.nextLine();
		
		System.out.print("반(정수만) : ");
		String str3 = sc.nextLine();
		
		System.out.print("번호(정수만) : ");
		String str4 = sc.nextLine();
		
		System.out.print("성별(남학생/여학생) : ");
		String str5 = sc.nextLine();
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		String str6 = sc.nextLine();
		
		System.out.println();
		
		System.out.println(str2 + "학년 " + str3 + "반 " + str4 + "번 " + str1 + " " + str5 + "의 " + "성적은 " + str6 + "이다.");
		System.out.printf("%s학년 %s반 %s번 %s %s의 성적은 %s이다." , str2 , str3 , str4 , str1 , str5 , str6);*/
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(정수만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int group = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int number = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade , group , number , name , gender , score);
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println();
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f\n " , avg);
		
		boolean result = (kor >= 40) && (eng >= 40 ) && (math >= 40) && (avg >= 60);
		
		System.out.println( result ? "합격" : "불합격");
		
		//System.out.printf("합계 : %d" , a + b + c);
		//System.out.printf("합계 : %.2f" , (a + b + c) / 3.0);
	}

}



























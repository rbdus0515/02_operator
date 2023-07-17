package edu.kh.op.ex;

import java.util.Scanner;

public class OpExample { // 예제 코드 작성용 클래스
	
	// ex1() method : 객체 지향 프로그래밍에서 객체와 관련된 함수
	// -> OpExample이 가지고 있는 기능 중 ex1() 이라는 기능
	public void ex1() {
		
		System.out.println("OpExample 클래스에 ex1() 기능 수행");
		System.out.println("클래스 분리 테스트");
		System.out.println("println 자동완성도 배웠어요~!");
		
	}
	
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		// 실행될 때 ExampleRun -> OpExample -> Scanner 순으로 만들어냄
		// Scanner는 같은 패키지 내에 있지 않기 때문에 import 해와야한다.
		
		System.out.print("정수 입력 1 : ");
		int input1 = sc.nextInt(); // 다음 입력되는 정수를 읽어옴.
		
		System.out.print("정수 입력 2 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d / %d = %d\n" , input1 , input2 , input1 / input2);
		System.out.printf("%d %% %d = %d\n" , input1 , input2 , input1 % input2);
		// %% : printf에서 '%' 출력방법
		
	}
	
	public void ex3() {
		// 증감(증가, 감소) 연산자 : ++ , --
		// -> 피연산자(값)을 1 증가 또는 감소 시키는 연산자
		
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++; // iNum1을 1증가
		iNum2--; // iNum2를 1감소
		
		System.out.println("iNum1 : " + iNum1);
		System.out.println("iNum2 : " + iNum2);
		
		// 전위 연산 : ++3 , --2 연산자가 앞쪽에 배치
		// -> 다른 연산자보다 먼저 증가 , 감소함.
		
		int temp1 = 5;
		
		System.out.println( ++temp1 + 5 );
		//					++5   +   5
		//			         6    +   5 == 11
		System.out.println("temp1 : " + temp1); // 6
		
		
		// 후위 연산 : 10++ , 6-- 연산자가 뒷쪽에 배치
		// -> 다른 연산자보다 나중에 증가 , 감소함.
		
		int temp2 = 3;
		System.out.println( temp2-- + 2 );
		//					   3--  + 2 // 5
		//					temp2 - 1; (1감소)
		//					temp2는 2
		System.out.println("temp2 : " + temp2);
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		// 3++ + --5
		// c = 3++ + 4
		// c = 7
		
		// 미뤄놨던 a 후위연산 a++ ==> 3+1 ==> 4
		
		
		// 최종적으로 a,b,c는 각각 얼마인가?
		System.out.printf("%d / %d / %d\n" , a , b , c);
		// a=4 / b=4 / c=7
	}
	
	public void ex4() {
		
		
	}
}

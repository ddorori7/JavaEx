package com.javaex.basics;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
//		ifElseEx();
//		ifElsePractice();
//		switchEx();
//		switchEx2();
		conditionalPractice01();
		conditionalPractice02();
	}
		
	
	private static void conditionalPractice01() {
		
		
		
	}
	
	private static void conditionalPractice02() {
		
		
		
	}


	private static void switchEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		
		int month = scanner.nextInt();
		int days = 0; // 일수 저장 변수

		switch(month) {
		case 2: // month ==2
			days = 28;
			break;			
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 0;
		}
		System.out.println(days + "일입니다.");
		scanner.close();
	}
	
	private static void switchEx() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("과목을 선택하세요.\n(1.자바  2.C  3.C++  4.파이썬)");
		System.out.println("과목번호:");
		
		int code = input.nextInt();
		String message;
		
		switch(code) {
			case 1 : // code == 1
				message = "R101";
				break;
			case 2 : // code == 2
				message = "R202";
				break;
			case 3 : // code == 3
				message = "R303";
				break;
			case 4 : // code == 4
				message = "R404";
				break;
			default: // else문 역할
				message = "상담원에세 문의하세요.";	
		}
		
		System.out.println(message);
		
	}
	private static void ifElseEx() {
		// Scanner로 정수 입력
		// 0, 양수, 음수
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int num = scanner.nextInt();
		
		// 조건 분기
		// 양수 체크 -> 음수 체크 -> 0
		/*
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		*/
		
		// 중첩 if
		// 0체크 -> 0이 아닌것 (양수, 음수)
		if (num == 0) 
			System.out.println("0입니다");
		else {
			// 0이 아닌 것
			if (num > 0)
				System.out.println("양수입니다");
			else
				System.out.println("음수입니다");
		}
		// 3중이상의 중첩이 일어나면 의심한번 해보기.
			
		scanner.close();
	
	}
		private static void ifElsePractice() {
			
			// 연습문제
			Scanner input = new Scanner(System.in);
			System.out.println("과목을 선택하세요.\n(1.자바  2.C  3.C++  4.파이썬)");
			System.out.println("과목번호:");
			int num1 = input.nextInt();
			
	//		if (num1 == 1) {
	//			System.out.println("R101호 입니다.");
	//		} else if (num1 == 2) {
	//			System.out.println("R202호 입니다.");
	//		} else if (num1 == 3) {
	//			System.out.println("R303호 입니다.");
	//		} else if (num1 == 4) {
	//			System.out.println("R404호 입니다.");
	//		} else {
	//			System.out.println("상담원에게 문의하세요");
	//		}
	//		input.close();
		
			
			if (num1 <= 4 && num1 >=1 ) { 
				System.out.println("R" + num1 + "0" + num1 + "호 입니다.");
			} else {
				System.out.println("상담원에게 문의하세요");
			}		
			input.close();
			
			// 다른풀이
//			Scanner scanner = new Scanner(System.in);
//			int code = scanner.nextInt();
//			String message;
//			// 조건 분기 
//			if (code ==1)
//				message = "R101";
//			else if (code ==2)
//				message = "R202";
//			else if (code ==3)
//				message = "R303";
//			else if (code ==4)
//				message = "R404";
//			else
//				message = "상담원에게 문의하세요.";
//				
//			System.out.println(message);
//			scanner.close();
		
	}
	
	
}
package com.javaex.basics;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		whileGugu();
//		doWhileEx();
//		forGugu();
//		continueEx();
		practiceEx1();
//		practiceEx2();
		System.out.println("End of Code");
	}
	

	private static void practiceEx1() {
//		for (int i = 1; i <= 9; i++) {
//			System.out.println("-------------");
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//		}
//		
		int i = 2, j = 1;
		while (i <= 9) {
			while (j <= 9) {
				System.out.println(i + "*" + j + "=" + (i*j));
				j++;
			} 
			i++;
			j=1; // j를 다시 초기화를 시켜줘야 while문 안으로 들어감.
		}
	}
	
	private static void practiceEx2() {
		
		for (int i = 1; i <= 6; i++) {		
		
			for (int j = 1; j <= i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
				
	}
	
	private static void continueEx() {
		for (int i = 1; i <= 20; i++) {
			// 2의 배수, 3의 배수는 출력하지 않음
			if (i % 2 == 0 || i % 3 == 0) 
				// continue를 만나면 이후 문장은 수행하지 않고 블록의 끝으로 간다
				continue;
			System.out.println(i);
		}
		
	}
	
	private static void forGugu() {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("단을 압력하세요");
		 int dan = scanner.nextInt();
		 
		 for (int i = 1; // 초기화
				 i <= 9; // 반복조건
				 i++) { // 증감식
			 System.out.println(dan + "*" + i + "= " + (dan *i));
		 }
		scanner.close();	
	}
	
	private static void doWhileEx() {
		// 적어도 한번은 수행되어야 하는 반복, 
		// 반복 조건이 반복문 내부에서 할당되는 경우
		int total = 0, value = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("숫자를 입력하세요.[0이면 종료]");
			value = scanner.nextInt(); 
			total += value; // total = total + value
		} while(value != 0);
		
			System.out.println("합계:" + total);
			scanner.close();
		
	}
	
	private static void whileGugu() {
		Scanner scanner = new Scanner(System.in);
		int dan;
		int i = 1; // 반복 제어 변수
		
		System.out.println("단을 입력하세요");
		System.out.print("단:");
		dan = scanner.nextInt();
		
		while (i <= 9) {
			System.out.println(
					dan + "*" + i + "=" + (dan*i)); 
			// 중요: 제어 변수 변경
			i++;
		}
		
	}
	
	private static void whileEx() {
		
		int num = 0; // 반복 조건 제어 변수
		while (num <= 9) {
			System.out.println("I like Java" + num);
			num += 1; // num++; 주의: 무한 반복에 빠지지 않도록 적절히 제어
		}
	}
}

package com.javaex.exception;

import java.util.*;

public class ExceptionEx {

	public static void main(String[] args) {
//		arithExceptionEx();
//		NullPointerExceptionEx();
		arrayIndexExceptionEx();
	}
	
	private static void arrayIndexExceptionEx() {
		// 배열의 인덱스 범위를 벗어난 접근
		
		int[] intArray = new int[] {1,3,5,7,9};
		// length ==5, 인덱스 범위 0~4(length-1)
		
		try {
			System.out.println(intArray[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 객체:" + e.getClass().getSimpleName());
			System.out.println("예외 메시지:" + e.getMessage());
			System.err.printf("배열의 인덱스 범위는 0 ~ %d까지 입니다.%n",
					intArray.length - 1);
		}
		System.out.println("End of Code");
	}
	
	private static void NullPointerExceptionEx() {
		
		String str = new String("Java");
		System.out.println(str.toUpperCase());
		
		str = null; // 참조 해제
		System.out.println(str);
		
		try {
			System.out.println(str.toUpperCase());
		} catch (NullPointerException e) {
			System.err.println("str은 null입니다.");
		}
		System.out.println("End of Code");
		
	}
	
	private static void arithExceptionEx() {
		// 스캐너로부터 정수 입력
		// 100을 입력받은 정수로 나눈다.
		
		double result = 0;
		int num = 0;
		System.out.print("정수를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		
		try {
			// 예외 발생 가능 코드를 명시
			num = sc.nextInt();
			result = 100 / num;
		} catch (InputMismatchException e) { // 구체적인 예외 먼저
			System.err.println("정수를 입력해주세요!");
		} catch (ArithmeticException e) { // 구체적인 예외 먼저
			System.err.println("0으로는 나눌 수 없어요!");
		} catch (Exception e) { 
			//Exception은 모든예외의 최상위 클래스 > 가장 마지막에 막아줌 (위에는 구체적 예외)
			e.printStackTrace(); // 예외 정보 전체를 출력
		} finally {
			// 예외여부 관계 없이 가장 마지막에 수행
			System.out.println("finally");

		}
		
		System.out.println(result);
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}
}

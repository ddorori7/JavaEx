package com.javaex.basics;

//변수 예제,
//데이터 타입 예제
public class Types {
	public static void main(String[] args) {
		//varEx();
	}
	
	// 실수형 데이터 타입
	private static void floatDoubleEx() {
		// float(4) < double(8)
//		integerEx(); 
//		floatDoubleEx();
		
		float floatVar = 3.14159f;
		double doubleVar = 3.14159;
		
		System.out.println(floatVar);
		System.out.println(doubleVar);
		
		
		// 지수 표기법
		doubleVar = 3E10; // 3 * 10 ^ 10(10의 10승)
		floatVar = 3e-6f; // 3 * 10 ^ -6(10의 -6승)
	
		System.out.println(doubleVar);
		System.out.println(floatVar);

		// 부동소수점 계산의 문제
		// float, double은 정밀도를 포기하고
		// 표현 범위 넓힌 것
		// 정밀 실수 처리에는 적합하지 않다.
		System.out.println(0.1 * 3);
		
		
		
	}
	
	// 정수형 데이터 타입
	private static void integerEx() {
		//byte(1) < short(2) < int(4) < long(8)
		int intVar1, intVar2; // 선언
		
		intVar1 = 2021; // 초기화
		//intVar2 = 1234567890123; // out of range: 저장 범위 초과
		System.out.println(Integer.toBinaryString(intVar1));
		
		long longVar1, longVar2;
		
		longVar1 = 2021;
		longVar2 = 1234567890123L; // L or l 명시해야한다.
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		//2진수, 8진수, 16진수
		int bin, oct, hex;
		
		bin = 0b1101; // 2진수 0b
		oct = 072; // 8진수 0
		hex = 0xFF; // 16진수 0x
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
		
				
	}
	
	//변수의 선언과 사용
	private static void varEx() {
		/*변수의 식별자 규칙
		 * 1. 문자, 숫자, $, _ 사용할 수 있다
		 * 2. 숫자로 시작할 수 없다
		 * 3.예약어는 사용할 수 없다
		 * 4. 변수, 메서드의 명명규칙 : camelCase
		 */
		
		//int age; // 선언
		//age = 27 // 초기화
		int age = 27; // 선언과 동시에 초기화
		
		// 자바는 정적 타입 언어, 
		// 다른 타입의 데이터를 담을 수 없다.
		// age = 3.14; -> Error
		
		// 조회 :
		System.out.println("나이는 " + age);
		
		// 한번에 여러 변수를 선언한 때
		int v1 = 10, v2 = 20, v3 = 30;
		
		// 여러 변수에 동일한 값을 할당
		v1 = v2 = v3 = 40;
	}

}

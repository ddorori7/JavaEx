package com.javaex.quiz02;

public class Quiz02_1 {

	public static void main(String[] args) {
		
		int a = 3, b = 6;
		char c = 'A';
		
		// a는 짝수입니까? true or false로 출력하세요.
		String resultA = a % 2 == 0 ? "true" : "false";
		System.out.println("a는 짝수입니까? " + resultA );
		
		//b는 3의 배수입니까? true or false로 출력하세요.
		String resultB = b % 3 == 0 ? "true" : "false";
		System.out.println("b는 3의 배수입니까? " + resultB );

		
		/* 'a는 짝수이다'와 'b는 3의 배수이다'를 논리곱(AND)으로 연산하여 해당 진위값을 r1 변수에 저장해 봅시다.
		결과값 r1을 출력해 봅시다. */
		boolean resultRa = a % 2 == 0;
		boolean resultRb = b % 3 == 0;
		boolean r1 = (resultRa && resultRb);
		System.out.println(r1);
		
	 
//		 다른풀이
//		 System.out.println(a % 2 == 0);
//		 System.out.println(b % 3 == 0);
// 
//		 boolean r1 = a % 2 == 0 && b % 3 == 0;
//		 System.out.println(r1);
		
		
		
		/*c의 4글자 뒤의 문자는 무엇입니까? 결과값을 r2 변수에 저장해 봅시다.
		결과값 r2를 출력해 봅시다.*/
		
		char r2 = (char) (c + 4);
		System.out.println(r2);
	
	}

}

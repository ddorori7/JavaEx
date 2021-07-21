package com.javaex.basics.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		enumEx1();


	}
	
	public static void enumEx1() {
		Week today = Week.WEDNESDAY;
		
		System.out.printf("오늘은 %s(%d) 입니다.", 
				today.name(), // 열거 상수 -> 문자열
				today.ordinal()); // 열거 상수 내 순번 출력
		
		Week obj = Week.valueOf("FRIDAY");
		System.out.printf("%s, %d", obj.name(), obj.ordinal());
	}
	
	
	
	
}

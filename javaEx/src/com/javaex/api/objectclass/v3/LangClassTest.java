package com.javaex.api.objectclass.v3;

public class LangClassTest {

	public static void main(String[] args) {
		
		Point p = new Point(10, 20); // 새 객체
		Point p2 = p; //참조복제
		
		System.out.println("p = " + p);
		System.out.println("p2 = " + p2);

		// p2를 변경
		p2.x = 100;
		System.out.println("p2 = " + p2);
		System.out.println("p = " + p); //p의 x도 바뀜
		// 참조 복제는 같은 객체 참조
	}

}

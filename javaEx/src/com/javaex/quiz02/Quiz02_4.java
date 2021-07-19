package com.javaex.quiz02;

public class Quiz02_4 {

	public static void main(String[] args) {
		
		char ch = 'A';
//		char형 변수 ch에 알파벳 대문자가 담겨 있습니다. 이 변수에 담긴 알파벳을 소문자로 변환해 봅시다.
//		char ch = 'A';
//		참고
//		ch에 오직 대문자만 담겨 있다고 가정합니다. 다른 문자가 담겨 있는 상황은 없다고 가정합니다.
//		'A'의 코드는 65, 'a'의 코드는 97 입니다.
		
		String lower = String.valueOf(ch);
		System.out.println(lower.toLowerCase());
		
//		char conv = (char)(ch + 32);
//		System.out.println(conv);

		
	}

}

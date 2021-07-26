package com.javaex.oop.summary;

public class Human extends Animal {

	// 생성자
	public Human(String name, int age) {
		// 명시적으로 부모 생성자 호출해야 에러가 없어짐.
		super(name, age);
	}
	
	
	
	@Override
	public void say() { 
		// Animal 클래스의 추상 메서드 > 반드시 Override됌.
		System.out.printf("안녕 나는 %s입니다%n", name);
	}

}

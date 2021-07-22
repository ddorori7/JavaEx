package com.javaex.oop.goods.v3;

// v3. 생성자
//  	: new 키워드와 함께 클래스를 객체화 시킬때 초기화를 담당
public class Goods {
	// 필드 선언
	private String name; // private 는 클래스 내부에서만 쓸 수 있다.
	private int price;
	
	// 생성자 규칙
	// 1. 클래스 이름과 동일, 반환 타입 없음
	// 2. 사용자가 생성자를 하나도 만들지 않으면 -> javac가 기본생성자를 추가
	// 3. 생성자를 임의로 만들었을 때 -> javac는 기본생성자를 추가하지 않음.
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	// getters/setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	// setter를 구현하지 않으면 필드는 Read Only
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	// 메서드
	public void showInfo() {
		System.out.println("상품이름:" + name);
		System.out.println("가격:" + price);
	}
	
	
	
}

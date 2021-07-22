 package com.javaex.oop.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods notebook = new Goods(); // 기본생성자 없음
		Goods notebook = new Goods("LG Gram", 1700000);
		// 필드에 접근
//		notebook.name = "LG Gram";
//		notebook.price = 1700000;
		// setter를 이용한 우회 접근
//		notebook.setName("LG Gram");
//		notebook.setPrice(1700000);
		
		Goods smartphone = new Goods("iPhone 12",800000);
//		smartphone.setName("iPhone 12");
//		smartphone.setPrice(800000);
//		smartphone.name = "iPhone 12";
//		smartphone.price = 800000;

		
		// 출력
		System.out.printf("%s, %d원%n", 
				notebook.getName(),
				notebook.getPrice());
		System.out.printf("%s, %d원%n", 
				smartphone.getName(),
				smartphone.getPrice());

		notebook.showInfo();
		smartphone.showInfo();
		
//		notebook.setPrice(170); // price 필드는 Read Only
//		notebook.showInfo();
		
		
	}

}

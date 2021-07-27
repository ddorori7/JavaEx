package com.javaex.api.objectclass.v2.rectangle;



public class RectangleApp {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(6,4); //24
		Rectangle b = new Rectangle(2,12); //24
		Rectangle c = new Rectangle(3,3); //9
		Rectangle d = c; //9

		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(d.equals(c));

		

		// Rectangle 클론 테스트
		Rectangle r1 = new Rectangle(100,200);
		System.out.println("r1 = " + r1);
		Rectangle r2 = r1.getClone();
		System.out.println("r2 = " + r2);
		
		r2.width = 300;
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		
		System.out.println("r1 == r2 ?  " + (r1 == r2));
	}

}

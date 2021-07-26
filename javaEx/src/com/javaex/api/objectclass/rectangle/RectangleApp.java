package com.javaex.api.objectclass.rectangle;

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

	}

}

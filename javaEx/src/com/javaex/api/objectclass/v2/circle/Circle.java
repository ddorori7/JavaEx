package com.javaex.api.objectclass.v2.circle;

public class Circle {
	
	private int x;
	private int y;
	private int radius;
	
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}


	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}


	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Circle) { //obj객체가 Circle의 객체이면
			// 캐스팅
			Circle cir = (Circle)obj;
			return radius == cir.radius;
		}
		return super.equals(obj);
	}
	
	
	

}

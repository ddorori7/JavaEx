package com.javaex.api.objectclass.circle;

public class Circle {
	
	int x;
	int y;
	int radius;
	
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}


	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Circle) {
			Circle cir = (Circle)obj;
			return radius == cir.radius;
		}
		return super.equals(obj);
	}
	
	
	

}

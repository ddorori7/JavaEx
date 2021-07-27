package com.javaex.api.objectclass.v2.rectangle;

public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			// 캐스팅
			Rectangle rec = (Rectangle)obj;
			return width * height == rec.width * rec.height;
		}
		
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	

}

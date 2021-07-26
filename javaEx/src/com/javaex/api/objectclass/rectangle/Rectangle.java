package com.javaex.api.objectclass.rectangle;

public class Rectangle {
	
	int width;
	int height;
	
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle rec = (Rectangle)obj;
			return width * height == rec.width * rec.height;
		}
		
		return super.equals(obj);
	}
	
	

}

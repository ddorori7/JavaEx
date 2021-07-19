package com.javaex;

public class ex {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------------------");
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("-----------------------");
		z = x++;
		System.out.println("z=" + z); //12
		System.out.println("x=" + x); //13
		
		System.out.println("-----------------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		


		

		
		
	}

}

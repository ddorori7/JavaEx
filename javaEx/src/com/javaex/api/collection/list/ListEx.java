package com.javaex.api.collection.list;

import java.util.*;

public class ListEx {

	public static void main(String[] args) {
//		List<String> lst = new LinkedList<>();
		List<String> lst = new ArrayList<>(); // 다형성
		
		// 객체 추가: add - 맨 뒤에 새 요소 추가
		lst.add("Java");
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		
		System.out.println("lst:" + lst);
		
		lst.add("Java"); // Append
		System.out.println("append:" + lst); 
		// List는 순서가 있고, 중복 요소 허용
		
		lst.add(3, "C#"); // Insert: 3번 인텍스에 C# 추가
		System.out.println("insert:" + lst); 
		
		// 요소의 갯수
		System.out.println("size:" + lst.size()); // capacity는 없다(예는 벡터기반)
		lst.remove(3); // 인덱스로 삭제
		System.out.println("remove:" + lst); 
		lst.remove("Python"); // 객체로 삭제
		System.out.println("객체삭제, remove:" + lst); 
		
		// 반복자: List에서는 Iterator 이용
		Iterator<String> iter = lst.iterator();
		while(iter.hasNext()) { // 뒤에 남은 요소가 있는가?
			String item = iter.next(); // 요소를 받아오고 다음으로 이동
			System.out.print(item + " ");
		}
		System.out.println();
		
		// 리스트 비우기
		lst.clear();
		System.out.println(lst);
		
		
	}

}

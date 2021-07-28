package com.javaex.api.collection.list;

import java.util.*;

public class StackEx {

	public static void main(String[] args) {
		
		// 스택 생성
		// LIFO 마지막 입력이 가장 먼저 나간다
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < 5; i++) {
			stack.push(i); // 데이터 입력
			System.out.println("STACK:" +stack);
			
		}

		// 가장 위쪽 데이터 확인
		System.out.println("PEEK:" + stack.peek()); // 데이터를 확인만 하고 지우지 않음
		
//		while(true) { // 없을때 추출하면 에러
		while(!stack.empty()) {
			System.out.println("POP:" + stack.pop()); 
			// 가장 마지막 입력 데이터 추출
			System.out.println("Stack:" + stack);
		}
	}

}

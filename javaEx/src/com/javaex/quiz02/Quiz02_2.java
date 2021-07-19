package com.javaex.quiz02;

public class Quiz02_2 {

	public static void main(String[] args) {
	
			int balls = 136;
			int cap = 10;
			
//			변수 설명
//
//			balls는 보유하고 있는 공의 갯수입니다.
//			cap는 하나의 상자당 담을 수 있는 공의 개수입니다
//			balls를 상자에 나눠 담으려면 최소 몇 개의 상자가 필요합니까? 결과를 출력해 봅시다.
//			삼항 연산자를 활용해 계산해 봅니다
			
			int box = balls % cap == 0 ? balls/cap : balls/cap + 1;
			System.out.println("필요한 상자의 갯수는: " + box + "개 입니다.");
			
//			다른 풀이
//			int cnt = balls / cap;
//			cnt = cnt + (balls % cap > 0 ? 1 : 0);
//			or cnt += balls % cap > 0 ? 1 : 0;
//			System.out.println("필요한 상자의 갯수는: " + box + "개 입니다.");

	}

}

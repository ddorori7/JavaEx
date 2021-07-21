package Practice01_2;

import java.util.Scanner;

public class problem08 {

	public static void main(String[] args) {
		
		int num;
		int money;
		int balance = 0; // 잔고
		Scanner scanner = new Scanner(System.in);
		
			do {
				System.out.println("------------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("------------------------------");
				
				System.out.print("선택>");
				num = scanner.nextInt();
			
			
				if (num == 1) { // 1.예금
					System.out.print("예금액>");
					money = scanner.nextInt();
					balance = balance + money;
				} else if (num == 2) { // 2.출금
					System.out.print("출금액>");
					money = scanner.nextInt();
					balance = balance - money;
				} else if (num == 3) { // 3.잔고
					System.out.println("잔고액>" + balance);
				} else {
					if (num != 4)
					System.out.println("다시입력해주세요");
				}
				
			} while (num != 4);
			
			System.out.println("프로그램 종료");
			
	}

}

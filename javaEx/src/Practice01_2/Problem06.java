package Practice01_2;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int sum = 0;
		int i = 1;
		
		if (num % 2 == 1) {
			for (i = 1; i <= num; i++) {
				if (i % 2 == 1) {
				sum = sum + i;
				}
			} 
			System.out.println("결과값: " + sum);
		} else {
			for (i = 1; i <= num; i++) {
				if (i % 2 == 0){
				sum = sum + i;
				}
			}
			System.out.println("결과값: " + sum);
		}
	}

}

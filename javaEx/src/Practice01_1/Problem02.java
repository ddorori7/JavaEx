package Practice01_1;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = input.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		input.close();
		
	}

}

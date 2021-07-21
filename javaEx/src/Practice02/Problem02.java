package Practice02;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		int sum = 0;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		avg = sum / num.length;
		System.out.println("평균은 " + avg + "입니다.");
	}

}

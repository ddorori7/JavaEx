package Practice01_2;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		
		
		System.out.println("========================");
		System.out.println("[숫자맞추기게임 시작]");
		System.out.println("========================");
		
		int random = (int)(Math.random() * 100 + 1);
//    	System.out.println(random);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		int num = scanner.nextInt(); 
		
		
		while (random != num) {
			
			if (random > num) {
				System.out.println("더 높게");
				System.out.print(">>");
				num = scanner.nextInt(); 
			} else if (random < num) {
				System.out.println("더 낮게");
				System.out.print(">>");
				num = scanner.nextInt(); 
			}
		}
		System.out.println("맞았습니다.");
		
		System.out.println("게임을 종료하시겠습니다?(y/n) >>");
		String yesNo = scanner.next();
		
		//
		if (yesNo.equals("n")) {
			 random = (int)(Math.random() * 100 + 1);
//	    	System.out.println(random);
			
			System.out.print(">>");
			 num = scanner.nextInt(); 
			
			while (random != num) {
				
				if (random > num) {
					System.out.println("더 높게");
					System.out.print(">>");
					num = scanner.nextInt(); 
				} else if (random < num) {
					System.out.println("더 낮게");
					System.out.print(">>");
					num = scanner.nextInt(); 
				}
			}
			System.out.println("맞았습니다.");
			
			System.out.println("게임을 종료하시겠습니다?(y/n) >>");
			yesNo = scanner.next();
			
		} else {

			System.out.println("========================");
			System.out.println("[숫자맞추기게임 종료]");
			System.out.println("========================");
			
		}
			
	}

}

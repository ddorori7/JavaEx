package Practice02;

public class Problem05 {

	public static void main(String[] args) {
		int scoreboard[][] = {
						{80,75,90,95,78},
						{92,88,89,92,70},
						{78,80,85,86,63},
						{83,84,89,87,75},
						{89,83,93,94,78}
				};
		
		int sum = 0;
		int count = 0;
		
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				if (scoreboard[row][col] >= 85) {
					sum = sum + scoreboard[row][col];
					count++;
				}
			}
		}
		double avg = sum / count ;
		System.out.println("85점이상 총합: " + sum);
		System.out.println("85점이상 평균: " + avg);

	}

}

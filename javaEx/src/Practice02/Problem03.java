package Practice02;

import java.util.Arrays;

public class Problem03 {

	public static void main(String[] args) {
		char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l'};

		for (int i = 0; i < c.length; i++) {
			char c1 = c[i];
			System.out.print(c1);
		}
		System.out.println();
		
		for (int i = 0; i < c.length; i++) {
			if (c[i]==' ') {
				c[i] = ',';
			}
			char c1 = c[i];
			System.out.print(c1);
		}
		
		
	}

}

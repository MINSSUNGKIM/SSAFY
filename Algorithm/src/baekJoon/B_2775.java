package baekJoon;

import java.util.Scanner;

public class B_2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] apart = new int[15][15];
		
		for (int j = 0; j < 15; ++j) {
			apart[0][j] = j + 1;
			apart[j][0] = 1;
		}

		for (int j = 1; j < 15; ++j) {
			for (int l = 1; l < 15; ++l) {
				apart[j][l] = apart[j - 1][l] + apart[j][l - 1];
			}
		}
		
		int T = sc.nextInt();

		for (int i = 0; i < T; ++i) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(apart[k][n-1]);
		}
		
		sc.close();
		
	}

}

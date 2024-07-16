package labWork;

import java.util.Scanner;

public class AppleTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] map = new int[n + 2][n + 2];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				map[i + 1][j + 1] = sc.nextInt();
			}
		}
		int[][] sum = new int[n][n];
		int max = -1;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				sum[i][j] = map[i + 1][j + 1] + map[i + 1][j + 2] + map[i + 2][j + 1] + map[i + 1][j] + map[i][j + 1];
				if (max < sum[i][j])
					max = sum[i][j];
			}
		}
		System.out.println(max);
	}

}

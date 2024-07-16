package labWork;

import java.util.Scanner;

public class EmergencyEscape {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] vel = new int[N];
		int[] hei = new int[N];

		for (int i = 0; i < N; ++i) {
			vel[i] = sc.nextInt();
		}
		for (int i = 0; i < N; ++i) {
			hei[i] = sc.nextInt();
		}

		int[][] dethei = new int[N][3];
		int[][] detvel = new int[N][3];

		for (int i = 4; i < N; ++i) {
			dethei[i][0] = hei[i - 4] - hei[i];
			detvel[i][0] = (vel[i - 1] + vel[i - 2] + vel[i - 3] + vel[i - 4]) / 4;
		}
		for (int i = 3; i < N; ++i) {
			dethei[i][1] = hei[i - 3] - hei[i];
			detvel[i][1] = (vel[i - 1] + vel[i - 2] + vel[i - 3]) / 3;

		}
		for (int i = 2; i < N; ++i) {
			dethei[i][2] = hei[i - 2] - hei[i];
			detvel[i][2] = (vel[i - 1] + vel[i - 2]) / 2;
		}
		int ans = -1;
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < 3; ++j) {
				if (dethei[i][j] >= 4000 - 1000 * j && detvel[i][j] >= 900 + 100*j) {
					ans = i+1;

				}
			}
		}
		System.out.println(ans);

	}

}

package labWork;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] nums = new int[M];
		boolean[] arrSwitch = new boolean[N];

		for (int i = 0; i < M; ++i) {
			nums[i] = sc.nextInt();
			for (int j = 0; j < N; ++j) {
				if ((j + 1) % nums[i] == 0) {
					arrSwitch[j] = !arrSwitch[j];
				}
			}
		}
		int[] arrint = new int[N];
		for (int i = 0; i < N; ++i) {
			arrint[i] = arrSwitch[i] ? 1 : 0;
		}
		System.out.println(Arrays.toString(arrint));

	}

}

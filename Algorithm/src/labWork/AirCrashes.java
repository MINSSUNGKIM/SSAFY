package labWork;

import java.util.Scanner;

public class AirCrashes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] injuries = new int[N];
		int max = -1;
		for (int i = 0; i < N; ++i) {
			injuries[i] = sc.nextInt();
			if (max < injuries[i])
				max = injuries[i];
		}

		int min = injuries[0];
		for (int i = 1; i < N; ++i) {
			if (min > injuries[i])
				min = injuries[i];
		}
		if (min == injuries[N - 1])
			System.out.println("-1");
		else
			System.out.println(max - min);

	}

}

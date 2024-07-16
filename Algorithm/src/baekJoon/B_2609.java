package baekJoon;

import java.util.Scanner;

public class B_2609 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int gcd = 0;
		int lcm = 1;

		for (int i = 1; i <= A || i <= B; ++i) {
			if (A % i == 0 && B % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);

		while (!(lcm % A == 0 && lcm % B == 0)) {
			lcm++;
		}
		System.out.println(lcm);

	}

}

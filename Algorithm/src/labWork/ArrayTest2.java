package labWork;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[] nums = new int[] {1,2,3,4,5,6,7,8,9,2};
		
		for(int i=0; i<nums.length; ++i){
			System.out.print(nums[i]);
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] foods = new String[N];
		for(int i=0; i<N; ++i) {
			foods[i]=sc.next();
		}
		
		for(int i=0; i<N; ++i) {
			System.out.println(foods[i]);
		}
	}
		
}



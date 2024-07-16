package day02_array;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {

		int[] nums= {1,4,6,2,3};
		
		int[] longernums = new int[nums.length*2];
		
		//1번 for문으로 복사
		for(int i=0; i<nums.length; ++i) {
			longernums[i]=nums[i];
		}
		System.out.println(Arrays.toString(longernums));
		
		//2. Arrays.copyOf(원본,새로운배열의 크기)
		int[] longernums2 = Arrays.copyOf(nums, 3);
		System.out.println(Arrays.toString(longernums2));
		
		//3.Arrays.copyOfRange(원본,원본 기준 시작점(index),원본 배열의 마지막 순서)
		int[] copynums = Arrays.copyOfRange(nums, 1,3);
		System.out.println(Arrays.toString(copynums));
		
		//4.System.arraycopy(원본배열,
		
	}

}

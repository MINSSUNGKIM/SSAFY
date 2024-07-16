package day02_array;

public class Array03 {

	public static void main(String[] args) {
		int[] nums = {23, 7, 20, 11,6};
		//for each 문은 read only 임, 내부 값 못바꿈.
		for(int i:nums) {
			System.out.println(i);
		}
	}

}

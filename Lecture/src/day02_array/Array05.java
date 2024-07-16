package day02_array;

public class Array05 {

	public static void main(String[] args) {
		int[] nums = {1,2,4,1,2,3,1,2,3,4,6,8,9,5,7,4,5};
		
		int[] cnt = new int[10];
		
		for(int i=0;i<nums.length;++i) {
			
			cnt[nums[i]]++;
			
		}
	}

}

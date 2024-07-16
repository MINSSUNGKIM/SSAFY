package day02_array;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1;//권장
		int arr2[];//배열을 생성한 것 이 아닌, 참조값 저장 변수를 만든 것.
		
		int[] arr3 = new int[5];
		//배열의 생성
		
		//2. 자료형[] 변수이름 = new 자료형[] {값1, 값2, ...}
		int[] arr4 = new int[] {1,2,3,4};
		
		//3. 자료형[] 변수이름 = {값1,값2,값3}
		//제약사항 재할당이 불가능 함.
		int[] arr5 = {1,2,3,4,5};
		
		
		//재할당 가능
		arr3 =new int[10];
		arr3 = new int[]{1,2,3,4,5};

		//3번경우
		arr5 =new int [10];
		
		for(int i=0; i<10; ++i) {
			System.out.println(arr5[i]);
		}
	}

}

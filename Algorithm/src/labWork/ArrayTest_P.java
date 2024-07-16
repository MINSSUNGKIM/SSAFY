package labWork;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest_P {

	public static void main(String[] args) {

		int[] arr1 = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		System.out.println("-----원소 10개 출력-----");
		System.out.println(Arrays.toString(arr1));
		System.out.println("-----원소 10개 중 짝수만 출력-----");
		for(int i=0; i<10; ++i) {
			if(arr1[i]%2==0)
				System.out.print(arr1[i]+" ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("-----바꿀 위치 입력 : ");
		int index = sc.nextInt();
		System.out.print("-----수 입력 : ");
		int value = sc.nextInt();
		System.out.println("-----원소 10개 출력-----");
		arr1[index]=value;
		System.out.println(Arrays.toString(arr1));
		
		

	}

}

package ch05;

import java.util.Arrays;

/*
 * 정렬하기: 오름차순, 내림차순으로 배열을 정렬
 */
public class ArrayEx9 {
	public static void main(String[] args) {
		
		int[] code   = {-4 ,-1 ,3 ,6 ,11};
		int[] arr    = new int [10];
		
		for (int i=0; i< arr.length ; i++) {
			int tmp = (int)(Math.random()*code.length);
			arr[i]  = code[tmp];
		}
		System.out.println(Arrays.toString(arr));
		
				
	} //end of main
}

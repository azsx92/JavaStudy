package ch06;
// 3.8 기본형 매개변수와 참조형 매개변수 
/*
 * 
	기본형 매개변수 : 변수의 값을 읽기만 한다.(read only) 
	참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다.(read $ write) 
 * 
 *6-12 267P
 * */
class ReferenceParamEx3 {
	public static void main(String[] args) {
		int[] arr =  new int[]{3,2,1,6,5,4}; // 크기가 1인 배열. x[0] = 10;
		printArr(arr); //배열의 모든 요소를 출력
		sortArr(arr);  // 배열을 정렬
		printArr(arr); // 정렬 후 결과를 출력
		System.out.println("sum="+ sumArr(arr)); //배열의 총합을 출력
	
	}

	static void printArr(int[] arr) {
		System.out.print("[");
		for(int i : arr) //향상된 for문
			System.out.print(i+" ");
		System.out.println("]");
		
	} //printArr

	static int sumArr(int[] arr) { //참조형 매개변수
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			sum+= arr[i];
		} 
		return sum;
	} //sumArr

	static void sortArr(int[] arr) {
		for(int i=0; i< arr.length-1; i++) {
			for(int j=0; j< arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp  = arr[j];
					arr[j]   = arr[j+1];
					arr[j+1] = tmp;
				}
			}			
		} //sortArr
		
	}
}

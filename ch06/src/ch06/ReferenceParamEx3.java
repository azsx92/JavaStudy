package ch06;
// 3.8 �⺻�� �Ű������� ������ �Ű����� 
/*
 * 
	�⺻�� �Ű����� : ������ ���� �б⸸ �Ѵ�.(read only) 
	������ �Ű����� : ������ ���� �а� ������ �� �ִ�.(read $ write) 
 * 
 *6-12 267P
 * */
class ReferenceParamEx3 {
	public static void main(String[] args) {
		int[] arr =  new int[]{3,2,1,6,5,4}; // ũ�Ⱑ 1�� �迭. x[0] = 10;
		printArr(arr); //�迭�� ��� ��Ҹ� ���
		sortArr(arr);  // �迭�� ����
		printArr(arr); // ���� �� ����� ���
		System.out.println("sum="+ sumArr(arr)); //�迭�� ������ ���
	
	}

	static void printArr(int[] arr) {
		System.out.print("[");
		for(int i : arr) //���� for��
			System.out.print(i+" ");
		System.out.println("]");
		
	} //printArr

	static int sumArr(int[] arr) { //������ �Ű�����
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

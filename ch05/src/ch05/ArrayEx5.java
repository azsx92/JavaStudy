package ch05;
/*
 * �ִ밪 �� �ּҰ� : �迭�� ��� �߿��� ���� ū���� ���� ���� ���� ã����.
 */
public class ArrayEx5 {
	public static void main(String[] args) {
		int sum 		= 0; 	//������ �����ϱ� ���Ѻ���
		float average 	= 0f;	//����� �����ϱ� ���� ����
		
		int[] score = {100, 88, 100, 100, 90};
				
		for(int i=0; i< score.length; i++) {
			sum += score[i];
		}
		
		average = sum /(float)score.length ; // ������� float�� ��� ���ؼ� ����ȯ
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
		
	}
}

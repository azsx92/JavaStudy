package ch05;
/*
 * 최대값 과 최소값 : 배열의 요소 중에서 제일 큰값과 제일 작은 값을 찾느다.
 */
public class ArrayEx5 {
	public static void main(String[] args) {
		int sum 		= 0; 	//총점을 저장하기 위한변수
		float average 	= 0f;	//평균을 저장하기 위한 변수
		
		int[] score = {100, 88, 100, 100, 90};
				
		for(int i=0; i< score.length; i++) {
			sum += score[i];
		}
		
		average = sum /(float)score.length ; // 계산결과를 float로 얻기 위해서 형변환
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		
	}
}

package ch06;
// 3.8 기본형 매개변수와 참조형 매개변수 
/*
 * 
	기본형 매개변수 : 변수의 값을 읽기만 한다.(read only) 
	참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다.(read $ write) 
 * 
 *
 * */
class ReferenceParamEx2 {
	public static void main(String[] args) {
		int[] x =  {10}; // 크기가 1인 배열. x[0] = 10;
		System.out.println("main() : x = " + x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("Main() : x = " + x[0]);
	}

	static void change(int[] x) { //참조형 매개변수
//		static void change(int x) {
		x[0] = 1000;

		System.out.println("change() : x =" + x[0]);
	}
}

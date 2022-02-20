package ch06;
//3.8 기본형 매개변수와 참조형 매개변수 
/*
* 
	기본형 매개변수 : 변수의 값을 읽기만 한다.(read only) 
	참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다.(read $ write) 
* 
*
* */
class Data { int x;}

 class PrimitiveParmEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("Main() : x = " + d.x);
	}
	
	
	static void change(int x) {
//		static void change(int x) {
		x = 1000;
		
		System.out.println("change() : x =" + x);
	}
	
}

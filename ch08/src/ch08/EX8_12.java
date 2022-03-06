package ch08;

public class EX8_12 {
	public static void main(String[] args) throws Exception {
			method1(); //같은 클래스내의 static멤버으므로 객체생성없이 직접 호출 가능
	} //main

	static void method1() throws Exception{
		method2();
	} // method1의 끝
	static void method2() throws Exception {
		throw new Exception();
	} // method1의 끝
}

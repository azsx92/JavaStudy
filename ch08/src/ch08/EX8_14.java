package ch08;

public class EX8_14 {
	public static void main(String[] args) throws Exception {
		try {
			method1(); //같은 클래스내의 static멤버으므로 객체생성없이 직접 호출 가능
		} catch (Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	} //main

	static void method1() throws Exception{
		throw new Exception();
	} // method1의 끝
}

package ch08;

public class EX8_7 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); // 0을 나눠서 ArithmeticException을 발생시킨다.
			System.out.println(4);   // 실행되지 않느다.
		} catch (ArithmeticException ae) {      //ArithmeticException대신 Exception을 사용
			if(ae instanceof ArithmeticException)
					System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) {      //ArithmeticException대신 Exception을 사용
			System.out.println(5); //실행되지 않는다.
		} //try-catch의 끝
		System.out.println(6);
	} //main
}

package ch08;

public class EX8_5 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception s) {
			System.out.println(5); //실행되지 않는다.
		} //try-catch의 끝
		System.out.println(6);
	} //main
}

package ch08;

public class EX8_3 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i=0; i < 10; i++) {
			try {
				result = number / (int)(Math.random() * 10); //7번 라인
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("0");
			} //try-catch 끝ㅓ

		}
	} //main
}

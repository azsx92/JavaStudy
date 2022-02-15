package ch05;

/*
 * char 배열과 String 클래스의 변환
 */
public class ArrayEx16 {
	public static void main(String[] args) {
		System.out.println("매개변수의 개수:" + args.length);

		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i +"] = \""+ args[i] + "\"");
		}
	} // end of main
}

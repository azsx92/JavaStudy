package ch05;

/*
 * char �迭�� String Ŭ������ ��ȯ
 */
public class ArrayEx14 {
	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i=0; i< src.length(); i++) {
			char ch = src.charAt(i); //src�� i��°�� ch�� ����
			System.out.println("src.charAt("+i+") :" + ch);
		}
		
		//String�� char[]�� ��ȯ
		char[] chArr = src.toCharArray();
		
		// char�迭(char[])�� ���
		System.out.println(chArr);
	} // end of main
}

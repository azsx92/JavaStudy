package ch08;

public class EX8_8 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); // 0�� ������ ArithmeticException�� �߻���Ų��.
			System.out.println(4);   // ������� �ʴ���.
		} catch (ArithmeticException ae) {      //ArithmeticException��� Exception�� ���
			ae.printStackTrace();				//ae�� ���� , ������ ArithmeticException�ν��Ͻ��� ������ ���� �ִ�.
			System.out.println("���ܸ޽��� : " + ae.getMessage());
		} catch (Exception e) {      //ArithmeticException��� Exception�� ���
			System.out.println(5); //������� �ʴ´�.
		} //try-catch�� ��
		System.out.println(6);
	} //main
}

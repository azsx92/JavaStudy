package ch08;

public class EX8_13 {
	public static void main(String[] args) throws Exception {
			method1(); //���� Ŭ�������� static������Ƿ� ��ü�������� ���� ȣ�� ����
	} //main

	static void method1() throws Exception{
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
			e.printStackTrace();
		}
	} // method1�� ��
}

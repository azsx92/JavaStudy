package ch08;

public class EX8_14 {
	public static void main(String[] args) throws Exception {
		try {
			method1(); //���� Ŭ�������� static������Ƿ� ��ü�������� ���� ȣ�� ����
		} catch (Exception e) {
			System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
			e.printStackTrace();
		}
	} //main

	static void method1() throws Exception{
		throw new Exception();
	} // method1�� ��
}

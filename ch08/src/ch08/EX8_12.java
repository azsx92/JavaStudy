package ch08;

public class EX8_12 {
	public static void main(String[] args) throws Exception {
			method1(); //���� Ŭ�������� static������Ƿ� ��ü�������� ���� ȣ�� ����
	} //main

	static void method1() throws Exception{
		method2();
	} // method1�� ��
	static void method2() throws Exception {
		throw new Exception();
	} // method1�� ��
}

package ch08;

import java.io.File;

public class EX8_19 {
	public static void main(String[] args) throws Exception {
		//method1()�� static�޼����̹Ƿ� �ν��Ͻ� �������� ���� ȣ���� �����ϴ�.
		EX8_19.method1();
		System.out.println("method1()�� ������ ��ġ�� main�޼���� ���ƿԽ��ϴ�.��");
	} //main

	
	
	static void method1() {
		try {
			System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
			return;   //���� ���� ���� �޼��带 �����Ѵ�.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1()�� finally���� ����Ǿ����ϴ�.");
		}
	} //method1()
	
	
}

package ch06;


public class MemberCall_Ex_6_20 {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv //���� , Ŭ���������� �ν��Ͻ� ������ ����� �� ����.
	static int cv2 = new MemberCall_Ex_6_20().iv; // ��ó�� ��ü�� �����ؾ� ��밡��.
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); //���� .Ŭ�����޼��忡�� �ν��Ͻ������� ���Ұ�
		MemberCall_Ex_6_20 c = new MemberCall_Ex_6_20();
		System.out.println(c.iv);  //��ü�� ������ �Ŀ��� �ν��Ͻ������� ��������
	}
	
	void instanceMethod() {
		System.out.println(cv);
		System.out.println(iv); //�ν��Ͻ��޼��忡�� �ν��Ͻ������� �ٷ� ��밡��.
	}
	
	static  void staticMethod2() {
		staticMethod1();
//		instanceMethod(); //����. Ŭ�����޼��忡���� �ν��Ͻ��޼��带 ȣ���� �� ����.
		MemberCall_Ex_6_20 c = new MemberCall_Ex_6_20();
		c.instanceMethod(); //�ν��Ͻ��� ������ �Ŀ��� ȣ�� �� �� ����.
	}
			
	void instanceMethod2() {  //�ν��Ͻ��޼��忡���� �ν��Ͻ��޼���� Ŭ�����޼���
		staticMethod2();	  //��� �ν��Ͻ� �������� �ٷ� ȣ���� �����ϴ�.	
		instanceMethod();
	}

}

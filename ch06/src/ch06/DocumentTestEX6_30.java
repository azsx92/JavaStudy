package ch06;
//6.4 ��������� �ʱ�ȭ �ñ�� ����
/*
 * Ŭ���������� �ʱ�ȭ ���� Ŭ������ ó�� �ε��� �� �� �ѹ� �ʱ�ȭ�ȴ�.
 * �ν��Ͻ������� �ʱ�ȭ���� �ν��Ͻ��� ������ ������ �� �ν��Ͻ����� �ʱ�ȭ�� �̷������.
 * 
 * Ŭ���������� �ʱ�ȭ���� �⺻��-> ������ʱ�ȭ -> Ŭ�����ʱ�ȭ��
 * �ν��Ͻ������� �ʱ�ȭ���� �⺻��-> ������ʱ�ȭ -> �ν��Ͻ��ʱ�ȭ�� -> ������
 * */
class DocumentTestEX6_30 {
	static int count = 0; 	//������ �ν��Ͻ��� ���� �����ϱ� ���� ����
	String name; 			//������ (Document name)
	
	DocumentTestEX6_30() { //���� ������ �������� �������� �ʾ��� ��
		this("�������" + ++count);
	}
	
	DocumentTestEX6_30(String name) {
		this.name = name;
		System.out.println("���� " + this.name + "�� �����Ǿ����ϴ�.");
	};
	
	public static void main(String[] args) {
		DocumentTestEX6_30 p1 = new DocumentTestEX6_30();
		DocumentTestEX6_30 p2 = new DocumentTestEX6_30("�ڹ�.txt");
		DocumentTestEX6_30 p3 = new DocumentTestEX6_30();
		DocumentTestEX6_30 p4 = new DocumentTestEX6_30();
	}
}


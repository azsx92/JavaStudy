package ch06;
//6.4 ��������� �ʱ�ȭ �ñ�� ����
/*
 * Ŭ���������� �ʱ�ȭ ���� Ŭ������ ó�� �ε��� �� �� �ѹ� �ʱ�ȭ�ȴ�.
 * �ν��Ͻ������� �ʱ�ȭ���� �ν��Ͻ��� ������ ������ �� �ν��Ͻ����� �ʱ�ȭ�� �̷������.
 * 
 * Ŭ���������� �ʱ�ȭ���� �⺻��-> ������ʱ�ȭ -> Ŭ�����ʱ�ȭ��
 * �ν��Ͻ������� �ʱ�ȭ���� �⺻��-> ������ʱ�ȭ -> �ν��Ͻ��ʱ�ȭ�� -> ������
 * */
class ProductTestEX6_29 {
	static int count = 0; //������ �ν��Ͻ��� ���� �����ϱ� ���� ����
	int serialNo;          //�ν��Ͻ� ������ ��ȣ
	
	{
		++count;
		serialNo = count; // Product�� �ν��Ͻ��� ������ ������  count�� ���� 1�� �������Ѽ� seriaNo�� �����Ѵ�.
	}
	public ProductTestEX6_29() {}; 
	
	public static void main(String[] args) {
		ProductTestEX6_29 p1 = new ProductTestEX6_29();
		ProductTestEX6_29 p2 = new ProductTestEX6_29();
		ProductTestEX6_29 p3 = new ProductTestEX6_29();
		
		System.out.println("p1�� ��ǰ��ȣ(serial no)�� " + p1.serialNo);
		System.out.println("p2�� ��ǰ��ȣ(serial no)�� " + p2.serialNo);
		System.out.println("p3�� ��ǰ��ȣ(serial no)�� " + p3.serialNo);
		System.out.println("������ ��ǰ�� ���� ��� "+ DocumentTestEX6_30.count + "�� �Դϴ�.");
	}
}


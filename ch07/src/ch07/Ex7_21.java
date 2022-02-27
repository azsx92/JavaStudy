package ch07;

class Product {
	int price ;		 // ��ǰ�� ����
	int bonusPoint;  // ��ǰ���� �� �����ϴ� ���ʽ�����
	Product() {}
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); //���ʽ������� ��ǰ������ 10%
	}
}

class Tv2 extends Product {
	Tv2() {
//		����Ŭ������ �������� Product(int price)�� ȣ�� �Ѵ�.
		super(100); //Tv�� ������ 100�������� �Ѵ�.
	}
	
	//ObjectŬ������ toString()�� �������̵��Ѵ�.
	public String toString() {
//		return "Computer";
		return "Tv";
	}
}

class Computer extends Product {
	Computer() { super(200);}
	
	//ObjectŬ������ toString()�� �������̵��Ѵ�.
	public String toString() {
		return "Computer";
	}
}

class Buyer { //�� , ������ ��� ���
	int money      = 1000; // �����ݾ�
	int bonusPoint = 0;    //���ʽ� ����
	Product2 [] item = new Product2[10];
	int i = 0;
	void buy(Product Product) {
		if(money < Product.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money      -= Product.price;       // ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += Product.bonusPoint;  // ��Ǿ�� ���ʽ� ������ �߰��Ѵ�. 
		System.out.println(Product +"��/�� �����ϼ̽��ϴ�.");
	}
}
public class Ex7_21 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv2());
		b.buy(new Computer());
	
		
		System.out.println("���� ���� ����  " + b.money + "�����Դϴ�.");
		System.out.println("���纸�ʽ�������  " + b.bonusPoint + "���Դϴ�.");
	}
}//

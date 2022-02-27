package ch07;

class Product2 {
	int price ;		 // ��ǰ�� ����
	int bonusPoint;  // ��ǰ���� �� �����ϴ� ���ʽ�����
	Product2() {}
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); //���ʽ������� ��ǰ������ 10%
	}
}

class Tv3 extends Product2 {
	Tv3() {
//		����Ŭ������ �������� Product2(int price)�� ȣ�� �Ѵ�.
		super(100); //Tv�� ������ 100�������� �Ѵ�.
	}
	
	//ObjectŬ������ toString()�� �������̵��Ѵ�.
	public String toString() {
//		return "Computer";
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2() { super(200);}
	
	//ObjectŬ������ toString()�� �������̵��Ѵ�.
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product2 {
	Audio() {}
	//ObjectŬ������ toString()�� �������̵��Ѵ�.
	public String toString() {
		return "Audio";
	}
}
class Buyer2 { //�� , ������ ��� ���
	int money      = 1000; // �����ݾ�
	int bonusPoint = 0;    //���ʽ� ����
	Product2[] item = new Product2[10]; //������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0;				// Product �迭�� ���� ī���� 
	
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money      -= p.price;       // ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;  // ��Ǿ�� ���ʽ� ������ �߰��Ѵ�.
		item[i++]   = p; 			 // ��ǰ�� Product[] item�� �����Ѵ�.
		System.out.println(p +"��/�� �����ϼ̽��ϴ�.");
	}
	
	void summary() {
		int sum = 0;  			//������ ��ǰ�� ���� ������ ����ؼ� �����ش�.
		String itemList = ""; 	//��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		
		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i = 0; i< item.length; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + " �����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + " �Դϴ�.");
	} 
}
public class Ex7_22 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv3());
		b.buy(new Computer2());
		b.buy(new Audio());
		b.summary();
	}
}//

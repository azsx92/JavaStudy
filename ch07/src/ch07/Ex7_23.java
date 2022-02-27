package ch07;

import java.util.Vector;

class Product3 {
	int price ;		 // ��ǰ�� ����
	int bonusPoint;  // ��ǰ���� �� �����ϴ� ���ʽ�����
	
	Product3(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); //���ʽ������� ��ǰ������ 10%
	}
	Product3() {
		price      = 0;
		bonusPoint = 0;
	}
}

class Tv4 extends Product3 {
	Tv4() {
//		����Ŭ������ �������� Product3(int price)�� ȣ�� �Ѵ�.
		super(100); //Tv�� ������ 100�������� �Ѵ�.
	}
	
	//ObjectŬ������ toString()�� �������̵��Ѵ�.
	public String toString() {
//		return "Computer";
		return "Tv";
	}
}

class Computer3 extends Product3 {
	Computer3() { super(200);}
	
	//ObjectŬ������ toString()�� �������̵��Ѵ�.
	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product3 {
	Audio2() {
		super(50);
	}
	//ObjectŬ������ toString()�� �������̵��Ѵ�.
	public String toString() {
		return "Audio";
	}
}
class Buyer3 { //�� , ������ ��� ���
	int money      = 1000; // �����ݾ�
	int bonusPoint = 0;    //���ʽ� ����
	Vector item = new Vector();  //������ ��ǰ�� �����ϱ� ���� Vector ��ü
	int i = 0;				// Product �迭�� ���� ī���� 
	
	
	void buy(Product3 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money      -= p.price;       // ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;  // ��Ǿ�� ���ʽ� ������ �߰��Ѵ�.
		item.add(p); 			     // ��ǰ�� vector�� �����Ѵ�.
		System.out.println(p +"��/�� �����ϼ̽��ϴ�.");
	}
	
	void refund (Product3 p) { //������ ��ǰ�� ȯ���Ѵ�.
		if (item.remove(p) ) {  // ��ǰ�� Vector���� �����Ѵ�.
			money      += p.price;       // ���� ������ ������ ��ǰ�� ������ ����.
			bonusPoint -= p.bonusPoint;  // ��Ǿ�� ���ʽ� ������ �߰��Ѵ�.
			System.out.println(p +"��/�� ��ǰ�ϼ̽��ϴ�.");
		} else { //���ſ� ������ ���
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	void summary() {     		//������ ��ǰ�� ���� ������ ����ؼ� �����ش�.
		int sum = 0;  			//������ ��ǰ�� ���� ������ ����ؼ� �����ش�.
		String itemList = ""; 	//��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		
		if(item.isEmpty()) {    //Vector�� ����ִ��� Ȯ�� �Ѵ�.
			System.out.println("�����Ͻ�  ��ǰ�� �����ϴ�.");
			return;
		}
		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i = 0; i< item.size(); i++) {
			Product3 p = (Product3) item.get(i); //Vector�� i������ �ִ� ��ü�� ���´�.
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + " �����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + " �Դϴ�.");
	} 
}
public class Ex7_23 {
	public static void main(String[] args) {
		Buyer3 b      = new Buyer3();
		Tv4   tv      = new Tv4();
		Computer3 com = new Computer3();
		Audio2 audio  = new Audio2();
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
		
	}
}//

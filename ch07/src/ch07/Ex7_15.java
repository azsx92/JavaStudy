package ch07;

class Car {
	String color;
	int door;
	
	void drive() { //�����ϴ� ���
		System.out.println("drive , Brrrr~");
	}
	
	void stop() { //���ߴ� ���
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car{
	void water() { // ���� �Ѹ��� ��� 
		System.out.println("water!!!");
	}
}
public class Ex7_15 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //car = (Car)fe;���� ����ȯ�� ������ ���´�.
//		car.water(); ���Ǿ˿��� carŸ���� ���������� water()�� ȣ�� �� �� ����.
		fe2 = (FireEngine) car; // �ں�Ÿ�� <- ����Ÿ�� �ٿ��ɽ���
		fe2.water();
	}
}

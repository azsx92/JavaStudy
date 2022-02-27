package ch07;

class Car {
	String color;
	int door;
	
	void drive() { //운전하는 기능
		System.out.println("drive , Brrrr~");
	}
	
	void stop() { //멈추는 기능
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car{
	void water() { // 물을 뿌리는 기능 
		System.out.println("water!!!");
	}
}
public class Ex7_15 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //car = (Car)fe;에서 형변환이 생략된 형태다.
//		car.water(); 컴피알에러 car타입의 참조변수로 water()를 호출 할 수 없다.
		fe2 = (FireEngine) car; // 자본타입 <- 조상타입 다운케스팅
		fe2.water();
	}
}

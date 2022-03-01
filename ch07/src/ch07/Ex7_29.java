package ch07;

public class Ex7_29 {
	public static void main(String[] args) {
		A3 a = new A3();
		a.methodA();
	}
}
interface I2 {
	public abstract void methodB();
}

class A3 {
	void methodA() {
		I2 i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString()); //i로 Object클래스의 메서드 호출 가능 
	
	}
}

class B3 implements I2 {
	public void methodB() {
		System.out.println("methodB in  B class");
	}
	public String toString() { return "class B"; }
}

class InstanceManager {
	public static I2 getInstance() {
		return new B3();
	}
}
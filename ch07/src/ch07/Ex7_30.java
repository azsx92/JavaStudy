package ch07;

public class Ex7_30 {
	public static void main(String[] args) {
		Child6 c = new Child6();
		c.method1();
		c.method2();
		Myinterface.staticMethod();
		Myinterface2.staticMethod();
	}
}

class Child6 extends Parent6 implements Myinterface , Myinterface2 {
	public void method1() {
		System.out.println("method1 () in Child");  //오버라이딩
	}

}

class Parent6 {
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

interface Myinterface {
	default void method1 () {
		System.out.println("method1 in Myinterface");
	}
	default void method2 () {
		System.out.println("method2 in Myinterface");
	}
	static  void staticMethod () {
		System.out.println("staticMethod in Myinterface");
	}
}

interface Myinterface2 {
	default void method1() {
		System.out.println("method1 in Myinterface2");
	}
	static  void staticMethod () {
		System.out.println("staticMethod in Myinterface2");
	}
}
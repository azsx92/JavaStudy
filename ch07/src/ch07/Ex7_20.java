package ch07;

class Parent5 {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child5 extends Parent5 {
	int x = 200;

	void method() {
		System.out.println("x=" + x);
		System.out.println("super.x =" + super.x);
		System.out.println("this.x =" + this.x);
	}
}

public class Ex7_20 {
	public static void main(String[] args) {
		Parent5 p = new Child5();
		Child5  c = new Child5();

		System.out.println("main p.x = " + p.x);
		p.method();
		System.out.println();
		System.out.println("main c.x = " + c.x);
		c.method();
	}
}//

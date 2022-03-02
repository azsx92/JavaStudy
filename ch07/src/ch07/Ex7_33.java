package ch07;

class Outer2 {
	int value = 10; //Outer.this.value
	
	class Inner {
		int value = 20; //this.value

		void myMethod() {
			int value = 30; 
			System.out.println("           value : " + value);
			System.out.println("      this.value : " + this.value);
			System.out.println("Outer.this.value : " + Outer2.this.value);
		}
	}
	
	
}

class Ex7_33 {
	public static void main(String[] args) {
//		인스턴스클래스의 인스턴스를 생성하려면
//		외부클래스의 인스턴스를 먼저 생성해야한다.
		Outer2 oc = new Outer2();
		Outer2.Inner inner = oc.new Inner();
		inner.myMethod();
	}
}



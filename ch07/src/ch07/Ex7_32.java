package ch07;

class Outer {
	class InstanceInner2 {
		int iv = 100;
	}
	
	static class StaticInner2 {
		int iv        = 200;
		static int cv = 300;  //static클래스만 static멤버를 정의할 수 있다.
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
}

class Ex7_32 {
	public static void main(String[] args) {
//		인스턴스클래스의 인스턴스를 생성하려면
//		외부클래스의 인스턴스를 먼저 생성해야한다.
		Outer oc = new Outer();
		Outer.InstanceInner2 il =  oc.new InstanceInner2();
		
		System.out.println("ii.iv : " + il.iv );
		System.out.println("Outer.StaticInner.cv  :" + Outer.StaticInner2.cv);
		
//		스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도된다.
		Outer.StaticInner2 si = new Outer.StaticInner2();
		System.out.println("si.iv :" + si.iv);
	
	}
}



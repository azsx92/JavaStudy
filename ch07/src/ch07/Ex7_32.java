package ch07;

class Outer {
	class InstanceInner2 {
		int iv = 100;
	}
	
	static class StaticInner2 {
		int iv        = 200;
		static int cv = 300;  //staticŬ������ static����� ������ �� �ִ�.
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
}

class Ex7_32 {
	public static void main(String[] args) {
//		�ν��Ͻ�Ŭ������ �ν��Ͻ��� �����Ϸ���
//		�ܺ�Ŭ������ �ν��Ͻ��� ���� �����ؾ��Ѵ�.
		Outer oc = new Outer();
		Outer.InstanceInner2 il =  oc.new InstanceInner2();
		
		System.out.println("ii.iv : " + il.iv );
		System.out.println("Outer.StaticInner.cv  :" + Outer.StaticInner2.cv);
		
//		����ƽ ���� Ŭ������ �ν��Ͻ��� �ܺ� Ŭ������ ���� �������� �ʾƵ��ȴ�.
		Outer.StaticInner2 si = new Outer.StaticInner2();
		System.out.println("si.iv :" + si.iv);
	
	}
}



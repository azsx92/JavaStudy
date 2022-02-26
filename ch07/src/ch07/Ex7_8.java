package ch07;


public class Ex7_8 {
	public static void main(String[] args) {
		Point3D2 p3 = new Point3D2();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}
}

class MyPoint2 {
	int x =10;
	int y =20;
	
	MyPoint2(int x, int y){
					//������ ù �ٿ��� �ٸ� �����ڸ� ȣ������ �ʱ� ������ �����Ϸ��� 'super();'�� ���⿡ �����Ѵ�. super()�� Mypoint2�� ������
					//ObjectŬ������ �⺻ �������� Object()�� �ǹ��ϳ�.
		this.x = x ;
		this.y = y;
	}
}

class Point3D2 extends MyPoint2 {
	int z;
	
	Point3D2() {
		this(100,200,300); //Point3D(int x, int y , int z)�� ȣ���Ѵ�.
	}
	Point3D2(int x, int y, int z) {
		super(x, y);      //Point3D(int x, int y)�� ȣ���Ѵ�.
		this.z = z;
	}
	
}

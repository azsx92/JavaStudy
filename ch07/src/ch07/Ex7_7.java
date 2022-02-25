package ch07;


public class Ex7_7 {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(1,2,3);
	}
}

class MyPoint {
	int x,y;
	
	MyPoint(int x, int y){
		this.x = x ;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends MyPoint {
	int z;
	
	Point3D(int x, int y, int z) {
		super(x, y); // ����Ŭ������ ������ Point(intx , int y)�� ȣ���Ѵ�.
//		this.x = x;
//		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x :" + x + ", y :" + y + " , z :" + z;
	}
}


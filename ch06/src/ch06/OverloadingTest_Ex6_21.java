package ch06;

public class OverloadingTest_Ex6_21 {
	public static void main(String[] args) {
		MyMath4 mm = new MyMath4();
		System.out.println("mm.add(3, 3 ) ���:" + mm.add(3,3));
		System.out.println("mm.add(3L, 3 ) ���:" + mm.add(3L,3));
		System.out.println("mm.add(3, 3L ) ���:" + mm.add(3,3L));
		System.out.println("mm.add(3L, 3L ) ���:" + mm.add(3L,3L));
		
		int[] a = {100 ,200 ,300};
		System.out.println("mm.add(a) ���" + mm.add(a));
	}
}


class MyMath4 {

	public int add(int a, int b) {
		System.out.println("int add(inta, int b) -");
		return a+b;
	}

	public long add(int a, long b) {
		System.out.println("long add(int a, long b) -");
		return a+b;
	}
	
	public long add(long a, int b) {
		System.out.println("long add(long a, int b) -");
		return a+b;
	}
	
	public long add(long a, long b) {
		System.out.println("long add(long a, int b) -");
		return a+b;
	}  

	public int add(int[] a) {
		System.out.println("int add(int[] a) -");
		int result = 0;
		for(int i=0; i< a.length; i++) {
			result += a[i];
		}
		return result;
	}

}
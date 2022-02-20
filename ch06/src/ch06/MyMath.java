package ch06;
// 255P 메소드 
public class MyMath {
	/*
	static long add(long a, long b) {
		long result = a+b;
		return result;
//		return result  a+b; 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다. 
	}
	
	static long subtract(long a, long b) {  return a-b;}
	static long multuply(long a, long b) {  return a*b;}
	static double divide (double a, double b) {  return a-b;}
	*/ 
	public static void main(String[] args) {
		MyMath2 my = new MyMath2();
		long a = my.add(  3 ,  5);
		long b = my.subtract(  3 ,  5);
		long c = my.multuply(  3 ,  5);
		double d = my.divide(  3 ,  5);
	
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}


class MyMath2 {
	long add(long a, long b) {
		long result = a+b;
		return result;
//		return result  a+b; 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다. 
	}
	
	 long subtract(long a, long b) {  return a-b;}
	 long multuply(long a, long b) {  return a*b;}
	 double divide (double a, double b) {  return a-b;}
}
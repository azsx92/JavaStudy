package ch06;
// 256P 6-6

class MyMathTest {
	public static void main(String[] args) {
		// class MyMath.MyMath2
		MyMath2 nm = new MyMath2();
		
		long   result  = nm.add(  5L ,  3L);
		long   result2 = nm.subtract(  5L ,  3L);
		long   result3 = nm.multuply(  5L ,  3L);
		double result4 = nm.divide(  5L ,  3L);
	
		
		System.out.println("add(5L, 3L)      =" +result);
		System.out.println("subtract(5L, 3L) =" +result2);
		System.out.println("multuply(5L, 3L) =" +result3);
		System.out.println("divide(5L, 3L)   =" +result4);
	}
}


/*
class MyMath {
	long add(long a, long b) {
		long result = a+b;
		return result;
//		return result  a+b; 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다. 
	}
	
	 long subtract(long a, long b) {  return a-b;}
	 long multuply(long a, long b) {  return a*b;}
	 double divide (double a, double b) {  return a-b;}
}
*/